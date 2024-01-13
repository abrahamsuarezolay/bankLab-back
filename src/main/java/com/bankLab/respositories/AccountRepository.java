package com.bankLab.respositories;

import com.bankLab.models.AccountVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountVO, Integer> {
}
