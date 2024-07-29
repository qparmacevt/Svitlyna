package com.qparmacevt.svitlyna.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="bricks")
@Getter
@Setter
@NoArgsConstructor
public class Bricks {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "brick_sequence"),
                    @Parameter(name = "initial_value", value = "10"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long brick_id;
    
    private Brick brick_code;
    private String brick_region;
    private String area_manager;


}
