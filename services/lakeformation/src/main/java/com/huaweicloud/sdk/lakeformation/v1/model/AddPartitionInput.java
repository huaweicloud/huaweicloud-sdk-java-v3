package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 添加分区信息
 */
public class AddPartitionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_not_exist")

    private Boolean ifNotExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions")

    private List<PartitionInput> partitions = null;

    public AddPartitionInput withIfNotExist(Boolean ifNotExist) {
        this.ifNotExist = ifNotExist;
        return this;
    }

    /**
     * 是否跳过已存在的分区
     * @return ifNotExist
     */
    public Boolean getIfNotExist() {
        return ifNotExist;
    }

    public void setIfNotExist(Boolean ifNotExist) {
        this.ifNotExist = ifNotExist;
    }

    public AddPartitionInput withPartitions(List<PartitionInput> partitions) {
        this.partitions = partitions;
        return this;
    }

    public AddPartitionInput addPartitionsItem(PartitionInput partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public AddPartitionInput withPartitions(Consumer<List<PartitionInput>> partitionsSetter) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 添加的分区信息
     * @return partitions
     */
    public List<PartitionInput> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<PartitionInput> partitions) {
        this.partitions = partitions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddPartitionInput that = (AddPartitionInput) obj;
        return Objects.equals(this.ifNotExist, that.ifNotExist) && Objects.equals(this.partitions, that.partitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifNotExist, partitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPartitionInput {\n");
        sb.append("    ifNotExist: ").append(toIndentedString(ifNotExist)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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
