package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHomeRegionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "home_region")

    private String homeRegion;

    public ShowHomeRegionResponse withHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
        return this;
    }

    /**
     * 区域名称。
     * @return homeRegion
     */
    public String getHomeRegion() {
        return homeRegion;
    }

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHomeRegionResponse that = (ShowHomeRegionResponse) obj;
        return Objects.equals(this.homeRegion, that.homeRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHomeRegionResponse {\n");
        sb.append("    homeRegion: ").append(toIndentedString(homeRegion)).append("\n");
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
