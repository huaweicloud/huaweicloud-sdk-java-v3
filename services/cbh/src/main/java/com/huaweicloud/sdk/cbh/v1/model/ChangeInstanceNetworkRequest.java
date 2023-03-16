package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeInstanceNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeInstanceNetwork body;

    public ChangeInstanceNetworkRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机实例ID，使用UUID格式。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ChangeInstanceNetworkRequest withBody(ChangeInstanceNetwork body) {
        this.body = body;
        return this;
    }

    public ChangeInstanceNetworkRequest withBody(Consumer<ChangeInstanceNetwork> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeInstanceNetwork();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeInstanceNetwork getBody() {
        return body;
    }

    public void setBody(ChangeInstanceNetwork body) {
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
        ChangeInstanceNetworkRequest changeInstanceNetworkRequest = (ChangeInstanceNetworkRequest) o;
        return Objects.equals(this.serverId, changeInstanceNetworkRequest.serverId)
            && Objects.equals(this.body, changeInstanceNetworkRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceNetworkRequest {\n");
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
