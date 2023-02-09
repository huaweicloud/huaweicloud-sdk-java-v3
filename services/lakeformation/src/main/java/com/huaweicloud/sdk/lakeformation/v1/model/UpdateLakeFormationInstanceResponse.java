package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLakeFormationInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    public UpdateLakeFormationInstanceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * LakeFormation实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateLakeFormationInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateLakeFormationInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateLakeFormationInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目Id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateLakeFormationInstanceResponse withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 逻辑多租和物理多租的判断
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public UpdateLakeFormationInstanceResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 实例创建时间戳
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateLakeFormationInstanceResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 实例更新时间戳
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateLakeFormationInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateLakeFormationInstanceResponse withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 是否在回收站
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLakeFormationInstanceResponse updateLakeFormationInstanceResponse =
            (UpdateLakeFormationInstanceResponse) o;
        return Objects.equals(this.instanceId, updateLakeFormationInstanceResponse.instanceId)
            && Objects.equals(this.name, updateLakeFormationInstanceResponse.name)
            && Objects.equals(this.description, updateLakeFormationInstanceResponse.description)
            && Objects.equals(this.enterpriseProjectId, updateLakeFormationInstanceResponse.enterpriseProjectId)
            && Objects.equals(this.shared, updateLakeFormationInstanceResponse.shared)
            && Objects.equals(this.createTime, updateLakeFormationInstanceResponse.createTime)
            && Objects.equals(this.updateTime, updateLakeFormationInstanceResponse.updateTime)
            && Objects.equals(this.status, updateLakeFormationInstanceResponse.status)
            && Objects.equals(this.inRecycleBin, updateLakeFormationInstanceResponse.inRecycleBin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            name,
            description,
            enterpriseProjectId,
            shared,
            createTime,
            updateTime,
            status,
            inRecycleBin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLakeFormationInstanceResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
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
