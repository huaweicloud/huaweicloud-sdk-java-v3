package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 表达式 */
public class Formula {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    private String formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formulas")

    private List<NamedFormula> formulas = null;

    public Formula withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /** 公式，最多1024个字符(分析任务单输出场景，配合TransformModel或AggregateModel的output_property使用)
     * 
     * @return formula */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Formula withFormulas(List<NamedFormula> formulas) {
        this.formulas = formulas;
        return this;
    }

    public Formula addFormulasItem(NamedFormula formulasItem) {
        if (this.formulas == null) {
            this.formulas = new ArrayList<>();
        }
        this.formulas.add(formulasItem);
        return this;
    }

    public Formula withFormulas(Consumer<List<NamedFormula>> formulasSetter) {
        if (this.formulas == null) {
            this.formulas = new ArrayList<>();
        }
        formulasSetter.accept(this.formulas);
        return this;
    }

    /** 带名称的公式
     * 
     * @return formulas */
    public List<NamedFormula> getFormulas() {
        return formulas;
    }

    public void setFormulas(List<NamedFormula> formulas) {
        this.formulas = formulas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Formula formula = (Formula) o;
        return Objects.equals(this.formula, formula.formula) && Objects.equals(this.formulas, formula.formulas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formula, formulas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Formula {\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    formulas: ").append(toIndentedString(formulas)).append("\n");
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
