package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdatePublicKibanaBandwidthReq
 */
public class UpdatePublicKibanaBandwidthReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidth")

    private UpdatePublicKibanaBandwidthReqBandWidth bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private Integer isAutoPay;

    public UpdatePublicKibanaBandwidthReq withBandWidth(UpdatePublicKibanaBandwidthReqBandWidth bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public UpdatePublicKibanaBandwidthReq withBandWidth(
        Consumer<UpdatePublicKibanaBandwidthReqBandWidth> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new UpdatePublicKibanaBandwidthReqBandWidth();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public UpdatePublicKibanaBandwidthReqBandWidth getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(UpdatePublicKibanaBandwidthReqBandWidth bandWidth) {
        this.bandWidth = bandWidth;
    }

    public UpdatePublicKibanaBandwidthReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。该参数适用于包周期集群。  - 1：是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券)。  - 0：否（需要客户手动去支付，客户可以选择折扣和优惠券）。默认值为“0”。
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
        UpdatePublicKibanaBandwidthReq updatePublicKibanaBandwidthReq = (UpdatePublicKibanaBandwidthReq) o;
        return Objects.equals(this.bandWidth, updatePublicKibanaBandwidthReq.bandWidth)
            && Objects.equals(this.isAutoPay, updatePublicKibanaBandwidthReq.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidth, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicKibanaBandwidthReq {\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
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
