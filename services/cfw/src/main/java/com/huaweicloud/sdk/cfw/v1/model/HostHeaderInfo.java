package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostHeaderInfo
 */
public class HostHeaderInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Host")

    private String host;

    public HostHeaderInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 主机
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostHeaderInfo that = (HostHeaderInfo) obj;
        return Objects.equals(this.host, that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostHeaderInfo {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
