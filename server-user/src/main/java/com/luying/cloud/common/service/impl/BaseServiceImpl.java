package com.luying.cloud.common.service.impl;

import com.luying.cloud.common.domain.entity.BaseEntity;
import com.luying.cloud.common.domain.event.IBaseEvent;
import com.luying.cloud.common.service.IBaseService;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/7 下午6:19
 * @modified
 */
public abstract class BaseServiceImpl<T extends IBaseEvent<E>, E extends BaseEntity>
        implements IBaseService<E> {

    protected T baseEvent;

    /**
     * 对应模型的数据库dao类
     *
     * @param baseEvent
     */
    abstract public void setBaseEvent(T baseEvent);

    @Override
    public E findOne(String fdId) {
        return baseEvent.findOne(fdId);
    }

    @Override
    public List<E> findAll() {
        return baseEvent.findAll();
    }

    @Override
    public List<E> findAll(List<String> fdIds) {
        return baseEvent.findAll(fdIds);
    }

    @Override
    public List<E> findAll(Sort sort) {
        return baseEvent.findAll(sort);
    }

    @Override
    public E save(E entity) {
        return baseEvent.save(entity);
    }

    @Override
    public List<E> save(List<E> entitys) {
        return baseEvent.save(entitys);
    }

    @Override
    public boolean exists(String fdId) {
        return this.baseEvent.exists(fdId);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String id) {
        this.baseEvent.delete(id);
    }

    @Override
    public void delete(E entity) {
        this.baseEvent.delete(entity);
    }

    @Override
    public void delete(List<E> entities) {
        this.baseEvent.delete(entities);
    }

    @Override
    public void deleteByIds(List<String> fdIds) {
        this.baseEvent.deleteByIds(fdIds);
    }

    @Override
    public void deleteAll() {
        this.baseEvent.deleteAll();
    }

}
