package com.luying.cloud.common.service;

import com.luying.cloud.common.domain.entity.BaseEntity;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @author luoming
 * @version V1.0
 * @description 通用service基类，集合了常用的service方法。
 * @creater 2018/6/7 下午6:19
 * @modified
 */
public interface IBaseService<E extends BaseEntity> {

    /**
     * 根据ID查询数据
     *
     * @param fdId
     * @return
     */
    E findOne(String fdId);

    /**
     * 查询所有数据
     *
     * @return
     */
    List<E> findAll();

    /**
     * 根据Id列表查询数据
     *
     * @param fdIds
     * @return
     */
    List<E> findAll(List<String> fdIds);

    /**
     * 查询所有数据并排序
     *
     * @param sort
     * @return
     */
    List<E> findAll(Sort sort);

    /**
     * 保存单个数据对象
     *
     * @param entity
     * @return
     */
    E save(E entity);

    /**
     * 保存一组数据对象
     *
     * @param entitys
     * @return
     */
    List<E> save(List<E> entitys);

    /**
     * 根据Id判断数据是否存在
     *
     * @param fdId
     * @return
     */
    boolean exists(String fdId);

    /**
     * 获取数据总数
     *
     * @return
     */
    long count();

    /**
     * 根据Id删除对象
     *
     * @param id
     */
    void delete(String id);

    /**
     * 删除对象
     *
     * @param entity
     */
    void delete(E entity);

    /**
     * 删除List中的对象
     *
     * @param entities
     */
    void delete(List<E> entities);

    /**
     * 根据id列表删除数据
     *
     * @param fdIds
     */
    void deleteByIds(List<String> fdIds);

    /**
     * 删除所有
     */
    void deleteAll();
}
