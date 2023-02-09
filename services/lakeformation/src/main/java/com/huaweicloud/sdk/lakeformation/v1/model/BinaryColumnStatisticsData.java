package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BinaryColumnStatisticsData
 */
public class BinaryColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_length")

    private Long maximumLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_length")

    private Double averageLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    public BinaryColumnStatisticsData withMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
        return this;
    }

    /**
     * 列中字节数组的最大值
     * @return maximumLength
     */
    public Long getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    public BinaryColumnStatisticsData withAverageLength(Double averageLength) {
        this.averageLength = averageLength;
        return this;
    }

    /**
     * 列中字节数组的平均长度
     * @return averageLength
     */
    public Double getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    public BinaryColumnStatisticsData withNumberOfNull(Long numberOfNull) {
        this.numberOfNull = numberOfNull;
        return this;
    }

    /**
     * 列中空值个数
     * @return numberOfNull
     */
    public Long getNumberOfNull() {
        return numberOfNull;
    }

    public void setNumberOfNull(Long numberOfNull) {
        this.numberOfNull = numberOfNull;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BinaryColumnStatisticsData binaryColumnStatisticsData = (BinaryColumnStatisticsData) o;
        return Objects.equals(this.maximumLength, binaryColumnStatisticsData.maximumLength)
            && Objects.equals(this.averageLength, binaryColumnStatisticsData.averageLength)
            && Objects.equals(this.numberOfNull, binaryColumnStatisticsData.numberOfNull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximumLength, averageLength, numberOfNull);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BinaryColumnStatisticsData {\n");
        sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
        sb.append("    averageLength: ").append(toIndentedString(averageLength)).append("\n");
        sb.append("    numberOfNull: ").append(toIndentedString(numberOfNull)).append("\n");
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
