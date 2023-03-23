package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSqlTemplatesRequestBody
 */
public class CreateSqlTemplatesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_name")

    private String sqlName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    public CreateSqlTemplatesRequestBody withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 新增的SQL模板。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public CreateSqlTemplatesRequestBody withSqlName(String sqlName) {
        this.sqlName = sqlName;
        return this;
    }

    /**
     * 新增SQL模板名称，该名称在当前工程下必须唯一。
     * @return sqlName
     */
    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public CreateSqlTemplatesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 新增SQL模板的描述信息，可以为空字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSqlTemplatesRequestBody withGroup(String group) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSqlTemplatesRequestBody createSqlTemplatesRequestBody = (CreateSqlTemplatesRequestBody) o;
        return Objects.equals(this.sql, createSqlTemplatesRequestBody.sql)
            && Objects.equals(this.sqlName, createSqlTemplatesRequestBody.sqlName)
            && Objects.equals(this.description, createSqlTemplatesRequestBody.description)
            && Objects.equals(this.group, createSqlTemplatesRequestBody.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, sqlName, description, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlTemplatesRequestBody {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlName: ").append(toIndentedString(sqlName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
