package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHostedDirectConnectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect_id")

    private String hostedConnectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateHostedDirectConnectRequestBody body;

    public UpdateHostedDirectConnectRequest withHostedConnectId(String hostedConnectId) {
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

    public UpdateHostedDirectConnectRequest withBody(UpdateHostedDirectConnectRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateHostedDirectConnectRequest withBody(Consumer<UpdateHostedDirectConnectRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHostedDirectConnectRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHostedDirectConnectRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateHostedDirectConnectRequestBody body) {
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
        UpdateHostedDirectConnectRequest that = (UpdateHostedDirectConnectRequest) obj;
        return Objects.equals(this.hostedConnectId, that.hostedConnectId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedConnectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostedDirectConnectRequest {\n");
        sb.append("    hostedConnectId: ").append(toIndentedString(hostedConnectId)).append("\n");
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
