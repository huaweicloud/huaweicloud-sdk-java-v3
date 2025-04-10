package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略信息
 */
public class AgentPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name")

    private String featureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_category")

    private String policyCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_status")

    private String policyStatus;

    public AgentPolicyInfo withPolicyId(String policyId) {
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

    public AgentPolicyInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 策略组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AgentPolicyInfo withPolicyName(String policyName) {
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

    public AgentPolicyInfo withFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * feature名称
     * @return featureName
     */
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public AgentPolicyInfo withPolicyCategory(String policyCategory) {
        this.policyCategory = policyCategory;
        return this;
    }

    /**
     * 策略类别
     * @return policyCategory
     */
    public String getPolicyCategory() {
        return policyCategory;
    }

    public void setPolicyCategory(String policyCategory) {
        this.policyCategory = policyCategory;
    }

    public AgentPolicyInfo withPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    /**
     * 策略应用状态:not_applied-未应用、protection_degradation_not_applied-防护降级未应用、processing-应用中、applied-已应用
     * @return policyStatus
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentPolicyInfo that = (AgentPolicyInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.policyName, that.policyName) && Objects.equals(this.featureName, that.featureName)
            && Objects.equals(this.policyCategory, that.policyCategory)
            && Objects.equals(this.policyStatus, that.policyStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, groupId, policyName, featureName, policyCategory, policyStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentPolicyInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    policyCategory: ").append(toIndentedString(policyCategory)).append("\n");
        sb.append("    policyStatus: ").append(toIndentedString(policyStatus)).append("\n");
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
