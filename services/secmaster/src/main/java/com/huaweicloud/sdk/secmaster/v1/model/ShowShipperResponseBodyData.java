package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 投递数据
 */
public class ShowShipperResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumption_type")

    private Integer consumptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_destination")

    private ShowShipperResponseBodyDataShipperDestination shipperDestination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_id")

    private String shipperId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_name")

    private String shipperName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_source")

    private ShowShipperResponseBodyDataShipperSource shipperSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    public ShowShipperResponseBodyData withConsumptionType(Integer consumptionType) {
        this.consumptionType = consumptionType;
        return this;
    }

    /**
     * 消费类型
     * @return consumptionType
     */
    public Integer getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(Integer consumptionType) {
        this.consumptionType = consumptionType;
    }

    public ShowShipperResponseBodyData withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（时间戳）
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowShipperResponseBodyData withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 数据空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public ShowShipperResponseBodyData withDataspaceName(String dataspaceName) {
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

    public ShowShipperResponseBodyData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowShipperResponseBodyData withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 管道ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowShipperResponseBodyData withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * 管道ID
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public ShowShipperResponseBodyData withPipeName(String pipeName) {
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

    public ShowShipperResponseBodyData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowShipperResponseBodyData withShipperDestination(
        ShowShipperResponseBodyDataShipperDestination shipperDestination) {
        this.shipperDestination = shipperDestination;
        return this;
    }

    public ShowShipperResponseBodyData withShipperDestination(
        Consumer<ShowShipperResponseBodyDataShipperDestination> shipperDestinationSetter) {
        if (this.shipperDestination == null) {
            this.shipperDestination = new ShowShipperResponseBodyDataShipperDestination();
            shipperDestinationSetter.accept(this.shipperDestination);
        }

        return this;
    }

    /**
     * Get shipperDestination
     * @return shipperDestination
     */
    public ShowShipperResponseBodyDataShipperDestination getShipperDestination() {
        return shipperDestination;
    }

    public void setShipperDestination(ShowShipperResponseBodyDataShipperDestination shipperDestination) {
        this.shipperDestination = shipperDestination;
    }

    public ShowShipperResponseBodyData withShipperId(String shipperId) {
        this.shipperId = shipperId;
        return this;
    }

    /**
     * 投递ID
     * @return shipperId
     */
    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public ShowShipperResponseBodyData withShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }

    /**
     * 投递名称
     * @return shipperName
     */
    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public ShowShipperResponseBodyData withShipperSource(ShowShipperResponseBodyDataShipperSource shipperSource) {
        this.shipperSource = shipperSource;
        return this;
    }

    public ShowShipperResponseBodyData withShipperSource(
        Consumer<ShowShipperResponseBodyDataShipperSource> shipperSourceSetter) {
        if (this.shipperSource == null) {
            this.shipperSource = new ShowShipperResponseBodyDataShipperSource();
            shipperSourceSetter.accept(this.shipperSource);
        }

        return this;
    }

    /**
     * Get shipperSource
     * @return shipperSource
     */
    public ShowShipperResponseBodyDataShipperSource getShipperSource() {
        return shipperSource;
    }

    public void setShipperSource(ShowShipperResponseBodyDataShipperSource shipperSource) {
        this.shipperSource = shipperSource;
    }

    public ShowShipperResponseBodyData withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowShipperResponseBodyData withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（时间戳）
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowShipperResponseBodyData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowShipperResponseBodyData withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowShipperResponseBodyData withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShipperResponseBodyData that = (ShowShipperResponseBodyData) obj;
        return Objects.equals(this.consumptionType, that.consumptionType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.pipeId, that.pipeId)
            && Objects.equals(this.pipeName, that.pipeName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.shipperDestination, that.shipperDestination)
            && Objects.equals(this.shipperId, that.shipperId) && Objects.equals(this.shipperName, that.shipperName)
            && Objects.equals(this.shipperSource, that.shipperSource) && Objects.equals(this.status, that.status)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.version, that.version)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.workspaceName, that.workspaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumptionType,
            createTime,
            dataspaceId,
            dataspaceName,
            domainId,
            id,
            pipeId,
            pipeName,
            projectId,
            shipperDestination,
            shipperId,
            shipperName,
            shipperSource,
            status,
            updateTime,
            version,
            workspaceId,
            workspaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShipperResponseBodyData {\n");
        sb.append("    consumptionType: ").append(toIndentedString(consumptionType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    shipperDestination: ").append(toIndentedString(shipperDestination)).append("\n");
        sb.append("    shipperId: ").append(toIndentedString(shipperId)).append("\n");
        sb.append("    shipperName: ").append(toIndentedString(shipperName)).append("\n");
        sb.append("    shipperSource: ").append(toIndentedString(shipperSource)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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
