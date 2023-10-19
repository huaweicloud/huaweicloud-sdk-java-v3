package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateNetworkInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instance")

    private NetworkInstance networkInstance;

    public UpdateNetworkInstanceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateNetworkInstanceResponse withNetworkInstance(NetworkInstance networkInstance) {
        this.networkInstance = networkInstance;
        return this;
    }

    public UpdateNetworkInstanceResponse withNetworkInstance(Consumer<NetworkInstance> networkInstanceSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNetworkInstanceResponse that = (UpdateNetworkInstanceResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.networkInstance, that.networkInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, networkInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNetworkInstanceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    networkInstance: ").append(toIndentedString(networkInstance)).append("\n");
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
