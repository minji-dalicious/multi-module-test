package com.kurrant.multi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Origin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Builder
    public Origin(Integer id) {
        this.id = id;
    }
}