package vn.edu.fpt.fpt.horo.repository;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import vn.edu.fpt.fpt.horo.dto.common.AuditableRequest;
import vn.edu.fpt.fpt.horo.dto.common.PageableRequest;

import java.util.Objects;

/**
 * vn.edu.fpt.fpt.horo.repository
 *
 * @author : Portgas.D.Ace
 * @created : 22/02/2023
 * @contact : 0339850697- congdung2510@gmail.com
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseMongoRepository {

    public static void addCriteriaWithPageable(Query query, PageableRequest request) {
        PageRequest pageRequest = PageRequest.of(request.getPage(), request.getSize());
        query.with(pageRequest);
    }

    public static void addCriteriaWithAuditable(Query query, AuditableRequest request) {
        if (Objects.nonNull(request.getCreatedBy())) {
            query.addCriteria(Criteria.where("created_by").is(request.getCreatedBy()));
        }

        query.addCriteria(Criteria.where("created_date").gte(request.getCreatedDateFrom()).lte(request.getCreatedDateTo()));

        if (Objects.nonNull(request.getLastModifiedBy())) {
            query.addCriteria(Criteria.where("last_modified_by").is(request.getLastModifiedBy()));
        }

        query.addCriteria(Criteria.where("last_modified_date").gte(request.getLastModifiedDateFrom()).lte(request.getLastModifiedDateTo()));
    }

    public static void addCriteriaWithSorted(Query query, PageableRequest request){
        request.getSortBy().forEach(v -> {
            query.with(Sort.by(v.getDirection(), v.getProperty()));
        });
    }
}
