package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateInstanceRetentionPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private Integer policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRetentionPolicyRequestBody body;

    public UpdateInstanceRetentionPolicyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceRetentionPolicyRequest withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public UpdateInstanceRetentionPolicyRequest withPolicyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 老化策略ID
     * @return policyId
     */
    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public UpdateInstanceRetentionPolicyRequest withBody(UpdateRetentionPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateInstanceRetentionPolicyRequest withBody(Consumer<UpdateRetentionPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRetentionPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRetentionPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRetentionPolicyRequestBody body) {
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
        UpdateInstanceRetentionPolicyRequest that = (UpdateInstanceRetentionPolicyRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.namespaceName, that.namespaceName) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, namespaceName, policyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRetentionPolicyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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
