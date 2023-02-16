package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SearchToolsReq
 */
public class SearchToolsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top")

    private Integer top;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type_id")

    private String productTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type_id")

    private String businessTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "problem_type_id")

    private String problemTypeId;

    public SearchToolsReq withTop(Integer top) {
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

    public SearchToolsReq withProductTypeId(String productTypeId) {
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

    public SearchToolsReq withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    /**
     * 业务类型Id
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public SearchToolsReq withProblemTypeId(String problemTypeId) {
        this.problemTypeId = problemTypeId;
        return this;
    }

    /**
     * 问题类型Id
     * @return problemTypeId
     */
    public String getProblemTypeId() {
        return problemTypeId;
    }

    public void setProblemTypeId(String problemTypeId) {
        this.problemTypeId = problemTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchToolsReq searchToolsReq = (SearchToolsReq) o;
        return Objects.equals(this.top, searchToolsReq.top)
            && Objects.equals(this.productTypeId, searchToolsReq.productTypeId)
            && Objects.equals(this.businessTypeId, searchToolsReq.businessTypeId)
            && Objects.equals(this.problemTypeId, searchToolsReq.problemTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, productTypeId, businessTypeId, problemTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchToolsReq {\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    problemTypeId: ").append(toIndentedString(problemTypeId)).append("\n");
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
