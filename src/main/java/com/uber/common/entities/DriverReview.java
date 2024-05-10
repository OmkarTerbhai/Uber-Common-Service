package com.uber.common.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DriverReview extends Review{
    private short driverRating;

    private String driverContent;
}
