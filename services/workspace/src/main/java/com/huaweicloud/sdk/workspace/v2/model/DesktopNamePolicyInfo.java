package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面名称策略信息。
 */
public class DesktopNamePolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_contain_user")

    private Boolean isContainUser;

    public DesktopNamePolicyInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略id。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public DesktopNamePolicyInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public DesktopNamePolicyInfo withNamePrefix(String namePrefix) {
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

    public DesktopNamePolicyInfo withDigitNumber(Integer digitNumber) {
        this.digitNumber = digitNumber;
        return this;
    }

    /**
     * 策略后缀有效位数。
     * @return digitNumber
     */
    public Integer getDigitNumber() {
        return digitNumber;
    }

    public void setDigitNumber(Integer digitNumber) {
        this.digitNumber = digitNumber;
    }

    public DesktopNamePolicyInfo withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    /**
     * 策略后缀起始数字。
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public DesktopNamePolicyInfo withSingleDomainUserInc(Integer singleDomainUserInc) {
        this.singleDomainUserInc = singleDomainUserInc;
        return this;
    }

    /**
     * 是否单用户名递增。 - 1 单用户名递增。 - 0 租户递增。
     * @return singleDomainUserInc
     */
    public Integer getSingleDomainUserInc() {
        return singleDomainUserInc;
    }

    public void setSingleDomainUserInc(Integer singleDomainUserInc) {
        this.singleDomainUserInc = singleDomainUserInc;
    }

    public DesktopNamePolicyInfo withIsDefaultPolicy(Boolean isDefaultPolicy) {
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

    public DesktopNamePolicyInfo withIsContainUser(Boolean isContainUser) {
        this.isContainUser = isContainUser;
        return this;
    }

    /**
     * 是否包含用户名的桌面名称策略，true包含。
     * @return isContainUser
     */
    public Boolean getIsContainUser() {
        return isContainUser;
    }

    public void setIsContainUser(Boolean isContainUser) {
        this.isContainUser = isContainUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopNamePolicyInfo that = (DesktopNamePolicyInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.namePrefix, that.namePrefix) && Objects.equals(this.digitNumber, that.digitNumber)
            && Objects.equals(this.startNumber, that.startNumber)
            && Objects.equals(this.singleDomainUserInc, that.singleDomainUserInc)
            && Objects.equals(this.isDefaultPolicy, that.isDefaultPolicy)
            && Objects.equals(this.isContainUser, that.isContainUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            namePrefix,
            digitNumber,
            startNumber,
            singleDomainUserInc,
            isDefaultPolicy,
            isContainUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopNamePolicyInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
        sb.append("    digitNumber: ").append(toIndentedString(digitNumber)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    singleDomainUserInc: ").append(toIndentedString(singleDomainUserInc)).append("\n");
        sb.append("    isDefaultPolicy: ").append(toIndentedString(isDefaultPolicy)).append("\n");
        sb.append("    isContainUser: ").append(toIndentedString(isContainUser)).append("\n");
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
