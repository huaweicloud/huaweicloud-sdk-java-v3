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

    public TuningParameter withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名称
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
     * 参数取值
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
     * 是否可用
     * @return availability
     */
    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TuningParameter tuningParameter = (TuningParameter) o;
        return Objects.equals(this.paramName, tuningParameter.paramName)
            && Objects.equals(this.paramValue, tuningParameter.paramValue)
            && Objects.equals(this.availability, tuningParameter.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramValue, availability);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TuningParameter {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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
