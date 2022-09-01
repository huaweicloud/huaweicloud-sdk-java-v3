package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表达式
 */
public class Expression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    @JacksonXmlProperty(localName = "formula")

    private String formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formulas")

    @JacksonXmlProperty(localName = "formulas")

    private List<NamedFormula> formulas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    @JacksonXmlProperty(localName = "time_range")

    private String timeRange;

    public Expression withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 公式，最多1024个字符(分析任务单输出场景，配合TransformModel或AggregateModel的output_property使用)
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Expression withFormulas(List<NamedFormula> formulas) {
        this.formulas = formulas;
        return this;
    }

    public Expression addFormulasItem(NamedFormula formulasItem) {
        if (this.formulas == null) {
            this.formulas = new ArrayList<>();
        }
        this.formulas.add(formulasItem);
        return this;
    }

    public Expression withFormulas(Consumer<List<NamedFormula>> formulasSetter) {
        if (this.formulas == null) {
            this.formulas = new ArrayList<>();
        }
        formulasSetter.accept(this.formulas);
        return this;
    }

    /**
     * 带名称的公式
     * @return formulas
     */
    public List<NamedFormula> getFormulas() {
        return formulas;
    }

    public void setFormulas(List<NamedFormula> formulas) {
        this.formulas = formulas;
    }

    public Expression withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 时间范围，调度时间往前的时间范围，比如1m表示调度时间往前1分钟到调度时间的时间范围，正则：\"1m|5m|15m|1h\"
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expression expression = (Expression) o;
        return Objects.equals(this.formula, expression.formula) && Objects.equals(this.formulas, expression.formulas)
            && Objects.equals(this.timeRange, expression.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formula, formulas, timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expression {\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
