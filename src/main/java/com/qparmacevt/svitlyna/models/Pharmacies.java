package com.qparmacevt.svitlyna.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name="pharmacies")
@Getter
@Setter
@NoArgsConstructor

public class Pharmacies {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "pharmacy_sequence"),
                    @Parameter(name = "initial_value", value = "10"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long pharmacy_id;

    @NotBlank
    private Long brick_id;
    @NotBlank
    private String pharmacy_code;
    @NotBlank
    private String pharmacy_address;
    @NotBlank
    private String planogram;
    @NotBlank
    private boolean status;
}
