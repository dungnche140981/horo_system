package vn.edu.fpt.fpt.horo.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.entity.common
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

public class GeneralResponse <T> implements Serializable {
    private static final long serialVersionUID = -369541457518166195L;
    private _ResponseStatus status;
    private T data;
}
