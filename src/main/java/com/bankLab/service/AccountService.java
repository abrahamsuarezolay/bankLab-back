package com.bankLab.service;

import com.bankLab.models.AccountVO;

import java.util.Optional;

public interface AccountService {
    <S extends AccountVO> S save(S entity);

    <S extends AccountVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<AccountVO> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<AccountVO> findAll();

    Iterable<AccountVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(AccountVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends AccountVO> entities);

    void deleteAll();
}
