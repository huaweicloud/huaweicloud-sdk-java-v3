package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 跨地域类型。
 */
public class CrossRegionType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_region_type")

    private CrossRegionTypeEnum crossRegionType;

    public CrossRegionType withCrossRegionType(CrossRegionTypeEnum crossRegionType) {
        this.crossRegionType = crossRegionType;
        return this;
    }

    /**
     * Get crossRegionType
     * @return crossRegionType
     */
    public CrossRegionTypeEnum getCrossRegionType() {
        return crossRegionType;
    }

    public void setCrossRegionType(CrossRegionTypeEnum crossRegionType) {
        this.crossRegionType = crossRegionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrossRegionType that = (CrossRegionType) obj;
        return Objects.equals(this.crossRegionType, that.crossRegionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crossRegionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CrossRegionType {\n");
        sb.append("    crossRegionType: ").append(toIndentedString(crossRegionType)).append("\n");
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
