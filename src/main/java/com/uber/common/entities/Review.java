package com.uber.common.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review extends CommonEntity {
    @Column
    public String content;

    @ManyToOne
    private Rider rider;

    @ManyToOne
    private Driver driver;
}