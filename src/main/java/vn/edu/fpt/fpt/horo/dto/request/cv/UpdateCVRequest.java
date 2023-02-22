package vn.edu.fpt.fpt.horo.dto.request.cv;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.fpt.fpt.horo.dto.common.CreateFileRequest;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.request.cv
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateCVRequest implements Serializable {
    private static final long serialVersionUID = -5095264388141420494L;
    private String cvName;
    private String description;
    private CreateFileRequest cv;
}
