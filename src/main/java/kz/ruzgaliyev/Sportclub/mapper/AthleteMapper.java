package kz.ruzgaliyev.Sportclub.mapper;

import kz.ruzgaliyev.Sportclub.dtos.AthleteDTO;
import kz.ruzgaliyev.Sportclub.entities.Athlete;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring") // Исправленная строка
public interface AthleteMapper {
    AthleteDTO mapToDTO(Athlete athlete);
    Athlete mapToEntity(AthleteDTO athleteDTO);
    List<AthleteDTO> mapToDTOList(List<Athlete> athletes);
    List<Athlete> mapToEntityList(List<AthleteDTO> athletesDTO);
}
