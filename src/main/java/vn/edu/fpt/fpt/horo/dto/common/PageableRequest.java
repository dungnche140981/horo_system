package vn.edu.fpt.fpt.horo.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import vn.edu.fpt.fpt.horo.constant.AppConstant;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * vn.edu.fpt.fpt.horo.dto.common
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder(toBuilder = true)
public abstract class PageableRequest implements Serializable {

    private static final long serialVersionUID = 584841879771493450L;
    protected Integer page;
    protected Integer size;
    protected List<SortableRequest> sortBy;

    public Integer getPage() {
        return Objects.nonNull(page) && page > 0 ? page : AppConstant.PAGE_DEFAULT;
    }

    public Integer getSize() {
        return Objects.nonNull(size) && size > 0 ? size : AppConstant.SIZE_DEFAULT;
    }

    public List<SortableRequest> getSortBy() {
        return sortBy;
    }
}
