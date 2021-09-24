package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ListFreeResourceInfosReq */
public class ListFreeResourceInfosReq {

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

    public ListFreeResourceInfosReq withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /** |参数名称：云服务区编码，例如：“cn-north-1”。| |参数约束及描述：云服务区编码，例如：“cn-north-1”。|
     * 
     * @return regionCode */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public ListFreeResourceInfosReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** |参数名称：订单ID。| |参数约束及描述：订单ID。|
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ListFreeResourceInfosReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** |参数名称：产品ID，即资源包ID。| |参数约束及描述：产品ID，即资源包ID。|
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ListFreeResourceInfosReq withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /** |参数名称：产品名称，即资源包名称。| |参数约束及描述：产品名称，即资源包名称。|
     * 
     * @return productName */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListFreeResourceInfosReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** |参数名称：企业项目ID。| |参数约束及描述：企业项目ID。|
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListFreeResourceInfosReq withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** |参数名称：状态：0：未生效1：生效中2：已用完3：已失效4：已退订| |参数的约束及描述：状态：0：未生效1：生效中2：已用完3：已失效4：已退订| minimum: 0 maximum: 4
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListFreeResourceInfosReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** |参数名称：偏移量，从0开始。默认值为0。| |参数的约束及描述：偏移量，从0开始。默认值为0。| minimum: 0 maximum: 999999
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFreeResourceInfosReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** |参数名称：每次查询的数量限制。默认值为10。| |参数的约束及描述：每次查询的数量限制。默认值为10。| minimum: 1 maximum: 1000
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
        ListFreeResourceInfosReq listFreeResourceInfosReq = (ListFreeResourceInfosReq) o;
        return Objects.equals(this.regionCode, listFreeResourceInfosReq.regionCode)
            && Objects.equals(this.orderId, listFreeResourceInfosReq.orderId)
            && Objects.equals(this.productId, listFreeResourceInfosReq.productId)
            && Objects.equals(this.productName, listFreeResourceInfosReq.productName)
            && Objects.equals(this.enterpriseProjectId, listFreeResourceInfosReq.enterpriseProjectId)
            && Objects.equals(this.status, listFreeResourceInfosReq.status)
            && Objects.equals(this.offset, listFreeResourceInfosReq.offset)
            && Objects.equals(this.limit, listFreeResourceInfosReq.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionCode, orderId, productId, productName, enterpriseProjectId, status, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFreeResourceInfosReq {\n");
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
