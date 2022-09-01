package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeBaremetalServerNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    @JacksonXmlProperty(localName = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ChangeBaremetalNameBody body;

    public ChangeBaremetalServerNameRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 裸金属服务器ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ChangeBaremetalServerNameRequest withBody(ChangeBaremetalNameBody body) {
        this.body = body;
        return this;
    }

    public ChangeBaremetalServerNameRequest withBody(Consumer<ChangeBaremetalNameBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeBaremetalNameBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeBaremetalNameBody getBody() {
        return body;
    }

    public void setBody(ChangeBaremetalNameBody body) {
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
        ChangeBaremetalServerNameRequest changeBaremetalServerNameRequest = (ChangeBaremetalServerNameRequest) o;
        return Objects.equals(this.serverId, changeBaremetalServerNameRequest.serverId)
            && Objects.equals(this.body, changeBaremetalServerNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBaremetalServerNameRequest {\n");
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
