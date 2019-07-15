package io.chacha.beaba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.chacha.beaba.tables.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
