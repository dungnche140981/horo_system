package vn.edu.fpt.fpt.horo.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

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
public class SendSmsEvent implements Serializable {
    private static final long serialVersionUID = 893856313535683110L;
    private String templateId;
    private String sendTo;
    private Map<String, String> params;

}
