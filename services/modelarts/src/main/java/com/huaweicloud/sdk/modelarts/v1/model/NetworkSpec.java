package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对外网络的描述。
 */
public class NetworkSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private NetworkConnection connection;

    public NetworkSpec withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释**：网络的cidr值。 **取值范围**： - 172.16.0.0/12~24 - 192.168.0.0/16~24
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public NetworkSpec withConnection(NetworkConnection connection) {
        this.connection = connection;
        return this;
    }

    public NetworkSpec withConnection(Consumer<NetworkConnection> connectionSetter) {
        if (this.connection == null) {
            this.connection = new NetworkConnection();
            connectionSetter.accept(this.connection);
        }

        return this;
    }

    /**
     * Get connection
     * @return connection
     */
    public NetworkConnection getConnection() {
        return connection;
    }

    public void setConnection(NetworkConnection connection) {
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
        NetworkSpec that = (NetworkSpec) obj;
        return Objects.equals(this.cidr, that.cidr) && Objects.equals(this.connection, that.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidr, connection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSpec {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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
