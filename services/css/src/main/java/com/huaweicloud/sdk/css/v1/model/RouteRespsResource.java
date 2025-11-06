package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RouteRespsResource
 */
public class RouteRespsResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipAddress")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipNetMask")

    private String ipNetMask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private String updateAt;

    public RouteRespsResource withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public RouteRespsResource withIpNetMask(String ipNetMask) {
        this.ipNetMask = ipNetMask;
        return this;
    }

    /**
     * 子网掩码。
     * @return ipNetMask
     */
    public String getIpNetMask() {
        return ipNetMask;
    }

    public void setIpNetMask(String ipNetMask) {
        this.ipNetMask = ipNetMask;
    }

    public RouteRespsResource withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteRespsResource that = (RouteRespsResource) obj;
        return Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.ipNetMask, that.ipNetMask)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, ipNetMask, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteRespsResource {\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipNetMask: ").append(toIndentedString(ipNetMask)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
