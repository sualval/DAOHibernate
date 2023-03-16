package ru.netology.hibernate;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.netology.hibernate.entity.Identifier;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonsRepositoryJPA;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@RequiredArgsConstructor
@Component
public class CommandLineApp implements CommandLineRunner {

    private final PersonsRepositoryJPA personRepositoryJPA;


    @Override
    @Transactional
    public void run(String... args) {
        var names = List.of("Name1", "Name2", "Name3", "Name4", "Name5");
        var surnames = List.of("Surname1", "Surname2", "Surname3", "Surname4", "Surname5");
        var cities = List.of("Moscow", "Samara", "Kaluga", "Tula", "Sochi");
        var phoneNumbers = List.of("81111111111", "82222222222", "83333333333", "84444444444");
        var random = new Random();
        IntStream.range(0, 30).
                forEach(i -> {
                    var person = Person.builder().identifier(Identifier.builder()
                                    .name(names.get(random.nextInt(names.size())))
                                    .surname(surnames.get(random.nextInt(surnames.size())))
                                    .age(random.nextInt(30)).build())
                            .cityOfLiving(cities.get(random.nextInt(cities.size())))
                            .phoneNumber(phoneNumbers.get(random.nextInt(phoneNumbers.size())))
                            .build();
                    personRepositoryJPA.save(person);

                });
    }
}
