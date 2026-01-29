package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateBindingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private String destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_key")

    private String routingKey;

    public CreateBindingResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 绑定对象
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateBindingResponse withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * **参数解释**： 绑定目标端类型。 **取值范围**： - exchange：交换机。 - queue：队列。[AMQP版本只支持绑定queue。](tag:hws,hws_hk,hws_eu,srg)
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public CreateBindingResponse withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 要投递的Exchange或Queue名称
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public CreateBindingResponse withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * 绑定键值，用于告知Exchange应该将消息投递到哪些Queue中
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
        CreateBindingResponse that = (CreateBindingResponse) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.routingKey, that.routingKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destinationType, destination, routingKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBindingResponse {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
