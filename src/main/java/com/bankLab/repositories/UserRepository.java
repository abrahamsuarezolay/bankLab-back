package com.bankLab.repositories;

import com.bankLab.models.UserVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {
}
