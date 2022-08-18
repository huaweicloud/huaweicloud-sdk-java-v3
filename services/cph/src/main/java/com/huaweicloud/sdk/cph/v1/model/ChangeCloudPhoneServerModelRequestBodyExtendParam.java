package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 购买模式参数
 */
public class ChangeCloudPhoneServerModelRequestBodyExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    public ChangeCloudPhoneServerModelRequestBodyExtendParam withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 否自动付款。默认不自动付款。如果是规格升配的变更，则需要支付额外的费用，如果是降配的变更，则会自动退款。 - 1 表示自动付款 - 0 表示不自动付款
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeCloudPhoneServerModelRequestBodyExtendParam changeCloudPhoneServerModelRequestBodyExtendParam =
            (ChangeCloudPhoneServerModelRequestBodyExtendParam) o;
        return Objects.equals(this.isAutoPay, changeCloudPhoneServerModelRequestBodyExtendParam.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeCloudPhoneServerModelRequestBodyExtendParam {\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
