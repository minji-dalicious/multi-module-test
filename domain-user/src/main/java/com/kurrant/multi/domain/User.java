package com.kurrant.multi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

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
    @JoinColumn(name = "CustomerCorpId")
    @JsonBackReference
    private Apartment apartment;
}