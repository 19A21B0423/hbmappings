package application.repo;

import application.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository <Doctors , Integer> {
}
