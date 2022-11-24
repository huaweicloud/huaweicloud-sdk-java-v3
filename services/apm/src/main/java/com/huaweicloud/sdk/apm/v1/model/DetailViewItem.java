package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点详情视图函数信息。
 */
public class DetailViewItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as")

    private String as;

    public DetailViewItem withFunction(String function) {
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

    public DetailViewItem withAs(String as) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailViewItem detailViewItem = (DetailViewItem) o;
        return Objects.equals(this.function, detailViewItem.function) && Objects.equals(this.as, detailViewItem.as);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function, as);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailViewItem {\n");
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
