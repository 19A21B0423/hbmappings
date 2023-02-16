package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="leaddata" , schema = "hbmappings")
public class TeamLead {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "LEADID")
    private Integer leadid;

    @Column(name = "LEAD_NAME")
    private String leadName;
}
