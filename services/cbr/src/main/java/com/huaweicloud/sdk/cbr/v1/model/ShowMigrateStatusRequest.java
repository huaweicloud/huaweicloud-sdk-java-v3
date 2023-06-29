package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMigrateStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_regions")

    private Boolean allRegions;

    public ShowMigrateStatusRequest withAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
        return this;
    }

    /**
     * 是否查询其他区域结果
     * @return allRegions
     */
    public Boolean getAllRegions() {
        return allRegions;
    }

    public void setAllRegions(Boolean allRegions) {
        this.allRegions = allRegions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrateStatusRequest that = (ShowMigrateStatusRequest) obj;
        return Objects.equals(this.allRegions, that.allRegions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allRegions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrateStatusRequest {\n");
        sb.append("    allRegions: ").append(toIndentedString(allRegions)).append("\n");
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
