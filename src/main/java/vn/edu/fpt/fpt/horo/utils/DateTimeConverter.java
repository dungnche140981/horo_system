package vn.edu.fpt.fpt.horo.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import vn.edu.fpt.fpt.horo.constant.ResponseStatusEnum;
import vn.edu.fpt.fpt.horo.exception.BusinessException;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static vn.edu.fpt.fpt.horo.utils.CustomDateTimeFormatter.DATE_FORMATTER;
import static vn.edu.fpt.fpt.horo.utils.CustomDateTimeFormatter.DATE_TIME_FORMATTER;

/**
 * vn.edu.fpt.fpt.horo.utils
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateTimeConverter {

    public static LocalDateTime toLocalDateTime(String localDateTime) {
        try {
            return LocalDateTime.parse(localDateTime, DATE_TIME_FORMATTER);
        }catch (Exception ex){
            throw new BusinessException(ResponseStatusEnum.VALIDATION_ERROR, "Can not convert: "+ localDateTime+" to LocalDateTime");
        }
    }

    public static LocalDate toLocaleDate(String localDate){
        try {
            return LocalDate.parse(localDate, DATE_FORMATTER);
        }catch (Exception ex){
            throw new BusinessException(ResponseStatusEnum.VALIDATION_ERROR, "Can not convert: "+localDate+ " to DateTime");
        }
    }
}
