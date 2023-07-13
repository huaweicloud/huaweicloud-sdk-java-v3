package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEndpointGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group")

    private EndpointGroupDetail endpointGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateEndpointGroupResponse withEndpointGroup(EndpointGroupDetail endpointGroup) {
        this.endpointGroup = endpointGroup;
        return this;
    }

    public CreateEndpointGroupResponse withEndpointGroup(Consumer<EndpointGroupDetail> endpointGroupSetter) {
        if (this.endpointGroup == null) {
            this.endpointGroup = new EndpointGroupDetail();
            endpointGroupSetter.accept(this.endpointGroup);
        }

        return this;
    }

    /**
     * Get endpointGroup
     * @return endpointGroup
     */
    public EndpointGroupDetail getEndpointGroup() {
        return endpointGroup;
    }

    public void setEndpointGroup(EndpointGroupDetail endpointGroup) {
        this.endpointGroup = endpointGroup;
    }

    public CreateEndpointGroupResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEndpointGroupResponse that = (CreateEndpointGroupResponse) obj;
        return Objects.equals(this.endpointGroup, that.endpointGroup) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroup, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointGroupResponse {\n");
        sb.append("    endpointGroup: ").append(toIndentedString(endpointGroup)).append("\n");
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
