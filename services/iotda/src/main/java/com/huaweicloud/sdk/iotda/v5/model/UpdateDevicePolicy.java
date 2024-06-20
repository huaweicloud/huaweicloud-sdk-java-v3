package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新策略请求体。
 */
public class UpdateDevicePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private List<Statement> statement = null;

    public UpdateDevicePolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数说明**：策略名称。 **取值范围**：长度不超过128，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public UpdateDevicePolicy withStatement(List<Statement> statement) {
        this.statement = statement;
        return this;
    }

    public UpdateDevicePolicy addStatementItem(Statement statementItem) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        this.statement.add(statementItem);
        return this;
    }

    public UpdateDevicePolicy withStatement(Consumer<List<Statement>> statementSetter) {
        if (this.statement == null) {
            this.statement = new ArrayList<>();
        }
        statementSetter.accept(this.statement);
        return this;
    }

    /**
     * **参数说明**：策略文档。
     * @return statement
     */
    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDevicePolicy that = (UpdateDevicePolicy) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDevicePolicy {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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
