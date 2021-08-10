package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListFreeResourcesReq */
public class ListFreeResourcesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListFreeResourcesReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /** 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * 
     * @return regionCode */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListFreeResourcesReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单ID。
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListFreeResourcesReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID，即资源包ID。
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListFreeResourcesReq withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /** 产品名称，即资源包名称。
     * 
     * @return productName */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListFreeResourcesReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListFreeResourcesReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 状态： 0：未生效1：生效中2：已用完3：已失效4：已退订 minimum: 0 maximum: 4
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListFreeResourcesReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，从0开始，默认为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。
     * 例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。 minimum: 0 maximum: 2147483646
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFreeResourcesReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每次查询的记录数，默认为10。 minimum: 0 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
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
        ListFreeResourcesReq listFreeResourcesReq = (ListFreeResourcesReq) o;
        return Objects.equals(this.regionCode, listFreeResourcesReq.regionCode)
            && Objects.equals(this.orderId, listFreeResourcesReq.orderId)
            && Objects.equals(this.productId, listFreeResourcesReq.productId)
            && Objects.equals(this.productName, listFreeResourcesReq.productName)
            && Objects.equals(this.enterpriseProjectId, listFreeResourcesReq.enterpriseProjectId)
            && Objects.equals(this.status, listFreeResourcesReq.status)
            && Objects.equals(this.offset, listFreeResourcesReq.offset)
            && Objects.equals(this.limit, listFreeResourcesReq.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode, orderId, productId, productName, enterpriseProjectId, status, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourcesReq {\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
