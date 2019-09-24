package com.user.UserMicroService;

import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long> {
}
