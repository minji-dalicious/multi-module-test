package com.kurrant.multi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column
    private String password;

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

    public User(String name, String password, Role role) {
        this.password = password;
        this.role = role;
        this.name = name;
    }

    public User(Integer id, String password, Role role, String name, Integer point, CustomerCorp customerCorp, Apartment apartment) {
        this.id = id;
        this.password = password;
        this.role = role;
        this.name = name;
        this.point = point;
        this.customerCorp = customerCorp;
        this.apartment = apartment;
    }
}