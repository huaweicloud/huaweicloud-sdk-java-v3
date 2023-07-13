package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 所需展示的字段列表模型。
 */
public class FieldItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as")

    private String as;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace")

    private Boolean trace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precision")

    private Integer precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    public FieldItem withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 表达式。
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public FieldItem withAs(String as) {
        this.as = as;
        return this;
    }

    /**
     * 作为。
     * @return as
     */
    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public FieldItem withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值。
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public FieldItem withTrace(Boolean trace) {
        this.trace = trace;
        return this;
    }

    /**
     * 是否是trace。
     * @return trace
     */
    public Boolean getTrace() {
        return trace;
    }

    public void setTrace(Boolean trace) {
        this.trace = trace;
    }

    public FieldItem withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 百分比。
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public FieldItem withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FieldItem withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 是否可见。
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldItem that = (FieldItem) obj;
        return Objects.equals(this.function, that.function) && Objects.equals(this.as, that.as)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.trace, that.trace)
            && Objects.equals(this.precision, that.precision) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.visible, that.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function, as, defaultValue, trace, precision, unit, visible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldItem {\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    as: ").append(toIndentedString(as)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
