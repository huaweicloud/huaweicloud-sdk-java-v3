package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRoutingBacklogPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Instance-Id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateBacklogPolicy body;

    public UpdateRoutingBacklogPolicyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数说明**：实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。您可以在IoTDA管理控制台界面，选择左侧导航栏“总览”页签查看当前实例的ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateRoutingBacklogPolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数说明**：数据流转积压策略id，用于唯一标识一个数据流转积压策略，在创建数据流转积压策略时由物联网平台分配获得。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateRoutingBacklogPolicyRequest withBody(UpdateBacklogPolicy body) {
        this.body = body;
        return this;
    }

    public UpdateRoutingBacklogPolicyRequest withBody(Consumer<UpdateBacklogPolicy> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateBacklogPolicy();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateBacklogPolicy getBody() {
        return body;
    }

    public void setBody(UpdateBacklogPolicy body) {
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
        UpdateRoutingBacklogPolicyRequest that = (UpdateRoutingBacklogPolicyRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRoutingBacklogPolicyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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
