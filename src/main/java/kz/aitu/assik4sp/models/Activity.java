package kz.aitu.assik4sp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.sql.Date;

@Data
@Entity
@Table(name = "activities") 
public class Activity //Represents an activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activityid;
    private String type;
    private Date date;
    private Time duration;
    private double distance;
    private int calories;
    private String notes;
}
