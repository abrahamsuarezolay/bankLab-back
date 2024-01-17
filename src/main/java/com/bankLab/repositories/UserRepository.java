package com.bankLab.repositories;

import com.bankLab.models.UserVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {

    public Optional<UserVO> findByUserName(String userName);
}
