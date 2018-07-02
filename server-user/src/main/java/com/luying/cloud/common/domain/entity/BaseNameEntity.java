package com.luying.cloud.common.domain.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author luoming
 * @version V1.0
 * @description 实体名称，不能为空。
 * @creater 2018/6/7 下午2:38
 * @modified
 */
@MappedSuperclass
public class BaseNameEntity extends BaseEntity implements IBaseNameEntity {

    @Column(nullable = false)
    protected String fdName;

    @Override
    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }
}
