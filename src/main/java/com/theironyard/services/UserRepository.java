package com.theironyard.services;//Created by KevinBozic on 3/16/16.

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
}
