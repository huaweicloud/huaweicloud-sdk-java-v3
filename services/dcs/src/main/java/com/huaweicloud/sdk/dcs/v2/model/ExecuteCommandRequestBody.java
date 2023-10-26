package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExecuteCommandRequestBody
 */
public class ExecuteCommandRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private Integer database;

    public ExecuteCommandRequestBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 客户端ID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ExecuteCommandRequestBody withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ExecuteCommandRequestBody withDatabase(Integer database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库编号
     * @return database
     */
    public Integer getDatabase() {
        return database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteCommandRequestBody that = (ExecuteCommandRequestBody) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.command, that.command)
            && Objects.equals(this.database, that.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, command, database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteCommandRequestBody {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
