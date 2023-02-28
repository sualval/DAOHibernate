package ru.netology.hibernate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Identifier implements Serializable {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(columnDefinition = "int check (age > -1)")
    private int age;
}