package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableLineage
 */
public class TableLineage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tables")

    private List<TableInfo> inputTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tables")

    private List<TableInfo> outputTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_connection_id")

    private String sourceConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_connection_id")

    private String targetConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_lineages")

    private List<ColumnLineage> columnLineages = null;

    public TableLineage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业算子名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TableLineage withInputTables(List<TableInfo> inputTables) {
        this.inputTables = inputTables;
        return this;
    }

    public TableLineage addInputTablesItem(TableInfo inputTablesItem) {
        if (this.inputTables == null) {
            this.inputTables = new ArrayList<>();
        }
        this.inputTables.add(inputTablesItem);
        return this;
    }

    public TableLineage withInputTables(Consumer<List<TableInfo>> inputTablesSetter) {
        if (this.inputTables == null) {
            this.inputTables = new ArrayList<>();
        }
        inputTablesSetter.accept(this.inputTables);
        return this;
    }

    /**
     * 上游血缘表列表，列表大小：1至100
     * @return inputTables
     */
    public List<TableInfo> getInputTables() {
        return inputTables;
    }

    public void setInputTables(List<TableInfo> inputTables) {
        this.inputTables = inputTables;
    }

    public TableLineage withOutputTables(List<TableInfo> outputTables) {
        this.outputTables = outputTables;
        return this;
    }

    public TableLineage addOutputTablesItem(TableInfo outputTablesItem) {
        if (this.outputTables == null) {
            this.outputTables = new ArrayList<>();
        }
        this.outputTables.add(outputTablesItem);
        return this;
    }

    public TableLineage withOutputTables(Consumer<List<TableInfo>> outputTablesSetter) {
        if (this.outputTables == null) {
            this.outputTables = new ArrayList<>();
        }
        outputTablesSetter.accept(this.outputTables);
        return this;
    }

    /**
     * 下游血缘表列表，列表大小：1至100
     * @return outputTables
     */
    public List<TableInfo> getOutputTables() {
        return outputTables;
    }

    public void setOutputTables(List<TableInfo> outputTables) {
        this.outputTables = outputTables;
    }

    public TableLineage withSourceConnectionId(String sourceConnectionId) {
        this.sourceConnectionId = sourceConnectionId;
        return this;
    }

    /**
     * 源数据连接id
     * @return sourceConnectionId
     */
    public String getSourceConnectionId() {
        return sourceConnectionId;
    }

    public void setSourceConnectionId(String sourceConnectionId) {
        this.sourceConnectionId = sourceConnectionId;
    }

    public TableLineage withTargetConnectionId(String targetConnectionId) {
        this.targetConnectionId = targetConnectionId;
        return this;
    }

    /**
     * 目标数据连接id
     * @return targetConnectionId
     */
    public String getTargetConnectionId() {
        return targetConnectionId;
    }

    public void setTargetConnectionId(String targetConnectionId) {
        this.targetConnectionId = targetConnectionId;
    }

    public TableLineage withColumnLineages(List<ColumnLineage> columnLineages) {
        this.columnLineages = columnLineages;
        return this;
    }

    public TableLineage addColumnLineagesItem(ColumnLineage columnLineagesItem) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        this.columnLineages.add(columnLineagesItem);
        return this;
    }

    public TableLineage withColumnLineages(Consumer<List<ColumnLineage>> columnLineagesSetter) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        columnLineagesSetter.accept(this.columnLineages);
        return this;
    }

    /**
     * 字段血缘列表，列表大小：0至100
     * @return columnLineages
     */
    public List<ColumnLineage> getColumnLineages() {
        return columnLineages;
    }

    public void setColumnLineages(List<ColumnLineage> columnLineages) {
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
        TableLineage that = (TableLineage) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.inputTables, that.inputTables)
            && Objects.equals(this.outputTables, that.outputTables)
            && Objects.equals(this.sourceConnectionId, that.sourceConnectionId)
            && Objects.equals(this.targetConnectionId, that.targetConnectionId)
            && Objects.equals(this.columnLineages, that.columnLineages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inputTables, outputTables, sourceConnectionId, targetConnectionId, columnLineages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableLineage {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inputTables: ").append(toIndentedString(inputTables)).append("\n");
        sb.append("    outputTables: ").append(toIndentedString(outputTables)).append("\n");
        sb.append("    sourceConnectionId: ").append(toIndentedString(sourceConnectionId)).append("\n");
        sb.append("    targetConnectionId: ").append(toIndentedString(targetConnectionId)).append("\n");
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
