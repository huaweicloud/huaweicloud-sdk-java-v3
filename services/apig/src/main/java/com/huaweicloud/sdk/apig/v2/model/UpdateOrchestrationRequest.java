package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOrchestrationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orchestration_id")

    private String orchestrationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OrchestrationCreate body;

    public UpdateOrchestrationRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateOrchestrationRequest withOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
        return this;
    }

    /**
     * 编排规则编号
     * @return orchestrationId
     */
    public String getOrchestrationId() {
        return orchestrationId;
    }

    public void setOrchestrationId(String orchestrationId) {
        this.orchestrationId = orchestrationId;
    }

    public UpdateOrchestrationRequest withBody(OrchestrationCreate body) {
        this.body = body;
        return this;
    }

    public UpdateOrchestrationRequest withBody(Consumer<OrchestrationCreate> bodySetter) {
        if (this.body == null) {
            this.body = new OrchestrationCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OrchestrationCreate getBody() {
        return body;
    }

    public void setBody(OrchestrationCreate body) {
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
        UpdateOrchestrationRequest that = (UpdateOrchestrationRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.orchestrationId, that.orchestrationId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, orchestrationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrchestrationRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    orchestrationId: ").append(toIndentedString(orchestrationId)).append("\n");
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
