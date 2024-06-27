package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用例状态数据
 */
public class QueryCasesStatusResponseV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "casesStatusJA")

    private List<Object> casesStatusJA = null;

    public QueryCasesStatusResponseV2 withCasesStatusJA(List<Object> casesStatusJA) {
        this.casesStatusJA = casesStatusJA;
        return this;
    }

    public QueryCasesStatusResponseV2 addCasesStatusJAItem(Object casesStatusJAItem) {
        if (this.casesStatusJA == null) {
            this.casesStatusJA = new ArrayList<>();
        }
        this.casesStatusJA.add(casesStatusJAItem);
        return this;
    }

    public QueryCasesStatusResponseV2 withCasesStatusJA(Consumer<List<Object>> casesStatusJASetter) {
        if (this.casesStatusJA == null) {
            this.casesStatusJA = new ArrayList<>();
        }
        casesStatusJASetter.accept(this.casesStatusJA);
        return this;
    }

    /**
     * Get casesStatusJA
     * @return casesStatusJA
     */
    public List<Object> getCasesStatusJA() {
        return casesStatusJA;
    }

    public void setCasesStatusJA(List<Object> casesStatusJA) {
        this.casesStatusJA = casesStatusJA;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryCasesStatusResponseV2 that = (QueryCasesStatusResponseV2) obj;
        return Objects.equals(this.casesStatusJA, that.casesStatusJA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(casesStatusJA);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCasesStatusResponseV2 {\n");
        sb.append("    casesStatusJA: ").append(toIndentedString(casesStatusJA)).append("\n");
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
