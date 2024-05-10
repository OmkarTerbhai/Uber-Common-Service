package com.uber.common.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RiderReview extends Review{
    private short riderRating;

    private String riderContent;
}
