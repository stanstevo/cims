package com.unya.cims.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//This class represents a single entry in an order
// ie the name of product, quantity and order id

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineItem extends AbstractEntity{

    @ManyToOne(cascade= CascadeType.PERSIST)
    private Orders orders;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private Product product;

    private int quantity;

}
