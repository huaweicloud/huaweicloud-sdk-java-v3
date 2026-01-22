package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BindingsDetails
 */
public class BindingsDetails {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties_key")

    private String propertiesKey;

    public BindingsDetails withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： Exchange名称。 **取值范围**： 不涉及。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BindingsDetails withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * **参数解释**： 绑定目标的类型。 **取值范围**： - exchange：交换机。 - queue：队列。
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public BindingsDetails withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * **参数解释**： 绑定目标。 **取值范围**： 不涉及。
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BindingsDetails withRoutingKey(String routingKey) {
        this.routingKey = routingKey;
        return this;
    }

    /**
     * **参数解释**： 绑定键值。 **取值范围**： 不涉及。
     * @return routingKey
     */
    public String getRoutingKey() {
        return routingKey;
    }

    public void setRoutingKey(String routingKey) {
        this.routingKey = routingKey;
    }

    public BindingsDetails withPropertiesKey(String propertiesKey) {
        this.propertiesKey = propertiesKey;
        return this;
    }

    /**
     * **参数解释**： 经过URL转译后routing_key。 **取值范围**： 不涉及。
     * @return propertiesKey
     */
    public String getPropertiesKey() {
        return propertiesKey;
    }

    public void setPropertiesKey(String propertiesKey) {
        this.propertiesKey = propertiesKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindingsDetails that = (BindingsDetails) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.routingKey, that.routingKey)
            && Objects.equals(this.propertiesKey, that.propertiesKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, destinationType, destination, routingKey, propertiesKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindingsDetails {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    routingKey: ").append(toIndentedString(routingKey)).append("\n");
        sb.append("    propertiesKey: ").append(toIndentedString(propertiesKey)).append("\n");
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
