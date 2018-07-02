package com.luying.cloud.sys.organization.domain.event;


import com.luying.cloud.sys.organization.domain.entity.SysOrgPerson;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/19 下午2:30
 * @modified
 */
public interface ISysOrgPersonEvent extends ISysOrgElementEvent<SysOrgPerson> {
    /**
     * 根据登陆名获取用户
     *
     * @param fdLoginName 登录名
     * @return
     */
    SysOrgPerson findByLoginName(String fdLoginName);
}
