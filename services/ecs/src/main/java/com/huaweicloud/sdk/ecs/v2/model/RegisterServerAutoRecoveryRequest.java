package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RegisterServerAutoRecoveryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    @JacksonXmlProperty(localName = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RegisterServerAutoRecoveryRequestBody body;

    public RegisterServerAutoRecoveryRequest withServerId(String serverId) {
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

    public RegisterServerAutoRecoveryRequest withBody(RegisterServerAutoRecoveryRequestBody body) {
        this.body = body;
        return this;
    }

    public RegisterServerAutoRecoveryRequest withBody(Consumer<RegisterServerAutoRecoveryRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RegisterServerAutoRecoveryRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RegisterServerAutoRecoveryRequestBody getBody() {
        return body;
    }

    public void setBody(RegisterServerAutoRecoveryRequestBody body) {
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
        RegisterServerAutoRecoveryRequest registerServerAutoRecoveryRequest = (RegisterServerAutoRecoveryRequest) o;
        return Objects.equals(this.serverId, registerServerAutoRecoveryRequest.serverId)
            && Objects.equals(this.body, registerServerAutoRecoveryRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterServerAutoRecoveryRequest {\n");
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
