package com.qparmacevt.svitlyna.repositories;

import com.qparmacevt.svitlyna.models.Pharmacies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository <Pharmacies, Long> {
}
