package kz.aitu.assik4sp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int goalid;
    private String type;
    private Date startDate;
    private double targetValue;

    @Column(name = "\"DurationDays\"")
    private int durationDays;

    private boolean achieved;
}
