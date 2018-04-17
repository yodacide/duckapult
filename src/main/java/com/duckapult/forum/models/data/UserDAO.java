package com.duckapult.forum.models.data;

import com.duckapult.forum.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserDAO extends CrudRepository<User, Integer>{
}


