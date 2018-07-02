package com.luying.cloud.sys.organization.domain.entity;



import com.luying.cloud.common.domain.entity.BaseNameEntity;

import javax.persistence.*;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/7 下午2:34
 * @modified
 */
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class SysOrgElement extends BaseNameEntity {

    @Column
    protected int fdType;

    @JoinColumn
    protected SysOrgElement fdParent;

    @Column
    protected boolean enabled = true;

    @Column
    protected String fdEmail;

    @Column
    protected String fdOfficeLocation;

    @Column(unique = true, nullable = false)
    protected String fdNo;

    public int getFdType() {
        return fdType;
    }

    public void setFdType(int fdType) {
        this.fdType = fdType;
    }

    public SysOrgElement getFdParent() {
        return fdParent;
    }

    public void setFdParent(SysOrgElement fdParent) {
        this.fdParent = fdParent;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFdEmail() {
        return fdEmail;
    }

    public void setFdEmail(String fdEmail) {
        this.fdEmail = fdEmail;
    }

    public String getFdOfficeLocation() {
        return fdOfficeLocation;
    }

    public void setFdOfficeLocation(String fdOfficeLocation) {
        this.fdOfficeLocation = fdOfficeLocation;
    }

    public String getFdNo() {
        return fdNo;
    }

    public void setFdNo(String fdNo) {
        this.fdNo = fdNo;
    }
}
