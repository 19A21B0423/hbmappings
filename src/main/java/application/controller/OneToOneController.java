package application.controller;

import application.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.repo.StudentRepo;

@RestController
@RequestMapping("/students")
public class OneToOneController {

    @Autowired
    private StudentRepo stdrepo;

    @PostMapping("/create/oneToOne")
    public Students save(@RequestBody Students st)
    {
        return stdrepo.save(st);
    }


}
