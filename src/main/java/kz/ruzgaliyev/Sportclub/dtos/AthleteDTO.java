package kz.ruzgaliyev.Sportclub.dtos;

import kz.ruzgaliyev.Sportclub.entities.SportType;
import kz.ruzgaliyev.Sportclub.entities.TrainingSession;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AthleteDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
    private String weightClass;
    private String sportType;
    private SportType typesport;
    private List<TrainingSession> trainingSessions;

}
