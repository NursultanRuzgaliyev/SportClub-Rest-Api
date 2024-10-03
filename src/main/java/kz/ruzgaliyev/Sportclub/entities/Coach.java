package kz.ruzgaliyev.Sportclub.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "coach")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialization;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<TrainingSession> trainingSessions;
}
