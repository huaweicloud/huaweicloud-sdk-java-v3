package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Partitions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_infos")

    private List<PartitionInfos> partitionInfos = null;

    public Partitions withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总个数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Partitions withPartitionInfos(List<PartitionInfos> partitionInfos) {
        this.partitionInfos = partitionInfos;
        return this;
    }

    public Partitions addPartitionInfosItem(PartitionInfos partitionInfosItem) {
        if (this.partitionInfos == null) {
            this.partitionInfos = new ArrayList<>();
        }
        this.partitionInfos.add(partitionInfosItem);
        return this;
    }

    public Partitions withPartitionInfos(Consumer<List<PartitionInfos>> partitionInfosSetter) {
        if (this.partitionInfos == null) {
            this.partitionInfos = new ArrayList<>();
        }
        partitionInfosSetter.accept(this.partitionInfos);
        return this;
    }

    /**
     * 分区信息列表
     * @return partitionInfos
     */
    public List<PartitionInfos> getPartitionInfos() {
        return partitionInfos;
    }

    public void setPartitionInfos(List<PartitionInfos> partitionInfos) {
        this.partitionInfos = partitionInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partitions partitions = (Partitions) o;
        return Objects.equals(this.totalCount, partitions.totalCount)
            && Objects.equals(this.partitionInfos, partitions.partitionInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, partitionInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Partitions {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    partitionInfos: ").append(toIndentedString(partitionInfos)).append("\n");
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
