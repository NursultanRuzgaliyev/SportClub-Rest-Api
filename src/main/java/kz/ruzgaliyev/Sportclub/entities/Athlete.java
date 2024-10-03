package kz.ruzgaliyev.Sportclub.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "athletes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private int age;
    private String weightClass;
    private String sportType;
    @ManyToOne(fetch = FetchType.EAGER)
    private SportType typesport;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<TrainingSession> trainingSessions;
    private String promocode;

}
