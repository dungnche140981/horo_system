package vn.edu.fpt.fpt.horo.dto.response.cv;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.response.cv
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetCVDetailResponse implements Serializable {

    private static final long serialVersionUID = 7570066309941982807L;
    private String cvId;
    private String cvName;
    private String description;

}
