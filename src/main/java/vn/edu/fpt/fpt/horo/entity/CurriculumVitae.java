package vn.edu.fpt.fpt.horo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import vn.edu.fpt.fpt.horo.entity.common.Auditor;

/**
 * vn.edu.fpt.fpt.horo.entity
 *
 * @author : Portgas.D.Ace
 * @created : 17/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@Document(collection = "curriculum_vitae")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder

public class CurriculumVitae extends Auditor {
    private static final long serialVersionUID = 3270598026059811449L;
    @Id
    @Field(name = "_id", targetType = FieldType.OBJECT_ID)
    private String cvId;
    @Field(name = "cv_name")
    private String cvName;
    @Field(name = "description")
    private String description;
    @Field(name = "file")
    @DBRef(lazy = true)
    private _File file;
}
