package com.jsonindent.repository;

import com.jsonindent.entity.Feedback;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vkamble on 04/06/18.
 */
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
