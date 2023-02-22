package vn.edu.fpt.fpt.horo.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.i18n.LocaleContextHolder;
import vn.edu.fpt.fpt.horo.config.datatime.CustomDateTimeSerializer;
import vn.edu.fpt.fpt.horo.constant.ResponseStatusEnum;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * vn.edu.fpt.fpt.horo.dto.common
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class _ResponseStatus implements Serializable {
    private static final long serialVersionUID = -8476144773001611196L;
    private Integer status;
    private String code;
    private String message;
    private String displayMessage;
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    private LocalDateTime responseDate;
    public _ResponseStatus(Integer status, String code){
        this.status = status;
        this.code = code;
        this.message = null;
        this.displayMessage = null;
        this.responseDate = LocalDateTime.now(LocaleContextHolder.getTimeZone().toZoneId());
    }

    public _ResponseStatus(Integer status, String code, String message){
        this.status = status;
        this.code = code;
        this.message = message;
        this.displayMessage = null;
        this.responseDate = LocalDateTime.now(LocaleContextHolder.getTimeZone().toZoneId());
    }

    public _ResponseStatus(ResponseStatusEnum statusEnum){
        this.status = statusEnum.getStatus();
        this.code = statusEnum.getCode();
        this.message = null;
        this.displayMessage = null;
        this.responseDate = LocalDateTime.now(LocaleContextHolder.getTimeZone().toZoneId());
    }

}
