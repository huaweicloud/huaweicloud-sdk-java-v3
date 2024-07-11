package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Queue参数，如果未配置则不返回。
 */
public class QueueArguments {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-message-ttl")

    private Long xMessageTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-dead-letter-exchange")

    private String xDeadLetterExchange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-dead-letter-routing-key")

    private String xDeadLetterRoutingKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-queue-mode")

    private String xQueueMode;

    public QueueArguments withXMessageTtl(Long xMessageTtl) {
        this.xMessageTtl = xMessageTtl;
        return this;
    }

    /**
     * 消息过期时间，发布到Queue的消息在被丢弃之前可以存活多长时间。
     * @return xMessageTtl
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-message-ttl")
    public Long getXMessageTtl() {
        return xMessageTtl;
    }

    public void setXMessageTtl(Long xMessageTtl) {
        this.xMessageTtl = xMessageTtl;
    }

    public QueueArguments withXDeadLetterExchange(String xDeadLetterExchange) {
        this.xDeadLetterExchange = xDeadLetterExchange;
        return this;
    }

    /**
     * 死信Exchange名称，消息被拒绝或过期时将重新发布到该Exchange。
     * @return xDeadLetterExchange
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-dead-letter-exchange")
    public String getXDeadLetterExchange() {
        return xDeadLetterExchange;
    }

    public void setXDeadLetterExchange(String xDeadLetterExchange) {
        this.xDeadLetterExchange = xDeadLetterExchange;
    }

    public QueueArguments withXDeadLetterRoutingKey(String xDeadLetterRoutingKey) {
        this.xDeadLetterRoutingKey = xDeadLetterRoutingKey;
        return this;
    }

    /**
     * 死信的RoutingKey，死信Exchange会发送死信消息到绑定对应RoutingKey的Queue上。
     * @return xDeadLetterRoutingKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-dead-letter-routing-key")
    public String getXDeadLetterRoutingKey() {
        return xDeadLetterRoutingKey;
    }

    public void setXDeadLetterRoutingKey(String xDeadLetterRoutingKey) {
        this.xDeadLetterRoutingKey = xDeadLetterRoutingKey;
    }

    public QueueArguments withXQueueMode(String xQueueMode) {
        this.xQueueMode = xQueueMode;
        return this;
    }

    /**
     * 惰性队列[（AMQP版本默认持久化所有消息，不涉及此参数）](tag:hws,hws_hk)
     * @return xQueueMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-queue-mode")
    public String getXQueueMode() {
        return xQueueMode;
    }

    public void setXQueueMode(String xQueueMode) {
        this.xQueueMode = xQueueMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueArguments that = (QueueArguments) obj;
        return Objects.equals(this.xMessageTtl, that.xMessageTtl)
            && Objects.equals(this.xDeadLetterExchange, that.xDeadLetterExchange)
            && Objects.equals(this.xDeadLetterRoutingKey, that.xDeadLetterRoutingKey)
            && Objects.equals(this.xQueueMode, that.xQueueMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xMessageTtl, xDeadLetterExchange, xDeadLetterRoutingKey, xQueueMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueArguments {\n");
        sb.append("    xMessageTtl: ").append(toIndentedString(xMessageTtl)).append("\n");
        sb.append("    xDeadLetterExchange: ").append(toIndentedString(xDeadLetterExchange)).append("\n");
        sb.append("    xDeadLetterRoutingKey: ").append(toIndentedString(xDeadLetterRoutingKey)).append("\n");
        sb.append("    xQueueMode: ").append(toIndentedString(xQueueMode)).append("\n");
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
