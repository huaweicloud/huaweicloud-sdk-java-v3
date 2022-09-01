package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 带名称的公式
 */
public class NamedFormula {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    @JacksonXmlProperty(localName = "formula")

    private String formula;

    public NamedFormula withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 公式名称，不能和输入参数名重复，正则：\"^[A-Za-z][A-Za-z_]{0,31}$\"
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NamedFormula withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 公式，最多1024个字符
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
        NamedFormula namedFormula = (NamedFormula) o;
        return Objects.equals(this.name, namedFormula.name) && Objects.equals(this.formula, namedFormula.formula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, formula);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamedFormula {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
