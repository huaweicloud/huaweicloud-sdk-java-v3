package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * DateColumnStatisticsData
 */
public class DateColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_value")

    private OffsetDateTime minimumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_value")

    private OffsetDateTime maximumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_distinct_value")

    private Long numberOfDistinctValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_vector")

    private byte[] bitVector;

    public DateColumnStatisticsData withMinimumValue(OffsetDateTime minimumValue) {
        this.minimumValue = minimumValue;
        return this;
    }

    /**
     * 列中的最小时间戳
     * @return minimumValue
     */
    public OffsetDateTime getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(OffsetDateTime minimumValue) {
        this.minimumValue = minimumValue;
    }

    public DateColumnStatisticsData withMaximumValue(OffsetDateTime maximumValue) {
        this.maximumValue = maximumValue;
        return this;
    }

    /**
     * 列中的最大时间戳
     * @return maximumValue
     */
    public OffsetDateTime getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(OffsetDateTime maximumValue) {
        this.maximumValue = maximumValue;
    }

    public DateColumnStatisticsData withNumberOfNull(Long numberOfNull) {
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

    public DateColumnStatisticsData withNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
        return this;
    }

    /**
     * 列中去重后的时间戳个数
     * @return numberOfDistinctValue
     */
    public Long getNumberOfDistinctValue() {
        return numberOfDistinctValue;
    }

    public void setNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
    }

    public DateColumnStatisticsData withBitVector(byte[] bitVector) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateColumnStatisticsData that = (DateColumnStatisticsData) obj;
        return Objects.equals(this.minimumValue, that.minimumValue)
            && Objects.equals(this.maximumValue, that.maximumValue)
            && Objects.equals(this.numberOfNull, that.numberOfNull)
            && Objects.equals(this.numberOfDistinctValue, that.numberOfDistinctValue)
            && java.util.Arrays.equals(this.bitVector, that.bitVector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumValue,
            maximumValue,
            numberOfNull,
            numberOfDistinctValue,
            java.util.Arrays.hashCode(bitVector));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DateColumnStatisticsData {\n");
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
