package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRoutingFlowControlPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_value")

    private String scopeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowRoutingFlowControlPolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数说明**：数据流转流控策略id，用于唯一标识一个数据流转流控策略，在创建数据流转流控策略时由物联网平台分配获得。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowRoutingFlowControlPolicyResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数说明**：数据流转流控策略名称。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowRoutingFlowControlPolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：用户自定义的数据流转流控策略描述。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowRoutingFlowControlPolicyResponse withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数说明**：流控策略作用域. **取值范围**： - USER：租户级流控策略。 - CHANNEL：转发通道级流控策略。 - RULE：转发规则级流控策略。 - ACTION：转发动作级流控策略。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ShowRoutingFlowControlPolicyResponse withScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
        return this;
    }

    /**
     * **参数说明**：流控策略作用域附加值。 scope取值为USER时，可不携带该字段，表示租户级流控。 scope取值为CHANNEL时，**取值范围**：HTTP_FORWARDING、DIS_FORWARDING、OBS_FORWARDING、AMQP_FORWARDING、DMS_KAFKA_FORWARDING。 scope取值为RULE时，该字段为对应的ruleId。 scope取值为ACTION时，该字段为对应的actionId。
     * @return scopeValue
     */
    public String getScopeValue() {
        return scopeValue;
    }

    public void setScopeValue(String scopeValue) {
        this.scopeValue = scopeValue;
    }

    public ShowRoutingFlowControlPolicyResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数说明**：数据转发流控大小。单位为tps，取值范围为1~1000的整数，默认为1000.
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRoutingFlowControlPolicyResponse that = (ShowRoutingFlowControlPolicyResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.scopeValue, that.scopeValue) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, policyName, description, scope, scopeValue, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRoutingFlowControlPolicyResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    scopeValue: ").append(toIndentedString(scopeValue)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
