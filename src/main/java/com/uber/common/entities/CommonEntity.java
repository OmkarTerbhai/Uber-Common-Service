package com.uber.common.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int id;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    public Date createdAt;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    public Date updatedAt;

    @PrePersist
    public void beforeSave() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    @PreUpdate
    private void beforeUpdate() {
        this.updatedAt = new Date();
    }
}