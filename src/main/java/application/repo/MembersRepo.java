package application.repo;

import application.entity.TeamMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepo extends JpaRepository<TeamMembers , Integer> {
}
