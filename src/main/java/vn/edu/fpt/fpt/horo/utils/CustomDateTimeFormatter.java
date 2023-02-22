package vn.edu.fpt.fpt.horo.utils;

import java.time.format.DateTimeFormatter;

/**
 * vn.edu.fpt.fpt.horo.utils
 *
 * @author : Portgas.D.Ace
 * @created : 18/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

public class CustomDateTimeFormatter {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss SSS");

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
}
