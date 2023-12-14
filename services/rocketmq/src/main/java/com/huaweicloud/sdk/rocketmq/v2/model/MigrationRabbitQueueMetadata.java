package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RocketMQ元数据迁移，RabbitMQ队列元数据。
 */
public class MigrationRabbitQueueMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    public MigrationRabbitQueueMetadata withVhost(String vhost) {
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

    public MigrationRabbitQueueMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 队列名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MigrationRabbitQueueMetadata withDurable(Boolean durable) {
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
        MigrationRabbitQueueMetadata that = (MigrationRabbitQueueMetadata) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.name, that.name)
            && Objects.equals(this.durable, that.durable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost, name, durable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationRabbitQueueMetadata {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
