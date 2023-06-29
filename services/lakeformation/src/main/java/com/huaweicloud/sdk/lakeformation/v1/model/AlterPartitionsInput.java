package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改分区输入
 */
public class AlterPartitionsInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_inputs")

    private List<AlterPartitionEntry> partitionInputs = null;

    public AlterPartitionsInput withPartitionInputs(List<AlterPartitionEntry> partitionInputs) {
        this.partitionInputs = partitionInputs;
        return this;
    }

    public AlterPartitionsInput addPartitionInputsItem(AlterPartitionEntry partitionInputsItem) {
        if (this.partitionInputs == null) {
            this.partitionInputs = new ArrayList<>();
        }
        this.partitionInputs.add(partitionInputsItem);
        return this;
    }

    public AlterPartitionsInput withPartitionInputs(Consumer<List<AlterPartitionEntry>> partitionInputsSetter) {
        if (this.partitionInputs == null) {
            this.partitionInputs = new ArrayList<>();
        }
        partitionInputsSetter.accept(this.partitionInputs);
        return this;
    }

    /**
     * 批量修改分区对象数组
     * @return partitionInputs
     */
    public List<AlterPartitionEntry> getPartitionInputs() {
        return partitionInputs;
    }

    public void setPartitionInputs(List<AlterPartitionEntry> partitionInputs) {
        this.partitionInputs = partitionInputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlterPartitionsInput that = (AlterPartitionsInput) obj;
        return Objects.equals(this.partitionInputs, that.partitionInputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionInputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlterPartitionsInput {\n");
        sb.append("    partitionInputs: ").append(toIndentedString(partitionInputs)).append("\n");
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
