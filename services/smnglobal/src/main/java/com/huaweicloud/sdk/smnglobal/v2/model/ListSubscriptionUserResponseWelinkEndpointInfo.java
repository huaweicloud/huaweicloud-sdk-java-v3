package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSubscriptionUserResponseWelinkEndpointInfo
 */
public class ListSubscriptionUserResponseWelinkEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    public ListSubscriptionUserResponseWelinkEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 终端地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListSubscriptionUserResponseWelinkEndpointInfo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * welink协议订阅用户的client_id，从Welink方获取。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionUserResponseWelinkEndpointInfo that = (ListSubscriptionUserResponseWelinkEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, clientId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionUserResponseWelinkEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
