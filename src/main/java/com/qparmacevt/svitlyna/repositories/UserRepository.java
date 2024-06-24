package com.qparmacevt.svitlyna.repositories;

import com.qparmacevt.svitlyna.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Long> {
}
