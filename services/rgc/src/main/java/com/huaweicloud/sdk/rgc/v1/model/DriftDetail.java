package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漂移详细信息。
 */
public class DriftDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_account_id")

    private String managedAccountId;

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
    @JsonProperty(value = "parent_organizational_unit_id")

    private String parentOrganizationalUnitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solve_solution")

    private String solveSolution;

    public DriftDetail withManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
        return this;
    }

    /**
     * 管理员账号ID。
     * @return managedAccountId
     */
    public String getManagedAccountId() {
        return managedAccountId;
    }

    public void setManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
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
     * 漂移目标类型，类型有account、ou和policy。
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

    public DriftDetail withParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
        return this;
    }

    /**
     * 父注册OU ID。
     * @return parentOrganizationalUnitId
     */
    public String getParentOrganizationalUnitId() {
        return parentOrganizationalUnitId;
    }

    public void setParentOrganizationalUnitId(String parentOrganizationalUnitId) {
        this.parentOrganizationalUnitId = parentOrganizationalUnitId;
    }

    public DriftDetail withSolveSolution(String solveSolution) {
        this.solveSolution = solveSolution;
        return this;
    }

    /**
     * 漂移修复方法。
     * @return solveSolution
     */
    public String getSolveSolution() {
        return solveSolution;
    }

    public void setSolveSolution(String solveSolution) {
        this.solveSolution = solveSolution;
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
        return Objects.equals(this.managedAccountId, that.managedAccountId)
            && Objects.equals(this.driftType, that.driftType) && Objects.equals(this.driftTargetId, that.driftTargetId)
            && Objects.equals(this.driftTargetType, that.driftTargetType)
            && Objects.equals(this.driftMessage, that.driftMessage)
            && Objects.equals(this.parentOrganizationalUnitId, that.parentOrganizationalUnitId)
            && Objects.equals(this.solveSolution, that.solveSolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedAccountId,
            driftType,
            driftTargetId,
            driftTargetType,
            driftMessage,
            parentOrganizationalUnitId,
            solveSolution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DriftDetail {\n");
        sb.append("    managedAccountId: ").append(toIndentedString(managedAccountId)).append("\n");
        sb.append("    driftType: ").append(toIndentedString(driftType)).append("\n");
        sb.append("    driftTargetId: ").append(toIndentedString(driftTargetId)).append("\n");
        sb.append("    driftTargetType: ").append(toIndentedString(driftTargetType)).append("\n");
        sb.append("    driftMessage: ").append(toIndentedString(driftMessage)).append("\n");
        sb.append("    parentOrganizationalUnitId: ").append(toIndentedString(parentOrganizationalUnitId)).append("\n");
        sb.append("    solveSolution: ").append(toIndentedString(solveSolution)).append("\n");
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
