package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateHostMassageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    @JacksonXmlProperty(localName = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateHostMassageReq body;

    public UpdateHostMassageRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID，用于标识跨源连接的UUID。
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public UpdateHostMassageRequest withBody(UpdateHostMassageReq body) {
        this.body = body;
        return this;
    }

    public UpdateHostMassageRequest withBody(Consumer<UpdateHostMassageReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateHostMassageReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateHostMassageReq getBody() {
        return body;
    }

    public void setBody(UpdateHostMassageReq body) {
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
        UpdateHostMassageRequest updateHostMassageRequest = (UpdateHostMassageRequest) o;
        return Objects.equals(this.connectionId, updateHostMassageRequest.connectionId)
            && Objects.equals(this.body, updateHostMassageRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostMassageRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
