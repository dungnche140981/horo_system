package vn.edu.fpt.fpt.horo.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@SuperBuilder
public abstract class AuditableResponse implements Serializable {

    private static final long serialVersionUID = -8406677523279755332L;
    protected UserInfoResponse createdBy;
    protected LocalDateTime createdDate;
    protected UserInfoResponse lastModifiedBy;
    protected LocalDateTime lastModifiedDate;
}
