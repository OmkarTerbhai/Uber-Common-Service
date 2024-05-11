package com.uber.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExactLocation extends CommonEntity{

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;
}
