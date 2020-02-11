package day.of.week;

import org.springframework.context.annotation.Bean;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;

public interface WeekDay {
    String getWeekDayName();
}
