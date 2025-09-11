package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 增加租户权限
 */
public class SpecialAgreementSignReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_type")

    private String agreementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_sign")

    private Boolean toSign;

    public SpecialAgreementSignReq withAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * 当前服务协议类型: AUTO_PAY: 自动支付协议
     * @return agreementType
     */
    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public SpecialAgreementSignReq withToSign(Boolean toSign) {
        this.toSign = toSign;
        return this;
    }

    /**
     * 是否为去签署,true:签署;false:取消签署
     * @return toSign
     */
    public Boolean getToSign() {
        return toSign;
    }

    public void setToSign(Boolean toSign) {
        this.toSign = toSign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecialAgreementSignReq that = (SpecialAgreementSignReq) obj;
        return Objects.equals(this.agreementType, that.agreementType) && Objects.equals(this.toSign, that.toSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementType, toSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecialAgreementSignReq {\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    toSign: ").append(toIndentedString(toSign)).append("\n");
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
