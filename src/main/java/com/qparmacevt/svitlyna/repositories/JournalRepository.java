package com.qparmacevt.svitlyna.repositories;

import com.qparmacevt.svitlyna.models.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository <Journal, Long> {
}
