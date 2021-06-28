package com.unya.cims.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Supplier extends AbstractEntity{

    private String name;

    private String address;

    @Email
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Supplier supplier = (Supplier) o;

        return Objects.equals(getId(), supplier.getId());
    }

    @Override
    public int hashCode() {
        return 554628605;
    }
}
