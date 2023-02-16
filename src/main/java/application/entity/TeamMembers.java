package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="membersdata" , schema = "hbmappings")
public class TeamMembers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMBERID")
    private int memberId;

    @Column(name = "MEMBER_NAME")
    private String memberName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LEAD_ID")
    private TeamLead tmlead;
}
