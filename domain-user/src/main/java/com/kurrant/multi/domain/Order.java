package com.kurrant.multi.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "`Order`")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PKey", nullable = false)
    private Integer id;

    @Column(name = "TotalPrice")
    private double totalPrice;

    @Column(name = "PointDiscount")
    private double pointDiscount;

    @Column(name = "SubscriptionDiscount", length = 45)
    private double subscriptionDiscount;

    @Column(name = "PaymentTypeId")
    private Integer paymentTypeId;

    @Column(name = "Created")
    private Timestamp created;

    @ManyToOne
    @JoinColumn(name = "UserId")
    @JsonBackReference
    private User user;

    @Builder
    public Order(Integer id, double totalPrice, double pointDiscount, double subscriptionDiscount, Integer paymentTypeId, Timestamp created) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.pointDiscount = pointDiscount;
        this.subscriptionDiscount = subscriptionDiscount;
        this.paymentTypeId = paymentTypeId;
        this.created = created;
    }
}