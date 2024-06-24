package com.qparmacevt.svitlyna.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Pharmacies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long pharmacy_id;

    Long brick_id;
    String pharmacy_code;
    String pharmacy_address;
    String planogram;
    boolean status;
}
