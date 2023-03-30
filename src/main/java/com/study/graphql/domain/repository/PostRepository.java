package com.study.graphql.domain.repository;

import com.study.graphql.domain.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Long, Post> {
}
