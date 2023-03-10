package vn.edu.fpt.fpt.horo.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.dto.common
 *
 * @author : Portgas.D.Ace
 * @created : 18/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateFileRequest implements Serializable {

    private static final long serialVersionUID = -8018425855089614074L;
    private String name;
    private String base64;
    private Long size;
    private String mimeType;
}
