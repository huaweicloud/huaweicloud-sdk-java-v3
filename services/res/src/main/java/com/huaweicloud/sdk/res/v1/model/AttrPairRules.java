package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性对规则
 */
public class AttrPairRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_pairs")

    @JacksonXmlProperty(localName = "attr_pairs")

    private List<AttrPair> attrPairs = null;

    public AttrPairRules withAttrPairs(List<AttrPair> attrPairs) {
        this.attrPairs = attrPairs;
        return this;
    }

    public AttrPairRules addAttrPairsItem(AttrPair attrPairsItem) {
        if (this.attrPairs == null) {
            this.attrPairs = new ArrayList<>();
        }
        this.attrPairs.add(attrPairsItem);
        return this;
    }

    public AttrPairRules withAttrPairs(Consumer<List<AttrPair>> attrPairsSetter) {
        if (this.attrPairs == null) {
            this.attrPairs = new ArrayList<>();
        }
        attrPairsSetter.accept(this.attrPairs);
        return this;
    }

    /**
     * 属性对。
     * @return attrPairs
     */
    public List<AttrPair> getAttrPairs() {
        return attrPairs;
    }

    public void setAttrPairs(List<AttrPair> attrPairs) {
        this.attrPairs = attrPairs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttrPairRules attrPairRules = (AttrPairRules) o;
        return Objects.equals(this.attrPairs, attrPairRules.attrPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttrPairRules {\n");
        sb.append("    attrPairs: ").append(toIndentedString(attrPairs)).append("\n");
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
