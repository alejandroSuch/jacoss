package org.redlion.jacoss.service;

import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * Created by alejandro on 3/5/16.
 */
@Component
public class DateTimeService {
    public ZonedDateTime getCurrentDateAndTime() {
        return ZonedDateTime.now();
    }
}
