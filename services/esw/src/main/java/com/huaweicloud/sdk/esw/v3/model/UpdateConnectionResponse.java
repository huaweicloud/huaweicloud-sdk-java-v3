package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Connection connection;

    public UpdateConnectionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * - 参数解释：请求的唯一标识。 - 约束限制：UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateConnectionResponse withConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public UpdateConnectionResponse withConnection(Consumer<Connection> connectionSetter) {
        if (this.connection == null) {
            this.connection = new Connection();
            connectionSetter.accept(this.connection);
        }

        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConnectionResponse that = (UpdateConnectionResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, connection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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
