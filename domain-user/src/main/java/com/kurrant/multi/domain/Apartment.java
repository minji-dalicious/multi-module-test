package com.kurrant.multi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Builder
    public Apartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}