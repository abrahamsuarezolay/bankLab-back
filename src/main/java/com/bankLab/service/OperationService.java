package com.bankLab.service;

import com.bankLab.models.OperationVO;

import java.util.Optional;

public interface OperationService {
    <S extends OperationVO> S save(S entity);

    <S extends OperationVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<OperationVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<OperationVO> findAll();

    Iterable<OperationVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(OperationVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends OperationVO> entities);

    void deleteAll();
}
