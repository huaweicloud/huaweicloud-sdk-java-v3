package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateServerInterfaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateNicInfoRequestBody body;

    public UpdateServerInterfaceRequest withServerId(String serverId) {
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

    public UpdateServerInterfaceRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * The network card ID of the cloud server.
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdateServerInterfaceRequest withBody(UpdateNicInfoRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateServerInterfaceRequest withBody(Consumer<UpdateNicInfoRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateNicInfoRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateNicInfoRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNicInfoRequestBody body) {
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
        UpdateServerInterfaceRequest that = (UpdateServerInterfaceRequest) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, portId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerInterfaceRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
