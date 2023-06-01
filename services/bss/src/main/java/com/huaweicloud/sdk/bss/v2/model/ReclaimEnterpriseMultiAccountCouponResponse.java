package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ReclaimEnterpriseMultiAccountCouponResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_retrieve_amout")

    private String realRetrieveAmout;

    public ReclaimEnterpriseMultiAccountCouponResponse withRealRetrieveAmout(String realRetrieveAmout) {
        this.realRetrieveAmout = realRetrieveAmout;
        return this;
    }

    /**
     * |参数名称：实际回收金额。| |参数的约束及描述：成功时返回|
     * @return realRetrieveAmout
     */
    public String getRealRetrieveAmout() {
        return realRetrieveAmout;
    }

    public void setRealRetrieveAmout(String realRetrieveAmout) {
        this.realRetrieveAmout = realRetrieveAmout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReclaimEnterpriseMultiAccountCouponResponse reclaimEnterpriseMultiAccountCouponResponse =
            (ReclaimEnterpriseMultiAccountCouponResponse) o;
        return Objects.equals(this.realRetrieveAmout, reclaimEnterpriseMultiAccountCouponResponse.realRetrieveAmout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realRetrieveAmout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimEnterpriseMultiAccountCouponResponse {\n");
        sb.append("    realRetrieveAmout: ").append(toIndentedString(realRetrieveAmout)).append("\n");
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
