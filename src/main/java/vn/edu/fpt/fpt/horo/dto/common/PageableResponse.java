package vn.edu.fpt.fpt.horo.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

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
@SuperBuilder
public class PageableResponse<T> implements Serializable {

    private static final long serialVersionUID = 4717802793734384140L;
    private Integer currentPage;
    private Integer currentSize;
    private Integer totalPage;
    private Integer numberOfElements;
    private List<T> items;

    public PageableResponse(PageableRequest pageable, Long totalElements, List<T> items) {
        this.currentPage = pageable.getPage()+1;
        this.currentSize = pageable.getSize();
        this.totalPage = (int)Math.ceil((double) totalElements/pageable.getSize());
        this.numberOfElements = items.size();
        this.items = items;
    }

    public PageableResponse(List<T> items) {
        this.currentPage = 1;
        this.currentSize = items.size();
        this.totalPage = 1;
        this.numberOfElements = items.size();
        this.items = items;
    }
}
