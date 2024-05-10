package com.uber.common.entities;

import com.uber.common.utils.CarType;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car extends CommonEntity{

    @Column(nullable = false, unique = true, updatable = false)
    private String licensePlate;

    @Column(nullable = false, unique = true, updatable = false)
    private String brand;

    @Column(nullable = false, unique = true, updatable = false)
    private String model;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;

    @ManyToOne
    private Color color;

    @OneToOne
    private Driver driver;
}
