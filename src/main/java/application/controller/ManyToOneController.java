package application.controller;

import application.entity.Employee;
import application.entity.TeamMembers;
import application.repo.MembersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TeamMembers")
public class ManyToOneController {

    @Autowired
    private MembersRepo memrepo;

    @PostMapping("/create/manyToOne")
    public TeamMembers save(@RequestBody TeamMembers Team_mem)
    {
        return memrepo.save(Team_mem);
    }
}
