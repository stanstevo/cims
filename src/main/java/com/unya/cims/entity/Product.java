package com.unya.cims.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product extends AbstractEntity {
    private String description;

    private int quantityOnHand;

    private int reorderLevel;

    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;

        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return 2042274511;
    }
}
