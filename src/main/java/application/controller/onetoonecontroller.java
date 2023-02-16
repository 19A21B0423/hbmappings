package application.controller;

import application.entity.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.repo.studentRepo;

@RestController
@RequestMapping("/students")
public class onetoonecontroller {

    @Autowired
    private studentRepo stdrepo;
    @PostMapping("/create/oneToOne")
    public students save(@RequestBody students st)
    {
        return stdrepo.save(st);
    }


}
