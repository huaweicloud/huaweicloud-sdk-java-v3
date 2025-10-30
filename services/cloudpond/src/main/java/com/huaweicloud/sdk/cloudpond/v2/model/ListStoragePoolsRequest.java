package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListStoragePoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_site_id")

    private String edgeSiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<StoragePoolStatus> status = null;

    public ListStoragePoolsRequest withEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
        return this;
    }

    /**
     * 边缘小站ID
     * @return edgeSiteId
     */
    public String getEdgeSiteId() {
        return edgeSiteId;
    }

    public void setEdgeSiteId(String edgeSiteId) {
        this.edgeSiteId = edgeSiteId;
    }

    public ListStoragePoolsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListStoragePoolsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标识
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListStoragePoolsRequest withStatus(List<StoragePoolStatus> status) {
        this.status = status;
        return this;
    }

    public ListStoragePoolsRequest addStatusItem(StoragePoolStatus statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListStoragePoolsRequest withStatus(Consumer<List<StoragePoolStatus>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据存储池状态查询，支持多值查询
     * @return status
     */
    public List<StoragePoolStatus> getStatus() {
        return status;
    }

    public void setStatus(List<StoragePoolStatus> status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStoragePoolsRequest that = (ListStoragePoolsRequest) obj;
        return Objects.equals(this.edgeSiteId, that.edgeSiteId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeSiteId, limit, marker, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoragePoolsRequest {\n");
        sb.append("    edgeSiteId: ").append(toIndentedString(edgeSiteId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
