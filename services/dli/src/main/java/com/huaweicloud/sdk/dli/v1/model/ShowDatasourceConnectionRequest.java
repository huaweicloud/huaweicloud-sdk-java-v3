package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDatasourceConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    @JacksonXmlProperty(localName = "connection_id")

    private String connectionId;

    public ShowDatasourceConnectionRequest withConnectionId(String connectionId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDatasourceConnectionRequest showDatasourceConnectionRequest = (ShowDatasourceConnectionRequest) o;
        return Objects.equals(this.connectionId, showDatasourceConnectionRequest.connectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasourceConnectionRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
