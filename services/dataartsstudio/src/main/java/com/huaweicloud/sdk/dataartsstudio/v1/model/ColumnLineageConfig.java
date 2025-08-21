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
public class ColumnLineageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_columns")

    private List<ColumnConfig> inputColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_column")

    private ColumnConfig outputColumn;

    public ColumnLineageConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段血缘节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColumnLineageConfig withInputColumns(List<ColumnConfig> inputColumns) {
        this.inputColumns = inputColumns;
        return this;
    }

    public ColumnLineageConfig addInputColumnsItem(ColumnConfig inputColumnsItem) {
        if (this.inputColumns == null) {
            this.inputColumns = new ArrayList<>();
        }
        this.inputColumns.add(inputColumnsItem);
        return this;
    }

    public ColumnLineageConfig withInputColumns(Consumer<List<ColumnConfig>> inputColumnsSetter) {
        if (this.inputColumns == null) {
            this.inputColumns = new ArrayList<>();
        }
        inputColumnsSetter.accept(this.inputColumns);
        return this;
    }

    /**
     * 输入字段血缘信息。
     * @return inputColumns
     */
    public List<ColumnConfig> getInputColumns() {
        return inputColumns;
    }

    public void setInputColumns(List<ColumnConfig> inputColumns) {
        this.inputColumns = inputColumns;
    }

    public ColumnLineageConfig withOutputColumn(ColumnConfig outputColumn) {
        this.outputColumn = outputColumn;
        return this;
    }

    public ColumnLineageConfig withOutputColumn(Consumer<ColumnConfig> outputColumnSetter) {
        if (this.outputColumn == null) {
            this.outputColumn = new ColumnConfig();
            outputColumnSetter.accept(this.outputColumn);
        }

        return this;
    }

    /**
     * Get outputColumn
     * @return outputColumn
     */
    public ColumnConfig getOutputColumn() {
        return outputColumn;
    }

    public void setOutputColumn(ColumnConfig outputColumn) {
        this.outputColumn = outputColumn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnLineageConfig that = (ColumnLineageConfig) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.inputColumns, that.inputColumns)
            && Objects.equals(this.outputColumn, that.outputColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inputColumns, outputColumn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnLineageConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inputColumns: ").append(toIndentedString(inputColumns)).append("\n");
        sb.append("    outputColumn: ").append(toIndentedString(outputColumn)).append("\n");
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
