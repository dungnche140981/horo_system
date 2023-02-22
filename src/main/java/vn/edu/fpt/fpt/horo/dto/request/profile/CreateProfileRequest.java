package vn.edu.fpt.fpt.horo.dto.request.profile;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.fpt.fpt.horo.config.datatime.CustomDateDeserializer;
import vn.edu.fpt.fpt.horo.config.datatime.CustomDateSerializer;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * vn.edu.fpt.fpt.horo.dto.request.profile
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateProfileRequest implements Serializable {
    private static final long serialVersionUID = 3780717543344413848L;
    private String accountId;
    private String gender;
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
}
