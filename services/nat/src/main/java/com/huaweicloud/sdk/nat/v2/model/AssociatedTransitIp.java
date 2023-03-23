package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联的中转IP。
 */
public class AssociatedTransitIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_id")

    private String transitIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_address")

    private String transitIpAddress;

    public AssociatedTransitIp withTransitIpId(String transitIpId) {
        this.transitIpId = transitIpId;
        return this;
    }

    /**
     * 中转IP的ID。
     * @return transitIpId
     */
    public String getTransitIpId() {
        return transitIpId;
    }

    public void setTransitIpId(String transitIpId) {
        this.transitIpId = transitIpId;
    }

    public AssociatedTransitIp withTransitIpAddress(String transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
        return this;
    }

    /**
     * 中转IP地址。
     * @return transitIpAddress
     */
    public String getTransitIpAddress() {
        return transitIpAddress;
    }

    public void setTransitIpAddress(String transitIpAddress) {
        this.transitIpAddress = transitIpAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociatedTransitIp associatedTransitIp = (AssociatedTransitIp) o;
        return Objects.equals(this.transitIpId, associatedTransitIp.transitIpId)
            && Objects.equals(this.transitIpAddress, associatedTransitIp.transitIpAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIpId, transitIpAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatedTransitIp {\n");
        sb.append("    transitIpId: ").append(toIndentedString(transitIpId)).append("\n");
        sb.append("    transitIpAddress: ").append(toIndentedString(transitIpAddress)).append("\n");
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
