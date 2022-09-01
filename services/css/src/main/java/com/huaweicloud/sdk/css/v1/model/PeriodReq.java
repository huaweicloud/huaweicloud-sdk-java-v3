package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * PeriodReq
 */
public class PeriodReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    @JacksonXmlProperty(localName = "periodType")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    @JacksonXmlProperty(localName = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    @JacksonXmlProperty(localName = "isAutoRenew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    @JacksonXmlProperty(localName = "isAutoPay")

    private Integer isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consoleURL")

    @JacksonXmlProperty(localName = "consoleURL")

    private String consoleURL;

    public PeriodReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型。 - 2: 包月。 - 3: 包年。
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public PeriodReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数。 - 若选择包月（参数范围：1-9）。 - 若选择包年（参数范围：1-3）。
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodReq withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订，为空时表示不自动续订 - 1: 自动续订。 - 2: 不自动续订（默认）。
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public PeriodReq withIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     *  是否自动支付。下单订购后，是否自动从客户的华为云账户中支付，而不需要客户手动去进行支付。该参数适用于包周期集群。   - 1: 是（会自动选择折扣和优惠券进行优惠，然后自动从客户华为云账户中支付），自动支付失败后会生成订单成功(该订单应付金额是优惠后金额)、但订单状态为“待支付”，等待客户手动支付(手动支付时，客户还可以修改系统自动选择的折扣和优惠券)。   - 0: 否（需要客户手动去支付，客户可以选择折扣和优惠券）。默认值为“0”。
     * @return isAutoPay
     */
    public Integer getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Integer isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PeriodReq withConsoleURL(String consoleURL) {
        this.consoleURL = consoleURL;
        return this;
    }

    /**
     * 云服务ConsoleURL。 订购订单支付完成后，客户可以通过此URL跳转到云服务Console页面查看信息。（仅手动支付时涉及）。
     * @return consoleURL
     */
    public String getConsoleURL() {
        return consoleURL;
    }

    public void setConsoleURL(String consoleURL) {
        this.consoleURL = consoleURL;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodReq periodReq = (PeriodReq) o;
        return Objects.equals(this.periodType, periodReq.periodType)
            && Objects.equals(this.periodNum, periodReq.periodNum)
            && Objects.equals(this.isAutoRenew, periodReq.isAutoRenew)
            && Objects.equals(this.isAutoPay, periodReq.isAutoPay)
            && Objects.equals(this.consoleURL, periodReq.consoleURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodType, periodNum, isAutoRenew, isAutoPay, consoleURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodReq {\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    consoleURL: ").append(toIndentedString(consoleURL)).append("\n");
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
