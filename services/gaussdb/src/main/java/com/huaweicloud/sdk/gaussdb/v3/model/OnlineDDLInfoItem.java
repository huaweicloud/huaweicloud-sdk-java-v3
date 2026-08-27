package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OnlineDDLInfoItem
 */
public class OnlineDDLInfoItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    public OnlineDDLInfoItem withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * **参数解释**：   无锁变更的目标表。  **取值范围**：  不涉及。  
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public OnlineDDLInfoItem withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * **参数解释**：  无锁变更的具体执行SQL。  **取值范围**：   不涉及。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OnlineDDLInfoItem that = (OnlineDDLInfoItem) obj;
        return Objects.equals(this.table, that.table) && Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnlineDDLInfoItem {\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
