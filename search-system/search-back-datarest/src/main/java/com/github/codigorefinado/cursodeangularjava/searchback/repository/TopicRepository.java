package com.github.codigorefinado.cursodeangularjava.searchback.repository;

import com.github.codigorefinado.cursodeangularjava.searchback.model.Topic;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface TopicRepository extends PagingAndSortingRepository<Topic, Long> {
}
