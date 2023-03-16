package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.hibernate.entity.Identifier;
import ru.netology.hibernate.entity.Person;

import java.util.List;
import java.util.Optional;


public interface PersonsRepositoryJPA extends JpaRepository<Person, Identifier> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findAllByIdentifierAgeLessThanOrderByIdentifierAgeAsc(int age);

    Optional<Person> findPersonByIdentifierNameAndIdentifierSurname(String name, String surname);
}