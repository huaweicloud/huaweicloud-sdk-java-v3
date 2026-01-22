package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： RocketMQ元数据迁移，RocketMQ消费组元数据。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class MigrationRocketMqSubscriptionGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_broadcast_enable")

    private Boolean consumeBroadcastEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_enable")

    private Boolean consumeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_from_min_enable")

    private Boolean consumeFromMinEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_consumer_ids_changed_enable")

    private Boolean notifyConsumerIdsChangedEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_times")

    private Integer retryMaxTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_queue_nums")

    private Integer retryQueueNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "which_broker_when_consume_slow")

    private Long whichBrokerWhenConsumeSlow;

    public MigrationRocketMqSubscriptionGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 消费组名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public MigrationRocketMqSubscriptionGroup withConsumeBroadcastEnable(Boolean consumeBroadcastEnable) {
        this.consumeBroadcastEnable = consumeBroadcastEnable;
        return this;
    }

    /**
     * **参数解释**： 是否允许以广播模式消费。 **约束限制**： 不涉及。 **取值范围**： - true：允许以广播模式消费。 - false：不允许以广播模式消费。 **默认取值**： 不涉及。
     * @return consumeBroadcastEnable
     */
    public Boolean getConsumeBroadcastEnable() {
        return consumeBroadcastEnable;
    }

    public void setConsumeBroadcastEnable(Boolean consumeBroadcastEnable) {
        this.consumeBroadcastEnable = consumeBroadcastEnable;
    }

    public MigrationRocketMqSubscriptionGroup withConsumeEnable(Boolean consumeEnable) {
        this.consumeEnable = consumeEnable;
        return this;
    }

    /**
     * **参数解释**： 是否允许消费。 **约束限制**： 不涉及。 **取值范围**： - true：允许消费。 - false：不允许消费。 **默认取值**： true。
     * @return consumeEnable
     */
    public Boolean getConsumeEnable() {
        return consumeEnable;
    }

    public void setConsumeEnable(Boolean consumeEnable) {
        this.consumeEnable = consumeEnable;
    }

    public MigrationRocketMqSubscriptionGroup withConsumeFromMinEnable(Boolean consumeFromMinEnable) {
        this.consumeFromMinEnable = consumeFromMinEnable;
        return this;
    }

    /**
     * **参数解释**： 是否从最小偏移量开始消费。 **约束限制**： 不涉及。 **取值范围**： - true：是。 - false：不是。 **默认取值**： true。
     * @return consumeFromMinEnable
     */
    public Boolean getConsumeFromMinEnable() {
        return consumeFromMinEnable;
    }

    public void setConsumeFromMinEnable(Boolean consumeFromMinEnable) {
        this.consumeFromMinEnable = consumeFromMinEnable;
    }

    public MigrationRocketMqSubscriptionGroup withNotifyConsumerIdsChangedEnable(
        Boolean notifyConsumerIdsChangedEnable) {
        this.notifyConsumerIdsChangedEnable = notifyConsumerIdsChangedEnable;
        return this;
    }

    /**
     * **参数解释**： 消费者ID变化时是否通知。 **约束限制**： 不涉及。 **取值范围**： - true：是。 - false：不是。 **默认取值**： true。
     * @return notifyConsumerIdsChangedEnable
     */
    public Boolean getNotifyConsumerIdsChangedEnable() {
        return notifyConsumerIdsChangedEnable;
    }

    public void setNotifyConsumerIdsChangedEnable(Boolean notifyConsumerIdsChangedEnable) {
        this.notifyConsumerIdsChangedEnable = notifyConsumerIdsChangedEnable;
    }

    public MigrationRocketMqSubscriptionGroup withRetryMaxTimes(Integer retryMaxTimes) {
        this.retryMaxTimes = retryMaxTimes;
        return this;
    }

    /**
     * **参数解释**： 消费最大重试次数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 16。
     * @return retryMaxTimes
     */
    public Integer getRetryMaxTimes() {
        return retryMaxTimes;
    }

    public void setRetryMaxTimes(Integer retryMaxTimes) {
        this.retryMaxTimes = retryMaxTimes;
    }

    public MigrationRocketMqSubscriptionGroup withRetryQueueNums(Integer retryQueueNums) {
        this.retryQueueNums = retryQueueNums;
        return this;
    }

    /**
     * **参数解释**： 消费最大重试次数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 1。
     * @return retryQueueNums
     */
    public Integer getRetryQueueNums() {
        return retryQueueNums;
    }

    public void setRetryQueueNums(Integer retryQueueNums) {
        this.retryQueueNums = retryQueueNums;
    }

    public MigrationRocketMqSubscriptionGroup withWhichBrokerWhenConsumeSlow(Long whichBrokerWhenConsumeSlow) {
        this.whichBrokerWhenConsumeSlow = whichBrokerWhenConsumeSlow;
        return this;
    }

    /**
     * **参数解释**： 慢消费时选择的broker节点ID **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 1。
     * @return whichBrokerWhenConsumeSlow
     */
    public Long getWhichBrokerWhenConsumeSlow() {
        return whichBrokerWhenConsumeSlow;
    }

    public void setWhichBrokerWhenConsumeSlow(Long whichBrokerWhenConsumeSlow) {
        this.whichBrokerWhenConsumeSlow = whichBrokerWhenConsumeSlow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationRocketMqSubscriptionGroup that = (MigrationRocketMqSubscriptionGroup) obj;
        return Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.consumeBroadcastEnable, that.consumeBroadcastEnable)
            && Objects.equals(this.consumeEnable, that.consumeEnable)
            && Objects.equals(this.consumeFromMinEnable, that.consumeFromMinEnable)
            && Objects.equals(this.notifyConsumerIdsChangedEnable, that.notifyConsumerIdsChangedEnable)
            && Objects.equals(this.retryMaxTimes, that.retryMaxTimes)
            && Objects.equals(this.retryQueueNums, that.retryQueueNums)
            && Objects.equals(this.whichBrokerWhenConsumeSlow, that.whichBrokerWhenConsumeSlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            consumeBroadcastEnable,
            consumeEnable,
            consumeFromMinEnable,
            notifyConsumerIdsChangedEnable,
            retryMaxTimes,
            retryQueueNums,
            whichBrokerWhenConsumeSlow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationRocketMqSubscriptionGroup {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    consumeBroadcastEnable: ").append(toIndentedString(consumeBroadcastEnable)).append("\n");
        sb.append("    consumeEnable: ").append(toIndentedString(consumeEnable)).append("\n");
        sb.append("    consumeFromMinEnable: ").append(toIndentedString(consumeFromMinEnable)).append("\n");
        sb.append("    notifyConsumerIdsChangedEnable: ")
            .append(toIndentedString(notifyConsumerIdsChangedEnable))
            .append("\n");
        sb.append("    retryMaxTimes: ").append(toIndentedString(retryMaxTimes)).append("\n");
        sb.append("    retryQueueNums: ").append(toIndentedString(retryQueueNums)).append("\n");
        sb.append("    whichBrokerWhenConsumeSlow: ").append(toIndentedString(whichBrokerWhenConsumeSlow)).append("\n");
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
