package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StringColumnStatisticsData
 */
public class StringColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_length")

    private Double averageLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_length")

    private Long maximumLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_distinct_value")

    private Long numberOfDistinctValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_vector")

    private byte[] bitVector;

    public StringColumnStatisticsData withAverageLength(Double averageLength) {
        this.averageLength = averageLength;
        return this;
    }

    /**
     * 列中字符串平均长度
     * @return averageLength
     */
    public Double getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(Double averageLength) {
        this.averageLength = averageLength;
    }

    public StringColumnStatisticsData withMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
        return this;
    }

    /**
     * 列中字符串最长长度
     * @return maximumLength
     */
    public Long getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(Long maximumLength) {
        this.maximumLength = maximumLength;
    }

    public StringColumnStatisticsData withNumberOfNull(Long numberOfNull) {
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

    public StringColumnStatisticsData withNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
        return this;
    }

    /**
     * 列中去重后字符串个数
     * @return numberOfDistinctValue
     */
    public Long getNumberOfDistinctValue() {
        return numberOfDistinctValue;
    }

    public void setNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
    }

    public StringColumnStatisticsData withBitVector(byte[] bitVector) {
        this.bitVector = bitVector;
        return this;
    }

    /**
     * 估算唯一值使用的位图
     * @return bitVector
     */
    public byte[] getBitVector() {
        return bitVector;
    }

    public void setBitVector(byte[] bitVector) {
        this.bitVector = bitVector;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StringColumnStatisticsData stringColumnStatisticsData = (StringColumnStatisticsData) o;
        return Objects.equals(this.averageLength, stringColumnStatisticsData.averageLength)
            && Objects.equals(this.maximumLength, stringColumnStatisticsData.maximumLength)
            && Objects.equals(this.numberOfNull, stringColumnStatisticsData.numberOfNull)
            && Objects.equals(this.numberOfDistinctValue, stringColumnStatisticsData.numberOfDistinctValue)
            && Objects.equals(this.bitVector, stringColumnStatisticsData.bitVector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageLength, maximumLength, numberOfNull, numberOfDistinctValue, bitVector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StringColumnStatisticsData {\n");
        sb.append("    averageLength: ").append(toIndentedString(averageLength)).append("\n");
        sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
        sb.append("    numberOfNull: ").append(toIndentedString(numberOfNull)).append("\n");
        sb.append("    numberOfDistinctValue: ").append(toIndentedString(numberOfDistinctValue)).append("\n");
        sb.append("    bitVector: ").append(toIndentedString(bitVector)).append("\n");
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
