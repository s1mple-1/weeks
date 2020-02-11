package day.of.week;

import config.MyCon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyCon.class);

        WeekDay weekDay = applicationContext.getBean(WeekDay.class);
        System.out.println(weekDay.getWeekDayName());
    }
}
