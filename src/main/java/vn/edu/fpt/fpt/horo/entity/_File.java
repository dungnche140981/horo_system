package vn.edu.fpt.fpt.horo.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
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
@Document(collection = "files")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder

public class _File extends Auditor {
    private static final long serialVersionUID = -1344802533955238175L;
    @Id
    @Field(name = "_id", targetType = FieldType.OBJECT_ID)
    private String fileId;
    @Field(name = "file_name")
    private String fileName;
    @Field(name = "file_key")
    private String fileKey;
    @Field(name = "description")
    private String description;
    @Field(name = "size")
    private String size;
    @Field(name = "type")
    private String type;
    @Field(name = "length")
    private Long length;
    @Field(name = "mime_type")
    private String mimeType;
}
