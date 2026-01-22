package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowTopicStatusRespBrokers
 */
public class ShowTopicStatusRespBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<ShowTopicStatusRespQueues> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    public ShowTopicStatusRespBrokers withQueues(List<ShowTopicStatusRespQueues> queues) {
        this.queues = queues;
        return this;
    }

    public ShowTopicStatusRespBrokers addQueuesItem(ShowTopicStatusRespQueues queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ShowTopicStatusRespBrokers withQueues(Consumer<List<ShowTopicStatusRespQueues>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * **参数解释**： 队列列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return queues
     */
    public List<ShowTopicStatusRespQueues> getQueues() {
        return queues;
    }

    public void setQueues(List<ShowTopicStatusRespQueues> queues) {
        this.queues = queues;
    }

    public ShowTopicStatusRespBrokers withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * **参数解释**： 节点名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopicStatusRespBrokers that = (ShowTopicStatusRespBrokers) obj;
        return Objects.equals(this.queues, that.queues) && Objects.equals(this.brokerName, that.brokerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queues, brokerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicStatusRespBrokers {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
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
