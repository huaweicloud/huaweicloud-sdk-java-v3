package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组织合规规则包详情。
 */
public class OrgConformancePackStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_id")

    private String orgConformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_name")

    private String orgConformancePackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public OrgConformancePackStatus withOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
        return this;
    }

    /**
     * 组织合规规则包ID。
     * @return orgConformancePackId
     */
    public String getOrgConformancePackId() {
        return orgConformancePackId;
    }

    public void setOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
    }

    public OrgConformancePackStatus withOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
        return this;
    }

    /**
     * 组织合规规则包名称。
     * @return orgConformancePackName
     */
    public String getOrgConformancePackName() {
        return orgConformancePackName;
    }

    public void setOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
    }

    public OrgConformancePackStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 合规规则包部署状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public OrgConformancePackStatus withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 部署或删除组织合规规则包错误时的错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public OrgConformancePackStatus withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 组织合规规则包创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrgConformancePackStatus withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 组织合规规则包更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrgConformancePackStatus that = (OrgConformancePackStatus) obj;
        return Objects.equals(this.orgConformancePackId, that.orgConformancePackId)
            && Objects.equals(this.orgConformancePackName, that.orgConformancePackName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgConformancePackId, orgConformancePackName, state, errorMessage, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgConformancePackStatus {\n");
        sb.append("    orgConformancePackId: ").append(toIndentedString(orgConformancePackId)).append("\n");
        sb.append("    orgConformancePackName: ").append(toIndentedString(orgConformancePackName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
