package kz.aitu.assik4sp.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
    private String fname;
    private String sname;
    private Date dateofbirth;
    private int height;
    private int weight;
    private String gender;
}
