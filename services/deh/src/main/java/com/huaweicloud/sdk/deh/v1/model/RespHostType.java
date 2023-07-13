package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可用的专属主机类型。
 */
public class RespHostType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type_name")

    private String hostTypeName;

    public RespHostType withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 专属主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public RespHostType withHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
        return this;
    }

    /**
     * 专属主机类型名字。
     * @return hostTypeName
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    public void setHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RespHostType that = (RespHostType) obj;
        return Objects.equals(this.hostType, that.hostType) && Objects.equals(this.hostTypeName, that.hostTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostType, hostTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespHostType {\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostTypeName: ").append(toIndentedString(hostTypeName)).append("\n");
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
