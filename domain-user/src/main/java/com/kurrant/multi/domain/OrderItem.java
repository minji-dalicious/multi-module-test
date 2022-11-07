package com.kurrant.multi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column(name = "ContractDetailcol", length = 45)
    private String contractDetailcol;

    @Column(name = "Created", length = 45)
    private Timestamp created;

    @Column(name = "Updated", length = 45)
    private Timestamp updated;

    @Column(name = "ServiceDate", length = 45)
    private LocalDate serviceDate;

    @Column(name = "isCheck", length = 45)
    private boolean isCheck;

    @Column(name = "Price", length = 45)
    private double price;

    @Lob
    @Column(name = "DiningType")
    private String diningType;

    @ManyToOne
    @JoinColumn(name = "OrderId")
    @JsonBackReference
    private Order order;

    @Builder
    public OrderItem(Integer id, String contractDetailcol, Timestamp created, Timestamp updated, LocalDate serviceDate, boolean isCheck, double price, String diningType, Order order) {
        this.id = id;
        this.contractDetailcol = contractDetailcol;
        this.created = created;
        this.updated = updated;
        this.serviceDate = serviceDate;
        this.isCheck = isCheck;
        this.price = price;
        this.diningType = diningType;
        this.order = order;
    }
}