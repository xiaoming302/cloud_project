package com.luying.cloud.sys.organization.domain.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author luoming
 * @version V1.0
 * @description 组织架构人员对象用于保存人员数据
 * @creater 2018/6/7 下午3:25
 * @modified
 */
@Entity
@Table
public class SysOrgPerson extends SysOrgElement {

    @Column(length = 50, unique = true, nullable = false)
    protected String fdLoginName;

    @Column
    protected String fdPassword;

    @Column
    protected int fdAge;

    @Column
    protected String fdSex;

    @Column
    @Temporal(TemporalType.DATE)
    protected Date fdBirthday;

    @Column
    @Temporal(TemporalType.DATE)
    protected Date fdStartWorkDate;

    @Column
    @Temporal(TemporalType.DATE)
    protected Date fdJoinedDate;

    @Column
    @Temporal(TemporalType.DATE)
    protected Date fdLeaveDate;

    @Column
    protected boolean nonLocked = true;

    @Column
    protected boolean nonExpired = true;

    @Override
    public int getFdType() {
        return 8;
    }

    public String getFdLoginName() {
        return fdLoginName;
    }

    public void setFdLoginName(String fdLoginName) {
        this.fdLoginName = fdLoginName;
    }

    public String getFdPassword() {
        return fdPassword;
    }

    public void setFdPassword(String fdPassword) {
        this.fdPassword = fdPassword;
    }

    public int getFdAge() {
        return fdAge;
    }

    public void setFdAge(int fdAge) {
        this.fdAge = fdAge;
    }

    public String getFdSex() {
        return fdSex;
    }

    public void setFdSex(String fdSex) {
        this.fdSex = fdSex;
    }

    public Date getFdBirthday() {
        return fdBirthday;
    }

    public void setFdBirthday(Date fdBirthday) {
        this.fdBirthday = fdBirthday;
    }

    public Date getFdStartWorkDate() {
        return fdStartWorkDate;
    }

    public void setFdStartWorkDate(Date fdStartWorkDate) {
        this.fdStartWorkDate = fdStartWorkDate;
    }

    public Date getFdJoinedDate() {
        return fdJoinedDate;
    }

    public void setFdJoinedDate(Date fdJoinedDate) {
        this.fdJoinedDate = fdJoinedDate;
    }

    public Date getFdLeaveDate() {
        return fdLeaveDate;
    }

    public void setFdLeaveDate(Date fdLeaveDate) {
        this.fdLeaveDate = fdLeaveDate;
    }

    public boolean isNonLocked() {
        return nonLocked;
    }

    public void setNonLocked(boolean nonLocked) {
        this.nonLocked = nonLocked;
    }

    public boolean isNonExpired() {
        return nonExpired;
    }

    public void setNonExpired(boolean nonExpired) {
        this.nonExpired = nonExpired;
    }
}
