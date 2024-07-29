package com.qparmacevt.svitlyna.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor

public class Users {

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "users_sequence"),
                    @Parameter(name = "initial_value", value = "10"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )

    private Long user_id;

    private Long brick_id;
    @NotBlank
    @Column(name="user_name", unique=true, nullable=false)
    private String user_name;
    @NotBlank
    private String user_region;

    @Email
    @NotBlank
    @Column(name="email", nullable = false, unique = true)
    private String user_email;
}
