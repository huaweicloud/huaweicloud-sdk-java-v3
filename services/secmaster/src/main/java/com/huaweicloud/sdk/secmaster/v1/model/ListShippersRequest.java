package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListShippersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_name")

    private String shipperName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_source_region")

    private String shipperSourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_source_strategy")

    private String shipperSourceStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_consumption_type")

    private String shipperConsumptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_shipper_type")

    private String destinationShipperType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_status")

    private String shipperStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    public ListShippersRequest withWorkspaceId(String workspaceId) {
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

    public ListShippersRequest withDataspaceId(String dataspaceId) {
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

    public ListShippersRequest withPipeId(String pipeId) {
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

    public ListShippersRequest withShipperName(String shipperName) {
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

    public ListShippersRequest withShipperSourceRegion(String shipperSourceRegion) {
        this.shipperSourceRegion = shipperSourceRegion;
        return this;
    }

    /**
     * 数据源区域
     * @return shipperSourceRegion
     */
    public String getShipperSourceRegion() {
        return shipperSourceRegion;
    }

    public void setShipperSourceRegion(String shipperSourceRegion) {
        this.shipperSourceRegion = shipperSourceRegion;
    }

    public ListShippersRequest withShipperSourceStrategy(String shipperSourceStrategy) {
        this.shipperSourceStrategy = shipperSourceStrategy;
        return this;
    }

    /**
     * 数据源消费策略
     * @return shipperSourceStrategy
     */
    public String getShipperSourceStrategy() {
        return shipperSourceStrategy;
    }

    public void setShipperSourceStrategy(String shipperSourceStrategy) {
        this.shipperSourceStrategy = shipperSourceStrategy;
    }

    public ListShippersRequest withShipperConsumptionType(String shipperConsumptionType) {
        this.shipperConsumptionType = shipperConsumptionType;
        return this;
    }

    /**
     * 数据源消费类型
     * @return shipperConsumptionType
     */
    public String getShipperConsumptionType() {
        return shipperConsumptionType;
    }

    public void setShipperConsumptionType(String shipperConsumptionType) {
        this.shipperConsumptionType = shipperConsumptionType;
    }

    public ListShippersRequest withDestinationShipperType(String destinationShipperType) {
        this.destinationShipperType = destinationShipperType;
        return this;
    }

    /**
     * 目的投递类型
     * @return destinationShipperType
     */
    public String getDestinationShipperType() {
        return destinationShipperType;
    }

    public void setDestinationShipperType(String destinationShipperType) {
        this.destinationShipperType = destinationShipperType;
    }

    public ListShippersRequest withShipperStatus(String shipperStatus) {
        this.shipperStatus = shipperStatus;
        return this;
    }

    /**
     * 数据投递状态
     * @return shipperStatus
     */
    public String getShipperStatus() {
        return shipperStatus;
    }

    public void setShipperStatus(String shipperStatus) {
        this.shipperStatus = shipperStatus;
    }

    public ListShippersRequest withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListShippersRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
     * maximum: 1000
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListShippersRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 第几页
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShippersRequest that = (ListShippersRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.pipeId, that.pipeId) && Objects.equals(this.shipperName, that.shipperName)
            && Objects.equals(this.shipperSourceRegion, that.shipperSourceRegion)
            && Objects.equals(this.shipperSourceStrategy, that.shipperSourceStrategy)
            && Objects.equals(this.shipperConsumptionType, that.shipperConsumptionType)
            && Objects.equals(this.destinationShipperType, that.destinationShipperType)
            && Objects.equals(this.shipperStatus, that.shipperStatus)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            dataspaceId,
            pipeId,
            shipperName,
            shipperSourceRegion,
            shipperSourceStrategy,
            shipperConsumptionType,
            destinationShipperType,
            shipperStatus,
            createTime,
            limit,
            offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShippersRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    shipperName: ").append(toIndentedString(shipperName)).append("\n");
        sb.append("    shipperSourceRegion: ").append(toIndentedString(shipperSourceRegion)).append("\n");
        sb.append("    shipperSourceStrategy: ").append(toIndentedString(shipperSourceStrategy)).append("\n");
        sb.append("    shipperConsumptionType: ").append(toIndentedString(shipperConsumptionType)).append("\n");
        sb.append("    destinationShipperType: ").append(toIndentedString(destinationShipperType)).append("\n");
        sb.append("    shipperStatus: ").append(toIndentedString(shipperStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
