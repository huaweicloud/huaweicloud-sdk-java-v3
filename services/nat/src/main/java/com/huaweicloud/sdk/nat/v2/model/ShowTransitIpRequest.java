package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTransitIpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_id")

    private String transitIpId;

    public ShowTransitIpRequest withTransitIpId(String transitIpId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTransitIpRequest showTransitIpRequest = (ShowTransitIpRequest) o;
        return Objects.equals(this.transitIpId, showTransitIpRequest.transitIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTransitIpRequest {\n");
        sb.append("    transitIpId: ").append(toIndentedString(transitIpId)).append("\n");
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
