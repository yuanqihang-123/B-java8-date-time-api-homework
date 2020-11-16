package com.thoughtworks.capability.gtb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate laborDay = LocalDate.of(Integer.parseInt(Year.now().toString()), 5, 1);
    if(date.isBefore(laborDay)){
      return DAYS.between(date,laborDay);
    }
    return DAYS.between(date,laborDay.plusYears(1));
  }
}
