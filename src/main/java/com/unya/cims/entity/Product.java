package com.unya.cims.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class Product extends AbstractEntity{
    private String description;

    private int quantityOnHand;

    private int reorderLevel;

    private double price;
}
