package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 检查SQL语法
 */
public class CheckSQLGramarReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    @JacksonXmlProperty(localName = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentdb")

    @JacksonXmlProperty(localName = "currentdb")

    private String currentdb;

    public CheckSQLGramarReq withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 待执行的SQL语句。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public CheckSQLGramarReq withCurrentdb(String currentdb) {
        this.currentdb = currentdb;
        return this;
    }

    /**
     * SQL语句执行所在的数据库。
     * @return currentdb
     */
    public String getCurrentdb() {
        return currentdb;
    }

    public void setCurrentdb(String currentdb) {
        this.currentdb = currentdb;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSQLGramarReq checkSQLGramarReq = (CheckSQLGramarReq) o;
        return Objects.equals(this.sql, checkSQLGramarReq.sql)
            && Objects.equals(this.currentdb, checkSQLGramarReq.currentdb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, currentdb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSQLGramarReq {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    currentdb: ").append(toIndentedString(currentdb)).append("\n");
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
