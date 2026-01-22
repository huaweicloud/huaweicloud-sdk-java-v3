package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChannelDetails
 */
public class ChannelDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_name")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_host")

    private String peerHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_port")

    private Integer peerPort;

    public ChannelDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： channel信息，包括客户端IP:Port到服务端IP:Port(channel_id)。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelDetails withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**： channel数量。 **取值范围**： 不涉及。
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public ChannelDetails withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**： 消费者用户名，在开启ACL访问控制后返回真实用户名，未开启ACL时返回null。 **取值范围**： 不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ChannelDetails withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * **参数解释**： connection信息，包括客户端IP:Port到服务端IP:Port。 **取值范围**： 不涉及。
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ChannelDetails withPeerHost(String peerHost) {
        this.peerHost = peerHost;
        return this;
    }

    /**
     * **参数解释**： 连接的消费者IP。 **取值范围**： 不涉及。
     * @return peerHost
     */
    public String getPeerHost() {
        return peerHost;
    }

    public void setPeerHost(String peerHost) {
        this.peerHost = peerHost;
    }

    public ChannelDetails withPeerPort(Integer peerPort) {
        this.peerPort = peerPort;
        return this;
    }

    /**
     * **参数解释**： 连接的消费者进程端口号。 **取值范围**： 不涉及。
     * @return peerPort
     */
    public Integer getPeerPort() {
        return peerPort;
    }

    public void setPeerPort(Integer peerPort) {
        this.peerPort = peerPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelDetails that = (ChannelDetails) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.number, that.number)
            && Objects.equals(this.user, that.user) && Objects.equals(this.connectionName, that.connectionName)
            && Objects.equals(this.peerHost, that.peerHost) && Objects.equals(this.peerPort, that.peerPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, user, connectionName, peerHost, peerPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelDetails {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    peerHost: ").append(toIndentedString(peerHost)).append("\n");
        sb.append("    peerPort: ").append(toIndentedString(peerPort)).append("\n");
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
