package com.bankLab.service;

import com.bankLab.models.AccountVO;
import com.bankLab.respositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public <S extends AccountVO> S save(S entity) {
        return accountRepository.save(entity);
    }

    @Override
    public <S extends AccountVO> Iterable<S> saveAll(Iterable<S> entities) {
        return accountRepository.saveAll(entities);
    }

    @Override
    public Optional<AccountVO> findById(Integer integer) {
        return accountRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return accountRepository.existsById(integer);
    }

    @Override
    public Iterable<AccountVO> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Iterable<AccountVO> findAllById(Iterable<Integer> integers) {
        return accountRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return accountRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        accountRepository.deleteById(integer);
    }

    @Override
    public void delete(AccountVO entity) {
        accountRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        accountRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends AccountVO> entities) {
        accountRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        accountRepository.deleteAll();
    }
}
