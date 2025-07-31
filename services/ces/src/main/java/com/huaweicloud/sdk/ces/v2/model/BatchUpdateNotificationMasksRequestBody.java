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
 * 通知屏蔽信请求体
 */
public class BatchUpdateNotificationMasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

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
    @JsonProperty(value = "mask_type")

    private MaskType maskType;

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
    @JsonProperty(value = "effective_timezone")

    private String effectiveTimezone;

    public BatchUpdateNotificationMasksRequestBody withMaskName(String maskName) {
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

    public BatchUpdateNotificationMasksRequestBody withRelationType(RelationType relationType) {
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

    public BatchUpdateNotificationMasksRequestBody withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * 关联编号，relation_type为ALARM_RULE时填屏蔽的告警规则ID；relation_type为RESOURCE_POLICY_NOTIFICATION、RESOURCE_POLICY_ALARM时填屏蔽的告警策略ID；
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public BatchUpdateNotificationMasksRequestBody withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 关联资源，relation_type为RESOURCE、RESOURCE_POLICY_NOTIFICATION、RESOURCE_POLICY_ALARM时填屏蔽的资源信息；
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public BatchUpdateNotificationMasksRequestBody withMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody addMetricNamesItem(String metricNamesItem) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        this.metricNames.add(metricNamesItem);
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody withMetricNames(Consumer<List<String>> metricNamesSetter) {
        if (this.metricNames == null) {
            this.metricNames = new ArrayList<>();
        }
        metricNamesSetter.accept(this.metricNames);
        return this;
    }

    /**
     * 关联指标名称，relation_type为RESOURCE可选填，不填视为对资源所有指标进行告警屏蔽
     * @return metricNames
     */
    public List<String> getMetricNames() {
        return metricNames;
    }

    public void setMetricNames(List<String> metricNames) {
        this.metricNames = metricNames;
    }

    public BatchUpdateNotificationMasksRequestBody withProductMetrics(List<ProductMetric> productMetrics) {
        this.productMetrics = productMetrics;
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody addProductMetricsItem(ProductMetric productMetricsItem) {
        if (this.productMetrics == null) {
            this.productMetrics = new ArrayList<>();
        }
        this.productMetrics.add(productMetricsItem);
        return this;
    }

    public BatchUpdateNotificationMasksRequestBody withProductMetrics(
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

    public BatchUpdateNotificationMasksRequestBody withResourceLevel(ResourceLevelEnum resourceLevel) {
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

    public BatchUpdateNotificationMasksRequestBody withProductName(String productName) {
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

    public BatchUpdateNotificationMasksRequestBody withMaskType(MaskType maskType) {
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

    public BatchUpdateNotificationMasksRequestBody withStartDate(LocalDate startDate) {
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

    public BatchUpdateNotificationMasksRequestBody withStartTime(String startTime) {
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

    public BatchUpdateNotificationMasksRequestBody withEndDate(LocalDate endDate) {
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

    public BatchUpdateNotificationMasksRequestBody withEndTime(String endTime) {
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

    public BatchUpdateNotificationMasksRequestBody withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\"
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateNotificationMasksRequestBody that = (BatchUpdateNotificationMasksRequestBody) obj;
        return Objects.equals(this.maskName, that.maskName) && Objects.equals(this.relationType, that.relationType)
            && Objects.equals(this.relationIds, that.relationIds) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.metricNames, that.metricNames)
            && Objects.equals(this.productMetrics, that.productMetrics)
            && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.maskType, that.maskType)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endDate, that.endDate) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maskName,
            relationType,
            relationIds,
            resources,
            metricNames,
            productMetrics,
            resourceLevel,
            productName,
            maskType,
            startDate,
            startTime,
            endDate,
            endTime,
            effectiveTimezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateNotificationMasksRequestBody {\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    metricNames: ").append(toIndentedString(metricNames)).append("\n");
        sb.append("    productMetrics: ").append(toIndentedString(productMetrics)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    maskType: ").append(toIndentedString(maskType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
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
