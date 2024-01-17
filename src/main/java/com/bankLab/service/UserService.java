package com.bankLab.service;

import com.bankLab.models.UserVO;

import java.util.Optional;

public interface UserService {
    <S extends UserVO> S save(S entity);

    <S extends UserVO> Iterable<S> saveAll(Iterable<S> entities);

    Optional<UserVO> findById(Integer integer);

    Optional<UserVO> findByUserName(String user_name);

    boolean existsById(Integer integer);

    Iterable<UserVO> findAll();

    Iterable<UserVO> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(UserVO entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends UserVO> entities);

    void deleteAll();
}
