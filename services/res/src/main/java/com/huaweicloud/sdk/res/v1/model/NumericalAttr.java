package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 属性权重
 */
public class NumericalAttr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Float weight;

    public NumericalAttr withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 特征名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NumericalAttr withWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重。
     * minimum: 0.001
     * maximum: 1
     * @return weight
     */
    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumericalAttr numericalAttr = (NumericalAttr) o;
        return Objects.equals(this.name, numericalAttr.name) && Objects.equals(this.weight, numericalAttr.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NumericalAttr {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
