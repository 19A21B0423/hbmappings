package application.controller;

import application.entity.Employee;
import application.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employe")
public class oneToManyController {

    @Autowired
    private EmployeeRepo emprepo;

    @PostMapping("/create/oneToMany")
    public Employee save(@RequestBody Employee em)
    {
        return emprepo.save(em);
    }
}
