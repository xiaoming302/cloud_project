package con.luying.cloud.external.user.dto;

import java.util.Date;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/14 下午5:39
 * @modified
 */
public class Person {

    protected String fdLoginName;
    protected String fdName;
    protected String fdPassword;
    protected String fdParent;
    protected int fdAge;
    protected String fdSex;
    protected String fdEmail;
    protected String fdOfficeLocation;
    protected Date fdBirthday;
    protected Date fdStartWorkDate;
    protected Date fdJoinedDate;
    protected Date fdLeaveDate;
    protected String fdNo;
    protected boolean enabled = true;
    protected boolean nonLocked = true;
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
