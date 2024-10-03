package kz.ruzgaliyev.Sportclub.controllers;

import kz.ruzgaliyev.Sportclub.dtos.AthleteDTO;
import kz.ruzgaliyev.Sportclub.entities.Athlete;
import kz.ruzgaliyev.Sportclub.service.AthleteService;
import kz.ruzgaliyev.Sportclub.service.impl.AthleteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/athlete")
public class AthleteController {
    @Autowired
    private AthleteService athleteService;
    @GetMapping
    public List<AthleteDTO> getAllAthlete() {
        return athleteService.getAllAthletes();
    }
    @GetMapping("/{id}")
    public AthleteDTO getAthleteById(Long id) {
        return athleteService.getAllAthletesById(id);
    }
    @PostMapping
    public void createAthlete(@RequestBody AthleteDTO athlete) {
        athleteService.createAthlete(athlete);
    }
    @PutMapping("/{id}")
    public void updateAthlete(@PathVariable Long id,@RequestBody AthleteDTO athlete){
          athleteService.updateAthlete(athlete);
    }
    @DeleteMapping("/{id}")
    public void deleteAthlete(@PathVariable("id")Long id) {
        athleteService.deleteAthlete(id);
    }
}
