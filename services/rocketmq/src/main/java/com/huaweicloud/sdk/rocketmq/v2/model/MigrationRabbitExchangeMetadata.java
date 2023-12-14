package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RocketMQ元数据迁移，RabbitMQ交换机元数据。
 */
public class MigrationRabbitExchangeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    public MigrationRabbitExchangeMetadata withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * vhost名称。
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public MigrationRabbitExchangeMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 交换机名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigrationRabbitExchangeMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 交换机类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MigrationRabbitExchangeMetadata withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * 是否持久化。
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationRabbitExchangeMetadata that = (MigrationRabbitExchangeMetadata) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.durable, that.durable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost, name, type, durable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationRabbitExchangeMetadata {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
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
