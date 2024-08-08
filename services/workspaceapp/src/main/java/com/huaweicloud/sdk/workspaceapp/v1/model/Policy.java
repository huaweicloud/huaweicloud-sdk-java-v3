package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OBS桶存放的策略。
 */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement")

    private ObsPolicyStatement statement;

    public Policy withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Policy withStatement(ObsPolicyStatement statement) {
        this.statement = statement;
        return this;
    }

    public Policy withStatement(Consumer<ObsPolicyStatement> statementSetter) {
        if (this.statement == null) {
            this.statement = new ObsPolicyStatement();
            statementSetter.accept(this.statement);
        }

        return this;
    }

    /**
     * Get statement
     * @return statement
     */
    public ObsPolicyStatement getStatement() {
        return statement;
    }

    public void setStatement(ObsPolicyStatement statement) {
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
        Policy that = (Policy) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.statement, that.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, statement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
