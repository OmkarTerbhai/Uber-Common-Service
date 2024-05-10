package com.uber.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Node_Prop_Config extends CommonEntity{

    @Column(nullable = false, unique = true)
    private String prop_name;

    @Column(nullable = false)
    private String prop_value;
}
