package com.bankLab.respositories;

import com.bankLab.models.OperationVO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends CrudRepository<OperationVO, Integer> {
}
