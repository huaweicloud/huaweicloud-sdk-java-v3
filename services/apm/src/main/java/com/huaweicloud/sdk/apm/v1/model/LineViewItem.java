package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接线视图函数详情。
 */
public class LineViewItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as")

    private String as;

    public LineViewItem withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 表达式。
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public LineViewItem withAs(String as) {
        this.as = as;
        return this;
    }

    /**
     * 作为。
     * @return as
     */
    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineViewItem that = (LineViewItem) obj;
        return Objects.equals(this.function, that.function) && Objects.equals(this.as, that.as);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function, as);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineViewItem {\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    as: ").append(toIndentedString(as)).append("\n");
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
