package com.unya.cims.repository;

import com.unya.cims.entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<LineItem, Long> {
}
