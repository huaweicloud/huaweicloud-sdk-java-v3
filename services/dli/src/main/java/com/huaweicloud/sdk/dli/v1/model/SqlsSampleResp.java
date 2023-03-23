package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 样例模板信息。
 */
public class SqlsSampleResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private String lang;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    public SqlsSampleResp withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 语言。
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public SqlsSampleResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 样例模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlsSampleResp withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 样例模板内容。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlsSampleResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 样例模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SqlsSampleResp withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 样例模板分组。
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
        SqlsSampleResp sqlsSampleResp = (SqlsSampleResp) o;
        return Objects.equals(this.lang, sqlsSampleResp.lang) && Objects.equals(this.name, sqlsSampleResp.name)
            && Objects.equals(this.sql, sqlsSampleResp.sql)
            && Objects.equals(this.description, sqlsSampleResp.description)
            && Objects.equals(this.group, sqlsSampleResp.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lang, name, sql, description, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlsSampleResp {\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
