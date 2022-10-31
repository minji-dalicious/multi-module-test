package com.kurrant.multi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "Role", length = 45)
    private Role role;

    @Column(name = "Name", length = 45)
    private String name;

    @Column(name = "Point")
    private Integer point;

    @ManyToOne
    @JoinColumn(name = "CustomerCorpId")
    @JsonBackReference
    private CustomerCorp customerCorp;

    @ManyToOne
    @JoinColumn(name = "ApartmentId")
    @JsonBackReference
    private Apartment apartment;

    public User() {
    }
}