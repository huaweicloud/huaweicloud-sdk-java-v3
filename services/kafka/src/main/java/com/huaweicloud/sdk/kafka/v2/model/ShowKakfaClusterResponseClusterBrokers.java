package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowKakfaClusterResponseClusterBrokers
 */
public class ShowKakfaClusterResponseClusterBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private Boolean health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_id")

    private String brokerId;

    public ShowKakfaClusterResponseClusterBrokers withHealth(Boolean health) {
        this.health = health;
        return this;
    }

    /**
     * **参数解释**： 是否健康。   **取值范围**： - true：健康。 - false：不健康。
     * @return health
     */
    public Boolean getHealth() {
        return health;
    }

    public void setHealth(Boolean health) {
        this.health = health;
    }

    public ShowKakfaClusterResponseClusterBrokers withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**： Host地址。   **取值范围**： 不涉及。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ShowKakfaClusterResponseClusterBrokers withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 端口。   **取值范围**： 不涉及。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public ShowKakfaClusterResponseClusterBrokers withBrokerId(String brokerId) {
        this.brokerId = brokerId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。   **取值范围**： 不涉及。
     * @return brokerId
     */
    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKakfaClusterResponseClusterBrokers that = (ShowKakfaClusterResponseClusterBrokers) obj;
        return Objects.equals(this.health, that.health) && Objects.equals(this.host, that.host)
            && Objects.equals(this.port, that.port) && Objects.equals(this.brokerId, that.brokerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, host, port, brokerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKakfaClusterResponseClusterBrokers {\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
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
