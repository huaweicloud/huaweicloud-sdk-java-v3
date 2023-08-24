package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConnectionInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_id")

    private String connectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConnectionInfo body;

    public UpdateConnectionInfoRequest withConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }

    /**
     * ID of Connection
     * @return connectId
     */
    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    public UpdateConnectionInfoRequest withBody(ConnectionInfo body) {
        this.body = body;
        return this;
    }

    public UpdateConnectionInfoRequest withBody(Consumer<ConnectionInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ConnectionInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConnectionInfo getBody() {
        return body;
    }

    public void setBody(ConnectionInfo body) {
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
        UpdateConnectionInfoRequest that = (UpdateConnectionInfoRequest) obj;
        return Objects.equals(this.connectId, that.connectId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionInfoRequest {\n");
        sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
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
