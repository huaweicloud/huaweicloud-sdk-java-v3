package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据单元。
 */
public class FrontCell {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace")

    private Boolean trace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span")

    private Boolean span;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_field")

    private String spanField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precision")

    private Integer precision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    public FrontCell withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public FrontCell withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 函数。
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public FrontCell withTrace(Boolean trace) {
        this.trace = trace;
        return this;
    }

    /**
     * 是否调用链。
     * @return trace
     */
    public Boolean getTrace() {
        return trace;
    }

    public void setTrace(Boolean trace) {
        this.trace = trace;
    }

    public FrontCell withSpan(Boolean span) {
        this.span = span;
        return this;
    }

    /**
     * 是否是span信息，如果是就跳到调用链搜索页面。
     * @return span
     */
    public Boolean getSpan() {
        return span;
    }

    public void setSpan(Boolean span) {
        this.span = span;
    }

    public FrontCell withSpanField(String spanField) {
        this.spanField = spanField;
        return this;
    }

    /**
     * span字段。
     * @return spanField
     */
    public String getSpanField() {
        return spanField;
    }

    public void setSpanField(String spanField) {
        this.spanField = spanField;
    }

    public FrontCell withPrecision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 小数点位数。
     * @return precision
     */
    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public FrontCell withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 文本信息。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FrontCell withUnit(String unit) {
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

    public FrontCell withVisible(Boolean visible) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FrontCell frontCell = (FrontCell) o;
        return Objects.equals(this.dataType, frontCell.dataType) && Objects.equals(this.function, frontCell.function)
            && Objects.equals(this.trace, frontCell.trace) && Objects.equals(this.span, frontCell.span)
            && Objects.equals(this.spanField, frontCell.spanField)
            && Objects.equals(this.precision, frontCell.precision) && Objects.equals(this.text, frontCell.text)
            && Objects.equals(this.unit, frontCell.unit) && Objects.equals(this.visible, frontCell.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, function, trace, span, spanField, precision, text, unit, visible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrontCell {\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
        sb.append("    spanField: ").append(toIndentedString(spanField)).append("\n");
        sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
