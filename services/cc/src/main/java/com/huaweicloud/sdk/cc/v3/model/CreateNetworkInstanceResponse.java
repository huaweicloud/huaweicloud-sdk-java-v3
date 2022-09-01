package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateNetworkInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instance")

    @JacksonXmlProperty(localName = "network_instance")

    private NetworkInstance networkInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    public CreateNetworkInstanceResponse withNetworkInstance(NetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
        return this;
    }

    public CreateNetworkInstanceResponse withNetworkInstance(Consumer<NetworkInstance> networkInstanceSetter) {
        if (this.networkInstance == null) {
            this.networkInstance = new NetworkInstance();
            networkInstanceSetter.accept(this.networkInstance);
        }

        return this;
    }

    /**
     * Get networkInstance
     * @return networkInstance
     */
    public NetworkInstance getNetworkInstance() {
        return networkInstance;
    }

    public void setNetworkInstance(NetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
    }

    public CreateNetworkInstanceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNetworkInstanceResponse createNetworkInstanceResponse = (CreateNetworkInstanceResponse) o;
        return Objects.equals(this.networkInstance, createNetworkInstanceResponse.networkInstance)
            && Objects.equals(this.requestId, createNetworkInstanceResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkInstance, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNetworkInstanceResponse {\n");
        sb.append("    networkInstance: ").append(toIndentedString(networkInstance)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
