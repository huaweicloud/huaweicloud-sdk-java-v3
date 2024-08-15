package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CdmModifyClusterReq
 */
public class CdmModifyClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoOff")

    private Boolean autoOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleBootOff")

    private Boolean scheduleBootOff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleBootTime")

    private String scheduleBootTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduleOffTime")

    private String scheduleOffTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoRemind")

    private Boolean autoRemind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phoneNum")

    private String phoneNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    public CdmModifyClusterReq withAutoOff(Boolean autoOff) {
        this.autoOff = autoOff;
        return this;
    }

    /**
     * 自动关机。
     * @return autoOff
     */
    public Boolean getAutoOff() {
        return autoOff;
    }

    public void setAutoOff(Boolean autoOff) {
        this.autoOff = autoOff;
    }

    public CdmModifyClusterReq withScheduleBootOff(Boolean scheduleBootOff) {
        this.scheduleBootOff = scheduleBootOff;
        return this;
    }

    /**
     * 定时关机。
     * @return scheduleBootOff
     */
    public Boolean getScheduleBootOff() {
        return scheduleBootOff;
    }

    public void setScheduleBootOff(Boolean scheduleBootOff) {
        this.scheduleBootOff = scheduleBootOff;
    }

    public CdmModifyClusterReq withScheduleBootTime(String scheduleBootTime) {
        this.scheduleBootTime = scheduleBootTime;
        return this;
    }

    /**
     * 定时开机。
     * @return scheduleBootTime
     */
    public String getScheduleBootTime() {
        return scheduleBootTime;
    }

    public void setScheduleBootTime(String scheduleBootTime) {
        this.scheduleBootTime = scheduleBootTime;
    }

    public CdmModifyClusterReq withScheduleOffTime(String scheduleOffTime) {
        this.scheduleOffTime = scheduleOffTime;
        return this;
    }

    /**
     * 定时关机时间。
     * @return scheduleOffTime
     */
    public String getScheduleOffTime() {
        return scheduleOffTime;
    }

    public void setScheduleOffTime(String scheduleOffTime) {
        this.scheduleOffTime = scheduleOffTime;
    }

    public CdmModifyClusterReq withAutoRemind(Boolean autoRemind) {
        this.autoRemind = autoRemind;
        return this;
    }

    /**
     * 消息通知。
     * @return autoRemind
     */
    public Boolean getAutoRemind() {
        return autoRemind;
    }

    public void setAutoRemind(Boolean autoRemind) {
        this.autoRemind = autoRemind;
    }

    public CdmModifyClusterReq withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    /**
     * 手机号码，最多填写20个，以英文逗号分隔。
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public CdmModifyClusterReq withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址，最多填写20个，以英文逗号分隔。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmModifyClusterReq that = (CdmModifyClusterReq) obj;
        return Objects.equals(this.autoOff, that.autoOff) && Objects.equals(this.scheduleBootOff, that.scheduleBootOff)
            && Objects.equals(this.scheduleBootTime, that.scheduleBootTime)
            && Objects.equals(this.scheduleOffTime, that.scheduleOffTime)
            && Objects.equals(this.autoRemind, that.autoRemind) && Objects.equals(this.phoneNum, that.phoneNum)
            && Objects.equals(this.email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoOff, scheduleBootOff, scheduleBootTime, scheduleOffTime, autoRemind, phoneNum, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmModifyClusterReq {\n");
        sb.append("    autoOff: ").append(toIndentedString(autoOff)).append("\n");
        sb.append("    scheduleBootOff: ").append(toIndentedString(scheduleBootOff)).append("\n");
        sb.append("    scheduleBootTime: ").append(toIndentedString(scheduleBootTime)).append("\n");
        sb.append("    scheduleOffTime: ").append(toIndentedString(scheduleOffTime)).append("\n");
        sb.append("    autoRemind: ").append(toIndentedString(autoRemind)).append("\n");
        sb.append("    phoneNum: ").append(toIndentedString(phoneNum)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
