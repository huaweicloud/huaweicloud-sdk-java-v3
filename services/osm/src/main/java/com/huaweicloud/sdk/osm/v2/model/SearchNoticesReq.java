package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SearchNoticesReq
 */
public class SearchNoticesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    public SearchNoticesReq withTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * 返回匹配度最高的数据条数
     * minimum: 1
     * maximum: 100
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public SearchNoticesReq withProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
        return this;
    }

    /**
     * 产品类型Id
     * @return productTypeId
     */
    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchNoticesReq searchNoticesReq = (SearchNoticesReq) o;
        return Objects.equals(this.top, searchNoticesReq.top)
            && Objects.equals(this.productTypeId, searchNoticesReq.productTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, productTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchNoticesReq {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
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
