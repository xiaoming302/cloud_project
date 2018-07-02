package com.luying.cloud.common.domain.event.impl;

import com.luying.cloud.common.domain.dao.BaseRepository;
import com.luying.cloud.common.domain.entity.BaseEntity;
import com.luying.cloud.common.domain.event.IBaseEvent;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午1:58
 * @modified
 */
public abstract class BaseEventImpl<T extends BaseRepository<E>, E extends BaseEntity>
        implements IBaseEvent<E> {

    protected T baseRepository;

    /**
     * 对应模型的数据库dao类
     *
     * @param baseRepository
     */
    abstract public void setBaseRepository(T baseRepository);

    @Override
    public E findOne(String fdId) {
        return baseRepository.getOne(fdId);
    }

    @Override
    public List<E> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<E> findAll(List<String> fdIds) {
        return baseRepository.findAllById(fdIds);
    }

    @Override
    public List<E> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public E save(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public List<E> save(List<E> entitys) {
        return baseRepository.saveAll(entitys);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String fdId) {
        this.baseRepository.deleteById(fdId);
    }

    @Override
    public void delete(E entity) {
        this.baseRepository.delete(entity);
    }

    @Override
    public void delete(List<E> entities) {
        this.baseRepository.deleteAll(entities);
    }

    @Override
    public void deleteByIds(List<String> fdIds) {
        this.baseRepository.deleteByFdIdIn(fdIds);
    }

    @Override
    public void deleteAll() {
        this.baseRepository.deleteAll();
    }

    @Override
    public boolean exists(String fdId) {
        return this.baseRepository.existsById(fdId);
    }
}
