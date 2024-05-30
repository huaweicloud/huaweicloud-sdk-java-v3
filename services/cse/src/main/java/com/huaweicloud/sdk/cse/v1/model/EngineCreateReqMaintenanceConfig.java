package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 微服务引擎的维护时间窗
 */
public class EngineCreateReqMaintenanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    public EngineCreateReqMaintenanceConfig withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 维护时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public EngineCreateReqMaintenanceConfig withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * 维护时间的时区
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineCreateReqMaintenanceConfig that = (EngineCreateReqMaintenanceConfig) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.zone, that.zone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, zone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineCreateReqMaintenanceConfig {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
