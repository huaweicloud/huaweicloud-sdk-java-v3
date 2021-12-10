package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 自定义指标参数 */
public class IndicatorParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customize_parameter")

    private CustomizeParameter customizeParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customize_formula")

    private CustomizeFormula customizeFormula;

    public IndicatorParam withCustomizeParameter(CustomizeParameter customizeParameter) {
        this.customizeParameter = customizeParameter;
        return this;
    }

    public IndicatorParam withCustomizeParameter(Consumer<CustomizeParameter> customizeParameterSetter) {
        if (this.customizeParameter == null) {
            this.customizeParameter = new CustomizeParameter();
            customizeParameterSetter.accept(this.customizeParameter);
        }

        return this;
    }

    /** Get customizeParameter
     * 
     * @return customizeParameter */
    public CustomizeParameter getCustomizeParameter() {
        return customizeParameter;
    }

    public void setCustomizeParameter(CustomizeParameter customizeParameter) {
        this.customizeParameter = customizeParameter;
    }

    public IndicatorParam withCustomizeFormula(CustomizeFormula customizeFormula) {
        this.customizeFormula = customizeFormula;
        return this;
    }

    public IndicatorParam withCustomizeFormula(Consumer<CustomizeFormula> customizeFormulaSetter) {
        if (this.customizeFormula == null) {
            this.customizeFormula = new CustomizeFormula();
            customizeFormulaSetter.accept(this.customizeFormula);
        }

        return this;
    }

    /** Get customizeFormula
     * 
     * @return customizeFormula */
    public CustomizeFormula getCustomizeFormula() {
        return customizeFormula;
    }

    public void setCustomizeFormula(CustomizeFormula customizeFormula) {
        this.customizeFormula = customizeFormula;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndicatorParam indicatorParam = (IndicatorParam) o;
        return Objects.equals(this.customizeParameter, indicatorParam.customizeParameter)
            && Objects.equals(this.customizeFormula, indicatorParam.customizeFormula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customizeParameter, customizeFormula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorParam {\n");
        sb.append("    customizeParameter: ").append(toIndentedString(customizeParameter)).append("\n");
        sb.append("    customizeFormula: ").append(toIndentedString(customizeFormula)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
