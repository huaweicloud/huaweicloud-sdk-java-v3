package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OneResourceGroupResp
 */
public class OneResourceGroupResp {

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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 资源添加/匹配方式，取值只能为EPS（匹配企业项目）,TAG（匹配标签）,NAME（匹配实例名称）, COMB（组合匹配）,Manual（手动添加）
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

    /**
     * 指标告警状态，取值为health（告警中）、unhealthy（已触发）、no_alarm_rule（未设置告警规则）
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
     * 事件告警状态，取值为health（告警中）、unhealthy（已触发）、no_alarm_rule（未设置告警规则）
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

    private OneResourceGroupRespResourceStatistics resourceStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_ep_ids")

    private List<String> relatedEpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_alarm_templates")

    private List<AssociationAlarmTemplate> associationAlarmTemplates = null;

    public OneResourceGroupResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public OneResourceGroupResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public OneResourceGroupResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源分组的创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public OneResourceGroupResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 资源分组归属企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public OneResourceGroupResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源添加/匹配方式，取值只能为EPS（匹配企业项目）,TAG（匹配标签）,NAME（匹配实例名称）, COMB（组合匹配）,Manual（手动添加）
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public OneResourceGroupResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 指标告警状态，取值为health（告警中）、unhealthy（已触发）、no_alarm_rule（未设置告警规则）
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OneResourceGroupResp withEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }

    /**
     * 事件告警状态，取值为health（告警中）、unhealthy（已触发）、no_alarm_rule（未设置告警规则）
     * @return eventStatus
     */
    public EventStatusEnum getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
    }

    public OneResourceGroupResp withResourceStatistics(OneResourceGroupRespResourceStatistics resourceStatistics) {
        this.resourceStatistics = resourceStatistics;
        return this;
    }

    public OneResourceGroupResp withResourceStatistics(
        Consumer<OneResourceGroupRespResourceStatistics> resourceStatisticsSetter) {
        if (this.resourceStatistics == null) {
            this.resourceStatistics = new OneResourceGroupRespResourceStatistics();
            resourceStatisticsSetter.accept(this.resourceStatistics);
        }

        return this;
    }

    /**
     * Get resourceStatistics
     * @return resourceStatistics
     */
    public OneResourceGroupRespResourceStatistics getResourceStatistics() {
        return resourceStatistics;
    }

    public void setResourceStatistics(OneResourceGroupRespResourceStatistics resourceStatistics) {
        this.resourceStatistics = resourceStatistics;
    }

    public OneResourceGroupResp withRelatedEpIds(List<String> relatedEpIds) {
        this.relatedEpIds = relatedEpIds;
        return this;
    }

    public OneResourceGroupResp addRelatedEpIdsItem(String relatedEpIdsItem) {
        if (this.relatedEpIds == null) {
            this.relatedEpIds = new ArrayList<>();
        }
        this.relatedEpIds.add(relatedEpIdsItem);
        return this;
    }

    public OneResourceGroupResp withRelatedEpIds(Consumer<List<String>> relatedEpIdsSetter) {
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

    public OneResourceGroupResp withAssociationAlarmTemplates(
        List<AssociationAlarmTemplate> associationAlarmTemplates) {
        this.associationAlarmTemplates = associationAlarmTemplates;
        return this;
    }

    public OneResourceGroupResp addAssociationAlarmTemplatesItem(
        AssociationAlarmTemplate associationAlarmTemplatesItem) {
        if (this.associationAlarmTemplates == null) {
            this.associationAlarmTemplates = new ArrayList<>();
        }
        this.associationAlarmTemplates.add(associationAlarmTemplatesItem);
        return this;
    }

    public OneResourceGroupResp withAssociationAlarmTemplates(
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
        OneResourceGroupResp that = (OneResourceGroupResp) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.eventStatus, that.eventStatus)
            && Objects.equals(this.resourceStatistics, that.resourceStatistics)
            && Objects.equals(this.relatedEpIds, that.relatedEpIds)
            && Objects.equals(this.associationAlarmTemplates, that.associationAlarmTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            groupId,
            createTime,
            enterpriseProjectId,
            type,
            status,
            eventStatus,
            resourceStatistics,
            relatedEpIds,
            associationAlarmTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OneResourceGroupResp {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
        sb.append("    resourceStatistics: ").append(toIndentedString(resourceStatistics)).append("\n");
        sb.append("    relatedEpIds: ").append(toIndentedString(relatedEpIds)).append("\n");
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
