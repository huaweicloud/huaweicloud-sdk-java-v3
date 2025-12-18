package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 备份里的库表信息。 **约束限制：** 该参数仅针对GeminiDB Cassandra。 **取值范围：** - 字段为空，表示创建实例级备份。 - 字段非空，表示创建库表级备份。 **默认取值：** 不涉及。
 */
public class DatabaseTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")

    private List<String> tableNames = null;

    public DatabaseTable withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释：** 数据库名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseTable withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public DatabaseTable addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public DatabaseTable withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * **参数解释：** 数据表名称列表。 **约束限制：** 不涉及。 **取值范围：** - table_names为空的时候，表示库级别备份。 - table_names非空的时候，表示表级别备份。  **默认取值：** 不涉及。
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseTable that = (DatabaseTable) obj;
        return Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableNames, that.tableNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseTable {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
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
