package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** VisionActiveCodeDTO */
public class VisionActiveCodeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devType")

    private String devType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptCode")

    private String deptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devName")

    private String devName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smsNumber")

    private String smsNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emailAddr")

    private String emailAddr;

    public VisionActiveCodeDTO withDevType(String devType) {
        this.devType = devType;
        return this;
    }

    /** 终端类型 - idea-hub:智能协作大屏 - huawei-vision:智慧屏TV - welink-desktop(iwb):电子白板
     * 
     * @return devType */
    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public VisionActiveCodeDTO withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /** 部门编号，若不携带则默认根部门
     * 
     * @return deptCode */
    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public VisionActiveCodeDTO withDevName(String devName) {
        this.devName = devName;
        return this;
    }

    /** 终端的名称
     * 
     * @return devName */
    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public VisionActiveCodeDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述信息
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VisionActiveCodeDTO withSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
        return this;
    }

    /** 号码信息，如果为手机号，必须加上国家码。 例如中国大陆手机+86xxxxxxx，当填写手机号时 “country”参数必填,手机格式必须满足(^$|^[+]?[0-9]+$)
     * 
     * @return smsNumber */
    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    public VisionActiveCodeDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR
     * 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public VisionActiveCodeDTO withEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
        return this;
    }

    /** 邮箱地址
     * 
     * @return emailAddr */
    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VisionActiveCodeDTO visionActiveCodeDTO = (VisionActiveCodeDTO) o;
        return Objects.equals(this.devType, visionActiveCodeDTO.devType)
            && Objects.equals(this.deptCode, visionActiveCodeDTO.deptCode)
            && Objects.equals(this.devName, visionActiveCodeDTO.devName)
            && Objects.equals(this.description, visionActiveCodeDTO.description)
            && Objects.equals(this.smsNumber, visionActiveCodeDTO.smsNumber)
            && Objects.equals(this.country, visionActiveCodeDTO.country)
            && Objects.equals(this.emailAddr, visionActiveCodeDTO.emailAddr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devType, deptCode, devName, description, smsNumber, country, emailAddr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VisionActiveCodeDTO {\n");
        sb.append("    devType: ").append(toIndentedString(devType)).append("\n");
        sb.append("    deptCode: ").append(toIndentedString(deptCode)).append("\n");
        sb.append("    devName: ").append(toIndentedString(devName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    smsNumber: ").append(toIndentedString(smsNumber)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    emailAddr: ").append(toIndentedString(emailAddr)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
