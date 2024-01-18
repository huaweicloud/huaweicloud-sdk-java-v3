package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漂移详细信息。
 */
public class DriftDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drift_type")

    private String driftType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drift_target_id")

    private String driftTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drift_target_type")

    private String driftTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drift_message")

    private String driftMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_organization_unit_id")

    private String parentOrganizationUnitId;

    public DriftDetail withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理纳管账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public DriftDetail withDriftType(String driftType) {
        this.driftType = driftType;
        return this;
    }

    /**
     * 漂移类型。
     * @return driftType
     */
    public String getDriftType() {
        return driftType;
    }

    public void setDriftType(String driftType) {
        this.driftType = driftType;
    }

    public DriftDetail withDriftTargetId(String driftTargetId) {
        this.driftTargetId = driftTargetId;
        return this;
    }

    /**
     * 漂移发生的纳管账号ID或注册OU ID。
     * @return driftTargetId
     */
    public String getDriftTargetId() {
        return driftTargetId;
    }

    public void setDriftTargetId(String driftTargetId) {
        this.driftTargetId = driftTargetId;
    }

    public DriftDetail withDriftTargetType(String driftTargetType) {
        this.driftTargetType = driftTargetType;
        return this;
    }

    /**
     * 漂移目标类型，类型有accountId和policyId。
     * @return driftTargetType
     */
    public String getDriftTargetType() {
        return driftTargetType;
    }

    public void setDriftTargetType(String driftTargetType) {
        this.driftTargetType = driftTargetType;
    }

    public DriftDetail withDriftMessage(String driftMessage) {
        this.driftMessage = driftMessage;
        return this;
    }

    /**
     * 漂移信息。
     * @return driftMessage
     */
    public String getDriftMessage() {
        return driftMessage;
    }

    public void setDriftMessage(String driftMessage) {
        this.driftMessage = driftMessage;
    }

    public DriftDetail withParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
        return this;
    }

    /**
     * 父注册OU ID。
     * @return parentOrganizationUnitId
     */
    public String getParentOrganizationUnitId() {
        return parentOrganizationUnitId;
    }

    public void setParentOrganizationUnitId(String parentOrganizationUnitId) {
        this.parentOrganizationUnitId = parentOrganizationUnitId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DriftDetail that = (DriftDetail) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.driftType, that.driftType) && Objects.equals(this.driftTargetId, that.driftTargetId)
            && Objects.equals(this.driftTargetType, that.driftTargetType)
            && Objects.equals(this.driftMessage, that.driftMessage)
            && Objects.equals(this.parentOrganizationUnitId, that.parentOrganizationUnitId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(manageAccountId, driftType, driftTargetId, driftTargetType, driftMessage, parentOrganizationUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DriftDetail {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    driftType: ").append(toIndentedString(driftType)).append("\n");
        sb.append("    driftTargetId: ").append(toIndentedString(driftTargetId)).append("\n");
        sb.append("    driftTargetType: ").append(toIndentedString(driftTargetType)).append("\n");
        sb.append("    driftMessage: ").append(toIndentedString(driftMessage)).append("\n");
        sb.append("    parentOrganizationUnitId: ").append(toIndentedString(parentOrganizationUnitId)).append("\n");
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
