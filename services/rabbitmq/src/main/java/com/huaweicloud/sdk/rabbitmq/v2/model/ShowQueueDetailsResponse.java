package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQueueDetailsResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_details")

    private List<ConsumerDetails> consumerDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_bindings")

    private List<BindingsDetails> queueBindings = null;

    public ShowQueueDetailsResponse withVhost(String vhost) {
        this.vhost = vhost;
        return this;
    }

    /**
     * **参数解释**： Queue所属Vhost名称。 **取值范围**： 不涉及。
     * @return vhost
     */
    public String getVhost() {
        return vhost;
    }

    public void setVhost(String vhost) {
        this.vhost = vhost;
    }

    public ShowQueueDetailsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： Queue名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowQueueDetailsResponse withDurable(Boolean durable) {
        this.durable = durable;
        return this;
    }

    /**
     * **参数解释**： Queue是否开启持久化。 **取值范围**： - true：开启持久化。 - false：未开启持久化。
     * @return durable
     */
    public Boolean getDurable() {
        return durable;
    }

    public void setDurable(Boolean durable) {
        this.durable = durable;
    }

    public ShowQueueDetailsResponse withAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * **参数解释**： Queue是否开启自动删除。 **取值范围**： - true：开启自动删除。 - false：未开启自动删除。
     * @return autoDelete
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public ShowQueueDetailsResponse withMessages(Integer messages) {
        this.messages = messages;
        return this;
    }

    /**
     * **参数解释**： 待消费消息数。 **取值范围**： 不涉及。
     * @return messages
     */
    public Integer getMessages() {
        return messages;
    }

    public void setMessages(Integer messages) {
        this.messages = messages;
    }

    public ShowQueueDetailsResponse withConsumers(Integer consumers) {
        this.consumers = consumers;
        return this;
    }

    /**
     * **参数解释**： 连接的消费者数。 **取值范围**： 不涉及。
     * @return consumers
     */
    public Integer getConsumers() {
        return consumers;
    }

    public void setConsumers(Integer consumers) {
        this.consumers = consumers;
    }

    public ShowQueueDetailsResponse withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**： 策略[（AMQP版本不支持policy，不涉及此参数）](tag:hws,hws_hk,hws_eu)。 **取值范围**： 不涉及。
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public ShowQueueDetailsResponse withArguments(QueueArguments arguments) {
        this.arguments = arguments;
        return this;
    }

    public ShowQueueDetailsResponse withArguments(Consumer<QueueArguments> argumentsSetter) {
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

    public ShowQueueDetailsResponse withConsumerDetails(List<ConsumerDetails> consumerDetails) {
        this.consumerDetails = consumerDetails;
        return this;
    }

    public ShowQueueDetailsResponse addConsumerDetailsItem(ConsumerDetails consumerDetailsItem) {
        if (this.consumerDetails == null) {
            this.consumerDetails = new ArrayList<>();
        }
        this.consumerDetails.add(consumerDetailsItem);
        return this;
    }

    public ShowQueueDetailsResponse withConsumerDetails(Consumer<List<ConsumerDetails>> consumerDetailsSetter) {
        if (this.consumerDetails == null) {
            this.consumerDetails = new ArrayList<>();
        }
        consumerDetailsSetter.accept(this.consumerDetails);
        return this;
    }

    /**
     * **参数解释**： 订阅该Queue的消费者信息。
     * @return consumerDetails
     */
    public List<ConsumerDetails> getConsumerDetails() {
        return consumerDetails;
    }

    public void setConsumerDetails(List<ConsumerDetails> consumerDetails) {
        this.consumerDetails = consumerDetails;
    }

    public ShowQueueDetailsResponse withQueueBindings(List<BindingsDetails> queueBindings) {
        this.queueBindings = queueBindings;
        return this;
    }

    public ShowQueueDetailsResponse addQueueBindingsItem(BindingsDetails queueBindingsItem) {
        if (this.queueBindings == null) {
            this.queueBindings = new ArrayList<>();
        }
        this.queueBindings.add(queueBindingsItem);
        return this;
    }

    public ShowQueueDetailsResponse withQueueBindings(Consumer<List<BindingsDetails>> queueBindingsSetter) {
        if (this.queueBindings == null) {
            this.queueBindings = new ArrayList<>();
        }
        queueBindingsSetter.accept(this.queueBindings);
        return this;
    }

    /**
     * **参数解释**： 以此Queue为目标的绑定信息列表。
     * @return queueBindings
     */
    public List<BindingsDetails> getQueueBindings() {
        return queueBindings;
    }

    public void setQueueBindings(List<BindingsDetails> queueBindings) {
        this.queueBindings = queueBindings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQueueDetailsResponse that = (ShowQueueDetailsResponse) obj;
        return Objects.equals(this.vhost, that.vhost) && Objects.equals(this.name, that.name)
            && Objects.equals(this.durable, that.durable) && Objects.equals(this.autoDelete, that.autoDelete)
            && Objects.equals(this.messages, that.messages) && Objects.equals(this.consumers, that.consumers)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.arguments, that.arguments)
            && Objects.equals(this.consumerDetails, that.consumerDetails)
            && Objects.equals(this.queueBindings, that.queueBindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vhost,
            name,
            durable,
            autoDelete,
            messages,
            consumers,
            policy,
            arguments,
            consumerDetails,
            queueBindings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueDetailsResponse {\n");
        sb.append("    vhost: ").append(toIndentedString(vhost)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    durable: ").append(toIndentedString(durable)).append("\n");
        sb.append("    autoDelete: ").append(toIndentedString(autoDelete)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    consumerDetails: ").append(toIndentedString(consumerDetails)).append("\n");
        sb.append("    queueBindings: ").append(toIndentedString(queueBindings)).append("\n");
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
