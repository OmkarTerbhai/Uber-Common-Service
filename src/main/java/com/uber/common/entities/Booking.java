package com.uber.common.entities;

import com.uber.common.utils.BookingStatus;
import com.uber.common.utils.DriverApprovalStatus;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(indexes = {
//        @Index(columnList = "driver_id")
//})
public class Booking extends CommonEntity{

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @OneToOne
    private ExactLocation startLocation;

    @OneToOne
    private ExactLocation endLocation;

}
