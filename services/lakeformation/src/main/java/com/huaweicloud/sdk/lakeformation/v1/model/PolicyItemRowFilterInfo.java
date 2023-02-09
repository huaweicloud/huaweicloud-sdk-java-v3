package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyItemRowFilterInfo
 */
public class PolicyItemRowFilterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_expr")

    private String filterExpr;

    public PolicyItemRowFilterInfo withFilterExpr(String filterExpr) {
        this.filterExpr = filterExpr;
        return this;
    }

    /**
     * 行过滤表达式
     * @return filterExpr
     */
    public String getFilterExpr() {
        return filterExpr;
    }

    public void setFilterExpr(String filterExpr) {
        this.filterExpr = filterExpr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyItemRowFilterInfo policyItemRowFilterInfo = (PolicyItemRowFilterInfo) o;
        return Objects.equals(this.filterExpr, policyItemRowFilterInfo.filterExpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterExpr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyItemRowFilterInfo {\n");
        sb.append("    filterExpr: ").append(toIndentedString(filterExpr)).append("\n");
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
