package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group_id")

    private String endpointGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEndpointRequestBody body;

    public UpdateEndpointRequest withEndpointGroupId(String endpointGroupId) {
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

    public UpdateEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 终端节点ID。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public UpdateEndpointRequest withBody(UpdateEndpointRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEndpointRequest withBody(Consumer<UpdateEndpointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEndpointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEndpointRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEndpointRequestBody body) {
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
        UpdateEndpointRequest updateEndpointRequest = (UpdateEndpointRequest) o;
        return Objects.equals(this.endpointGroupId, updateEndpointRequest.endpointGroupId)
            && Objects.equals(this.endpointId, updateEndpointRequest.endpointId)
            && Objects.equals(this.body, updateEndpointRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroupId, endpointId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRequest {\n");
        sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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
