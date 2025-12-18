package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFlavorCapacityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_ids")

    private String regionIds;

    public ShowFlavorCapacityRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * Get flavorId
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ShowFlavorCapacityRequest withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowFlavorCapacityRequest withRegionIds(String regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    /**
     * Get regionIds
     * @return regionIds
     */
    public String getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(String regionIds) {
        this.regionIds = regionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlavorCapacityRequest that = (ShowFlavorCapacityRequest) obj;
        return Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.regionIds, that.regionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId, count, regionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlavorCapacityRequest {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
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
