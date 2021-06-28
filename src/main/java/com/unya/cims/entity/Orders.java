package com.unya.cims.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/*
 * Assumes only request for available stock are received and issued
 * */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Orders extends AbstractEntity{

    private String orderNumber;

    private LocalDate date;

    //An employee can have many orders
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Employee employee;

    //An order may contain many items
    @OneToMany(cascade=CascadeType.ALL, mappedBy="orders")
    @ToString.Exclude
    List<LineItem> lines;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Orders orders = (Orders) o;

        return Objects.equals(getId(), orders.getId());
    }

    @Override
    public int hashCode() {
        return 1775533341;
    }
}