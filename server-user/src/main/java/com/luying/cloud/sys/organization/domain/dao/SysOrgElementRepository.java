package com.luying.cloud.sys.organization.domain.dao;

import com.luying.cloud.common.domain.dao.BaseRepository;
import com.luying.cloud.sys.organization.domain.entity.SysOrgElement;
import org.springframework.stereotype.Repository;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/18 下午10:53
 * @modified
 */
@Repository
public interface SysOrgElementRepository<E extends SysOrgElement> extends BaseRepository<E> {

    /**
     * 根据编号查询组织架构对象
     *
     * @param no
     * @return
     */
    E findByFdNo(String no);
}
