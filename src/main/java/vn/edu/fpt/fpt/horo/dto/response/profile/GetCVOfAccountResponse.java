package vn.edu.fpt.fpt.horo.dto.response.profile;

import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.fpt.fpt.horo.dto.common.AuditableResponse;

/**
 * vn.edu.fpt.fpt.horo.dto.response.profile
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class GetCVOfAccountResponse extends AuditableResponse {

    private static final long serialVersionUID = -5646159877445859842L;
    private String cvId;
    private String cvName;
}
