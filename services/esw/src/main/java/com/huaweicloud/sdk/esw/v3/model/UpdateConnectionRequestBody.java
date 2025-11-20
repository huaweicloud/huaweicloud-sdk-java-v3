package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateConnectionRequestBody
 */
public class UpdateConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private UpdateConnectionOption connection;

    public UpdateConnectionRequestBody withConnection(UpdateConnectionOption connection) {
        this.connection = connection;
        return this;
    }

    public UpdateConnectionRequestBody withConnection(Consumer<UpdateConnectionOption> connectionSetter) {
        if (this.connection == null) {
            this.connection = new UpdateConnectionOption();
            connectionSetter.accept(this.connection);
        }

        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public UpdateConnectionOption getConnection() {
        return connection;
    }

    public void setConnection(UpdateConnectionOption connection) {
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
        UpdateConnectionRequestBody that = (UpdateConnectionRequestBody) obj;
        return Objects.equals(this.connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectionRequestBody {\n");
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
