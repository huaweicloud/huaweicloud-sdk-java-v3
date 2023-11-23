package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatePipeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_type")

    private String pipeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_period")

    private Integer storagePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards")

    private Integer shards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    public CreatePipeResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreatePipeResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreatePipeResponse withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 数据空间id
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public CreatePipeResponse withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 数据空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public CreatePipeResponse withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * 管道id
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public CreatePipeResponse withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * 管道名称
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public CreatePipeResponse withPipeType(String pipeType) {
        this.pipeType = pipeType;
        return this;
    }

    /**
     * 管道类型（system-defined，系统预定义)、1（user-defined，用户自定义)
     * @return pipeType
     */
    public String getPipeType() {
        return pipeType;
    }

    public void setPipeType(String pipeType) {
        this.pipeType = pipeType;
    }

    public CreatePipeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreatePipeResponse withStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * 索引存储天数
     * minimum: 1
     * maximum: 100000
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public CreatePipeResponse withShards(Integer shards) {
        this.shards = shards;
        return this;
    }

    /**
     * 索引分片数量
     * minimum: 1
     * maximum: 128
     * @return shards
     */
    public Integer getShards() {
        return shards;
    }

    public void setShards(Integer shards) {
        this.shards = shards;
    }

    public CreatePipeResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建者
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CreatePipeResponse withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 1010000000
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public CreatePipeResponse withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新者
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public CreatePipeResponse withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 10000000000
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePipeResponse that = (CreatePipeResponse) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName) && Objects.equals(this.pipeId, that.pipeId)
            && Objects.equals(this.pipeName, that.pipeName) && Objects.equals(this.pipeType, that.pipeType)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.storagePeriod, that.storagePeriod) && Objects.equals(this.shards, that.shards)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            projectId,
            dataspaceId,
            dataspaceName,
            pipeId,
            pipeName,
            pipeType,
            description,
            storagePeriod,
            shards,
            createBy,
            createTime,
            updateBy,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePipeResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    pipeType: ").append(toIndentedString(pipeType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
