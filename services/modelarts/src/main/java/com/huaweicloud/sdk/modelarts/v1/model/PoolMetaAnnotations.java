package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池metadata的注释信息。
 */
public class PoolMetaAnnotations {

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
    @JsonProperty(value = "os.modelarts/promotion.info")

    private String osModelartsPromotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/service.console.url")

    private String osModelartsServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/order.id")

    private String osModelartsOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/flavor.resource.ids")

    private String osModelartsFlavorResourceIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/tms.tags")

    private String osModelartsTmsTags;

    public PoolMetaAnnotations withOsModelartsDescription(String osModelartsDescription) {
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

    public PoolMetaAnnotations withOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
        return this;
    }

    /**
     * 计费模式。可选值如下： - 0：按需计费 - 1：包周期计费
     * @return osModelartsBillingMode
     */
    public String getOsModelartsBillingMode() {
        return osModelartsBillingMode;
    }

    public void setOsModelartsBillingMode(String osModelartsBillingMode) {
        this.osModelartsBillingMode = osModelartsBillingMode;
    }

    public PoolMetaAnnotations withOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
        return this;
    }

    /**
     * 包周期订购周期，比如2。
     * @return osModelartsPeriodNum
     */
    public String getOsModelartsPeriodNum() {
        return osModelartsPeriodNum;
    }

    public void setOsModelartsPeriodNum(String osModelartsPeriodNum) {
        this.osModelartsPeriodNum = osModelartsPeriodNum;
    }

    public PoolMetaAnnotations withOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
        return this;
    }

    /**
     * 包周期订购类型。可选值如下： - 2：月  - 3：年 - 4：小时
     * @return osModelartsPeriodType
     */
    public String getOsModelartsPeriodType() {
        return osModelartsPeriodType;
    }

    public void setOsModelartsPeriodType(String osModelartsPeriodType) {
        this.osModelartsPeriodType = osModelartsPeriodType;
    }

    public PoolMetaAnnotations withOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
        return this;
    }

    /**
     * 是否自动续费.可选值如下： - 0：不自动续费，默认值 - 1：自动续费
     * @return osModelartsAutoRenew
     */
    public String getOsModelartsAutoRenew() {
        return osModelartsAutoRenew;
    }

    public void setOsModelartsAutoRenew(String osModelartsAutoRenew) {
        this.osModelartsAutoRenew = osModelartsAutoRenew;
    }

    public PoolMetaAnnotations withOsModelartsPromotionInfo(String osModelartsPromotionInfo) {
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

    public PoolMetaAnnotations withOsModelartsServiceConsoleUrl(String osModelartsServiceConsoleUrl) {
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

    public PoolMetaAnnotations withOsModelartsOrderId(String osModelartsOrderId) {
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

    public PoolMetaAnnotations withOsModelartsFlavorResourceIds(String osModelartsFlavorResourceIds) {
        this.osModelartsFlavorResourceIds = osModelartsFlavorResourceIds;
        return this;
    }

    /**
     * 每种规格对应的resourceId，主要和cbc交互使用。
     * @return osModelartsFlavorResourceIds
     */
    public String getOsModelartsFlavorResourceIds() {
        return osModelartsFlavorResourceIds;
    }

    public void setOsModelartsFlavorResourceIds(String osModelartsFlavorResourceIds) {
        this.osModelartsFlavorResourceIds = osModelartsFlavorResourceIds;
    }

    public PoolMetaAnnotations withOsModelartsTmsTags(String osModelartsTmsTags) {
        this.osModelartsTmsTags = osModelartsTmsTags;
        return this;
    }

    /**
     * 创建的时候由用户指定的TMS标签。
     * @return osModelartsTmsTags
     */
    public String getOsModelartsTmsTags() {
        return osModelartsTmsTags;
    }

    public void setOsModelartsTmsTags(String osModelartsTmsTags) {
        this.osModelartsTmsTags = osModelartsTmsTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolMetaAnnotations that = (PoolMetaAnnotations) obj;
        return Objects.equals(this.osModelartsDescription, that.osModelartsDescription)
            && Objects.equals(this.osModelartsBillingMode, that.osModelartsBillingMode)
            && Objects.equals(this.osModelartsPeriodNum, that.osModelartsPeriodNum)
            && Objects.equals(this.osModelartsPeriodType, that.osModelartsPeriodType)
            && Objects.equals(this.osModelartsAutoRenew, that.osModelartsAutoRenew)
            && Objects.equals(this.osModelartsPromotionInfo, that.osModelartsPromotionInfo)
            && Objects.equals(this.osModelartsServiceConsoleUrl, that.osModelartsServiceConsoleUrl)
            && Objects.equals(this.osModelartsOrderId, that.osModelartsOrderId)
            && Objects.equals(this.osModelartsFlavorResourceIds, that.osModelartsFlavorResourceIds)
            && Objects.equals(this.osModelartsTmsTags, that.osModelartsTmsTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsDescription,
            osModelartsBillingMode,
            osModelartsPeriodNum,
            osModelartsPeriodType,
            osModelartsAutoRenew,
            osModelartsPromotionInfo,
            osModelartsServiceConsoleUrl,
            osModelartsOrderId,
            osModelartsFlavorResourceIds,
            osModelartsTmsTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolMetaAnnotations {\n");
        sb.append("    osModelartsDescription: ").append(toIndentedString(osModelartsDescription)).append("\n");
        sb.append("    osModelartsBillingMode: ").append(toIndentedString(osModelartsBillingMode)).append("\n");
        sb.append("    osModelartsPeriodNum: ").append(toIndentedString(osModelartsPeriodNum)).append("\n");
        sb.append("    osModelartsPeriodType: ").append(toIndentedString(osModelartsPeriodType)).append("\n");
        sb.append("    osModelartsAutoRenew: ").append(toIndentedString(osModelartsAutoRenew)).append("\n");
        sb.append("    osModelartsPromotionInfo: ").append(toIndentedString(osModelartsPromotionInfo)).append("\n");
        sb.append("    osModelartsServiceConsoleUrl: ")
            .append(toIndentedString(osModelartsServiceConsoleUrl))
            .append("\n");
        sb.append("    osModelartsOrderId: ").append(toIndentedString(osModelartsOrderId)).append("\n");
        sb.append("    osModelartsFlavorResourceIds: ")
            .append(toIndentedString(osModelartsFlavorResourceIds))
            .append("\n");
        sb.append("    osModelartsTmsTags: ").append(toIndentedString(osModelartsTmsTags)).append("\n");
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
