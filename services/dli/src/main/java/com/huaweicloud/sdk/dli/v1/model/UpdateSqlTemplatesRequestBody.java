package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSqlTemplatesRequestBody
 */
public class UpdateSqlTemplatesRequestBody {

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

    public UpdateSqlTemplatesRequestBody withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 更新后SQL模板文本。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public UpdateSqlTemplatesRequestBody withSqlName(String sqlName) {
        this.sqlName = sqlName;
        return this;
    }

    /**
     * 更新后SQL模板名称，该名称在当前工程下必须唯一。
     * @return sqlName
     */
    public String getSqlName() {
        return sqlName;
    }

    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public UpdateSqlTemplatesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SQL模板的描述信息，可以为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateSqlTemplatesRequestBody withGroup(String group) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSqlTemplatesRequestBody that = (UpdateSqlTemplatesRequestBody) obj;
        return Objects.equals(this.sql, that.sql) && Objects.equals(this.sqlName, that.sqlName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, sqlName, description, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSqlTemplatesRequestBody {\n");
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
