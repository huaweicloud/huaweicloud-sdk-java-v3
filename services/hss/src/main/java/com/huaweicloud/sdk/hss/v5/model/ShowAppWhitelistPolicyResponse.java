package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppWhitelistPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept")

    private Boolean intercept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unconfirmed_num")

    private Integer unconfirmedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_num")

    private Integer trustNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspicious_num")

    private Integer suspiciousNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_num")

    private Integer maliciousNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown_num")

    private Integer unknownNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_apply")

    private Boolean autoApply;

    public ShowAppWhitelistPolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowAppWhitelistPolicyResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowAppWhitelistPolicyResponse withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * **参数解释**： 进程白名单策略类型 **取值范围**: - block：日常运营模式 
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public ShowAppWhitelistPolicyResponse withIntercept(Boolean intercept) {
        this.intercept = intercept;
        return this;
    }

    /**
     * **参数解释**： 是否开启阻断 **取值范围**: - true：是 - false：否 
     * @return intercept
     */
    public Boolean getIntercept() {
        return intercept;
    }

    public void setIntercept(Boolean intercept) {
        this.intercept = intercept;
    }

    public ShowAppWhitelistPolicyResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowAppWhitelistPolicyResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 进程总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowAppWhitelistPolicyResponse withUnconfirmedNum(Integer unconfirmedNum) {
        this.unconfirmedNum = unconfirmedNum;
        return this;
    }

    /**
     * **参数解释**: 待确认进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unconfirmedNum
     */
    public Integer getUnconfirmedNum() {
        return unconfirmedNum;
    }

    public void setUnconfirmedNum(Integer unconfirmedNum) {
        this.unconfirmedNum = unconfirmedNum;
    }

    public ShowAppWhitelistPolicyResponse withTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
        return this;
    }

    /**
     * **参数解释**: 识别可信进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return trustNum
     */
    public Integer getTrustNum() {
        return trustNum;
    }

    public void setTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
    }

    public ShowAppWhitelistPolicyResponse withSuspiciousNum(Integer suspiciousNum) {
        this.suspiciousNum = suspiciousNum;
        return this;
    }

    /**
     * **参数解释**: 识别可疑进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return suspiciousNum
     */
    public Integer getSuspiciousNum() {
        return suspiciousNum;
    }

    public void setSuspiciousNum(Integer suspiciousNum) {
        this.suspiciousNum = suspiciousNum;
    }

    public ShowAppWhitelistPolicyResponse withMaliciousNum(Integer maliciousNum) {
        this.maliciousNum = maliciousNum;
        return this;
    }

    /**
     * **参数解释**: 识别恶意进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return maliciousNum
     */
    public Integer getMaliciousNum() {
        return maliciousNum;
    }

    public void setMaliciousNum(Integer maliciousNum) {
        this.maliciousNum = maliciousNum;
    }

    public ShowAppWhitelistPolicyResponse withUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
        return this;
    }

    /**
     * **参数解释**: 识别未知进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unknownNum
     */
    public Integer getUnknownNum() {
        return unknownNum;
    }

    public void setUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
    }

    public ShowAppWhitelistPolicyResponse withAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
        return this;
    }

    /**
     * **参数解释**： 是否自动应用策略 **取值范围**: - true：是 - false：否 
     * @return autoApply
     */
    public Boolean getAutoApply() {
        return autoApply;
    }

    public void setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppWhitelistPolicyResponse that = (ShowAppWhitelistPolicyResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.intercept, that.intercept)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.unconfirmedNum, that.unconfirmedNum) && Objects.equals(this.trustNum, that.trustNum)
            && Objects.equals(this.suspiciousNum, that.suspiciousNum)
            && Objects.equals(this.maliciousNum, that.maliciousNum) && Objects.equals(this.unknownNum, that.unknownNum)
            && Objects.equals(this.autoApply, that.autoApply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            policyType,
            intercept,
            updateTime,
            totalNum,
            unconfirmedNum,
            trustNum,
            suspiciousNum,
            maliciousNum,
            unknownNum,
            autoApply);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppWhitelistPolicyResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    intercept: ").append(toIndentedString(intercept)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    unconfirmedNum: ").append(toIndentedString(unconfirmedNum)).append("\n");
        sb.append("    trustNum: ").append(toIndentedString(trustNum)).append("\n");
        sb.append("    suspiciousNum: ").append(toIndentedString(suspiciousNum)).append("\n");
        sb.append("    maliciousNum: ").append(toIndentedString(maliciousNum)).append("\n");
        sb.append("    unknownNum: ").append(toIndentedString(unknownNum)).append("\n");
        sb.append("    autoApply: ").append(toIndentedString(autoApply)).append("\n");
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
