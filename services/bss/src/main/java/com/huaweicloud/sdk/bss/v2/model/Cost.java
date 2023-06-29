package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Cost
 */
public class Cost {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_dimension_value")

    private String timeDimensionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_measure_id")

    private Integer timeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private String officialAmount;

    public Cost withTimeDimensionValue(String timeDimensionValue) {
        this.timeDimensionValue = timeDimensionValue;
        return this;
    }

    /**
     * 时间维度值。 如按天维度，该值为yyyy-mm-dd如按月维度，该值为yyyy-mm
     * @return timeDimensionValue
     */
    public String getTimeDimensionValue() {
        return timeDimensionValue;
    }

    public void setTimeDimensionValue(String timeDimensionValue) {
        this.timeDimensionValue = timeDimensionValue;
    }

    public Cost withTimeMeasureId(Integer timeMeasureId) {
        this.timeMeasureId = timeMeasureId;
        return this;
    }

    /**
     * 时间单位。 1：天2：月
     * @return timeMeasureId
     */
    public Integer getTimeMeasureId() {
        return timeMeasureId;
    }

    public void setTimeMeasureId(Integer timeMeasureId) {
        this.timeMeasureId = timeMeasureId;
    }

    public Cost withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 应付或实付的成本金额或均摊金额，具体取决于请求参数。
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Cost withOfficialAmount(String officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /**
     * 官网价金额。
     * @return officialAmount
     */
    public String getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(String officialAmount) {
        this.officialAmount = officialAmount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cost that = (Cost) obj;
        return Objects.equals(this.timeDimensionValue, that.timeDimensionValue)
            && Objects.equals(this.timeMeasureId, that.timeMeasureId) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.officialAmount, that.officialAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeDimensionValue, timeMeasureId, amount, officialAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cost {\n");
        sb.append("    timeDimensionValue: ").append(toIndentedString(timeDimensionValue)).append("\n");
        sb.append("    timeMeasureId: ").append(toIndentedString(timeMeasureId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
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
