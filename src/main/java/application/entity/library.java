package application.entity;

import lombok.Data;


import javax.persistence.*;
@Data
@Entity
@Table(name="librarydata" , schema = "hbmappings")
public class library {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "LIBRARY_ID")
    private Integer libraryid;


    @Column(name = "BOOKS_NAME")
    private String bookName;


    @Column(name = "NUMBER_OF_BOOKS")
    private int numOfBooks;

}
