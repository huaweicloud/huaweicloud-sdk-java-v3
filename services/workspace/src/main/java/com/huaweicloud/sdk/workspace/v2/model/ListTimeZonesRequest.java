package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTimeZonesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone_name")

    private String timeZoneName;

    public ListTimeZonesRequest withTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
        return this;
    }

    /**
     * 按照时区name过滤
     * @return timeZoneName
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTimeZonesRequest that = (ListTimeZonesRequest) obj;
        return Objects.equals(this.timeZoneName, that.timeZoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZoneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTimeZonesRequest {\n");
        sb.append("    timeZoneName: ").append(toIndentedString(timeZoneName)).append("\n");
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
