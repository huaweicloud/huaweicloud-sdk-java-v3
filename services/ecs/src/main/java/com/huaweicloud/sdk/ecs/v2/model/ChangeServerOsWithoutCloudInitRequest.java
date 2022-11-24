package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeServerOsWithoutCloudInitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeServerOsWithoutCloudInitRequestBody body;

    public ChangeServerOsWithoutCloudInitRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ChangeServerOsWithoutCloudInitRequest withBody(ChangeServerOsWithoutCloudInitRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeServerOsWithoutCloudInitRequest withBody(
        Consumer<ChangeServerOsWithoutCloudInitRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeServerOsWithoutCloudInitRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeServerOsWithoutCloudInitRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeServerOsWithoutCloudInitRequestBody body) {
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
        ChangeServerOsWithoutCloudInitRequest changeServerOsWithoutCloudInitRequest =
            (ChangeServerOsWithoutCloudInitRequest) o;
        return Objects.equals(this.serverId, changeServerOsWithoutCloudInitRequest.serverId)
            && Objects.equals(this.body, changeServerOsWithoutCloudInitRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithoutCloudInitRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
