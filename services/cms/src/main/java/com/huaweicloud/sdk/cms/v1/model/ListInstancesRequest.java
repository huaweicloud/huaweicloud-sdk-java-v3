package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_launch_group_id")

    private String autoLaunchGroupId;

    public ListInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回实例数量限制 取值范围：1-1000。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstancesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 取值为上一页数据的最后一条记录的唯一标识
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListInstancesRequest withAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
        return this;
    }

    /**
     * 智能购买组ID
     * @return autoLaunchGroupId
     */
    public String getAutoLaunchGroupId() {
        return autoLaunchGroupId;
    }

    public void setAutoLaunchGroupId(String autoLaunchGroupId) {
        this.autoLaunchGroupId = autoLaunchGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.limit, listInstancesRequest.limit)
            && Objects.equals(this.marker, listInstancesRequest.marker)
            && Objects.equals(this.autoLaunchGroupId, listInstancesRequest.autoLaunchGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, autoLaunchGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    autoLaunchGroupId: ").append(toIndentedString(autoLaunchGroupId)).append("\n");
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
