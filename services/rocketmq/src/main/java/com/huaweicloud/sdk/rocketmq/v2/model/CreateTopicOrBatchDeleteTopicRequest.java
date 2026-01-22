package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTopicOrBatchDeleteTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTopicOrBatchDeleteTopicReq body;

    public CreateTopicOrBatchDeleteTopicRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateTopicOrBatchDeleteTopicRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 批量删除Topic时使用，不配置则为创建接口。 **约束限制**： 不涉及。 **取值范围**： - delete：批量删除Topic。 - 不填：创建Topic。 **默认取值**： 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateTopicOrBatchDeleteTopicRequest withBody(CreateTopicOrBatchDeleteTopicReq body) {
        this.body = body;
        return this;
    }

    public CreateTopicOrBatchDeleteTopicRequest withBody(Consumer<CreateTopicOrBatchDeleteTopicReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTopicOrBatchDeleteTopicReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTopicOrBatchDeleteTopicReq getBody() {
        return body;
    }

    public void setBody(CreateTopicOrBatchDeleteTopicReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTopicOrBatchDeleteTopicRequest that = (CreateTopicOrBatchDeleteTopicRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, action, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTopicOrBatchDeleteTopicRequest {\n");
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
