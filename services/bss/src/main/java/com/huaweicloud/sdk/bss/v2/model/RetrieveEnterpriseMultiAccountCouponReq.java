package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RetrieveEnterpriseMultiAccountCouponReq
 */
public class RetrieveEnterpriseMultiAccountCouponReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_coupon_id")

    private String subCouponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_id")

    private String transId;

    public RetrieveEnterpriseMultiAccountCouponReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 企业子账号的客户ID。您可以调用查询企业子账号列表接口，获取响应参数“id”的返回值。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public RetrieveEnterpriseMultiAccountCouponReq withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 优惠券ID。您可以调用查询企业子账号可回收优惠券列表接口，获取响应参数“coupon_id”的返回值。
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public RetrieveEnterpriseMultiAccountCouponReq withSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
        return this;
    }

    /**
     * 子优惠券ID。您可以调用查询企业子账号可回收优惠券列表接口，获取响应参数“sub_coupon_id”的返回值。
     * @return subCouponId
     */
    public String getSubCouponId() {
        return subCouponId;
    }

    public void setSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
    }

    public RetrieveEnterpriseMultiAccountCouponReq withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    /**
     * 交易序列号，用于防止重复提交。 如果接口调用方不传，则企业管理微服务后台生成如果接口调用方传入，则请采用UUID保证全局唯一 此参数不携带或携带值为null或携带值为空串时，由系统自动生成。
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrieveEnterpriseMultiAccountCouponReq retrieveEnterpriseMultiAccountCouponReq =
            (RetrieveEnterpriseMultiAccountCouponReq) o;
        return Objects.equals(this.customerId, retrieveEnterpriseMultiAccountCouponReq.customerId)
            && Objects.equals(this.couponId, retrieveEnterpriseMultiAccountCouponReq.couponId)
            && Objects.equals(this.subCouponId, retrieveEnterpriseMultiAccountCouponReq.subCouponId)
            && Objects.equals(this.transId, retrieveEnterpriseMultiAccountCouponReq.transId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, couponId, subCouponId, transId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrieveEnterpriseMultiAccountCouponReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    subCouponId: ").append(toIndentedString(subCouponId)).append("\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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
