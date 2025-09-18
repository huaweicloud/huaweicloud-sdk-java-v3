package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCloudConnectionCapabilitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capabilities")

    private List<CloudConnectionCapabilityInfo> capabilities = null;

    public ListCloudConnectionCapabilitiesResponse withRequestId(String requestId) {
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

    public ListCloudConnectionCapabilitiesResponse withCapabilities(List<CloudConnectionCapabilityInfo> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public ListCloudConnectionCapabilitiesResponse addCapabilitiesItem(CloudConnectionCapabilityInfo capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    public ListCloudConnectionCapabilitiesResponse withCapabilities(
        Consumer<List<CloudConnectionCapabilityInfo>> capabilitiesSetter) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        capabilitiesSetter.accept(this.capabilities);
        return this;
    }

    /**
     * 租户能力列表。
     * @return capabilities
     */
    public List<CloudConnectionCapabilityInfo> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<CloudConnectionCapabilityInfo> capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudConnectionCapabilitiesResponse that = (ListCloudConnectionCapabilitiesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.capabilities, that.capabilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, capabilities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudConnectionCapabilitiesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
