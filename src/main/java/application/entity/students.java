package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studentdata" , schema = "hbmappings")
public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "STUDENT_ID")
    private Integer studentid;


    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_BRANCH")
    private String studentBranch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LIBRARY_ID")
    private library lib;
}
