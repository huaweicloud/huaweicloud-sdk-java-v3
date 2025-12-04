package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWarmPoolInstancesNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_group_id")

    private String scalingGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListWarmPoolInstancesNewRequest withScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }

    /**
     * 伸缩组ID
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public ListWarmPoolInstancesNewRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询的记录条数，不传默认20，最大可传入100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListWarmPoolInstancesNewRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询暖池实例的分页marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWarmPoolInstancesNewRequest that = (ListWarmPoolInstancesNewRequest) obj;
        return Objects.equals(this.scalingGroupId, that.scalingGroupId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWarmPoolInstancesNewRequest {\n");
        sb.append("    scalingGroupId: ").append(toIndentedString(scalingGroupId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
