package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库表信息。
 */
public class DatabaseForListTableResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public DatabaseForListTableResult withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**： 表名称。 **取值范围**： 不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseForListTableResult that = (DatabaseForListTableResult) obj;
        return Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseForListTableResult {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
