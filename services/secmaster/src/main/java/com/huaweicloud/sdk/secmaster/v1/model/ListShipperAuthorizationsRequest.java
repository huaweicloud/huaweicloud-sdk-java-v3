package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListShipperAuthorizationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_shipper_type")

    private String destinationShipperType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shipper_status")

    private String shipperStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_status")

    private String authStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    public ListShipperAuthorizationsRequest withWorkspaceId(String workspaceId) {
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

    public ListShipperAuthorizationsRequest withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * 数据源
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public ListShipperAuthorizationsRequest withDestinationShipperType(String destinationShipperType) {
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

    public ListShipperAuthorizationsRequest withShipperStatus(String shipperStatus) {
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

    public ListShipperAuthorizationsRequest withAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }

    /**
     * 授权状态
     * @return authStatus
     */
    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
    }

    public ListShipperAuthorizationsRequest withLimit(Long limit) {
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

    public ListShipperAuthorizationsRequest withOffset(Long offset) {
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
        ListShipperAuthorizationsRequest that = (ListShipperAuthorizationsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.sourceRegion, that.sourceRegion)
            && Objects.equals(this.destinationShipperType, that.destinationShipperType)
            && Objects.equals(this.shipperStatus, that.shipperStatus)
            && Objects.equals(this.authStatus, that.authStatus) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workspaceId, sourceRegion, destinationShipperType, shipperStatus, authStatus, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShipperAuthorizationsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    destinationShipperType: ").append(toIndentedString(destinationShipperType)).append("\n");
        sb.append("    shipperStatus: ").append(toIndentedString(shipperStatus)).append("\n");
        sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
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
