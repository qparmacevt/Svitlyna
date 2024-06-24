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
public class Bricks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long brick_id;

    int brick_code;
    String brick_region;
    String area_manager;


}
