package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** VerifyVerifyCodeV2Req */
public class VerifyVerifyCodeV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_code")

    private String verifyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_value")

    private String contactValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_way")

    private Integer contactWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_id")

    private String xCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    public VerifyVerifyCodeV2Req withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /** 验证码
     * 
     * @return verifyCode */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public VerifyVerifyCodeV2Req withContactValue(String contactValue) {
        this.contactValue = contactValue;
        return this;
    }

    /** 联系方式的值
     * 
     * @return contactValue */
    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public VerifyVerifyCodeV2Req withContactWay(Integer contactWay) {
        this.contactWay = contactWay;
        return this;
    }

    /** 联系方式的类型。0：短信；1：邮件 minimum: 0 maximum: 1
     * 
     * @return contactWay */
    public Integer getContactWay() {
        return contactWay;
    }

    public void setContactWay(Integer contactWay) {
        this.contactWay = contactWay;
    }

    public VerifyVerifyCodeV2Req withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /** 国家码
     * 
     * @return areaCode */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public VerifyVerifyCodeV2Req withXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
        return this;
    }

    /** 子用户id
     * 
     * @return xCustomerId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_customer_id")
    public String getXCustomerId() {
        return xCustomerId;
    }

    public void setXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
    }

    public VerifyVerifyCodeV2Req withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /** 客户id
     * 
     * @return customerId */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyVerifyCodeV2Req verifyVerifyCodeV2Req = (VerifyVerifyCodeV2Req) o;
        return Objects.equals(this.verifyCode, verifyVerifyCodeV2Req.verifyCode)
            && Objects.equals(this.contactValue, verifyVerifyCodeV2Req.contactValue)
            && Objects.equals(this.contactWay, verifyVerifyCodeV2Req.contactWay)
            && Objects.equals(this.areaCode, verifyVerifyCodeV2Req.areaCode)
            && Objects.equals(this.xCustomerId, verifyVerifyCodeV2Req.xCustomerId)
            && Objects.equals(this.customerId, verifyVerifyCodeV2Req.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verifyCode, contactValue, contactWay, areaCode, xCustomerId, customerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyVerifyCodeV2Req {\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    contactValue: ").append(toIndentedString(contactValue)).append("\n");
        sb.append("    contactWay: ").append(toIndentedString(contactWay)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    xCustomerId: ").append(toIndentedString(xCustomerId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
