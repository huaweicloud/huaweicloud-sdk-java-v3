package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Landing Zone配置信息。
 */
public class CommonConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_region")

    private String homeRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_trail_type")

    private Boolean cloudTrailType;

    public CommonConfiguration withHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }

    /**
     * 主区域名。
     * @return homeRegion
     */
    public String getHomeRegion() {
        return homeRegion;
    }

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    public CommonConfiguration withCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
        return this;
    }

    /**
     * CTS配置状态。
     * @return cloudTrailType
     */
    public Boolean getCloudTrailType() {
        return cloudTrailType;
    }

    public void setCloudTrailType(Boolean cloudTrailType) {
        this.cloudTrailType = cloudTrailType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonConfiguration that = (CommonConfiguration) obj;
        return Objects.equals(this.homeRegion, that.homeRegion)
            && Objects.equals(this.cloudTrailType, that.cloudTrailType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeRegion, cloudTrailType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonConfiguration {\n");
        sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
        sb.append("    cloudTrailType: ").append(toIndentedString(cloudTrailType)).append("\n");
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
