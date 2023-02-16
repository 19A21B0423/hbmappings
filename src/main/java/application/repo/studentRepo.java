package application.repo;

import application.entity.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository <students,Integer> {

}
