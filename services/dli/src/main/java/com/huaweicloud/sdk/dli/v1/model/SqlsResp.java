package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlsResp
 */
public class SqlsResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_name")

    private String sqlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public SqlsResp withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * SQL模板ID。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public SqlsResp withSqlName(String sqlName) {
        this.sqlName = sqlName;
        return this;
    }

    /**
     * SQL模板名称。
     * @return sqlName
     */
    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public SqlsResp withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL模板文本。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlsResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SQL模板描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SqlsResp withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 分组名称。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public SqlsResp withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * SQL模板的创建者。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlsResp sqlsResp = (SqlsResp) o;
        return Objects.equals(this.sqlId, sqlsResp.sqlId) && Objects.equals(this.sqlName, sqlsResp.sqlName)
            && Objects.equals(this.sql, sqlsResp.sql) && Objects.equals(this.description, sqlsResp.description)
            && Objects.equals(this.group, sqlsResp.group) && Objects.equals(this.owner, sqlsResp.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlId, sqlName, sql, description, group, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlsResp {\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlName: ").append(toIndentedString(sqlName)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
