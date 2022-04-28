package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateQueuePlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SetQueuePlanReq body;

    public CreateQueuePlanRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 需要设置定时扩缩计划的队列名称，名称只能包含数字、英文字母和下划线，但不能是纯数字，且不能以下划线开头。长度限制：1~128个字符。 说明：  队列名称不区分大小写，系统会自动转换为小写。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public CreateQueuePlanRequest withBody(SetQueuePlanReq body) {
        this.body = body;
        return this;
    }

    public CreateQueuePlanRequest withBody(Consumer<SetQueuePlanReq> bodySetter) {
        if (this.body == null) {
            this.body = new SetQueuePlanReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetQueuePlanReq getBody() {
        return body;
    }

    public void setBody(SetQueuePlanReq body) {
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
        CreateQueuePlanRequest createQueuePlanRequest = (CreateQueuePlanRequest) o;
        return Objects.equals(this.queueName, createQueuePlanRequest.queueName)
            && Objects.equals(this.body, createQueuePlanRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQueuePlanRequest {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
