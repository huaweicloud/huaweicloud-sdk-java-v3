package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateBindingBody
 */
public class CreateBindingBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_key")

    private String routingKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private String destinationType;

    public CreateBindingBody withDestination(String destination) {
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

    public CreateBindingBody withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * **参数解释**： 绑定键值，用于告知Exchange应该将消息投递到哪些Queue或Exchange中。 **约束限制**： - 不允许包含+和~。 - 最长128个字符。 - 不能包含中文。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return routingKey
     */
    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public CreateBindingBody withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * **参数解释**： 绑定目标端类型。 **约束限制**： [不涉及。](tag:sbc,cmcc,tm,hk_tm,ax,hk_sbc)[AMQP版本只支持绑定Queue。](tag:hws,hws_hk,hws_eu,srg) **取值范围**： - exchange：交换机。 - queue：队列。 **默认取值**： 不涉及。
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBindingBody that = (CreateBindingBody) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.routingKey, that.routingKey)
            && Objects.equals(this.destinationType, that.destinationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, routingKey, destinationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBindingBody {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
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
