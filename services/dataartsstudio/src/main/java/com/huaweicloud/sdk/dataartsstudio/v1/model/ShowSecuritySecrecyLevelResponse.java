package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecuritySecrecyLevelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_id")

    private String secrecyLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_name")

    private String secrecyLevelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level_number")

    private Integer secrecyLevelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public ShowSecuritySecrecyLevelResponse withSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
        return this;
    }

    /**
     * 密级id
     * @return secrecyLevelId
     */
    public String getSecrecyLevelId() {
        return secrecyLevelId;
    }

    public void setSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
    }

    public ShowSecuritySecrecyLevelResponse withSecrecyLevelName(String secrecyLevelName) {
        this.secrecyLevelName = secrecyLevelName;
        return this;
    }

    /**
     * 密级名称
     * @return secrecyLevelName
     */
    public String getSecrecyLevelName() {
        return secrecyLevelName;
    }

    public void setSecrecyLevelName(String secrecyLevelName) {
        this.secrecyLevelName = secrecyLevelName;
    }

    public ShowSecuritySecrecyLevelResponse withSecrecyLevelNumber(Integer secrecyLevelNumber) {
        this.secrecyLevelNumber = secrecyLevelNumber;
        return this;
    }

    /**
     * 密级等级
     * minimum: 1
     * maximum: 10
     * @return secrecyLevelNumber
     */
    public Integer getSecrecyLevelNumber() {
        return secrecyLevelNumber;
    }

    public void setSecrecyLevelNumber(Integer secrecyLevelNumber) {
        this.secrecyLevelNumber = secrecyLevelNumber;
    }

    public ShowSecuritySecrecyLevelResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 密级描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowSecuritySecrecyLevelResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowSecuritySecrecyLevelResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ShowSecuritySecrecyLevelResponse withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新者
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public ShowSecuritySecrecyLevelResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 2147483647
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowSecuritySecrecyLevelResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DataArts实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecuritySecrecyLevelResponse that = (ShowSecuritySecrecyLevelResponse) obj;
        return Objects.equals(this.secrecyLevelId, that.secrecyLevelId)
            && Objects.equals(this.secrecyLevelName, that.secrecyLevelName)
            && Objects.equals(this.secrecyLevelNumber, that.secrecyLevelNumber)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secrecyLevelId,
            secrecyLevelName,
            secrecyLevelNumber,
            description,
            createdBy,
            createdAt,
            updatedBy,
            updatedAt,
            instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecuritySecrecyLevelResponse {\n");
        sb.append("    secrecyLevelId: ").append(toIndentedString(secrecyLevelId)).append("\n");
        sb.append("    secrecyLevelName: ").append(toIndentedString(secrecyLevelName)).append("\n");
        sb.append("    secrecyLevelNumber: ").append(toIndentedString(secrecyLevelNumber)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
