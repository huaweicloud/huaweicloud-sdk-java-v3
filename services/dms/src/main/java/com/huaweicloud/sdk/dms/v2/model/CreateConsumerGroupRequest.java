package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateConsumerGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_id")

    private String queueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateConsumerGroupReq body;

    public CreateConsumerGroupRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /** 指定的队列ID
     * 
     * @return queueId */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public CreateConsumerGroupRequest withBody(CreateConsumerGroupReq body) {
        this.body = body;
        return this;
    }

    public CreateConsumerGroupRequest withBody(Consumer<CreateConsumerGroupReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateConsumerGroupReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public CreateConsumerGroupReq getBody() {
        return body;
    }

    public void setBody(CreateConsumerGroupReq body) {
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
        CreateConsumerGroupRequest createConsumerGroupRequest = (CreateConsumerGroupRequest) o;
        return Objects.equals(this.queueId, createConsumerGroupRequest.queueId)
            && Objects.equals(this.body, createConsumerGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
