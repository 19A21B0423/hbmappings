package application.repo;

import application.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Students,Integer> {

}
