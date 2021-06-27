package com.unya.cims.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/*
 * Assumes only request for available stock are received and issued
 * */
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders extends AbstractEntity{

    private String orderNumber;

    private LocalDate date;

    //An employee can have many orders
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Employee employee;

    //An order may contain many items
    @OneToMany(cascade=CascadeType.ALL, mappedBy="orders")
    List<LineItem> lines;
}