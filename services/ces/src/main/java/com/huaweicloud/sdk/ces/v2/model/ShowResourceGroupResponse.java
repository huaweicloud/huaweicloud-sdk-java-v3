package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * **参数解释** 资源添加/匹配方式。 **取值范围** 枚举值。 - EPS: 匹配企业项目 - TAG: 匹配标签 - NAME: 匹配实例名称 - COMB: 组合匹配 - Manual: 手动添加 
     */
    public static final class TypeEnum {

        /**
         * Enum EPS for value: "EPS"
         */
        public static final TypeEnum EPS = new TypeEnum("EPS");

        /**
         * Enum TAG for value: "TAG"
         */
        public static final TypeEnum TAG = new TypeEnum("TAG");

        /**
         * Enum NAME for value: "NAME"
         */
        public static final TypeEnum NAME = new TypeEnum("NAME");

        /**
         * Enum COMB for value: "COMB"
         */
        public static final TypeEnum COMB = new TypeEnum("COMB");

        /**
         * Enum MANUAL for value: "Manual"
         */
        public static final TypeEnum MANUAL = new TypeEnum("Manual");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("EPS", EPS);
            map.put("TAG", TAG);
            map.put("NAME", NAME);
            map.put("COMB", COMB);
            map.put("Manual", MANUAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_ep_ids")

    private List<String> associationEpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<Instance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comb_relation")

    private CombRelation combRelation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_ep_ids")

    private List<String> relatedEpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id_and_tags")

    private List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags = null;

    /**
     * **参数解释** 指标告警状态。 **取值范围** 枚举值。 - health: 告警中 - unhealthy: 已触发 - no_alarm_rule: 未设置告警规则 
     */
    public static final class StatusEnum {

        /**
         * Enum HEALTH for value: "health"
         */
        public static final StatusEnum HEALTH = new StatusEnum("health");

        /**
         * Enum UNHEALTHY for value: "unhealthy"
         */
        public static final StatusEnum UNHEALTHY = new StatusEnum("unhealthy");

        /**
         * Enum NO_ALARM_RULE for value: "no_alarm_rule"
         */
        public static final StatusEnum NO_ALARM_RULE = new StatusEnum("no_alarm_rule");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("health", HEALTH);
            map.put("unhealthy", UNHEALTHY);
            map.put("no_alarm_rule", NO_ALARM_RULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    /**
     * **参数解释** 事件告警状态。 **取值范围** 枚举值。 - health: 告警中 - unhealthy: 已触发 - no_alarm_rule: 未设置告警规则 
     */
    public static final class EventStatusEnum {

        /**
         * Enum HEALTH for value: "health"
         */
        public static final EventStatusEnum HEALTH = new EventStatusEnum("health");

        /**
         * Enum UNHEALTHY for value: "unhealthy"
         */
        public static final EventStatusEnum UNHEALTHY = new EventStatusEnum("unhealthy");

        /**
         * Enum NO_ALARM_RULE for value: "no_alarm_rule"
         */
        public static final EventStatusEnum NO_ALARM_RULE = new EventStatusEnum("no_alarm_rule");

        private static final Map<String, EventStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventStatusEnum> createStaticFields() {
            Map<String, EventStatusEnum> map = new HashMap<>();
            map.put("health", HEALTH);
            map.put("unhealthy", UNHEALTHY);
            map.put("no_alarm_rule", NO_ALARM_RULE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventStatusEnum(String value) {
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
        public static EventStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventStatusEnum(value));
        }

        public static EventStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventStatusEnum) {
                return this.value.equals(((EventStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_status")

    private EventStatusEnum eventStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_statistics")

    private GetResourceGroupRespResourceStatistics resourceStatistics;

    /**
     * **参数解释** 资源等级。 **取值范围** 枚举值。 - product: 云产品 - dimension: 子维度 
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
    @JsonProperty(value = "product_names")

    private String productNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_resource_statistics")

    private List<EpResourceStatistics> epResourceStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_alarm_templates")

    private List<AssociationAlarmTemplate> associationAlarmTemplates = null;

    public ShowResourceGroupResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释** 资源分组的名称。 **取值范围** 只能为字母、数字、汉字、-或_，长度为[1,128]个字符。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowResourceGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 资源分组ID。 **取值范围**： 以rg开头，后跟22位由字母或数字组成的字符串。长度为[2,24]个字符。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowResourceGroupResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 资源分组的创建时间 **取值范围**： 不涉及。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowResourceGroupResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 资源分组的修改时间 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowResourceGroupResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 资源分组归属企业项目ID。 **取值范围** 由数字、字母和-组成，或者为0（默认企业项目ID）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowResourceGroupResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 资源添加/匹配方式。 **取值范围** 枚举值。 - EPS: 匹配企业项目 - TAG: 匹配标签 - NAME: 匹配实例名称 - COMB: 组合匹配 - Manual: 手动添加 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowResourceGroupResponse withAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
        return this;
    }

    public ShowResourceGroupResponse addAssociationEpIdsItem(String associationEpIdsItem) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        this.associationEpIds.add(associationEpIdsItem);
        return this;
    }

    public ShowResourceGroupResponse withAssociationEpIds(Consumer<List<String>> associationEpIdsSetter) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        associationEpIdsSetter.accept(this.associationEpIds);
        return this;
    }

    /**
     * 该资源分组内包含的资源来源的企业项目ID，type为EPS时必传
     * @return associationEpIds
     */
    public List<String> getAssociationEpIds() {
        return associationEpIds;
    }

    public void setAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
    }

    public ShowResourceGroupResponse withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceGroupResponse addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowResourceGroupResponse withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 当资源匹配规则为匹配标签时,所指定的标签规则
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    public ShowResourceGroupResponse withInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    public ShowResourceGroupResponse addInstancesItem(Instance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ShowResourceGroupResponse withInstances(Consumer<List<Instance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例名称匹配参数
     * @return instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public ShowResourceGroupResponse withCombRelation(CombRelation combRelation) {
        this.combRelation = combRelation;
        return this;
    }

    public ShowResourceGroupResponse withCombRelation(Consumer<CombRelation> combRelationSetter) {
        if (this.combRelation == null) {
            this.combRelation = new CombRelation();
            combRelationSetter.accept(this.combRelation);
        }

        return this;
    }

    /**
     * Get combRelation
     * @return combRelation
     */
    public CombRelation getCombRelation() {
        return combRelation;
    }

    public void setCombRelation(CombRelation combRelation) {
        this.combRelation = combRelation;
    }

    public ShowResourceGroupResponse withRelatedEpIds(List<String> relatedEpIds) {
        this.relatedEpIds = relatedEpIds;
        return this;
    }

    public ShowResourceGroupResponse addRelatedEpIdsItem(String relatedEpIdsItem) {
        if (this.relatedEpIds == null) {
            this.relatedEpIds = new ArrayList<>();
        }
        this.relatedEpIds.add(relatedEpIdsItem);
        return this;
    }

    public ShowResourceGroupResponse withRelatedEpIds(Consumer<List<String>> relatedEpIdsSetter) {
        if (this.relatedEpIds == null) {
            this.relatedEpIds = new ArrayList<>();
        }
        relatedEpIdsSetter.accept(this.relatedEpIds);
        return this;
    }

    /**
     * 当资源匹配规则为匹配企业项目时，指定的企业项目列表
     * @return relatedEpIds
     */
    public List<String> getRelatedEpIds() {
        return relatedEpIds;
    }

    public void setRelatedEpIds(List<String> relatedEpIds) {
        this.relatedEpIds = relatedEpIds;
    }

    public ShowResourceGroupResponse withEnterpriseProjectIdAndTags(
        List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
        return this;
    }

    public ShowResourceGroupResponse addEnterpriseProjectIdAndTagsItem(
        EnterpriseProjectIdAndTags enterpriseProjectIdAndTagsItem) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        this.enterpriseProjectIdAndTags.add(enterpriseProjectIdAndTagsItem);
        return this;
    }

    public ShowResourceGroupResponse withEnterpriseProjectIdAndTags(
        Consumer<List<EnterpriseProjectIdAndTags>> enterpriseProjectIdAndTagsSetter) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        enterpriseProjectIdAndTagsSetter.accept(this.enterpriseProjectIdAndTags);
        return this;
    }

    /**
     * 匹配企业项目或匹配标签参数
     * @return enterpriseProjectIdAndTags
     */
    public List<EnterpriseProjectIdAndTags> getEnterpriseProjectIdAndTags() {
        return enterpriseProjectIdAndTags;
    }

    public void setEnterpriseProjectIdAndTags(List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
    }

    public ShowResourceGroupResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 指标告警状态。 **取值范围** 枚举值。 - health: 告警中 - unhealthy: 已触发 - no_alarm_rule: 未设置告警规则 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowResourceGroupResponse withEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }

    /**
     * **参数解释** 事件告警状态。 **取值范围** 枚举值。 - health: 告警中 - unhealthy: 已触发 - no_alarm_rule: 未设置告警规则 
     * @return eventStatus
     */
    public EventStatusEnum getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
    }

    public ShowResourceGroupResponse withResourceStatistics(GetResourceGroupRespResourceStatistics resourceStatistics) {
        this.resourceStatistics = resourceStatistics;
        return this;
    }

    public ShowResourceGroupResponse withResourceStatistics(
        Consumer<GetResourceGroupRespResourceStatistics> resourceStatisticsSetter) {
        if (this.resourceStatistics == null) {
            this.resourceStatistics = new GetResourceGroupRespResourceStatistics();
            resourceStatisticsSetter.accept(this.resourceStatistics);
        }

        return this;
    }

    /**
     * Get resourceStatistics
     * @return resourceStatistics
     */
    public GetResourceGroupRespResourceStatistics getResourceStatistics() {
        return resourceStatistics;
    }

    public void setResourceStatistics(GetResourceGroupRespResourceStatistics resourceStatistics) {
        this.resourceStatistics = resourceStatistics;
    }

    public ShowResourceGroupResponse withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * **参数解释** 资源等级。 **取值范围** 枚举值。 - product: 云产品 - dimension: 子维度 
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ShowResourceGroupResponse withProductNames(String productNames) {
        this.productNames = productNames;
        return this;
    }

    /**
     * **参数解释** 创建资源层级为云产品时的云产品名称，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"。多个云产品则用“;”隔开，如\"SERVICE.BMS,instance_id;SYS.ECS,instance_id\"。 **取值范围** 长度[0,10240]个字符 
     * @return productNames
     */
    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public ShowResourceGroupResponse withEpResourceStatistics(List<EpResourceStatistics> epResourceStatistics) {
        this.epResourceStatistics = epResourceStatistics;
        return this;
    }

    public ShowResourceGroupResponse addEpResourceStatisticsItem(EpResourceStatistics epResourceStatisticsItem) {
        if (this.epResourceStatistics == null) {
            this.epResourceStatistics = new ArrayList<>();
        }
        this.epResourceStatistics.add(epResourceStatisticsItem);
        return this;
    }

    public ShowResourceGroupResponse withEpResourceStatistics(
        Consumer<List<EpResourceStatistics>> epResourceStatisticsSetter) {
        if (this.epResourceStatistics == null) {
            this.epResourceStatistics = new ArrayList<>();
        }
        epResourceStatisticsSetter.accept(this.epResourceStatistics);
        return this;
    }

    /**
     * 每个企业项目关联的资源状态
     * @return epResourceStatistics
     */
    public List<EpResourceStatistics> getEpResourceStatistics() {
        return epResourceStatistics;
    }

    public void setEpResourceStatistics(List<EpResourceStatistics> epResourceStatistics) {
        this.epResourceStatistics = epResourceStatistics;
    }

    public ShowResourceGroupResponse withAssociationAlarmTemplates(
        List<AssociationAlarmTemplate> associationAlarmTemplates) {
        this.associationAlarmTemplates = associationAlarmTemplates;
        return this;
    }

    public ShowResourceGroupResponse addAssociationAlarmTemplatesItem(
        AssociationAlarmTemplate associationAlarmTemplatesItem) {
        if (this.associationAlarmTemplates == null) {
            this.associationAlarmTemplates = new ArrayList<>();
        }
        this.associationAlarmTemplates.add(associationAlarmTemplatesItem);
        return this;
    }

    public ShowResourceGroupResponse withAssociationAlarmTemplates(
        Consumer<List<AssociationAlarmTemplate>> associationAlarmTemplatesSetter) {
        if (this.associationAlarmTemplates == null) {
            this.associationAlarmTemplates = new ArrayList<>();
        }
        associationAlarmTemplatesSetter.accept(this.associationAlarmTemplates);
        return this;
    }

    /**
     * 关联的告警模板列表
     * @return associationAlarmTemplates
     */
    public List<AssociationAlarmTemplate> getAssociationAlarmTemplates() {
        return associationAlarmTemplates;
    }

    public void setAssociationAlarmTemplates(List<AssociationAlarmTemplate> associationAlarmTemplates) {
        this.associationAlarmTemplates = associationAlarmTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceGroupResponse that = (ShowResourceGroupResponse) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.associationEpIds, that.associationEpIds)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.instances, that.instances)
            && Objects.equals(this.combRelation, that.combRelation)
            && Objects.equals(this.relatedEpIds, that.relatedEpIds)
            && Objects.equals(this.enterpriseProjectIdAndTags, that.enterpriseProjectIdAndTags)
            && Objects.equals(this.status, that.status) && Objects.equals(this.eventStatus, that.eventStatus)
            && Objects.equals(this.resourceStatistics, that.resourceStatistics)
            && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.productNames, that.productNames)
            && Objects.equals(this.epResourceStatistics, that.epResourceStatistics)
            && Objects.equals(this.associationAlarmTemplates, that.associationAlarmTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            groupId,
            createTime,
            updateTime,
            enterpriseProjectId,
            type,
            associationEpIds,
            tags,
            instances,
            combRelation,
            relatedEpIds,
            enterpriseProjectIdAndTags,
            status,
            eventStatus,
            resourceStatistics,
            resourceLevel,
            productNames,
            epResourceStatistics,
            associationAlarmTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceGroupResponse {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    associationEpIds: ").append(toIndentedString(associationEpIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    combRelation: ").append(toIndentedString(combRelation)).append("\n");
        sb.append("    relatedEpIds: ").append(toIndentedString(relatedEpIds)).append("\n");
        sb.append("    enterpriseProjectIdAndTags: ").append(toIndentedString(enterpriseProjectIdAndTags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
        sb.append("    resourceStatistics: ").append(toIndentedString(resourceStatistics)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    productNames: ").append(toIndentedString(productNames)).append("\n");
        sb.append("    epResourceStatistics: ").append(toIndentedString(epResourceStatistics)).append("\n");
        sb.append("    associationAlarmTemplates: ").append(toIndentedString(associationAlarmTemplates)).append("\n");
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
