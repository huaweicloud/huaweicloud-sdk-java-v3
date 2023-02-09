package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除分区信息
 */
public class DropPartitionsInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_exist")

    private Boolean ifExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_data")

    private Boolean deleteData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values")

    private List<List<String>> partitionValues = null;

    public DropPartitionsInput withIfExist(Boolean ifExist) {
        this.ifExist = ifExist;
        return this;
    }

    /**
     * 是否跳过不存在分区
     * @return ifExist
     */
    public Boolean getIfExist() {
        return ifExist;
    }

    public void setIfExist(Boolean ifExist) {
        this.ifExist = ifExist;
    }

    public DropPartitionsInput withDeleteData(Boolean deleteData) {
        this.deleteData = deleteData;
        return this;
    }

    /**
     * 非事务表：删除分区的数据；若if_purge为真，立即释放空间。 事务表：数据保留但不可见，待数据过期统一删除。
     * @return deleteData
     */
    public Boolean getDeleteData() {
        return deleteData;
    }

    public void setDeleteData(Boolean deleteData) {
        this.deleteData = deleteData;
    }

    public DropPartitionsInput withPartitionValues(List<List<String>> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    public DropPartitionsInput addPartitionValuesItem(List<String> partitionValuesItem) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        this.partitionValues.add(partitionValuesItem);
        return this;
    }

    public DropPartitionsInput withPartitionValues(Consumer<List<List<String>>> partitionValuesSetter) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        partitionValuesSetter.accept(this.partitionValues);
        return this;
    }

    /**
     * 删除分区值
     * @return partitionValues
     */
    public List<List<String>> getPartitionValues() {
        return partitionValues;
    }

    public void setPartitionValues(List<List<String>> partitionValues) {
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
        DropPartitionsInput dropPartitionsInput = (DropPartitionsInput) o;
        return Objects.equals(this.ifExist, dropPartitionsInput.ifExist)
            && Objects.equals(this.deleteData, dropPartitionsInput.deleteData)
            && Objects.equals(this.partitionValues, dropPartitionsInput.partitionValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifExist, deleteData, partitionValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DropPartitionsInput {\n");
        sb.append("    ifExist: ").append(toIndentedString(ifExist)).append("\n");
        sb.append("    deleteData: ").append(toIndentedString(deleteData)).append("\n");
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
