package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ConfirmDeadLettersMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_group_id")

    private String consumerGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ConfirmDeadLettersMessagesReq body;

    public ConfirmDeadLettersMessagesRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * 队列ID。
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public ConfirmDeadLettersMessagesRequest withConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
        return this;
    }

    /**
     * 消费组ID。
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    public void setConsumerGroupId(String consumerGroupId) {
        this.consumerGroupId = consumerGroupId;
    }

    public ConfirmDeadLettersMessagesRequest withBody(ConfirmDeadLettersMessagesReq body) {
        this.body = body;
        return this;
    }

    public ConfirmDeadLettersMessagesRequest withBody(Consumer<ConfirmDeadLettersMessagesReq> bodySetter) {
        if (this.body == null) {
            this.body = new ConfirmDeadLettersMessagesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ConfirmDeadLettersMessagesReq getBody() {
        return body;
    }

    public void setBody(ConfirmDeadLettersMessagesReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmDeadLettersMessagesRequest confirmDeadLettersMessagesRequest = (ConfirmDeadLettersMessagesRequest) o;
        return Objects.equals(this.queueId, confirmDeadLettersMessagesRequest.queueId)
            && Objects.equals(this.consumerGroupId, confirmDeadLettersMessagesRequest.consumerGroupId)
            && Objects.equals(this.body, confirmDeadLettersMessagesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueId, consumerGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmDeadLettersMessagesRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    consumerGroupId: ").append(toIndentedString(consumerGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
