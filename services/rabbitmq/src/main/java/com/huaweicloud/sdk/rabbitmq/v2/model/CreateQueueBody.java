package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateQueueBody
 */
public class CreateQueueBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete")

    private Boolean autoDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_letter_exchange")

    private String deadLetterExchange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_letter_routing_key")

    private String deadLetterRoutingKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_ttl")

    private Long messageTtl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lazy_mode")

    private String lazyMode;

    public CreateQueueBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Queue名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateQueueBody withAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * 是否自动删除
     * @return autoDelete
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public CreateQueueBody withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * 是否持久化[（AMQP版本默认持久化，不涉及此字段）](tag:hws,hws_hk,hws_eu)
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public CreateQueueBody withDeadLetterExchange(String deadLetterExchange) {
        this.deadLetterExchange = deadLetterExchange;
        return this;
    }

    /**
     * 死信Exchange名称，消息被拒绝或过期时将重新发布到该Exchange。
     * @return deadLetterExchange
     */
    public String getDeadLetterExchange() {
        return deadLetterExchange;
    }

    public void setDeadLetterExchange(String deadLetterExchange) {
        this.deadLetterExchange = deadLetterExchange;
    }

    public CreateQueueBody withDeadLetterRoutingKey(String deadLetterRoutingKey) {
        this.deadLetterRoutingKey = deadLetterRoutingKey;
        return this;
    }

    /**
     * 死信Exchange的RoutingKey，死信Exchange会发送死信消息到绑定对应RoutingKey的Queue上。
     * @return deadLetterRoutingKey
     */
    public String getDeadLetterRoutingKey() {
        return deadLetterRoutingKey;
    }

    public void setDeadLetterRoutingKey(String deadLetterRoutingKey) {
        this.deadLetterRoutingKey = deadLetterRoutingKey;
    }

    public CreateQueueBody withMessageTtl(Long messageTtl) {
        this.messageTtl = messageTtl;
        return this;
    }

    /**
     * 发布到Queue的消息在被丢弃之前可以存活多长时间
     * @return messageTtl
     */
    public Long getMessageTtl() {
        return messageTtl;
    }

    public void setMessageTtl(Long messageTtl) {
        this.messageTtl = messageTtl;
    }

    public CreateQueueBody withLazyMode(String lazyMode) {
        this.lazyMode = lazyMode;
        return this;
    }

    /**
     * 若设置惰性队列，请输入lazy。惰性队列模式会在磁盘上存储尽可能多的消息以减少内存使用；若不设置，队列将消息存储在内存缓存以尽可能快地传递消息。[（AMQP版本默认将消息存储到磁盘，不涉及此字段）](tag:hws,hws_hk,hws_eu)
     * @return lazyMode
     */
    public String getLazyMode() {
        return lazyMode;
    }

    public void setLazyMode(String lazyMode) {
        this.lazyMode = lazyMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateQueueBody that = (CreateQueueBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.autoDelete, that.autoDelete)
            && Objects.equals(this.durable, that.durable)
            && Objects.equals(this.deadLetterExchange, that.deadLetterExchange)
            && Objects.equals(this.deadLetterRoutingKey, that.deadLetterRoutingKey)
            && Objects.equals(this.messageTtl, that.messageTtl) && Objects.equals(this.lazyMode, that.lazyMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autoDelete, durable, deadLetterExchange, deadLetterRoutingKey, messageTtl, lazyMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQueueBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    deadLetterExchange: ").append(toIndentedString(deadLetterExchange)).append("\n");
        sb.append("    deadLetterRoutingKey: ").append(toIndentedString(deadLetterRoutingKey)).append("\n");
        sb.append("    messageTtl: ").append(toIndentedString(messageTtl)).append("\n");
        sb.append("    lazyMode: ").append(toIndentedString(lazyMode)).append("\n");
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
