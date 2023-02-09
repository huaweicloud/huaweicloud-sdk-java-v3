package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改分区实体
 */
public class AlterPartitionEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private PartitionInput partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values")

    private List<String> partitionValues = null;

    public AlterPartitionEntry withPartition(PartitionInput partition) {
        this.partition = partition;
        return this;
    }

    public AlterPartitionEntry withPartition(Consumer<PartitionInput> partitionSetter) {
        if (this.partition == null) {
            this.partition = new PartitionInput();
            partitionSetter.accept(this.partition);
        }

        return this;
    }

    /**
     * Get partition
     * @return partition
     */
    public PartitionInput getPartition() {
        return partition;
    }

    public void setPartition(PartitionInput partition) {
        this.partition = partition;
    }

    public AlterPartitionEntry withPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    public AlterPartitionEntry addPartitionValuesItem(String partitionValuesItem) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        this.partitionValues.add(partitionValuesItem);
        return this;
    }

    public AlterPartitionEntry withPartitionValues(Consumer<List<String>> partitionValuesSetter) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        partitionValuesSetter.accept(this.partitionValues);
        return this;
    }

    /**
     * 原分区值数组
     * @return partitionValues
     */
    public List<String> getPartitionValues() {
        return partitionValues;
    }

    public void setPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlterPartitionEntry alterPartitionEntry = (AlterPartitionEntry) o;
        return Objects.equals(this.partition, alterPartitionEntry.partition)
            && Objects.equals(this.partitionValues, alterPartitionEntry.partitionValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partition, partitionValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlterPartitionEntry {\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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
