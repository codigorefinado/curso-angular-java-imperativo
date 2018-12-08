package com.github.codigorefinado.cursodeangularjava.searchback.repository;

import com.github.codigorefinado.cursodeangularjava.searchback.model.Topic;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {
    List<Topic> findByDescriptionLikeIgnoreCase(String description);
}
