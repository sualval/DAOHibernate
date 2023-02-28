package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @EmbeddedId
    private Identifier identifier;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;}