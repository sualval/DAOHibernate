package ru.netology.hibernate.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.sevice.PersonsService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonsController {
    private final PersonsService personsService;

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam("city") String city) {
        return personsService.getPersonsByCity(city);
    }
}
