package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组织合规规则包查询结果。
 */
public class OrgConformancePackDetailedStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_id")

    private String conformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conformance_pack_name")

    private String conformancePackName;

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

    public OrgConformancePackDetailedStatus withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 成员帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public OrgConformancePackDetailedStatus withConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
        return this;
    }

    /**
     * 合规规则包ID。
     * @return conformancePackId
     */
    public String getConformancePackId() {
        return conformancePackId;
    }

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    public OrgConformancePackDetailedStatus withConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
        return this;
    }

    /**
     * 合规规则包名称。
     * @return conformancePackName
     */
    public String getConformancePackName() {
        return conformancePackName;
    }

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    public OrgConformancePackDetailedStatus withState(String state) {
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

    public OrgConformancePackDetailedStatus withErrorMessage(String errorMessage) {
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

    public OrgConformancePackDetailedStatus withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrgConformancePackDetailedStatus withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
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
        OrgConformancePackDetailedStatus that = (OrgConformancePackDetailedStatus) obj;
        return Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.conformancePackId, that.conformancePackId)
            && Objects.equals(this.conformancePackName, that.conformancePackName)
            && Objects.equals(this.state, that.state) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, conformancePackId, conformancePackName, state, errorMessage, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgConformancePackDetailedStatus {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    conformancePackId: ").append(toIndentedString(conformancePackId)).append("\n");
        sb.append("    conformancePackName: ").append(toIndentedString(conformancePackName)).append("\n");
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
