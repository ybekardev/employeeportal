package org.hire.employee.repository;

import org.hire.employee.data.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
