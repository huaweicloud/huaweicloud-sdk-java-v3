package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueueDetails
 */
public class QueueDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vhost")

    private String vhost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "durable")

    private Boolean durable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete")

    private Boolean autoDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private Integer messages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumers")

    private Integer consumers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arguments")

    private QueueArguments arguments;

    public QueueDetails withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * Queue所属Vhost名称
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public QueueDetails withName(String name) {
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

    public QueueDetails withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * 是否持久化
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public QueueDetails withAutoDelete(Boolean autoDelete) {
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

    public QueueDetails withMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    /**
     * 待消费消息数
     * @return messages
     */
    public Integer getMessages() {
        return messages;
    }

    public void setMessages(Integer messages) {
        this.messages = messages;
    }

    public QueueDetails withConsumers(Integer consumers) {
        this.consumers = consumers;
        return this;
    }

    /**
     * 连接的消费者数
     * @return consumers
     */
    public Integer getConsumers() {
        return consumers;
    }

    public void setConsumers(Integer consumers) {
        this.consumers = consumers;
    }

    public QueueDetails withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 策略（AMQP版本不支持policy，不涉及此参数）
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public QueueDetails withArguments(QueueArguments arguments) {
        this.arguments = arguments;
        return this;
    }

    public QueueDetails withArguments(Consumer<QueueArguments> argumentsSetter) {
        if (this.arguments == null) {
            this.arguments = new QueueArguments();
            argumentsSetter.accept(this.arguments);
        }

        return this;
    }

    /**
     * Get arguments
     * @return arguments
     */
    public QueueArguments getArguments() {
        return arguments;
    }

    public void setArguments(QueueArguments arguments) {
        this.arguments = arguments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueDetails that = (QueueDetails) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.name, that.name)
            && Objects.equals(this.durable, that.durable) && Objects.equals(this.autoDelete, that.autoDelete)
            && Objects.equals(this.messages, that.messages) && Objects.equals(this.consumers, that.consumers)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost, name, durable, autoDelete, messages, consumers, policy, arguments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueDetails {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
