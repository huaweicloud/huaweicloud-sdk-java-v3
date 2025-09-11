package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryFlavorCapacityAzInfo
 */
public class QueryFlavorCapacityAzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefer")

    private Boolean prefer;

    public QueryFlavorCapacityAzInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Get regionId
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public QueryFlavorCapacityAzInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public QueryFlavorCapacityAzInfo withPrefer(Boolean prefer) {
        this.prefer = prefer;
        return this;
    }

    /**
     * Get prefer
     * @return prefer
     */
    public Boolean getPrefer() {
        return prefer;
    }

    public void setPrefer(Boolean prefer) {
        this.prefer = prefer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryFlavorCapacityAzInfo that = (QueryFlavorCapacityAzInfo) obj;
        return Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.prefer, that.prefer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, availabilityZone, prefer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryFlavorCapacityAzInfo {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    prefer: ").append(toIndentedString(prefer)).append("\n");
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
