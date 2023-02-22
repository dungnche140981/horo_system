package vn.edu.fpt.fpt.horo.dto.response.profile;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.fpt.fpt.horo.config.datatime.CustomDateDeserializer;
import vn.edu.fpt.fpt.horo.config.datatime.CustomDateSerializer;
import vn.edu.fpt.fpt.horo.dto.common.AuditableResponse;

import java.time.LocalDate;
import java.util.List;

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
public class GetProfileDetailResponse extends AuditableResponse {

    private static final long serialVersionUID = 5684387979889249940L;
    private String profileId;
    private String gender;
    private String fullName;
    private String username;
    private String email;
    private List<String> roles;
    @JsonSerialize(using = CustomDateSerializer.class)
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String studentId;
    private String studentCode;
    private String major;
    private Integer currentTermNo;
    private String specialized;
    private String avatar;
    private String description;
    private String award;
    private String interest;
}
