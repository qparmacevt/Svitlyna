package com.qparmacevt.svitlyna.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.sql.Timestamp;

@Entity
@Table(name="Journal")
@Getter
@Setter
@NoArgsConstructor
public class Journal {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "journal_sequence"),
                    @Parameter(name = "initial_value", value = "10"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long journal_id;

    private Long user_id;
    private Long product_id;
    private Long pharmacy_id;
    private Timestamp date;
}
