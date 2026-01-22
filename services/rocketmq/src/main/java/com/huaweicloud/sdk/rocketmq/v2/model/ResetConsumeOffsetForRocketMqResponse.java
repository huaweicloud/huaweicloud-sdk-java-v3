package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ResetConsumeOffsetForRocketMqResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<ResetConsumeOffsetRespQueues> queues = null;

    public ResetConsumeOffsetForRocketMqResponse withQueues(List<ResetConsumeOffsetRespQueues> queues) {
        this.queues = queues;
        return this;
    }

    public ResetConsumeOffsetForRocketMqResponse addQueuesItem(ResetConsumeOffsetRespQueues queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ResetConsumeOffsetForRocketMqResponse withQueues(Consumer<List<ResetConsumeOffsetRespQueues>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * **参数解释**： 重置的队列。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return queues
     */
    public List<ResetConsumeOffsetRespQueues> getQueues() {
        return queues;
    }

    public void setQueues(List<ResetConsumeOffsetRespQueues> queues) {
        this.queues = queues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetConsumeOffsetForRocketMqResponse that = (ResetConsumeOffsetForRocketMqResponse) obj;
        return Objects.equals(this.queues, that.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetConsumeOffsetForRocketMqResponse {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
