package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartOnlineDDLInfoItem
 */
public class StartOnlineDDLInfoItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    public StartOnlineDDLInfoItem withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * **参数解释**：  无锁变更的具体执行SQL。  **约束限制**:  满足ALTER TABLE Statement语法形式，多条SQL需要以英文分号隔开。  **取值范围**：   不涉及。  **默认取值**：   不涉及。
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
        StartOnlineDDLInfoItem that = (StartOnlineDDLInfoItem) obj;
        return Objects.equals(this.sql, that.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartOnlineDDLInfoItem {\n");
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
