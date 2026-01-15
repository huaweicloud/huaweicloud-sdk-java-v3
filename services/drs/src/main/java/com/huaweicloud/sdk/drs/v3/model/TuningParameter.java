package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 调优参数
 */
public class TuningParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_value")

    private String paramValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability")

    private String availability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range")

    private String range;

    public TuningParameter withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名称。
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public TuningParameter withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    /**
     * 参数取值。
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public TuningParameter withAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    /**
     * 是否可用。
     * @return availability
     */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public TuningParameter withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * 参数范围。
     * @return range
     */
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TuningParameter that = (TuningParameter) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.paramValue, that.paramValue)
            && Objects.equals(this.availability, that.availability) && Objects.equals(this.range, that.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramValue, availability, range);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TuningParameter {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
