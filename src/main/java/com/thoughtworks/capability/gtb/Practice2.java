package com.thoughtworks.capability.gtb;

import javafx.util.converter.LocalDateStringConverter;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    LocalDate localDate = date.plusDays(1);
    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    if (dayOfWeek==DayOfWeek.SATURDAY){
      return localDate.plusDays(2);
    }else if (dayOfWeek==DayOfWeek.SUNDAY){
      return localDate.plusDays(1);
    }else {
      return localDate;
    }
  }
}
