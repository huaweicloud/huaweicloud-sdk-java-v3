package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAuthorizeTxtRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    public ShowAuthorizeTxtRecordRequest withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 待创建的子域名。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuthorizeTxtRecordRequest that = (ShowAuthorizeTxtRecordRequest) obj;
        return Objects.equals(this.zoneName, that.zoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuthorizeTxtRecordRequest {\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
