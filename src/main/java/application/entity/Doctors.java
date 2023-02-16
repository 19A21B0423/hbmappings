package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctordata" , schema = "hbmappings")
public class Doctors {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "DOCTORID")
    private int doctorId;

    @Column(name = "DOCTOR_NAME")
    private String doctorName;

    @Column(name = "DOCTOR_DESIGNATION")
    private String doctorDesig;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "doctors_patients",
    joinColumns = {@JoinColumn(name = "doctorId")},
    inverseJoinColumns = {@JoinColumn(name = "patientId")})
    Set <Patients> patients ;
}
