package kz.ruzgaliyev.Sportclub.service.impl;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import kz.ruzgaliyev.Sportclub.dtos.AthleteDTO;
import kz.ruzgaliyev.Sportclub.entities.Athlete;
import kz.ruzgaliyev.Sportclub.mapper.AthleteMapper;
import kz.ruzgaliyev.Sportclub.repositories.AthleteRepository;
import kz.ruzgaliyev.Sportclub.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AthleteServiceImpl implements AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;
    @Autowired
    private AthleteMapper athleteMapper;
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public List<AthleteDTO> getAllAthletes() {
        List<Athlete> athletes = athleteRepository.findAll();
        return athleteMapper.mapToDTOList(athletes);
    }

    @Override
    public AthleteDTO getAllAthletesById(Long id) {
        return athleteMapper.mapToDTO(athleteRepository.findAllById(id));
    }

    @Override
    public void createAthlete(AthleteDTO athleteDTO) {

        Athlete checkAthlete = athleteRepository.findAllByEmailContainsIgnoreCase(athleteDTO.getEmail());
        if(checkAthlete == null){
        Athlete athlete = athleteMapper.mapToEntity(athleteDTO);
        athleteRepository.save(athlete);
        athlete.setPromocode(UUID.randomUUID().toString());
        athleteRepository.save(athlete);
        sendVerificationEmail(athlete.getEmail(),athlete.getPromocode(),athlete.getName());
        }
    }

    @Override
    public void updateAthlete(AthleteDTO athleteDTO) {
           Athlete athlete = athleteRepository.findAllById(athleteDTO.getId());
           athlete.setName(athleteDTO.getName());
           athlete.setEmail(athleteDTO.getEmail());
           athlete.setAge(athleteDTO.getAge());
           athlete.setSportType(athleteDTO.getSportType());
           athlete.setTrainingSessions(athleteDTO.getTrainingSessions());
           athlete.setSportType(athleteDTO.getSportType());
           athleteRepository.save(athlete);

    }

    @Override
    public void deleteAthlete(Long id) {
       athleteRepository.deleteById(id);
    }
    private void sendVerificationEmail(String to, String promocode,String name) {
        String subject = " Your University Promocode ";
        String text = " Thank you for choosing us. " + " Dear " + name +" Никому не сообщайте этот код даже сотрудникам компании : " + promocode;

        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text);

            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
