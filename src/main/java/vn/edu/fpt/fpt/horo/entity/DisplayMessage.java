package vn.edu.fpt.fpt.horo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import vn.edu.fpt.fpt.horo.entity.common.Auditor;

import java.io.Serializable;

/**
 * vn.edu.fpt.fpt.horo.entity
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class DisplayMessage extends Auditor implements Serializable {
    private static final long serialVersionUID = -2757240779293611765L;
    @Id
    @Field(name = "_id", targetType = FieldType.OBJECT_ID)
    private String displayMessageId;
    @Field(name = "code")
    private String code;
    @Field(name = "language")
    @Builder.Default
    private String language = "en";
    @Field(name = "message")
    private String message;
}
