package com.uber.common.entities;

import jakarta.persistence.OneToMany;

import java.util.List;

public class Color extends CommonEntity{
    private String name;
    @OneToMany(mappedBy = "color")
    private List<Car> cars;
}
