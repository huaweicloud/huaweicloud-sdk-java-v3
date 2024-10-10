package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ColumnLineageV2
 */
public class ColumnLineageV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_columns")

    private List<ColumnDetails> inputColumns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_columns")

    private List<ColumnDetails> outputColumns = null;

    public ColumnLineageV2 withInputColumns(List<ColumnDetails> inputColumns) {
        this.inputColumns = inputColumns;
        return this;
    }

    public ColumnLineageV2 addInputColumnsItem(ColumnDetails inputColumnsItem) {
        if (this.inputColumns == null) {
            this.inputColumns = new ArrayList<>();
        }
        this.inputColumns.add(inputColumnsItem);
        return this;
    }

    public ColumnLineageV2 withInputColumns(Consumer<List<ColumnDetails>> inputColumnsSetter) {
        if (this.inputColumns == null) {
            this.inputColumns = new ArrayList<>();
        }
        inputColumnsSetter.accept(this.inputColumns);
        return this;
    }

    /**
     * 上游血缘字段列表，列表大小：1至100
     * @return inputColumns
     */
    public List<ColumnDetails> getInputColumns() {
        return inputColumns;
    }

    public void setInputColumns(List<ColumnDetails> inputColumns) {
        this.inputColumns = inputColumns;
    }

    public ColumnLineageV2 withOutputColumns(List<ColumnDetails> outputColumns) {
        this.outputColumns = outputColumns;
        return this;
    }

    public ColumnLineageV2 addOutputColumnsItem(ColumnDetails outputColumnsItem) {
        if (this.outputColumns == null) {
            this.outputColumns = new ArrayList<>();
        }
        this.outputColumns.add(outputColumnsItem);
        return this;
    }

    public ColumnLineageV2 withOutputColumns(Consumer<List<ColumnDetails>> outputColumnsSetter) {
        if (this.outputColumns == null) {
            this.outputColumns = new ArrayList<>();
        }
        outputColumnsSetter.accept(this.outputColumns);
        return this;
    }

    /**
     * 下游血缘字段列表，列表大小：1至100
     * @return outputColumns
     */
    public List<ColumnDetails> getOutputColumns() {
        return outputColumns;
    }

    public void setOutputColumns(List<ColumnDetails> outputColumns) {
        this.outputColumns = outputColumns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColumnLineageV2 that = (ColumnLineageV2) obj;
        return Objects.equals(this.inputColumns, that.inputColumns)
            && Objects.equals(this.outputColumns, that.outputColumns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputColumns, outputColumns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnLineageV2 {\n");
        sb.append("    inputColumns: ").append(toIndentedString(inputColumns)).append("\n");
        sb.append("    outputColumns: ").append(toIndentedString(outputColumns)).append("\n");
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
