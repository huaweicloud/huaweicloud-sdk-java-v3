package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DDLInfoItem
 */
public class DDLInfoItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table")

    private String table;

    public DDLInfoItem withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * **参数解释**：   无锁变更产生的临时表，获取方法参见[查询无锁变更任务记录列表](https://support.huaweicloud.com/api-taurusdb/ListOnlineDdlTaskRecords.html)的响应参数temp_table_name。   **约束限制**：  不涉及。   **取值范围**：   不涉及。   **默认取值**：   不涉及。
     * @return table
     */
    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DDLInfoItem that = (DDLInfoItem) obj;
        return Objects.equals(this.table, that.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DDLInfoItem {\n");
        sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
