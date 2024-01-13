package com.bankLab.respositories;

import com.bankLab.models.UserVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserVO, Integer> {
}
