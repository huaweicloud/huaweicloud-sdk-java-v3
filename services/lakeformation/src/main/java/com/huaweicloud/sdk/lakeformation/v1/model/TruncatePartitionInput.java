package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 清空分区数据
 */
public class TruncatePartitionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values")

    private List<List<String>> partitionValues = null;

    public TruncatePartitionInput withPartitionValues(List<List<String>> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    public TruncatePartitionInput addPartitionValuesItem(List<String> partitionValuesItem) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        this.partitionValues.add(partitionValuesItem);
        return this;
    }

    public TruncatePartitionInput withPartitionValues(Consumer<List<List<String>>> partitionValuesSetter) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        partitionValuesSetter.accept(this.partitionValues);
        return this;
    }

    /**
     * 分区值
     * @return partitionValues
     */
    public List<List<String>> getPartitionValues() {
        return partitionValues;
    }

    public void setPartitionValues(List<List<String>> partitionValues) {
        this.partitionValues = partitionValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TruncatePartitionInput that = (TruncatePartitionInput) obj;
        return Objects.equals(this.partitionValues, that.partitionValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TruncatePartitionInput {\n");
        sb.append("    partitionValues: ").append(toIndentedString(partitionValues)).append("\n");
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
