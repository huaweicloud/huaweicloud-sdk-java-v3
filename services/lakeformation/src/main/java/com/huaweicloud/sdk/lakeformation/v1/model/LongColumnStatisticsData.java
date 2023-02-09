package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LongColumnStatisticsData
 */
public class LongColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_value")

    private Long minimumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_value")

    private Long maximumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_distinct_value")

    private Long numberOfDistinctValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_vector")

    private byte[] bitVector;

    public LongColumnStatisticsData withMinimumValue(Long minimumValue) {
        this.minimumValue = minimumValue;
        return this;
    }

    /**
     * 列中长整数最小值
     * @return minimumValue
     */
    public Long getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Long minimumValue) {
        this.minimumValue = minimumValue;
    }

    public LongColumnStatisticsData withMaximumValue(Long maximumValue) {
        this.maximumValue = maximumValue;
        return this;
    }

    /**
     * 列中长整数最大值
     * @return maximumValue
     */
    public Long getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Long maximumValue) {
        this.maximumValue = maximumValue;
    }

    public LongColumnStatisticsData withNumberOfNull(Long numberOfNull) {
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

    public LongColumnStatisticsData withNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
        return this;
    }

    /**
     * 列中去重后的长整数个数
     * @return numberOfDistinctValue
     */
    public Long getNumberOfDistinctValue() {
        return numberOfDistinctValue;
    }

    public void setNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
    }

    public LongColumnStatisticsData withBitVector(byte[] bitVector) {
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
        LongColumnStatisticsData longColumnStatisticsData = (LongColumnStatisticsData) o;
        return Objects.equals(this.minimumValue, longColumnStatisticsData.minimumValue)
            && Objects.equals(this.maximumValue, longColumnStatisticsData.maximumValue)
            && Objects.equals(this.numberOfNull, longColumnStatisticsData.numberOfNull)
            && Objects.equals(this.numberOfDistinctValue, longColumnStatisticsData.numberOfDistinctValue)
            && Objects.equals(this.bitVector, longColumnStatisticsData.bitVector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumValue, maximumValue, numberOfNull, numberOfDistinctValue, bitVector);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LongColumnStatisticsData {\n");
        sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
        sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
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
