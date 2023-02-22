package vn.edu.fpt.fpt.horo.constant;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * vn.edu.fpt.fpt.horo.constant
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ApplicationStatus {
    WAITING_FOR_APPROVE("WAITING_FOR_APPROVAL"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
            ;

    private String statusName;

    ApplicationStatus(String statusName) {
        this.statusName = statusName;
    }
}
