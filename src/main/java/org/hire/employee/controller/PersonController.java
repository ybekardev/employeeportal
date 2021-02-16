package org.hire.employee.controller;

import org.hire.employee.data.Person;
import org.hire.employee.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/person")
    public List<Person> getEmployee(){
        return personService.getEmployee();
    }
    @RequestMapping("/person/{id}")
    public Person getEmployee(@PathVariable int id){
        return personService.getEmployee(id);
    }
    @RequestMapping(method = RequestMethod.POST, value ="/person")
    public void addEmployee(@RequestBody Person person){
        personService.addEmployee(person);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/pesron/{id}")
    public void updatePerson(@RequestBody Person person){
        personService.updateEmployee(person);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/person/{id}")
    public void deletePerson(@PathVariable int id){
        personService.deleteEmployee(id);
    }

}
