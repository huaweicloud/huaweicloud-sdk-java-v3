package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TableLineageV2
 */
public class TableLineageV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_tables")

    private List<TableInfoV2> inputTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_tables")

    private List<TableInfoV2> outputTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_lineages")

    private List<ColumnLineageV2> columnLineages = null;

    public TableLineageV2 withInputTables(List<TableInfoV2> inputTables) {
        this.inputTables = inputTables;
        return this;
    }

    public TableLineageV2 addInputTablesItem(TableInfoV2 inputTablesItem) {
        if (this.inputTables == null) {
            this.inputTables = new ArrayList<>();
        }
        this.inputTables.add(inputTablesItem);
        return this;
    }

    public TableLineageV2 withInputTables(Consumer<List<TableInfoV2>> inputTablesSetter) {
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
    public List<TableInfoV2> getInputTables() {
        return inputTables;
    }

    public void setInputTables(List<TableInfoV2> inputTables) {
        this.inputTables = inputTables;
    }

    public TableLineageV2 withOutputTables(List<TableInfoV2> outputTables) {
        this.outputTables = outputTables;
        return this;
    }

    public TableLineageV2 addOutputTablesItem(TableInfoV2 outputTablesItem) {
        if (this.outputTables == null) {
            this.outputTables = new ArrayList<>();
        }
        this.outputTables.add(outputTablesItem);
        return this;
    }

    public TableLineageV2 withOutputTables(Consumer<List<TableInfoV2>> outputTablesSetter) {
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
    public List<TableInfoV2> getOutputTables() {
        return outputTables;
    }

    public void setOutputTables(List<TableInfoV2> outputTables) {
        this.outputTables = outputTables;
    }

    public TableLineageV2 withColumnLineages(List<ColumnLineageV2> columnLineages) {
        this.columnLineages = columnLineages;
        return this;
    }

    public TableLineageV2 addColumnLineagesItem(ColumnLineageV2 columnLineagesItem) {
        if (this.columnLineages == null) {
            this.columnLineages = new ArrayList<>();
        }
        this.columnLineages.add(columnLineagesItem);
        return this;
    }

    public TableLineageV2 withColumnLineages(Consumer<List<ColumnLineageV2>> columnLineagesSetter) {
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
    public List<ColumnLineageV2> getColumnLineages() {
        return columnLineages;
    }

    public void setColumnLineages(List<ColumnLineageV2> columnLineages) {
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
        TableLineageV2 that = (TableLineageV2) obj;
        return Objects.equals(this.inputTables, that.inputTables)
            && Objects.equals(this.outputTables, that.outputTables)
            && Objects.equals(this.columnLineages, that.columnLineages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputTables, outputTables, columnLineages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableLineageV2 {\n");
        sb.append("    inputTables: ").append(toIndentedString(inputTables)).append("\n");
        sb.append("    outputTables: ").append(toIndentedString(outputTables)).append("\n");
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
