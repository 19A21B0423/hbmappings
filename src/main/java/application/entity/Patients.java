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
@Table(name="patientdata" , schema = "hbmappings")
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PATIENTID")
    private Integer patientId;

    @Column(name = "PATIENT_NAME")
    private String patientName;

    @Column(name = "PATIENT_PROBLEM")
    private String patientprblm;

    @ManyToMany(mappedBy = "patients" , cascade = { CascadeType.ALL })
    private Set < Doctors > doctors ;
}
