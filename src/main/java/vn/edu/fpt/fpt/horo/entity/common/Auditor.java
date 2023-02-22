package vn.edu.fpt.fpt.horo.entity.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * vn.edu.fpt.fpt.horo.entity.common
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditor implements Serializable {

    private static final long serialVersionUID = -1270165536077836250L;
    @Field(name = "created_by")
    @CreatedBy
    private String createdBy;
    @Field(name = "created_date")
    @CreatedDate
    private LocalDateTime createdDate;
    @Field(name = "last_modified_by")
    @LastModifiedBy
    private String lastModifiedBy;
    @Field(name = "last_modified_date")
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
