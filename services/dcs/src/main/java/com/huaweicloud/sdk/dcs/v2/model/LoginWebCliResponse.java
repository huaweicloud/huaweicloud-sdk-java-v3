package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class LoginWebCliResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private Integer databases;

    public LoginWebCliResponse withClientId(String clientId) {
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

    public LoginWebCliResponse withDatabases(Integer databases) {
        this.databases = databases;
        return this;
    }

    /**
     * DB数量
     * @return databases
     */
    public Integer getDatabases() {
        return databases;
    }

    public void setDatabases(Integer databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginWebCliResponse that = (LoginWebCliResponse) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginWebCliResponse {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
