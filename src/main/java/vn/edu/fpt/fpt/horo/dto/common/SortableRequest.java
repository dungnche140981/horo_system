package vn.edu.fpt.fpt.horo.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

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
public class SortableRequest implements Serializable {
    private static final long serialVersionUID = -2482003057363899302L;
    private String property;
    private Sort.Direction direction;

    public SortableRequest(String property, String direction) {
        this.property = property;
        this.direction = Sort.Direction.fromOptionalString(direction).orElse(Sort.Direction.DESC);
    }
}
