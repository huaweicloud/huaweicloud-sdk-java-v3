package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入血缘请求体。
 */
public class SubNodeLineageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tables")

    private List<TableConfig> inputTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_table")

    private TableConfig outputTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_lineages")

    private List<ColumnLineageConfig> columnLineages = null;

    public SubNodeLineageConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubNodeLineageConfig withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * 待接续sql语句。
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public SubNodeLineageConfig withInputTables(List<TableConfig> inputTables) {
        this.inputTables = inputTables;
        return this;
    }

    public SubNodeLineageConfig addInputTablesItem(TableConfig inputTablesItem) {
        if (this.inputTables == null) {
            this.inputTables = new ArrayList<>();
        }
        this.inputTables.add(inputTablesItem);
        return this;
    }

    public SubNodeLineageConfig withInputTables(Consumer<List<TableConfig>> inputTablesSetter) {
        if (this.inputTables == null) {
            this.inputTables = new ArrayList<>();
        }
        inputTablesSetter.accept(this.inputTables);
        return this;
    }

    /**
     * 输入表。
     * @return inputTables
     */
    public List<TableConfig> getInputTables() {
        return inputTables;
    }

    public void setInputTables(List<TableConfig> inputTables) {
        this.inputTables = inputTables;
    }

    public SubNodeLineageConfig withOutputTable(TableConfig outputTable) {
        this.outputTable = outputTable;
        return this;
    }

    public SubNodeLineageConfig withOutputTable(Consumer<TableConfig> outputTableSetter) {
        if (this.outputTable == null) {
            this.outputTable = new TableConfig();
            outputTableSetter.accept(this.outputTable);
        }

        return this;
    }

    /**
     * Get outputTable
     * @return outputTable
     */
    public TableConfig getOutputTable() {
        return outputTable;
    }

    public void setOutputTable(TableConfig outputTable) {
        this.outputTable = outputTable;
    }

    public SubNodeLineageConfig withColumnLineages(List<ColumnLineageConfig> columnLineages) {
        this.columnLineages = columnLineages;
        return this;
    }

    public SubNodeLineageConfig addColumnLineagesItem(ColumnLineageConfig columnLineagesItem) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        this.columnLineages.add(columnLineagesItem);
        return this;
    }

    public SubNodeLineageConfig withColumnLineages(Consumer<List<ColumnLineageConfig>> columnLineagesSetter) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        columnLineagesSetter.accept(this.columnLineages);
        return this;
    }

    /**
     * 字段血缘信息。
     * @return columnLineages
     */
    public List<ColumnLineageConfig> getColumnLineages() {
        return columnLineages;
    }

    public void setColumnLineages(List<ColumnLineageConfig> columnLineages) {
        this.columnLineages = columnLineages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubNodeLineageConfig that = (SubNodeLineageConfig) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.inputTables, that.inputTables) && Objects.equals(this.outputTable, that.outputTable)
            && Objects.equals(this.columnLineages, that.columnLineages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sqlStatement, inputTables, outputTable, columnLineages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubNodeLineageConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    inputTables: ").append(toIndentedString(inputTables)).append("\n");
        sb.append("    outputTable: ").append(toIndentedString(outputTable)).append("\n");
        sb.append("    columnLineages: ").append(toIndentedString(columnLineages)).append("\n");
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
