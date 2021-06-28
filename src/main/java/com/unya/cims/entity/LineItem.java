package com.unya.cims.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Objects;

//This class represents a single entry in an order
// ie the name of product, quantity and order id

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LineItem extends AbstractEntity{

    @ManyToOne(cascade= CascadeType.PERSIST)
    private Orders orders;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private Product product;

    private int quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LineItem lineItem = (LineItem) o;

        return Objects.equals(getId(), lineItem.getId());
    }

    @Override
    public int hashCode() {
        return 1198645368;
    }
}
