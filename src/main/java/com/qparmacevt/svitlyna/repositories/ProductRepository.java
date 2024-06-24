package com.qparmacevt.svitlyna.repositories;

import com.qparmacevt.svitlyna.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Products, Long> {
}
