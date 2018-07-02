package com.luying.cloud.common.domain.entity;

/**
 * @author luoming
 * @version V1.0
 * @description 有实体名称的对象继承
 * @creater 2018/6/7 下午2:36
 * @modified
 */
public interface IBaseNameEntity extends IBaseEntity {
    /**
     * 实体名称
     * @return
     */
    String getFdName();
}
