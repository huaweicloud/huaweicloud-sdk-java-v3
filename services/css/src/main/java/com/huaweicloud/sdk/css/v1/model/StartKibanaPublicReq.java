package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StartKibanaPublicReq
 */
public class StartKibanaPublicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_size")

    private Integer eipSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_white_list")

    private StartKibanaPublicReqElbWhitelist elbWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Integer isAutoPay;

    public StartKibanaPublicReq withEipSize(Integer eipSize) {
        this.eipSize = eipSize;
        return this;
    }

    /**
     * 带宽。单位：Mbit/s
     * @return eipSize
     */
    public Integer getEipSize() {
        return eipSize;
    }

    public void setEipSize(Integer eipSize) {
        this.eipSize = eipSize;
    }

    public StartKibanaPublicReq withElbWhiteList(StartKibanaPublicReqElbWhitelist elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
        return this;
    }

    public StartKibanaPublicReq withElbWhiteList(Consumer<StartKibanaPublicReqElbWhitelist> elbWhiteListSetter) {
        if (this.elbWhiteList == null) {
            this.elbWhiteList = new StartKibanaPublicReqElbWhitelist();
            elbWhiteListSetter.accept(this.elbWhiteList);
        }

        return this;
    }

    /**
     * Get elbWhiteList
     * @return elbWhiteList
     */
    public StartKibanaPublicReqElbWhitelist getElbWhiteList() {
        return elbWhiteList;
    }

    public void setElbWhiteList(StartKibanaPublicReqElbWhitelist elbWhiteList) {
        this.elbWhiteList = elbWhiteList;
    }

    public StartKibanaPublicReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。该参数适用于包周期集群。  - 1: 是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券)。 - 0: 否（需要客户手动去支付，客户可以选择折扣和优惠券）。默认值为“0”。
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartKibanaPublicReq that = (StartKibanaPublicReq) obj;
        return Objects.equals(this.eipSize, that.eipSize) && Objects.equals(this.elbWhiteList, that.elbWhiteList)
            && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipSize, elbWhiteList, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartKibanaPublicReq {\n");
        sb.append("    eipSize: ").append(toIndentedString(eipSize)).append("\n");
        sb.append("    elbWhiteList: ").append(toIndentedString(elbWhiteList)).append("\n");
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
