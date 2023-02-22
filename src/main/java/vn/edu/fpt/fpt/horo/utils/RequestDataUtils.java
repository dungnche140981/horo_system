package vn.edu.fpt.fpt.horo.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * vn.edu.fpt.fpt.horo.utils
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestDataUtils {

    public static ObjectId convertObjectId(String data){
        return data == null ? null : ObjectId.isValid(data) ? new ObjectId(data) : null;
    }

    public static String convertSearchableData(String data){
        if(Objects.nonNull(data)) {
            return "^.*" + data + ".*$";
        }else{
            return null;
        }
    }

    public static Boolean convertSearchableData(Boolean bool){
        if(Objects.nonNull(bool)){
            return bool;
        }else{
            return true;
        }
    }

    public static LocalDateTime convertDateTimeFrom(String dateFrom){
        if(Objects.isNull(dateFrom) || dateFrom.isBlank()){
            return LocalDateTime.of(1900, 1, 1,0, 0, 0);
        }else{
            return DateTimeConverter.toLocalDateTime(dateFrom);
        }
    }

    public static LocalDateTime convertDateTimeTo(String dateTo){
        if(Objects.isNull(dateTo) || dateTo.isBlank()){
            return LocalDateTime.now();
        }else{
            return DateTimeConverter.toLocalDateTime(dateTo);
        }
    }

    public static LocalDate convertDateFrom(String dateFrom){
        if(Objects.isNull(dateFrom) || dateFrom.isBlank()){
            return LocalDate.of(1900, 1, 1);
        }else{
            return DateTimeConverter.toLocaleDate(dateFrom);
        }
    }

    public static LocalDate convertDateTo(String dateTo){
        if(Objects.isNull(dateTo) || dateTo.isBlank()){
            return LocalDate.now();
        }else{
            return DateTimeConverter.toLocaleDate(dateTo);
        }
    }
}
