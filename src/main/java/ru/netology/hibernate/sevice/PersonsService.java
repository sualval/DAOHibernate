package ru.netology.hibernate.sevice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonsRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonsService {


    private final PersonsRepository repository;

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }


}
