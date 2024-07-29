package com.qparmacevt.svitlyna.models;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.validation.constraints.NotBlank;


@Entity
@Table(name="products")
@Getter
@Setter
@NoArgsConstructor

public class Products {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "product_sequence"),
                    @Parameter(name = "initial_value", value = "10"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long product_id;

    @NotBlank
    private String product_name;
    @NotBlank
    private int quantity;

}
