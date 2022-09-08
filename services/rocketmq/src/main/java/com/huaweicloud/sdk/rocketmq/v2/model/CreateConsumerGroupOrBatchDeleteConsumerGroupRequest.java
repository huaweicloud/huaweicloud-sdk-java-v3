package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateConsumerGroupOrBatchDeleteConsumerGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateConsumerGroupOrBatchDeleteConsumerGroupReq body;

    public CreateConsumerGroupOrBatchDeleteConsumerGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 批量删除topic时使用，不配置则为创建接口。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupRequest withBody(
        CreateConsumerGroupOrBatchDeleteConsumerGroupReq body) {
        this.body = body;
        return this;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupRequest withBody(
        Consumer<CreateConsumerGroupOrBatchDeleteConsumerGroupReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateConsumerGroupOrBatchDeleteConsumerGroupReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq getBody() {
        return body;
    }

    public void setBody(CreateConsumerGroupOrBatchDeleteConsumerGroupReq body) {
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
        CreateConsumerGroupOrBatchDeleteConsumerGroupRequest createConsumerGroupOrBatchDeleteConsumerGroupRequest =
            (CreateConsumerGroupOrBatchDeleteConsumerGroupRequest) o;
        return Objects.equals(this.instanceId, createConsumerGroupOrBatchDeleteConsumerGroupRequest.instanceId)
            && Objects.equals(this.action, createConsumerGroupOrBatchDeleteConsumerGroupRequest.action)
            && Objects.equals(this.body, createConsumerGroupOrBatchDeleteConsumerGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupOrBatchDeleteConsumerGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
