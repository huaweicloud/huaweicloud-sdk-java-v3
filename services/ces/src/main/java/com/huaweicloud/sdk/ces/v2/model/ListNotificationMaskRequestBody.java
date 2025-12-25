package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListNotificationMaskRequestBody
 */
public class ListNotificationMaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private ListRelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private List<String> alarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    /**
     * **参数解释**： 资源层级。 **约束限制**： 不涉及。 **取值范围**： - product: 云产品   - dimension: 子维度 **默认取值**： 不涉及。 
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
    @JsonProperty(value = "mask_id")

    private String maskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    /**
     * **参数解释**： 屏蔽状态,可选。 **约束限制**： 不涉及。 **取值范围**： - MASK_EFFECTIVE：已生效。 - MASK_INEFFECTIVE：未生效。 **默认取值**： 不涉及。 
     */
    public static final class MaskStatusEnum {

        /**
         * Enum MASK_EFFECTIVE for value: "MASK_EFFECTIVE"
         */
        public static final MaskStatusEnum MASK_EFFECTIVE = new MaskStatusEnum("MASK_EFFECTIVE");

        /**
         * Enum MASK_INEFFECTIVE for value: "MASK_INEFFECTIVE"
         */
        public static final MaskStatusEnum MASK_INEFFECTIVE = new MaskStatusEnum("MASK_INEFFECTIVE");

        private static final Map<String, MaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MaskStatusEnum> createStaticFields() {
            Map<String, MaskStatusEnum> map = new HashMap<>();
            map.put("MASK_EFFECTIVE", MASK_EFFECTIVE);
            map.put("MASK_INEFFECTIVE", MASK_INEFFECTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MaskStatusEnum(String value) {
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
        public static MaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskStatusEnum(value));
        }

        public static MaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MaskStatusEnum) {
                return this.value.equals(((MaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_status")

    private MaskStatusEnum maskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<ResourceDimension> dimensions = null;

    public ListNotificationMaskRequestBody withRelationType(ListRelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get relationType
     * @return relationType
     */
    public ListRelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(ListRelationType relationType) {
        this.relationType = relationType;
    }

    public ListNotificationMaskRequestBody withAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    public ListNotificationMaskRequestBody addAlarmIdsItem(String alarmIdsItem) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        this.alarmIds.add(alarmIdsItem);
        return this;
    }

    public ListNotificationMaskRequestBody withAlarmIds(Consumer<List<String>> alarmIdsSetter) {
        if (this.alarmIds == null) {
            this.alarmIds = new ArrayList<>();
        }
        alarmIdsSetter.accept(this.alarmIds);
        return this;
    }

    /**
     * **参数解释**： 告警规则ID列表，用于查询对应的告警通知屏蔽。 **约束限制**： 当relation_type为ALARM_RULE、RESOURCE_POLICY_NOTIFICATION时，应通过alarm_ids查询。当relation_type为RESOURCE、EVENT.SYS时，不支持使用alarm_ids查询，此时alarm_ids为空或不选，表示查询所有的RESOURCE、EVENT.SYS类型的告警屏蔽。 **取值范围**： 包含的告警规则ID数量最多不超过100个，最少为0个。 **默认取值**： 不涉及 
     * @return alarmIds
     */
    public List<String> getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(List<String> alarmIds) {
        this.alarmIds = alarmIds;
    }

    public ListNotificationMaskRequestBody withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public ListNotificationMaskRequestBody addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public ListNotificationMaskRequestBody withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * （已废弃，不推荐使用）关联编号（目前是告警规则ID）
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public ListNotificationMaskRequestBody withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**： 资源的监控指标名称，各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 必须以字母开头，只能包含0-9/a-z/A-Z/_/-。字符长度最短为1，最大为96。如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率。         **默认取值**： 不涉及。 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ListNotificationMaskRequestBody withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * **参数解释**： 资源层级。 **约束限制**： 不涉及。 **取值范围**： - product: 云产品   - dimension: 子维度 **默认取值**： 不涉及。 
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ListNotificationMaskRequestBody withMaskId(String maskId) {
        this.maskId = maskId;
        return this;
    }

    /**
     * **参数解释**： 屏蔽规则ID,可选。 **约束限制**： 不涉及。 **取值范围**： 以nm开头，后跟[0,62]个英文或数字。 **默认取值**： 不涉及。 
     * @return maskId
     */
    public String getMaskId() {
        return maskId;
    }

    public void setMaskId(String maskId) {
        this.maskId = maskId;
    }

    public ListNotificationMaskRequestBody withMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }

    /**
     * **参数解释**： 屏蔽规则名称,可选。 **约束限制**： 不涉及。 **取值范围**： 只能为字母、数字、汉字、-、_，长度为[1,64]个字符。 **默认取值**： 不涉及。 
     * @return maskName
     */
    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }

    public ListNotificationMaskRequestBody withMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
        return this;
    }

    /**
     * **参数解释**： 屏蔽状态,可选。 **约束限制**： 不涉及。 **取值范围**： - MASK_EFFECTIVE：已生效。 - MASK_INEFFECTIVE：未生效。 **默认取值**： 不涉及。 
     * @return maskStatus
     */
    public MaskStatusEnum getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
    }

    public ListNotificationMaskRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 资源维度值,提供一个维度的资源ID即可,可选 **约束限制**： 不涉及。 **取值范围**： 长度为[1,700]个字符。 **默认取值**： 不涉及。 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListNotificationMaskRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListNotificationMaskRequestBody withDimensions(List<ResourceDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ListNotificationMaskRequestBody addDimensionsItem(ResourceDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ListNotificationMaskRequestBody withDimensions(Consumer<List<ResourceDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * **参数解释**： 资源的维度信息 **约束限制**： 包含的维度信息数量为[1,4]个。 
     * @return dimensions
     */
    public List<ResourceDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<ResourceDimension> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMaskRequestBody that = (ListNotificationMaskRequestBody) obj;
        return Objects.equals(this.relationType, that.relationType) && Objects.equals(this.alarmIds, that.alarmIds)
            && Objects.equals(this.relationIds, that.relationIds) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.resourceLevel, that.resourceLevel) && Objects.equals(this.maskId, that.maskId)
            && Objects.equals(this.maskName, that.maskName) && Objects.equals(this.maskStatus, that.maskStatus)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationType,
            alarmIds,
            relationIds,
            metricName,
            resourceLevel,
            maskId,
            maskName,
            maskStatus,
            resourceId,
            namespace,
            dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMaskRequestBody {\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    maskId: ").append(toIndentedString(maskId)).append("\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    maskStatus: ").append(toIndentedString(maskStatus)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
