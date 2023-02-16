package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employedata" , schema = "hbmappings")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "EMPLOYEEID")
    private Integer employeeId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeName;

    @OneToMany(cascade=CascadeType.ALL, targetEntity = Bank.class)
    @JoinColumn(name="BANK_ID")
    private List<Bank> bank;
}
