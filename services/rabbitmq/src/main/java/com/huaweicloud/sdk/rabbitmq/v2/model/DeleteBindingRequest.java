package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBindingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exchange")

    private String exchange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    private String destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties_key")

    private String propertiesKey;

    public DeleteBindingRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteBindingRequest withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * Vhost名称
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public DeleteBindingRequest withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Exchange名称
     * @return exchange
     */
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public DeleteBindingRequest withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 绑定目标端类型，Exchange或Queue（AMQP版本只支持Queue绑定类型）
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public DeleteBindingRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 绑定的目标端名称
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DeleteBindingRequest withPropertiesKey(String propertiesKey) {
        this.propertiesKey = propertiesKey;
        return this;
    }

    /**
     * 绑定路由键，经过URL转译后routing_key，可通过调用[查询Exchange绑定列表](ListBindings.xml)或者[查询指定Queue详情](ShowQueueDetails.xml)接口的响应信息获取。
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
        DeleteBindingRequest that = (DeleteBindingRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.vhost, that.vhost)
            && Objects.equals(this.exchange, that.exchange)
            && Objects.equals(this.destinationType, that.destinationType)
            && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.propertiesKey, that.propertiesKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, vhost, exchange, destinationType, destination, propertiesKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBindingRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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
