package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新网关型终端节点policy请求结构体
 */
public class UpdateEndpointPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement")

    private List<PolicyStatement> policyStatement = null;

    public UpdateEndpointPolicyRequestBody withPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
        return this;
    }

    public UpdateEndpointPolicyRequestBody addPolicyStatementItem(PolicyStatement policyStatementItem) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        this.policyStatement.add(policyStatementItem);
        return this;
    }

    public UpdateEndpointPolicyRequestBody withPolicyStatement(Consumer<List<PolicyStatement>> policyStatementSetter) {
        if (this.policyStatement == null) {
            this.policyStatement = new ArrayList<>();
        }
        policyStatementSetter.accept(this.policyStatement);
        return this;
    }

    /**
     * 只涉及开启双端固定的网关型终端节点
     * @return policyStatement
     */
    public List<PolicyStatement> getPolicyStatement() {
        return policyStatement;
    }

    public void setPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointPolicyRequestBody updateEndpointPolicyRequestBody = (UpdateEndpointPolicyRequestBody) o;
        return Objects.equals(this.policyStatement, updateEndpointPolicyRequestBody.policyStatement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStatement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointPolicyRequestBody {\n");
        sb.append("    policyStatement: ").append(toIndentedString(policyStatement)).append("\n");
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
