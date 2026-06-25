package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建节点池metadata的注释信息。
 */
public class CreateNodePoolAnnotations {

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
    @JsonProperty(value = "os.modelarts/promotion.info")

    private String osModelartsPromotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/service.console.url")

    private String osModelartsServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.id")

    private String osModelartsOrderId;

    public CreateNodePoolAnnotations withOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
        return this;
    }

    /**
     * **参数解释**：计费模式。 **约束限制**：不涉及。 **取值范围**：可选值如下： - 0：按需计费 - 1：包周期计费 **默认取值**：不涉及。
     * @return osModelartsBillingMode
     */
    public String getOsModelartsBillingMode() {
        return osModelartsBillingMode;
    }

    public void setOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
    }

    public CreateNodePoolAnnotations withOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
        return this;
    }

    /**
     * **参数解释**：包周期订购周期，比如2。当计费模式为包周期时该参数必传。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPeriodNum
     */
    public String getOsModelartsPeriodNum() {
        return osModelartsPeriodNum;
    }

    public void setOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
    }

    public CreateNodePoolAnnotations withOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
        return this;
    }

    /**
     * **参数解释**：包周期订购类型。当计费模式为包周期时该参数必传 **约束限制**：不涉及。 **取值范围**：可选值如下： - 2：月 - 3：年 - 4：小时 **默认取值**：不涉及。
     * @return osModelartsPeriodType
     */
    public String getOsModelartsPeriodType() {
        return osModelartsPeriodType;
    }

    public void setOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
    }

    public CreateNodePoolAnnotations withOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
        return this;
    }

    /**
     * **参数解释**：是否自动续费。 **约束限制**：不涉及。 **取值范围**：可选值如下： - 0：不自动续费 - 1：自动续费 **默认取值**：0。
     * @return osModelartsAutoRenew
     */
    public String getOsModelartsAutoRenew() {
        return osModelartsAutoRenew;
    }

    public void setOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
    }

    public CreateNodePoolAnnotations withOsModelartsPromotionInfo(String osModelartsPromotionInfo) {
        this.osModelartsPromotionInfo = osModelartsPromotionInfo;
        return this;
    }

    /**
     * **参数解释**：用户在运营平台选择的折扣信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPromotionInfo
     */
    public String getOsModelartsPromotionInfo() {
        return osModelartsPromotionInfo;
    }

    public void setOsModelartsPromotionInfo(String osModelartsPromotionInfo) {
        this.osModelartsPromotionInfo = osModelartsPromotionInfo;
    }

    public CreateNodePoolAnnotations withOsModelartsServiceConsoleUrl(String osModelartsServiceConsoleUrl) {
        this.osModelartsServiceConsoleUrl = osModelartsServiceConsoleUrl;
        return this;
    }

    /**
     * **参数解释**：订购订单支付完成后跳转的url地址。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsServiceConsoleUrl
     */
    public String getOsModelartsServiceConsoleUrl() {
        return osModelartsServiceConsoleUrl;
    }

    public void setOsModelartsServiceConsoleUrl(String osModelartsServiceConsoleUrl) {
        this.osModelartsServiceConsoleUrl = osModelartsServiceConsoleUrl;
    }

    public CreateNodePoolAnnotations withOsModelartsOrderId(String osModelartsOrderId) {
        this.osModelartsOrderId = osModelartsOrderId;
        return this;
    }

    /**
     * **参数解释**：订单id，包周期资源创建或者计费模式变更的时候该参数必需。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
        CreateNodePoolAnnotations that = (CreateNodePoolAnnotations) obj;
        return Objects.equals(this.osModelartsBillingMode, that.osModelartsBillingMode)
            && Objects.equals(this.osModelartsPeriodNum, that.osModelartsPeriodNum)
            && Objects.equals(this.osModelartsPeriodType, that.osModelartsPeriodType)
            && Objects.equals(this.osModelartsAutoRenew, that.osModelartsAutoRenew)
            && Objects.equals(this.osModelartsPromotionInfo, that.osModelartsPromotionInfo)
            && Objects.equals(this.osModelartsServiceConsoleUrl, that.osModelartsServiceConsoleUrl)
            && Objects.equals(this.osModelartsOrderId, that.osModelartsOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsBillingMode,
            osModelartsPeriodNum,
            osModelartsPeriodType,
            osModelartsAutoRenew,
            osModelartsPromotionInfo,
            osModelartsServiceConsoleUrl,
            osModelartsOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodePoolAnnotations {\n");
        sb.append("    osModelartsBillingMode: ").append(toIndentedString(osModelartsBillingMode)).append("\n");
        sb.append("    osModelartsPeriodNum: ").append(toIndentedString(osModelartsPeriodNum)).append("\n");
        sb.append("    osModelartsPeriodType: ").append(toIndentedString(osModelartsPeriodType)).append("\n");
        sb.append("    osModelartsAutoRenew: ").append(toIndentedString(osModelartsAutoRenew)).append("\n");
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
