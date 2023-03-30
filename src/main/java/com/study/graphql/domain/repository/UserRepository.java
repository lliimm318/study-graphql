package com.study.graphql.domain.repository;

import com.study.graphql.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<String, User> {
}
