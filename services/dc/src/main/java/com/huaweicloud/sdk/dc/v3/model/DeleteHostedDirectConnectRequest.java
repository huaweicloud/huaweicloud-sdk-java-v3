package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteHostedDirectConnectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect_id")

    private String hostedConnectId;

    public DeleteHostedDirectConnectRequest withHostedConnectId(String hostedConnectId) {
        this.hostedConnectId = hostedConnectId;
        return this;
    }

    /**
     * 托管专线连接ID。
     * @return hostedConnectId
     */
    public String getHostedConnectId() {
        return hostedConnectId;
    }

    public void setHostedConnectId(String hostedConnectId) {
        this.hostedConnectId = hostedConnectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteHostedDirectConnectRequest deleteHostedDirectConnectRequest = (DeleteHostedDirectConnectRequest) o;
        return Objects.equals(this.hostedConnectId, deleteHostedDirectConnectRequest.hostedConnectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedConnectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHostedDirectConnectRequest {\n");
        sb.append("    hostedConnectId: ").append(toIndentedString(hostedConnectId)).append("\n");
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
