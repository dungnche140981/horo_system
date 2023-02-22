package vn.edu.fpt.fpt.horo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import vn.edu.fpt.fpt.horo.entity.common.Auditor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * vn.edu.fpt.fpt.horo.entity
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@Document(collection = "profiles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
public class Profile extends Auditor {

    private static final long serialVersionUID = -4959413365539181667L;
    @Id
    @Field(name = "_id", targetType = FieldType.OBJECT_ID)
    private String profileId;
    @Field(name = "gender")
    private String gender;
    @Field(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Field(name = "address")
    private String address;
    @Field(name = "phone_number")
    private String phoneNumber;
    @Field(name = "student_id")
    private String studentId;
    @Field(name = "student_code")
    private String studentCode;
    @Field(name = "major")
    private String major;
    @Field(name = "current_term_no")
    private Integer currentTermNo;
    @Field(name = "specialized")
    private String specialized;
    @Field(name = "avatar")
    private String avatar;
    @Field(name = "cv")
    @DBRef(lazy = true)
    @Builder.Default
    private List<CurriculumVitae> cv = new ArrayList<>();
    @Field(name = "interest")
    private String interest;
    @Field(name = "award")
    private String award;
    @Field(name = "description")
    private String description;
}
