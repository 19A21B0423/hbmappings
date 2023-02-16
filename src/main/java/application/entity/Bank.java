package application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bankdata" , schema = "hbmappings")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "BANKID")
    private Integer bankId;

    @Column(name = "ACCOUNT_NUMBER")
    private long acctNum;

    @Column(name = "BANK_NAME")
    private String bankName;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Employee.class)
    @JoinColumn(name = "emp_id")
    private Employee emp;
}
