package com.uber.common.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends CommonEntity {
    private String name;
    private int age;
    private String email;
    private String password;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.PERSIST)
    private List<Review> driverReviews;

    @OneToOne
    private Car car;
}