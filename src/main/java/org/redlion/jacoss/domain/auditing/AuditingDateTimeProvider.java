package org.redlion.jacoss.domain.auditing;

import org.redlion.jacoss.service.DateTimeService;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by alejandro on 3/5/16.
 */
public class AuditingDateTimeProvider implements DateTimeProvider {
    DateTimeService dateTimeService;

    public AuditingDateTimeProvider(DateTimeService dateTimeService) {
        this.dateTimeService = dateTimeService;
    }

    @Override
    public Calendar getNow() {
        return GregorianCalendar.from(dateTimeService.getCurrentDateAndTime());
    }
}
