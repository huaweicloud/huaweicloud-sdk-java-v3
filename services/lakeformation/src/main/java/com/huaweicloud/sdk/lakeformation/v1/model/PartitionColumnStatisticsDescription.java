package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 列统计信息的描述信息
 */
public class PartitionColumnStatisticsDescription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_values")

    private List<String> partitionValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_analyzed_time")

    private OffsetDateTime lastAnalyzedTime;

    public PartitionColumnStatisticsDescription withPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }

    public PartitionColumnStatisticsDescription addPartitionValuesItem(String partitionValuesItem) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        this.partitionValues.add(partitionValuesItem);
        return this;
    }

    public PartitionColumnStatisticsDescription withPartitionValues(Consumer<List<String>> partitionValuesSetter) {
        if (this.partitionValues == null) {
            this.partitionValues = new ArrayList<>();
        }
        partitionValuesSetter.accept(this.partitionValues);
        return this;
    }

    /**
     * 分区值的列表
     * @return partitionValues
     */
    public List<String> getPartitionValues() {
        return partitionValues;
    }

    public void setPartitionValues(List<String> partitionValues) {
        this.partitionValues = partitionValues;
    }

    public PartitionColumnStatisticsDescription withLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }

    /**
     * 最后统计时间
     * @return lastAnalyzedTime
     */
    public OffsetDateTime getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    public void setLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartitionColumnStatisticsDescription partitionColumnStatisticsDescription =
            (PartitionColumnStatisticsDescription) o;
        return Objects.equals(this.partitionValues, partitionColumnStatisticsDescription.partitionValues)
            && Objects.equals(this.lastAnalyzedTime, partitionColumnStatisticsDescription.lastAnalyzedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionValues, lastAnalyzedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartitionColumnStatisticsDescription {\n");
        sb.append("    partitionValues: ").append(toIndentedString(partitionValues)).append("\n");
        sb.append("    lastAnalyzedTime: ").append(toIndentedString(lastAnalyzedTime)).append("\n");
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
