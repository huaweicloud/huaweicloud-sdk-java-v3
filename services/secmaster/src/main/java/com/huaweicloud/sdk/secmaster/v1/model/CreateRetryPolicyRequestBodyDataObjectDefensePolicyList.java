package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 与操作连接对应的策略
 */
public class CreateRetryPolicyRequestBodyDataObjectDefensePolicyList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_connection_id")

    private String defenseConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_connection_name")

    private String defenseConnectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_connection_region_id")

    private String defenseConnectionRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_connection_region_name")

    private String defenseConnectionRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_type")

    private String defenseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_enterprise_id")

    private String targetEnterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_enterprise_name")

    private String targetEnterpriseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_name")

    private String targetProjectName;

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withDefenseConnectionId(String defenseConnectionId) {
        this.defenseConnectionId = defenseConnectionId;
        return this;
    }

    /**
     * 操作连接ID
     * @return defenseConnectionId
     */
    public String getDefenseConnectionId() {
        return defenseConnectionId;
    }

    public void setDefenseConnectionId(String defenseConnectionId) {
        this.defenseConnectionId = defenseConnectionId;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withDefenseConnectionName(
        String defenseConnectionName) {
        this.defenseConnectionName = defenseConnectionName;
        return this;
    }

    /**
     * 操作连接名称
     * @return defenseConnectionName
     */
    public String getDefenseConnectionName() {
        return defenseConnectionName;
    }

    public void setDefenseConnectionName(String defenseConnectionName) {
        this.defenseConnectionName = defenseConnectionName;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withDefenseConnectionRegionId(
        String defenseConnectionRegionId) {
        this.defenseConnectionRegionId = defenseConnectionRegionId;
        return this;
    }

    /**
     * 防线策略归属区域ID
     * @return defenseConnectionRegionId
     */
    public String getDefenseConnectionRegionId() {
        return defenseConnectionRegionId;
    }

    public void setDefenseConnectionRegionId(String defenseConnectionRegionId) {
        this.defenseConnectionRegionId = defenseConnectionRegionId;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withDefenseConnectionRegionName(
        String defenseConnectionRegionName) {
        this.defenseConnectionRegionName = defenseConnectionRegionName;
        return this;
    }

    /**
     * 防线策略归属区域名称
     * @return defenseConnectionRegionName
     */
    public String getDefenseConnectionRegionName() {
        return defenseConnectionRegionName;
    }

    public void setDefenseConnectionRegionName(String defenseConnectionRegionName) {
        this.defenseConnectionRegionName = defenseConnectionRegionName;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }

    /**
     * 防线服务
     * @return defenseType
     */
    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withTargetEnterpriseId(String targetEnterpriseId) {
        this.targetEnterpriseId = targetEnterpriseId;
        return this;
    }

    /**
     * 企业项目ID
     * @return targetEnterpriseId
     */
    public String getTargetEnterpriseId() {
        return targetEnterpriseId;
    }

    public void setTargetEnterpriseId(String targetEnterpriseId) {
        this.targetEnterpriseId = targetEnterpriseId;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withTargetEnterpriseName(
        String targetEnterpriseName) {
        this.targetEnterpriseName = targetEnterpriseName;
        return this;
    }

    /**
     * 企业项目名称
     * @return targetEnterpriseName
     */
    public String getTargetEnterpriseName() {
        return targetEnterpriseName;
    }

    public void setTargetEnterpriseName(String targetEnterpriseName) {
        this.targetEnterpriseName = targetEnterpriseName;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 防线策略归属项目ID
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public CreateRetryPolicyRequestBodyDataObjectDefensePolicyList withTargetProjectName(String targetProjectName) {
        this.targetProjectName = targetProjectName;
        return this;
    }

    /**
     * 防线策略归属项目名称
     * @return targetProjectName
     */
    public String getTargetProjectName() {
        return targetProjectName;
    }

    public void setTargetProjectName(String targetProjectName) {
        this.targetProjectName = targetProjectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRetryPolicyRequestBodyDataObjectDefensePolicyList that =
            (CreateRetryPolicyRequestBodyDataObjectDefensePolicyList) obj;
        return Objects.equals(this.defenseConnectionId, that.defenseConnectionId)
            && Objects.equals(this.defenseConnectionName, that.defenseConnectionName)
            && Objects.equals(this.defenseConnectionRegionId, that.defenseConnectionRegionId)
            && Objects.equals(this.defenseConnectionRegionName, that.defenseConnectionRegionName)
            && Objects.equals(this.defenseType, that.defenseType)
            && Objects.equals(this.targetEnterpriseId, that.targetEnterpriseId)
            && Objects.equals(this.targetEnterpriseName, that.targetEnterpriseName)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.targetProjectName, that.targetProjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defenseConnectionId,
            defenseConnectionName,
            defenseConnectionRegionId,
            defenseConnectionRegionName,
            defenseType,
            targetEnterpriseId,
            targetEnterpriseName,
            targetProjectId,
            targetProjectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetryPolicyRequestBodyDataObjectDefensePolicyList {\n");
        sb.append("    defenseConnectionId: ").append(toIndentedString(defenseConnectionId)).append("\n");
        sb.append("    defenseConnectionName: ").append(toIndentedString(defenseConnectionName)).append("\n");
        sb.append("    defenseConnectionRegionId: ").append(toIndentedString(defenseConnectionRegionId)).append("\n");
        sb.append("    defenseConnectionRegionName: ")
            .append(toIndentedString(defenseConnectionRegionName))
            .append("\n");
        sb.append("    defenseType: ").append(toIndentedString(defenseType)).append("\n");
        sb.append("    targetEnterpriseId: ").append(toIndentedString(targetEnterpriseId)).append("\n");
        sb.append("    targetEnterpriseName: ").append(toIndentedString(targetEnterpriseName)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    targetProjectName: ").append(toIndentedString(targetProjectName)).append("\n");
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
