package com.bankLab.service;

import com.bankLab.models.AccountVO;
import com.bankLab.repositories.AcccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AcccountRepository acccountRepository;

    @Override
    public <S extends AccountVO> S save(S entity) {
        return acccountRepository.save(entity);
    }

    @Override
    public <S extends AccountVO> Iterable<S> saveAll(Iterable<S> entities) {
        return acccountRepository.saveAll(entities);
    }

    @Override
    public Optional<AccountVO> findById(Integer integer) {
        return acccountRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return acccountRepository.existsById(integer);
    }

    @Override
    public Iterable<AccountVO> findAll() {
        return acccountRepository.findAll();
    }

    @Override
    public Iterable<AccountVO> findAllById(Iterable<Integer> integers) {
        return acccountRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return acccountRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        acccountRepository.deleteById(integer);
    }

    @Override
    public void delete(AccountVO entity) {
        acccountRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        acccountRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends AccountVO> entities) {
        acccountRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        acccountRepository.deleteAll();
    }
}
