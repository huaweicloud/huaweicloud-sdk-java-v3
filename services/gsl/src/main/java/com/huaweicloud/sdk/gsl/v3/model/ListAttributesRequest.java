package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAttributesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_attr_name")

    private String custAttrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ListAttributesRequest withCustAttrName(String custAttrName) {
        this.custAttrName = custAttrName;
        return this;
    }

    /**
     * 自定义属性名称
     * @return custAttrName
     */
    public String getCustAttrName() {
        return custAttrName;
    }

    public void setCustAttrName(String custAttrName) {
        this.custAttrName = custAttrName;
    }

    public ListAttributesRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListAttributesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListAttributesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 自定义属性状态：0 未启用，1 已启用。
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAttributesRequest that = (ListAttributesRequest) obj;
        return Objects.equals(this.custAttrName, that.custAttrName) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custAttrName, limit, offset, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAttributesRequest {\n");
        sb.append("    custAttrName: ").append(toIndentedString(custAttrName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
