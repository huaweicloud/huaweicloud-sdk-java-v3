package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 细粒度备份信息。 **取值范围**： 不涉及。
 */
public class FineGrainedSnapshotDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_list")

    private List<String> schemaList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_list")

    private List<String> tableList = null;

    public FineGrainedSnapshotDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**： 数据库。 **取值范围**： 不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public FineGrainedSnapshotDetail withSchemaList(List<String> schemaList) {
        this.schemaList = schemaList;
        return this;
    }

    public FineGrainedSnapshotDetail addSchemaListItem(String schemaListItem) {
        if (this.schemaList == null) {
            this.schemaList = new ArrayList<>();
        }
        this.schemaList.add(schemaListItem);
        return this;
    }

    public FineGrainedSnapshotDetail withSchemaList(Consumer<List<String>> schemaListSetter) {
        if (this.schemaList == null) {
            this.schemaList = new ArrayList<>();
        }
        schemaListSetter.accept(this.schemaList);
        return this;
    }

    /**
     * **参数解释**： 模式列表。 **取值范围**： 不涉及。
     * @return schemaList
     */
    public List<String> getSchemaList() {
        return schemaList;
    }

    public void setSchemaList(List<String> schemaList) {
        this.schemaList = schemaList;
    }

    public FineGrainedSnapshotDetail withTableList(List<String> tableList) {
        this.tableList = tableList;
        return this;
    }

    public FineGrainedSnapshotDetail addTableListItem(String tableListItem) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        this.tableList.add(tableListItem);
        return this;
    }

    public FineGrainedSnapshotDetail withTableList(Consumer<List<String>> tableListSetter) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        tableListSetter.accept(this.tableList);
        return this;
    }

    /**
     * **参数解释**： 表集合。 **取值范围**： 不涉及。
     * @return tableList
     */
    public List<String> getTableList() {
        return tableList;
    }

    public void setTableList(List<String> tableList) {
        this.tableList = tableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FineGrainedSnapshotDetail that = (FineGrainedSnapshotDetail) obj;
        return Objects.equals(this.database, that.database) && Objects.equals(this.schemaList, that.schemaList)
            && Objects.equals(this.tableList, that.tableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(database, schemaList, tableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineGrainedSnapshotDetail {\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    schemaList: ").append(toIndentedString(schemaList)).append("\n");
        sb.append("    tableList: ").append(toIndentedString(tableList)).append("\n");
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
