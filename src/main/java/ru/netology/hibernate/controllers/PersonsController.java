package ru.netology.hibernate.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.sevice.PersonsService;


import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PersonsController {
    private final PersonsService personsService;

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return personsService.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonByAge(@RequestParam("age") int age) {
        return personsService.getPersonByAge(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public List<Person> getPersonByIdentifierNameAndIdetifierSurname(@RequestParam("name") String name,
                                                                     @RequestParam("surname") String surname) {
        return personsService.getPersonByIdentifierNameAndIdentifierSurname(name, surname);
    }

    @GetMapping("/persons/by-name")
    public List<Person> getPersonByIdentifierName(@RequestParam("name") String name) {
        return personsService.getPersonByIdentifierName(name);
    }

}