package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGlobalDcGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway_id")

    private String globalDcGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateGlobalDcGatewayRequestBody body;

    public UpdateGlobalDcGatewayRequest withGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
        return this;
    }

    /**
     * 全球接入网关ID
     * @return globalDcGatewayId
     */
    public String getGlobalDcGatewayId() {
        return globalDcGatewayId;
    }

    public void setGlobalDcGatewayId(String globalDcGatewayId) {
        this.globalDcGatewayId = globalDcGatewayId;
    }

    public UpdateGlobalDcGatewayRequest withBody(UpdateGlobalDcGatewayRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateGlobalDcGatewayRequest withBody(Consumer<UpdateGlobalDcGatewayRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateGlobalDcGatewayRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateGlobalDcGatewayRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateGlobalDcGatewayRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalDcGatewayRequest that = (UpdateGlobalDcGatewayRequest) obj;
        return Objects.equals(this.globalDcGatewayId, that.globalDcGatewayId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalDcGatewayRequest {\n");
        sb.append("    globalDcGatewayId: ").append(toIndentedString(globalDcGatewayId)).append("\n");
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
