package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建桌面名称策略请求体。
 */
public class CreateDesktopNamePolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_prefix")

    private String namePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digit_number")

    private Integer digitNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_number")

    private Integer startNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_domain_user_inc")

    private Integer singleDomainUserInc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_policy")

    private Boolean isDefaultPolicy;

    public CreateDesktopNamePolicyReq withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称，由数字、字母、中文、下划线组成，必须以字母或下划线开头，长度范围为1~30个字符。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public CreateDesktopNamePolicyReq withNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * 策略前缀。
     * @return namePrefix
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public CreateDesktopNamePolicyReq withDigitNumber(Integer digitNumber) {
        this.digitNumber = digitNumber;
        return this;
    }

    /**
     * 策略后缀有效位数。
     * minimum: 1
     * maximum: 5
     * @return digitNumber
     */
    public Integer getDigitNumber() {
        return digitNumber;
    }

    public void setDigitNumber(Integer digitNumber) {
        this.digitNumber = digitNumber;
    }

    public CreateDesktopNamePolicyReq withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    /**
     * 策略后缀起始数字。
     * minimum: 1
     * maximum: 99999
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public CreateDesktopNamePolicyReq withSingleDomainUserInc(Integer singleDomainUserInc) {
        this.singleDomainUserInc = singleDomainUserInc;
        return this;
    }

    /**
     * 是否单用户名递增。 - 1 单用户名递增。 - 0 租户递增。
     * minimum: 0
     * maximum: 1
     * @return singleDomainUserInc
     */
    public Integer getSingleDomainUserInc() {
        return singleDomainUserInc;
    }

    public void setSingleDomainUserInc(Integer singleDomainUserInc) {
        this.singleDomainUserInc = singleDomainUserInc;
    }

    public CreateDesktopNamePolicyReq withIsDefaultPolicy(Boolean isDefaultPolicy) {
        this.isDefaultPolicy = isDefaultPolicy;
        return this;
    }

    /**
     * 是否为默认策略，true默认策略。
     * @return isDefaultPolicy
     */
    public Boolean getIsDefaultPolicy() {
        return isDefaultPolicy;
    }

    public void setIsDefaultPolicy(Boolean isDefaultPolicy) {
        this.isDefaultPolicy = isDefaultPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopNamePolicyReq that = (CreateDesktopNamePolicyReq) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.namePrefix, that.namePrefix)
            && Objects.equals(this.digitNumber, that.digitNumber) && Objects.equals(this.startNumber, that.startNumber)
            && Objects.equals(this.singleDomainUserInc, that.singleDomainUserInc)
            && Objects.equals(this.isDefaultPolicy, that.isDefaultPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, namePrefix, digitNumber, startNumber, singleDomainUserInc, isDefaultPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopNamePolicyReq {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
        sb.append("    digitNumber: ").append(toIndentedString(digitNumber)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    singleDomainUserInc: ").append(toIndentedString(singleDomainUserInc)).append("\n");
        sb.append("    isDefaultPolicy: ").append(toIndentedString(isDefaultPolicy)).append("\n");
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
