package com.luying.cloud.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/14 下午5:39
 * @modified
 */
@ApiModel(value = "人员数据传输对象")
public class Person {

    @ApiModelProperty("登录名")
    protected String fdLoginName;
    @ApiModelProperty("姓名")
    protected String fdName;
    @ApiModelProperty("密码")
    protected String fdPassword;
    @ApiModelProperty("所属部门编号")
    protected String fdParent;
    @ApiModelProperty("年龄")
    protected int fdAge;
    @ApiModelProperty("性别")
    protected String fdSex;
    @ApiModelProperty("邮箱")
    protected String fdEmail;
    @ApiModelProperty("办公地点")
    protected String fdOfficeLocation;
    @ApiModelProperty("出生日期")
    protected Date fdBirthday;
    @ApiModelProperty("参加工作日期")
    protected Date fdStartWorkDate;
    @ApiModelProperty("入职日期")
    protected Date fdJoinedDate;
    @ApiModelProperty("离职日期")
    protected Date fdLeaveDate;
    @ApiModelProperty("编号")
    protected String fdNo;
    @ApiModelProperty("是否启用")
    protected boolean enabled = true;
    @ApiModelProperty("是否未被锁定")
    protected boolean nonLocked = true;
    @ApiModelProperty("是否未失效")
    protected boolean nonExpired = true;


    public String getFdLoginName() {
        return fdLoginName;
    }

    public void setFdLoginName(String fdLoginName) {
        this.fdLoginName = fdLoginName;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public String getFdPassword() {
        return fdPassword;
    }

    public void setFdPassword(String fdPassword) {
        this.fdPassword = fdPassword;
    }

    public String getFdParent() {
        return fdParent;
    }

    public void setFdParent(String fdParent) {
        this.fdParent = fdParent;
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

    public String getFdNo() {
        return fdNo;
    }

    public void setFdNo(String fdNo) {
        this.fdNo = fdNo;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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

    @Override
    public String toString() {
        return "Person{" +
                "fdLoginName='" + fdLoginName + '\'' +
                ", fdPassword='" + fdPassword + '\'' +
                ", fdParent='" + fdParent + '\'' +
                ", fdAge=" + fdAge +
                ", fdSex='" + fdSex + '\'' +
                ", fdEmail='" + fdEmail + '\'' +
                ", fdOfficeLocation='" + fdOfficeLocation + '\'' +
                ", fdBirthday=" + fdBirthday +
                ", fdStartWorkDate=" + fdStartWorkDate +
                ", fdJoinedDate=" + fdJoinedDate +
                ", fdLeaveDate=" + fdLeaveDate +
                ", fdNo='" + fdNo + '\'' +
                ", enabled=" + enabled +
                ", nonLocked=" + nonLocked +
                ", nonExpired=" + nonExpired +
                '}';
    }
}
