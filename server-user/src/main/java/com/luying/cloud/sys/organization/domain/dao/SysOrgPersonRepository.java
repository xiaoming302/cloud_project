package com.luying.cloud.sys.organization.domain.dao;

import com.luying.cloud.sys.organization.domain.entity.SysOrgPerson;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/18 下午10:17
 * @modified
 */
@Repository
public interface SysOrgPersonRepository extends SysOrgElementRepository<SysOrgPerson> {

    /**
     * 根据登录名获取用户
     *
     * @param fdLoginName
     * @return
     */
    SysOrgPerson findByFdLoginName(@Param("fdLoginName") String fdLoginName);

}
