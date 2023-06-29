package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListCaseQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "un_used")

    private Integer unUsed;

    public ListCaseQuotasResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总配额
     * minimum: -1
     * maximum: 65535
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCaseQuotasResponse withUnUsed(Integer unUsed) {
        this.unUsed = unUsed;
        return this;
    }

    /**
     * 未使用
     * minimum: -1
     * maximum: 65535
     * @return unUsed
     */
    public Integer getUnUsed() {
        return unUsed;
    }

    public void setUnUsed(Integer unUsed) {
        this.unUsed = unUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCaseQuotasResponse that = (ListCaseQuotasResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.unUsed, that.unUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, unUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseQuotasResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    unUsed: ").append(toIndentedString(unUsed)).append("\n");
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
