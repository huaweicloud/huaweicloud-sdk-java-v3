package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ClaimEnterpriseMultiAccountCouponResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_coupon_id")

    private String subCouponId;

    public ClaimEnterpriseMultiAccountCouponResponse withSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
        return this;
    }

    /**
     * |参数名称：实际回收金额。| |参数的约束及描述：成功时返回|
     * @return subCouponId
     */
    public String getSubCouponId() {
        return subCouponId;
    }

    public void setSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClaimEnterpriseMultiAccountCouponResponse claimEnterpriseMultiAccountCouponResponse =
            (ClaimEnterpriseMultiAccountCouponResponse) o;
        return Objects.equals(this.subCouponId, claimEnterpriseMultiAccountCouponResponse.subCouponId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCouponId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClaimEnterpriseMultiAccountCouponResponse {\n");
        sb.append("    subCouponId: ").append(toIndentedString(subCouponId)).append("\n");
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
