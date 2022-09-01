package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 自定义公式
 */
public class CustomizeFormula {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    @JacksonXmlProperty(localName = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    @JacksonXmlProperty(localName = "formula")

    private String formula;

    public CustomizeFormula withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CustomizeFormula withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 公式。
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeFormula customizeFormula = (CustomizeFormula) o;
        return Objects.equals(this.alias, customizeFormula.alias)
            && Objects.equals(this.formula, customizeFormula.formula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, formula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeFormula {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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
