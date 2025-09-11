package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleScopeRequest
 */
public class RuleScopeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private String dbNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_users")

    private String dbUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_ips")

    private String exceptionIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ips")

    private String sourceIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ports")

    private String sourcePorts;

    public RuleScopeRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作类型，多个用英文,分隔
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public RuleScopeRequest withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库ID，多个用英文逗号分隔，全部传[ALL]
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public RuleScopeRequest withDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    /**
     * 数据库名称，多个用英文逗号分隔，全部传[全部数据库]
     * @return dbNames
     */
    public String getDbNames() {
        return dbNames;
    }

    public void setDbNames(String dbNames) {
        this.dbNames = dbNames;
    }

    public RuleScopeRequest withDbUsers(String dbUsers) {
        this.dbUsers = dbUsers;
        return this;
    }

    /**
     * 数据库账号，多个用英文逗号分隔
     * @return dbUsers
     */
    public String getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(String dbUsers) {
        this.dbUsers = dbUsers;
    }

    public RuleScopeRequest withExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
        return this;
    }

    /**
     * 例外IP，多个用英文逗号分隔
     * @return exceptionIps
     */
    public String getExceptionIps() {
        return exceptionIps;
    }

    public void setExceptionIps(String exceptionIps) {
        this.exceptionIps = exceptionIps;
    }

    public RuleScopeRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public RuleScopeRequest withSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
        return this;
    }

    /**
     * 源IP，多个用英文逗号分隔
     * @return sourceIps
     */
    public String getSourceIps() {
        return sourceIps;
    }

    public void setSourceIps(String sourceIps) {
        this.sourceIps = sourceIps;
    }

    public RuleScopeRequest withSourcePorts(String sourcePorts) {
        this.sourcePorts = sourcePorts;
        return this;
    }

    /**
     * 源端口，多个用英文逗号分隔
     * @return sourcePorts
     */
    public String getSourcePorts() {
        return sourcePorts;
    }

    public void setSourcePorts(String sourcePorts) {
        this.sourcePorts = sourcePorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleScopeRequest that = (RuleScopeRequest) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.dbIds, that.dbIds)
            && Objects.equals(this.dbNames, that.dbNames) && Objects.equals(this.dbUsers, that.dbUsers)
            && Objects.equals(this.exceptionIps, that.exceptionIps) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.sourceIps, that.sourceIps) && Objects.equals(this.sourcePorts, that.sourcePorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, dbIds, dbNames, dbUsers, exceptionIps, ruleName, sourceIps, sourcePorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleScopeRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    dbUsers: ").append(toIndentedString(dbUsers)).append("\n");
        sb.append("    exceptionIps: ").append(toIndentedString(exceptionIps)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    sourceIps: ").append(toIndentedString(sourceIps)).append("\n");
        sb.append("    sourcePorts: ").append(toIndentedString(sourcePorts)).append("\n");
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
