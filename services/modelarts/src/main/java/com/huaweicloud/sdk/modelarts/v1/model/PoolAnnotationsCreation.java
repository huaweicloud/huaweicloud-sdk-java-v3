package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池的注释信息。
 */
public class PoolAnnotationsCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/description")

    private String osModelartsDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/billing.mode")

    private String osModelartsBillingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/period.num")

    private String osModelartsPeriodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/period.type")

    private String osModelartsPeriodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/auto.renew")

    private String osModelartsAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/auto.pay")

    private String osModelartsAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/promotion.info")

    private String osModelartsPromotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/service.console.url")

    private String osModelartsServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.id")

    private String osModelartsOrderId;

    public PoolAnnotationsCreation withOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
        return this;
    }

    /**
     * 资源池的描述信息。
     * @return osModelartsDescription
     */
    public String getOsModelartsDescription() {
        return osModelartsDescription;
    }

    public void setOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
    }

    public PoolAnnotationsCreation withOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
        return this;
    }

    /**
     * 计费模式，可选值如下： - 0：按需计费 - 1：包周期计费
     * @return osModelartsBillingMode
     */
    public String getOsModelartsBillingMode() {
        return osModelartsBillingMode;
    }

    public void setOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
    }

    public PoolAnnotationsCreation withOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
        return this;
    }

    /**
     * 包周期订购周期，比如2。当计费模式为包周期时该参数必传。
     * @return osModelartsPeriodNum
     */
    public String getOsModelartsPeriodNum() {
        return osModelartsPeriodNum;
    }

    public void setOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
    }

    public PoolAnnotationsCreation withOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
        return this;
    }

    /**
     * 包周期订购类型。可选值如下： - 2：月  - 3：年  当计费模式为包周期时该参数必传。
     * @return osModelartsPeriodType
     */
    public String getOsModelartsPeriodType() {
        return osModelartsPeriodType;
    }

    public void setOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
    }

    public PoolAnnotationsCreation withOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
        return this;
    }

    /**
     * 是否自动续费。可选值如下： - 0：不自动续费，默认值
     * @return osModelartsAutoRenew
     */
    public String getOsModelartsAutoRenew() {
        return osModelartsAutoRenew;
    }

    public void setOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
    }

    public PoolAnnotationsCreation withOsModelartsAutoPay(String osModelartsAutoPay) {
        this.osModelartsAutoPay = osModelartsAutoPay;
        return this;
    }

    /**
     * 是否自动付费，仅在用户购买包周期资源时生效。可选值如下： - true：自动付费 - false：手动付费，默认值
     * @return osModelartsAutoPay
     */
    public String getOsModelartsAutoPay() {
        return osModelartsAutoPay;
    }

    public void setOsModelartsAutoPay(String osModelartsAutoPay) {
        this.osModelartsAutoPay = osModelartsAutoPay;
    }

    public PoolAnnotationsCreation withOsModelartsPromotionInfo(String osModelartsPromotionInfo) {
        this.osModelartsPromotionInfo = osModelartsPromotionInfo;
        return this;
    }

    /**
     * 用户在cbc选择的折扣信息。
     * @return osModelartsPromotionInfo
     */
    public String getOsModelartsPromotionInfo() {
        return osModelartsPromotionInfo;
    }

    public void setOsModelartsPromotionInfo(String osModelartsPromotionInfo) {
        this.osModelartsPromotionInfo = osModelartsPromotionInfo;
    }

    public PoolAnnotationsCreation withOsModelartsServiceConsoleUrl(String osModelartsServiceConsoleUrl) {
        this.osModelartsServiceConsoleUrl = osModelartsServiceConsoleUrl;
        return this;
    }

    /**
     * 订购订单支付完成后跳转的url地址。
     * @return osModelartsServiceConsoleUrl
     */
    public String getOsModelartsServiceConsoleUrl() {
        return osModelartsServiceConsoleUrl;
    }

    public void setOsModelartsServiceConsoleUrl(String osModelartsServiceConsoleUrl) {
        this.osModelartsServiceConsoleUrl = osModelartsServiceConsoleUrl;
    }

    public PoolAnnotationsCreation withOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
        return this;
    }

    /**
     * 订单id，包周期资源池创建或者计费模式变更的时候该参数必需。
     * @return osModelartsOrderId
     */
    public String getOsModelartsOrderId() {
        return osModelartsOrderId;
    }

    public void setOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolAnnotationsCreation that = (PoolAnnotationsCreation) obj;
        return Objects.equals(this.osModelartsDescription, that.osModelartsDescription)
            && Objects.equals(this.osModelartsBillingMode, that.osModelartsBillingMode)
            && Objects.equals(this.osModelartsPeriodNum, that.osModelartsPeriodNum)
            && Objects.equals(this.osModelartsPeriodType, that.osModelartsPeriodType)
            && Objects.equals(this.osModelartsAutoRenew, that.osModelartsAutoRenew)
            && Objects.equals(this.osModelartsAutoPay, that.osModelartsAutoPay)
            && Objects.equals(this.osModelartsPromotionInfo, that.osModelartsPromotionInfo)
            && Objects.equals(this.osModelartsServiceConsoleUrl, that.osModelartsServiceConsoleUrl)
            && Objects.equals(this.osModelartsOrderId, that.osModelartsOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsDescription,
            osModelartsBillingMode,
            osModelartsPeriodNum,
            osModelartsPeriodType,
            osModelartsAutoRenew,
            osModelartsAutoPay,
            osModelartsPromotionInfo,
            osModelartsServiceConsoleUrl,
            osModelartsOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolAnnotationsCreation {\n");
        sb.append("    osModelartsDescription: ").append(toIndentedString(osModelartsDescription)).append("\n");
        sb.append("    osModelartsBillingMode: ").append(toIndentedString(osModelartsBillingMode)).append("\n");
        sb.append("    osModelartsPeriodNum: ").append(toIndentedString(osModelartsPeriodNum)).append("\n");
        sb.append("    osModelartsPeriodType: ").append(toIndentedString(osModelartsPeriodType)).append("\n");
        sb.append("    osModelartsAutoRenew: ").append(toIndentedString(osModelartsAutoRenew)).append("\n");
        sb.append("    osModelartsAutoPay: ").append(toIndentedString(osModelartsAutoPay)).append("\n");
        sb.append("    osModelartsPromotionInfo: ").append(toIndentedString(osModelartsPromotionInfo)).append("\n");
        sb.append("    osModelartsServiceConsoleUrl: ")
            .append(toIndentedString(osModelartsServiceConsoleUrl))
            .append("\n");
        sb.append("    osModelartsOrderId: ").append(toIndentedString(osModelartsOrderId)).append("\n");
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
