package com.bankLab.service;

import com.bankLab.models.OperationVO;
import com.bankLab.repositories.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    OperationRepository operationRepository;

    @Override
    public <S extends OperationVO> S save(S entity) {
        return operationRepository.save(entity);
    }

    @Override
    public <S extends OperationVO> Iterable<S> saveAll(Iterable<S> entities) {
        return operationRepository.saveAll(entities);
    }

    @Override
    public Optional<OperationVO> findById(Integer integer) {
        return operationRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return operationRepository.existsById(integer);
    }

    @Override
    public Iterable<OperationVO> findAll() {
        return operationRepository.findAll();
    }

    @Override
    public Iterable<OperationVO> findAllById(Iterable<Integer> integers) {
        return operationRepository.findAllById(integers);
    }

    @Override
    public long count() {
        return operationRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        operationRepository.deleteById(integer);
    }

    @Override
    public void delete(OperationVO entity) {
        operationRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        operationRepository.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends OperationVO> entities) {
        operationRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        operationRepository.deleteAll();
    }
}
