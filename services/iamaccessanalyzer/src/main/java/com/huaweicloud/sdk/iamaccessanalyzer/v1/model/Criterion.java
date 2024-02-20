package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 要在查找筛选器中使用的条件。最多只能有一个运算符。
 */
public class Criterion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contains")

    private List<String> contains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eq")

    private List<String> eq = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exists")

    private Boolean exists;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "neq")

    private List<String> neq = null;

    public Criterion withContains(List<String> contains) {
        this.contains = contains;
        return this;
    }

    public Criterion addContainsItem(String containsItem) {
        if (this.contains == null) {
            this.contains = new ArrayList<>();
        }
        this.contains.add(containsItem);
        return this;
    }

    public Criterion withContains(Consumer<List<String>> containsSetter) {
        if (this.contains == null) {
            this.contains = new ArrayList<>();
        }
        containsSetter.accept(this.contains);
        return this;
    }

    /**
     * 要匹配筛选器的“包含”运算符。
     * @return contains
     */
    public List<String> getContains() {
        return contains;
    }

    public void setContains(List<String> contains) {
        this.contains = contains;
    }

    public Criterion withEq(List<String> eq) {
        this.eq = eq;
        return this;
    }

    public Criterion addEqItem(String eqItem) {
        if (this.eq == null) {
            this.eq = new ArrayList<>();
        }
        this.eq.add(eqItem);
        return this;
    }

    public Criterion withEq(Consumer<List<String>> eqSetter) {
        if (this.eq == null) {
            this.eq = new ArrayList<>();
        }
        eqSetter.accept(this.eq);
        return this;
    }

    /**
     * 要匹配筛选器的“等于”运算符。
     * @return eq
     */
    public List<String> getEq() {
        return eq;
    }

    public void setEq(List<String> eq) {
        this.eq = eq;
    }

    public Criterion withExists(Boolean exists) {
        this.exists = exists;
        return this;
    }

    /**
     * 要匹配筛选器的“存在”运算符。
     * @return exists
     */
    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public Criterion withNeq(List<String> neq) {
        this.neq = neq;
        return this;
    }

    public Criterion addNeqItem(String neqItem) {
        if (this.neq == null) {
            this.neq = new ArrayList<>();
        }
        this.neq.add(neqItem);
        return this;
    }

    public Criterion withNeq(Consumer<List<String>> neqSetter) {
        if (this.neq == null) {
            this.neq = new ArrayList<>();
        }
        neqSetter.accept(this.neq);
        return this;
    }

    /**
     * 要匹配筛选器的“不等于”运算符。
     * @return neq
     */
    public List<String> getNeq() {
        return neq;
    }

    public void setNeq(List<String> neq) {
        this.neq = neq;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Criterion that = (Criterion) obj;
        return Objects.equals(this.contains, that.contains) && Objects.equals(this.eq, that.eq)
            && Objects.equals(this.exists, that.exists) && Objects.equals(this.neq, that.neq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contains, eq, exists, neq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Criterion {\n");
        sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
        sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
        sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
        sb.append("    neq: ").append(toIndentedString(neq)).append("\n");
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
