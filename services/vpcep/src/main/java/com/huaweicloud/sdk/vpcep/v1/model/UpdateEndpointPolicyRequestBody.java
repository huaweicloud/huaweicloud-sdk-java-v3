package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新终端节点policy请求结构体
 */
public class UpdateEndpointPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement")

    private List<PolicyStatement> policyStatement = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_document")

    private Object policyDocument;

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
     * Gateway类型终端节点策略信息，仅限OBS、SFS的终端节点服务的enable_policy值为true时支持该参数。
     * @return policyStatement
     */
    public List<PolicyStatement> getPolicyStatement() {
        return policyStatement;
    }

    public void setPolicyStatement(List<PolicyStatement> policyStatement) {
        this.policyStatement = policyStatement;
    }

    public UpdateEndpointPolicyRequestBody withPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * 终端节点策略信息，仅当终端节点服务的enable_policy值为true时支持该参数，默认值为完全访问权限。（OBS、SFS的终端节点服务暂不支持该参数）
     * @return policyDocument
     */
    public Object getPolicyDocument() {
        return policyDocument;
    }

    public void setPolicyDocument(Object policyDocument) {
        this.policyDocument = policyDocument;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointPolicyRequestBody that = (UpdateEndpointPolicyRequestBody) obj;
        return Objects.equals(this.policyStatement, that.policyStatement)
            && Objects.equals(this.policyDocument, that.policyDocument);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStatement, policyDocument);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointPolicyRequestBody {\n");
        sb.append("    policyStatement: ").append(toIndentedString(policyStatement)).append("\n");
        sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
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
