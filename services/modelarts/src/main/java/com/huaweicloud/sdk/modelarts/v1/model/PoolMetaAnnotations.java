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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/scheduler.queue.strategy")

    private String osModelartsPoolSchedulerQueueStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/subpools.count")

    private String osModelartsPoolSubpoolsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/tenant.domain.name")

    private String osModelartsTenantDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts.pool/scope.external.dependency.train")

    private String osModelartsPoolScopeExternalDependencyTrain;

    public PoolMetaAnnotations withOsModelartsDescription(String osModelartsDescription) {
        this.osModelartsDescription = osModelartsDescription;
        return this;
    }

    /**
     * **参数解释**：资源池的描述信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：计费模式。 **约束限制**：不涉及。 **取值范围**：可选值如下： - 0：按需计费 - 1：包周期计费 **默认取值**：不涉及。
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
     * **参数解释**：包周期资源池的订购周期。 **约束限制**：和os.modelarts/period.type字段配合使用。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：包周期资源池的订购类型。 **约束限制**：和os.modelarts/period.num字段配合使用。 **取值范围**：可选值如下： - 2：包月。 - 3：包年。 **默认取值**：不涉及。
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
     * **参数解释**：包周期资源池的自动续费类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - 0：不自动续费。 - 1：自动续费。 **默认取值**：0。
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
     * **参数解释**：包周期资源池购买时选择的折扣信息。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：购买包周期资源在订单支付完成后跳转地址。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：包周期资源池购买时传递的订单ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：包周期资源池中资源规格对应的资源ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
     * **参数解释**：资源池上的资源标签。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsTmsTags
     */
    public String getOsModelartsTmsTags() {
        return osModelartsTmsTags;
    }

    public void setOsModelartsTmsTags(String osModelartsTmsTags) {
        this.osModelartsTmsTags = osModelartsTmsTags;
    }

    public PoolMetaAnnotations withOsModelartsPoolSchedulerQueueStrategy(String osModelartsPoolSchedulerQueueStrategy) {
        this.osModelartsPoolSchedulerQueueStrategy = osModelartsPoolSchedulerQueueStrategy;
        return this;
    }

    /**
     * **参数解释**：资源池调度队列的策略，用于定义任务调度的规则。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPoolSchedulerQueueStrategy
     */
    public String getOsModelartsPoolSchedulerQueueStrategy() {
        return osModelartsPoolSchedulerQueueStrategy;
    }

    public void setOsModelartsPoolSchedulerQueueStrategy(String osModelartsPoolSchedulerQueueStrategy) {
        this.osModelartsPoolSchedulerQueueStrategy = osModelartsPoolSchedulerQueueStrategy;
    }

    public PoolMetaAnnotations withOsModelartsPoolSubpoolsCount(String osModelartsPoolSubpoolsCount) {
        this.osModelartsPoolSubpoolsCount = osModelartsPoolSubpoolsCount;
        return this;
    }

    /**
     * **参数解释**：资源池包含的逻辑子池的数量。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPoolSubpoolsCount
     */
    public String getOsModelartsPoolSubpoolsCount() {
        return osModelartsPoolSubpoolsCount;
    }

    public void setOsModelartsPoolSubpoolsCount(String osModelartsPoolSubpoolsCount) {
        this.osModelartsPoolSubpoolsCount = osModelartsPoolSubpoolsCount;
    }

    public PoolMetaAnnotations withOsModelartsTenantDomainName(String osModelartsTenantDomainName) {
        this.osModelartsTenantDomainName = osModelartsTenantDomainName;
        return this;
    }

    /**
     * **参数解释**：资源池的租户账号 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsTenantDomainName
     */
    public String getOsModelartsTenantDomainName() {
        return osModelartsTenantDomainName;
    }

    public void setOsModelartsTenantDomainName(String osModelartsTenantDomainName) {
        this.osModelartsTenantDomainName = osModelartsTenantDomainName;
    }

    public PoolMetaAnnotations withOsModelartsPoolScopeExternalDependencyTrain(
        String osModelartsPoolScopeExternalDependencyTrain) {
        this.osModelartsPoolScopeExternalDependencyTrain = osModelartsPoolScopeExternalDependencyTrain;
        return this;
    }

    /**
     * **参数解释**：训练外部依赖标识 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsPoolScopeExternalDependencyTrain
     */
    public String getOsModelartsPoolScopeExternalDependencyTrain() {
        return osModelartsPoolScopeExternalDependencyTrain;
    }

    public void setOsModelartsPoolScopeExternalDependencyTrain(String osModelartsPoolScopeExternalDependencyTrain) {
        this.osModelartsPoolScopeExternalDependencyTrain = osModelartsPoolScopeExternalDependencyTrain;
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
            && Objects.equals(this.osModelartsTmsTags, that.osModelartsTmsTags)
            && Objects.equals(this.osModelartsPoolSchedulerQueueStrategy, that.osModelartsPoolSchedulerQueueStrategy)
            && Objects.equals(this.osModelartsPoolSubpoolsCount, that.osModelartsPoolSubpoolsCount)
            && Objects.equals(this.osModelartsTenantDomainName, that.osModelartsTenantDomainName)
            && Objects.equals(this.osModelartsPoolScopeExternalDependencyTrain,
                that.osModelartsPoolScopeExternalDependencyTrain);
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
            osModelartsTmsTags,
            osModelartsPoolSchedulerQueueStrategy,
            osModelartsPoolSubpoolsCount,
            osModelartsTenantDomainName,
            osModelartsPoolScopeExternalDependencyTrain);
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
        sb.append("    osModelartsPoolSchedulerQueueStrategy: ")
            .append(toIndentedString(osModelartsPoolSchedulerQueueStrategy))
            .append("\n");
        sb.append("    osModelartsPoolSubpoolsCount: ")
            .append(toIndentedString(osModelartsPoolSubpoolsCount))
            .append("\n");
        sb.append("    osModelartsTenantDomainName: ")
            .append(toIndentedString(osModelartsTenantDomainName))
            .append("\n");
        sb.append("    osModelartsPoolScopeExternalDependencyTrain: ")
            .append(toIndentedString(osModelartsPoolScopeExternalDependencyTrain))
            .append("\n");
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
