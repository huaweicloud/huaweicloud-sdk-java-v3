package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEndpointGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group_id")

    private String endpointGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEndpointGroupRequestBody body;

    public UpdateEndpointGroupRequest withEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }

    /**
     * 终端节点组ID。
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return endpointGroupId;
    }

    public void setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
    }

    public UpdateEndpointGroupRequest withBody(UpdateEndpointGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEndpointGroupRequest withBody(Consumer<UpdateEndpointGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEndpointGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEndpointGroupRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEndpointGroupRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointGroupRequest updateEndpointGroupRequest = (UpdateEndpointGroupRequest) o;
        return Objects.equals(this.endpointGroupId, updateEndpointGroupRequest.endpointGroupId)
            && Objects.equals(this.body, updateEndpointGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointGroupRequest {\n");
        sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
