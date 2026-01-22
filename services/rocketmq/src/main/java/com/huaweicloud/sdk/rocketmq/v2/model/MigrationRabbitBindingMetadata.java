package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： RocketMQ元数据迁移，RabbitMQ binding元数据。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class MigrationRabbitBindingMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private String destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_key")

    private String routingKey;

    public MigrationRabbitBindingMetadata withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * **参数解释**： vhost名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public MigrationRabbitBindingMetadata withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 消息的来源。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public MigrationRabbitBindingMetadata withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * **参数解释**： 消息的目标。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public MigrationRabbitBindingMetadata withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * **参数解释**： 目标的类型。 **约束限制**： 不涉及。 **取值范围**： - exchange：交换机。 - queue：队列。[RabbitMQ AMQP版本只支持绑定queue。](tag:hws,hws_hk) **默认取值**： 不涉及。
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public MigrationRabbitBindingMetadata withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * **参数解释**： 路由键。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return routingKey
     */
    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationRabbitBindingMetadata that = (MigrationRabbitBindingMetadata) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.source, that.source)
            && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.routingKey, that.routingKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost, source, destination, destinationType, routingKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationRabbitBindingMetadata {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
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
