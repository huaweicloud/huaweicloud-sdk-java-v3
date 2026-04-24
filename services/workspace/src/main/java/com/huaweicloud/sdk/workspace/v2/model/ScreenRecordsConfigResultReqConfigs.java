package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ScreenRecordsConfigResultReqConfigs
 */
public class ScreenRecordsConfigResultReqConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limit")

    private Integer trafficLimit;

    public ScreenRecordsConfigResultReqConfigs withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID。
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public ScreenRecordsConfigResultReqConfigs withTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
        return this;
    }

    /**
     * 录屏限速。
     * minimum: 0
     * maximum: 2147483647
     * @return trafficLimit
     */
    public Integer getTrafficLimit() {
        return trafficLimit;
    }

    public void setTrafficLimit(Integer trafficLimit) {
        this.trafficLimit = trafficLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScreenRecordsConfigResultReqConfigs that = (ScreenRecordsConfigResultReqConfigs) obj;
        return Objects.equals(this.siteId, that.siteId) && Objects.equals(this.trafficLimit, that.trafficLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, trafficLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScreenRecordsConfigResultReqConfigs {\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    trafficLimit: ").append(toIndentedString(trafficLimit)).append("\n");
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
