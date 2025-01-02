package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DelayRestoreSchema
 */
public class DelayRestoreSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_tables")

    private Integer totalTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<DelayRestoreTable> tables = null;

    public DelayRestoreSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * schema名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DelayRestoreSchema withTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
        return this;
    }

    /**
     * 返回该schema下的总表数量
     * @return totalTables
     */
    public Integer getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(Integer totalTables) {
        this.totalTables = totalTables;
    }

    public DelayRestoreSchema withTables(List<DelayRestoreTable> tables) {
        this.tables = tables;
        return this;
    }

    public DelayRestoreSchema addTablesItem(DelayRestoreTable tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public DelayRestoreSchema withTables(Consumer<List<DelayRestoreTable>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * 该schema下的表列表
     * @return tables
     */
    public List<DelayRestoreTable> getTables() {
        return tables;
    }

    public void setTables(List<DelayRestoreTable> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelayRestoreSchema that = (DelayRestoreSchema) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.totalTables, that.totalTables)
            && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalTables, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelayRestoreSchema {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    totalTables: ").append(toIndentedString(totalTables)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
