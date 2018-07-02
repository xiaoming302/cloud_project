package com.luying.cloud.sys.organization.domain.event.impl;

import com.luying.cloud.common.domain.annotation.Event;
import com.luying.cloud.sys.organization.domain.dao.SysOrgPersonRepository;
import com.luying.cloud.sys.organization.domain.entity.SysOrgPerson;
import com.luying.cloud.sys.organization.domain.event.ISysOrgPersonEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:31
 * @modified
 */
@Event
public class SysOrgPersonEventImpl extends SysOrgElementEventImpl<SysOrgPersonRepository, SysOrgPerson>
        implements ISysOrgPersonEvent {

    @Override
    public SysOrgPerson findByLoginName(String fdLoginName) {
        return this.baseRepository.findByFdLoginName(fdLoginName);
    }

    @Autowired
    @Override
    public void setBaseRepository(SysOrgPersonRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
}
