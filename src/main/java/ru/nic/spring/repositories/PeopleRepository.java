package ru.nic.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nic.spring.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
