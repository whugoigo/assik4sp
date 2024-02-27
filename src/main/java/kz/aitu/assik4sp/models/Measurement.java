package kz.aitu.assik4sp.models;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "measurements")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int measurementid;
    private String type;
    private Date date;
    private double value;
    private String unit;
}
