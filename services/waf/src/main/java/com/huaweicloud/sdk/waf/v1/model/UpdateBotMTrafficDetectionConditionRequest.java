package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBotMTrafficDetectionConditionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_id")

    private String conditionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SaveTrafficDetectionConditionRequestBody body;

    public UpdateBotMTrafficDetectionConditionRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * policyId
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateBotMTrafficDetectionConditionRequest withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * 流量检测条件Id
     * @return conditionId
     */
    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public UpdateBotMTrafficDetectionConditionRequest withBody(SaveTrafficDetectionConditionRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateBotMTrafficDetectionConditionRequest withBody(
        Consumer<SaveTrafficDetectionConditionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new SaveTrafficDetectionConditionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SaveTrafficDetectionConditionRequestBody getBody() {
        return body;
    }

    public void setBody(SaveTrafficDetectionConditionRequestBody body) {
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
        UpdateBotMTrafficDetectionConditionRequest that = (UpdateBotMTrafficDetectionConditionRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.conditionId, that.conditionId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, conditionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBotMTrafficDetectionConditionRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
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
