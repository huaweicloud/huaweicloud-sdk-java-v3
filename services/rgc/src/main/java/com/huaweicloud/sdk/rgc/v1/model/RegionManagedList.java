package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 区域纳管情况。
 */
public class RegionManagedList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_status")

    private String regionStatus;

    public RegionManagedList withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名字。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RegionManagedList withRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
        return this;
    }

    /**
     * 区域的状态，取值为可用或者不可用。
     * @return regionStatus
     */
    public String getRegionStatus() {
        return regionStatus;
    }

    public void setRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegionManagedList that = (RegionManagedList) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.regionStatus, that.regionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, regionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionManagedList {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionStatus: ").append(toIndentedString(regionStatus)).append("\n");
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
