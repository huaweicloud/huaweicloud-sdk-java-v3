package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListNotificationMaskRespNotificationMasks
 */
public class ListNotificationMaskRespNotificationMasks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_id")

    private String notificationMaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private MaskResourceType resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_names")

    private List<String> metricNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_metrics")

    private List<ProductMetric> productMetrics = null;

    /**
     * dimension: 子维度,product: 云产品
     */
    public static final class ResourceLevelEnum {

        /**
         * Enum DIMENSION for value: "dimension"
         */
        public static final ResourceLevelEnum DIMENSION = new ResourceLevelEnum("dimension");

        /**
         * Enum PRODUCT for value: "product"
         */
        public static final ResourceLevelEnum PRODUCT = new ResourceLevelEnum("product");

        private static final Map<String, ResourceLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceLevelEnum> createStaticFields() {
            Map<String, ResourceLevelEnum> map = new HashMap<>();
            map.put("dimension", DIMENSION);
            map.put("product", PRODUCT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceLevelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceLevelEnum(value));
        }

        public static ResourceLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceLevelEnum) {
                return this.value.equals(((ResourceLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private ResourceLevelEnum resourceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourceCategory> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_status")

    private MaskStatus maskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_type")

    private MaskType maskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private LocalDate startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private LocalDate endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<PoliciesInListResp> policies = null;

    public ListNotificationMaskRespNotificationMasks withNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
        return this;
    }

    /**
     * 屏蔽规则ID
     * @return notificationMaskId
     */
    public String getNotificationMaskId() {
        return notificationMaskId;
    }

    public void setNotificationMaskId(String notificationMaskId) {
        this.notificationMaskId = notificationMaskId;
    }

    public ListNotificationMaskRespNotificationMasks withMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }

    /**
     * 屏蔽规则名称，只能为字母、数字、汉字、-、_，最大长度为64
     * @return maskName
     */
    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }

    public ListNotificationMaskRespNotificationMasks withRelationType(RelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get relationType
     * @return relationType
     */
    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
    }

    public ListNotificationMaskRespNotificationMasks withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 关联编号
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public ListNotificationMaskRespNotificationMasks withResourceType(MaskResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     * @return resourceType
     */
    public MaskResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(MaskResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public ListNotificationMaskRespNotificationMasks withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 关联指标名称，relation_type为RESOURCE时存在该字段
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    public ListNotificationMaskRespNotificationMasks withProductMetrics(List<ProductMetric> productMetrics) {
        this.productMetrics = productMetrics;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addProductMetricsItem(ProductMetric productMetricsItem) {
        if (this.productMetrics == null) {
            this.productMetrics = new ArrayList<>();
        }
        this.productMetrics.add(productMetricsItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withProductMetrics(
        Consumer<List<ProductMetric>> productMetricsSetter) {
        if (this.productMetrics == null) {
            this.productMetrics = new ArrayList<>();
        }
        productMetricsSetter.accept(this.productMetrics);
        return this;
    }

    /**
     * 按云产品维度屏蔽时的指标信息
     * @return productMetrics
     */
    public List<ProductMetric> getProductMetrics() {
        return productMetrics;
    }

    public void setProductMetrics(List<ProductMetric> productMetrics) {
        this.productMetrics = productMetrics;
    }

    public ListNotificationMaskRespNotificationMasks withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * dimension: 子维度,product: 云产品
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ListNotificationMaskRespNotificationMasks withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 资源为云产品时的云产品名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListNotificationMaskRespNotificationMasks withResources(List<ResourceCategory> resources) {
        this.resources = resources;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addResourcesItem(ResourceCategory resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withResources(Consumer<List<ResourceCategory>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 关联资源类型，relation_type为RESOURCE时存在该字段,只需要查询出资源的namespace+维度名即可
     * @return resources
     */
    public List<ResourceCategory> getResources() {
        return resources;
    }

    public void setResources(List<ResourceCategory> resources) {
        this.resources = resources;
    }

    public ListNotificationMaskRespNotificationMasks withMaskStatus(MaskStatus maskStatus) {
        this.maskStatus = maskStatus;
        return this;
    }

    /**
     * Get maskStatus
     * @return maskStatus
     */
    public MaskStatus getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(MaskStatus maskStatus) {
        this.maskStatus = maskStatus;
    }

    public ListNotificationMaskRespNotificationMasks withMaskType(MaskType maskType) {
        this.maskType = maskType;
        return this;
    }

    /**
     * Get maskType
     * @return maskType
     */
    public MaskType getMaskType() {
        return maskType;
    }

    public void setMaskType(MaskType maskType) {
        this.maskType = maskType;
    }

    public ListNotificationMaskRespNotificationMasks withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 告警屏蔽的创建时间，UNIX时间戳，单位毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListNotificationMaskRespNotificationMasks withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 告警屏蔽的更新时间，UNIX时间戳，单位毫秒。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ListNotificationMaskRespNotificationMasks withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 屏蔽起始日期，yyyy-MM-dd。
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ListNotificationMaskRespNotificationMasks withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 屏蔽起始时间，HH:mm:ss。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListNotificationMaskRespNotificationMasks withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 屏蔽截止日期，yyyy-MM-dd。
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ListNotificationMaskRespNotificationMasks withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 屏蔽截止时间，HH:mm:ss。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListNotificationMaskRespNotificationMasks withPolicies(List<PoliciesInListResp> policies) {
        this.policies = policies;
        return this;
    }

    public ListNotificationMaskRespNotificationMasks addPoliciesItem(PoliciesInListResp policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListNotificationMaskRespNotificationMasks withPolicies(Consumer<List<PoliciesInListResp>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 告警策略列表。
     * @return policies
     */
    public List<PoliciesInListResp> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PoliciesInListResp> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMaskRespNotificationMasks that = (ListNotificationMaskRespNotificationMasks) obj;
        return Objects.equals(this.notificationMaskId, that.notificationMaskId)
            && Objects.equals(this.maskName, that.maskName) && Objects.equals(this.relationType, that.relationType)
            && Objects.equals(this.relationId, that.relationId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.metricNames, that.metricNames)
            && Objects.equals(this.productMetrics, that.productMetrics)
            && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.maskStatus, that.maskStatus) && Objects.equals(this.maskType, that.maskType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endDate, that.endDate) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskId,
            maskName,
            relationType,
            relationId,
            resourceType,
            metricNames,
            productMetrics,
            resourceLevel,
            productName,
            resources,
            maskStatus,
            maskType,
            createTime,
            updateTime,
            startDate,
            startTime,
            endDate,
            endTime,
            policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMaskRespNotificationMasks {\n");
        sb.append("    notificationMaskId: ").append(toIndentedString(notificationMaskId)).append("\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
        sb.append("    productMetrics: ").append(toIndentedString(productMetrics)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    maskStatus: ").append(toIndentedString(maskStatus)).append("\n");
        sb.append("    maskType: ").append(toIndentedString(maskType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
