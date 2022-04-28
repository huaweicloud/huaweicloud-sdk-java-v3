package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEnginesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    public ListEnginesRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 如果不带则默认企业项目为\"default\"，ID为\"0\"。
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public ListEnginesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEnginesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnginesRequest listEnginesRequest = (ListEnginesRequest) o;
        return Objects.equals(this.xEnterpriseProjectID, listEnginesRequest.xEnterpriseProjectID)
            && Objects.equals(this.offset, listEnginesRequest.offset)
            && Objects.equals(this.limit, listEnginesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEnterpriseProjectID, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginesRequest {\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
