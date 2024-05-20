package com.uber.common.entities;

import com.uber.common.utils.BookingStatus;
import com.uber.common.utils.DriverApprovalStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends CommonEntity{

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.DATE)
    private Date startTime;

    @Temporal(value = TemporalType.DATE)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @OneToOne
    @Cascade(value = CascadeType.ALL)
    private ExactLocation startLocation;

    @OneToOne
    @Cascade(value = CascadeType.ALL)
    private ExactLocation endLocation;

}
