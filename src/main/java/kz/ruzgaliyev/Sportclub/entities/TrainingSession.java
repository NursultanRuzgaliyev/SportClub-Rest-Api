package kz.ruzgaliyev.Sportclub.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "trainsession")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrainingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;
    @ManyToOne(fetch = FetchType.EAGER)
    private Coach coach;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Athlete> participants;
}
