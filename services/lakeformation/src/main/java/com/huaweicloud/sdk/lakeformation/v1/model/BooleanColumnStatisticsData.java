package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BooleanColumnStatisticsData
 */
public class BooleanColumnStatisticsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_true")

    private Long numberOfTrue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_false")

    private Long numberOfFalse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_null")

    private Long numberOfNull;

    public BooleanColumnStatisticsData withNumberOfTrue(Long numberOfTrue) {
        this.numberOfTrue = numberOfTrue;
        return this;
    }

    /**
     * 列中为真的数量
     * @return numberOfTrue
     */
    public Long getNumberOfTrue() {
        return numberOfTrue;
    }

    public void setNumberOfTrue(Long numberOfTrue) {
        this.numberOfTrue = numberOfTrue;
    }

    public BooleanColumnStatisticsData withNumberOfFalse(Long numberOfFalse) {
        this.numberOfFalse = numberOfFalse;
        return this;
    }

    /**
     * 列中为假的数量
     * @return numberOfFalse
     */
    public Long getNumberOfFalse() {
        return numberOfFalse;
    }

    public void setNumberOfFalse(Long numberOfFalse) {
        this.numberOfFalse = numberOfFalse;
    }

    public BooleanColumnStatisticsData withNumberOfNull(Long numberOfNull) {
        this.numberOfNull = numberOfNull;
        return this;
    }

    /**
     * 列中为空的数量
     * @return numberOfNull
     */
    public Long getNumberOfNull() {
        return numberOfNull;
    }

    public void setNumberOfNull(Long numberOfNull) {
        this.numberOfNull = numberOfNull;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BooleanColumnStatisticsData that = (BooleanColumnStatisticsData) obj;
        return Objects.equals(this.numberOfTrue, that.numberOfTrue)
            && Objects.equals(this.numberOfFalse, that.numberOfFalse)
            && Objects.equals(this.numberOfNull, that.numberOfNull);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTrue, numberOfFalse, numberOfNull);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BooleanColumnStatisticsData {\n");
        sb.append("    numberOfTrue: ").append(toIndentedString(numberOfTrue)).append("\n");
        sb.append("    numberOfFalse: ").append(toIndentedString(numberOfFalse)).append("\n");
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
