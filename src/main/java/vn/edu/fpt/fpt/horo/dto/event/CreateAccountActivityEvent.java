package vn.edu.fpt.fpt.horo.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.event
 *
 * @author : Portgas.D.Ace
 * @created : 18/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateAccountActivityEvent implements Serializable {
    private static final long serialVersionUID = 1921172752115994910L;
    private String accountId;
}
