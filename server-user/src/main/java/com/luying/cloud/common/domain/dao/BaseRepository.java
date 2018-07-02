package com.luying.cloud.common.domain.dao;

import com.luying.cloud.common.domain.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/5/20 上午11:55
 * @modified
 */
@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity> extends JpaRepository<E, String> {

    /**
     * 根据id列表删除数据
     *
     * @param ids
     */
    @Query("delete from #{#entityName} where fdId in ?1")
    void deleteByFdIdIn(List<String> ids);

}

