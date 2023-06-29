package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 小数统计信息
 */
public class DecimalColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minimum_value")

    private Decimal minimumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_value")

    private Decimal maximumValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_distinct_value")

    private Long numberOfDistinctValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_vector")

    private byte[] bitVector;

    public DecimalColumnStatisticsData withMinimumValue(Decimal minimumValue) {
        this.minimumValue = minimumValue;
        return this;
    }

    public DecimalColumnStatisticsData withMinimumValue(Consumer<Decimal> minimumValueSetter) {
        if (this.minimumValue == null) {
            this.minimumValue = new Decimal();
            minimumValueSetter.accept(this.minimumValue);
        }

        return this;
    }

    /**
     * Get minimumValue
     * @return minimumValue
     */
    public Decimal getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(Decimal minimumValue) {
        this.minimumValue = minimumValue;
    }

    public DecimalColumnStatisticsData withMaximumValue(Decimal maximumValue) {
        this.maximumValue = maximumValue;
        return this;
    }

    public DecimalColumnStatisticsData withMaximumValue(Consumer<Decimal> maximumValueSetter) {
        if (this.maximumValue == null) {
            this.maximumValue = new Decimal();
            maximumValueSetter.accept(this.maximumValue);
        }

        return this;
    }

    /**
     * Get maximumValue
     * @return maximumValue
     */
    public Decimal getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Decimal maximumValue) {
        this.maximumValue = maximumValue;
    }

    public DecimalColumnStatisticsData withNumberOfNull(Long numberOfNull) {
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

    public DecimalColumnStatisticsData withNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
        return this;
    }

    /**
     * 列中去重后的小数个数
     * @return numberOfDistinctValue
     */
    public Long getNumberOfDistinctValue() {
        return numberOfDistinctValue;
    }

    public void setNumberOfDistinctValue(Long numberOfDistinctValue) {
        this.numberOfDistinctValue = numberOfDistinctValue;
    }

    public DecimalColumnStatisticsData withBitVector(byte[] bitVector) {
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
        DecimalColumnStatisticsData that = (DecimalColumnStatisticsData) obj;
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
        sb.append("class DecimalColumnStatisticsData {\n");
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
