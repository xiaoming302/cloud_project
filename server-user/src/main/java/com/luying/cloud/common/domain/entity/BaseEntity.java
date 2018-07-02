package com.luying.cloud.common.domain.entity;

import com.luying.cloud.common.utils.IdGenerate;
import com.luying.cloud.utils.StringUtil;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/5/20 上午10:41
 * @modified
 */
@MappedSuperclass
public class BaseEntity implements IBaseEntity {

    @Id
    @Column(name = "fd_id", length = 36)
    @GeneratedValue(generator = "assigned_id")
    @GenericGenerator(name = "assigned_id", strategy = "assigned")
    protected String fdId;

    /**
     * 获取Id
     *
     * @return 数据主键
     */
    @Override
    public String getFdId() {
        if (StringUtil.isNull(fdId)) {
            fdId = IdGenerate.getId();
        }
        return fdId;
    }

    /**
     * 设置Id
     *
     * @param fdId 数据主键
     */
    public void setFdId(String fdId) {
        this.fdId = fdId;
    }
}
