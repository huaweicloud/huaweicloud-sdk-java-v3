package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCollationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charSets")

    private List<String> charSets = null;

    public ListCollationsResponse withCharSets(List<String> charSets) {
        this.charSets = charSets;
        return this;
    }

    public ListCollationsResponse addCharSetsItem(String charSetsItem) {
        if (this.charSets == null) {
            this.charSets = new ArrayList<>();
        }
        this.charSets.add(charSetsItem);
        return this;
    }

    public ListCollationsResponse withCharSets(Consumer<List<String>> charSetsSetter) {
        if (this.charSets == null) {
            this.charSets = new ArrayList<>();
        }
        charSetsSetter.accept(this.charSets);
        return this;
    }

    /**
     * 字符集信息列表
     * @return charSets
     */
    public List<String> getCharSets() {
        return charSets;
    }

    public void setCharSets(List<String> charSets) {
        this.charSets = charSets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollationsResponse that = (ListCollationsResponse) obj;
        return Objects.equals(this.charSets, that.charSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charSets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollationsResponse {\n");
        sb.append("    charSets: ").append(toIndentedString(charSets)).append("\n");
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
