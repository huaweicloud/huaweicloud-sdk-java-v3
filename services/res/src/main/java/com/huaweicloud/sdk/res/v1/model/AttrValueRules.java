package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AttrValueRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_values_a")

    private List<AttrValue> attrValuesA = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_values_b")

    private List<AttrValue> attrValuesB = null;

    public AttrValueRules withAttrValuesA(List<AttrValue> attrValuesA) {
        this.attrValuesA = attrValuesA;
        return this;
    }

    public AttrValueRules addAttrValuesAItem(AttrValue attrValuesAItem) {
        if (this.attrValuesA == null) {
            this.attrValuesA = new ArrayList<>();
        }
        this.attrValuesA.add(attrValuesAItem);
        return this;
    }

    public AttrValueRules withAttrValuesA(Consumer<List<AttrValue>> attrValuesASetter) {
        if (this.attrValuesA == null) {
            this.attrValuesA = new ArrayList<>();
        }
        attrValuesASetter.accept(this.attrValuesA);
        return this;
    }

    /**
     * 被推荐对象的属性-值配置。
     * @return attrValuesA
     */
    public List<AttrValue> getAttrValuesA() {
        return attrValuesA;
    }

    public void setAttrValuesA(List<AttrValue> attrValuesA) {
        this.attrValuesA = attrValuesA;
    }

    public AttrValueRules withAttrValuesB(List<AttrValue> attrValuesB) {
        this.attrValuesB = attrValuesB;
        return this;
    }

    public AttrValueRules addAttrValuesBItem(AttrValue attrValuesBItem) {
        if (this.attrValuesB == null) {
            this.attrValuesB = new ArrayList<>();
        }
        this.attrValuesB.add(attrValuesBItem);
        return this;
    }

    public AttrValueRules withAttrValuesB(Consumer<List<AttrValue>> attrValuesBSetter) {
        if (this.attrValuesB == null) {
            this.attrValuesB = new ArrayList<>();
        }
        attrValuesBSetter.accept(this.attrValuesB);
        return this;
    }

    /**
     * 待推荐对象的属性-值配置。
     * @return attrValuesB
     */
    public List<AttrValue> getAttrValuesB() {
        return attrValuesB;
    }

    public void setAttrValuesB(List<AttrValue> attrValuesB) {
        this.attrValuesB = attrValuesB;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttrValueRules attrValueRules = (AttrValueRules) o;
        return Objects.equals(this.attrValuesA, attrValueRules.attrValuesA)
            && Objects.equals(this.attrValuesB, attrValueRules.attrValuesB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrValuesA, attrValuesB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttrValueRules {\n");
        sb.append("    attrValuesA: ").append(toIndentedString(attrValuesA)).append("\n");
        sb.append("    attrValuesB: ").append(toIndentedString(attrValuesB)).append("\n");
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
