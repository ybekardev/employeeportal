package org.hire.employee.services;

import org.hire.employee.data.Person;
import org.hire.employee.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getEmployee(){
        List<Person> personList = new ArrayList<>();
        for(Person person : personRepository.findAll()){
            personList.add(person);
        }
        return personList;
    }

    public Person getEmployee(int id){
        return personRepository.findById(id).get();
    }

    public void addEmployee(Person listPerson){
        personRepository.save(listPerson);
    }

    public void updateEmployee(Person person){
        personRepository.save(person);
    }

    public void deleteEmployee(int id){
        personRepository.deleteById(id);
    }
}
