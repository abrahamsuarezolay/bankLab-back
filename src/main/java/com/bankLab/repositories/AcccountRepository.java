package com.bankLab.repositories;

import com.bankLab.models.AccountVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcccountRepository extends CrudRepository<AccountVO, Integer> {
}
