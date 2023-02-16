package application.controller;

import application.entity.Doctors;
import application.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Doctors")
public class ManyToManyController {
    @Autowired
    private DoctorRepo docrepo;

    @PostMapping("/create/manyToMany")
    public Doctors save(@RequestBody Doctors doc)
    {
        return docrepo.save(doc);
    }
}
