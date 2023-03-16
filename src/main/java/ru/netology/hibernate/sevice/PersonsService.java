package ru.netology.hibernate.sevice;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonsRepositoryJPA;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonsService {


    private final PersonsRepositoryJPA repository;


    public List<Person> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(int age) {
        return repository.findAllByIdentifierAgeLessThanOrderByIdentifierAgeAsc(age);
    }

    public Optional<Person> getPersonByIdentifierNameAndIdentifierSurname(String name, String surname) {
        return repository.findPersonByIdentifierNameAndIdentifierSurname(name, surname);
    }


}
