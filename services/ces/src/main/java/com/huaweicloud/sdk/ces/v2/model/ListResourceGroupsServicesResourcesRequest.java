package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListResourceGroupsServicesResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_name")

    private String dimName;

    /**
     * **参数解释** 告警规则按状态信息进行过滤。 **约束限制**： 不涉及。 **取值范围** 枚举值。 - health: 已设置告警规则且无告警触发的资源 - unhealthy: 已设置告警规则且有告警触发的资源 - no_alarm_rule: 未设置告警规则的资源 **默认取值**： 不涉及。 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_value")

    private String dimValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_relation_id")

    private String extendRelationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * **参数解释** 按事件告警状态信息进行过滤。 **约束限制**： 不涉及。 **取值范围** 枚举值。 - health: 已设置事件告警规则且无事件告警触发的资源 - unhealthy: 已设置事件告警规则且有事件告警触发的资源 - no_alarm_rule: 未设置事件告警规则的资源 **默认取值**： 不涉及。 
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

    public ListResourceGroupsServicesResourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量 **约束限制**： 不涉及 **取值范围**： 整数，[0,10000] **默认取值**： 0 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListResourceGroupsServicesResourcesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页大小。 **约束限制**： 不涉及。 **取值范围**： 大小为1-100。 **默认取值**： 不涉及。 
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListResourceGroupsServicesResourcesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释** 资源分组ID。 **约束限制** 不涉及 **取值范围** 以\"rg\"开头，后面跟着22个字母或数字 **默认取值** 不涉及 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListResourceGroupsServicesResourcesRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * **参数解释** 服务类别，如SYS.ECS **约束限制** 不涉及 **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度在 [3,32]个字符之间 **默认取值** 不涉及
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ListResourceGroupsServicesResourcesRequest withDimName(String dimName) {
        this.dimName = dimName;
        return this;
    }

    /**
     * **参数解释**： 资源维度。 **约束限制**： 不涉及。 **取值范围**： 多维度用\",\"分割，只能包含0-9、a-z、A-Z、_、-、#、/、(、），每个维度的最大长度为32。字符串总长度最小为1，最大为131。 **默认取值**： 不涉及。 
     * @return dimName
     */
    public String getDimName() {
        return dimName;
    }

    public void setDimName(String dimName) {
        this.dimName = dimName;
    }

    public ListResourceGroupsServicesResourcesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释** 告警规则按状态信息进行过滤。 **约束限制**： 不涉及。 **取值范围** 枚举值。 - health: 已设置告警规则且无告警触发的资源 - unhealthy: 已设置告警规则且有告警触发的资源 - no_alarm_rule: 未设置告警规则的资源 **默认取值**： 不涉及。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListResourceGroupsServicesResourcesRequest withDimValue(String dimValue) {
        this.dimValue = dimValue;
        return this;
    }

    /**
     * **参数描述**： 资源维度值，不支持模糊匹配，但是多维度资源可以只指定一个维度值 **约束限制**： 不涉及。  **取值范围**： 字符串长度范围[1,1027] **默认取值**： 不涉及。 
     * @return dimValue
     */
    public String getDimValue() {
        return dimValue;
    }

    public void setDimValue(String dimValue) {
        this.dimValue = dimValue;
    }

    public ListResourceGroupsServicesResourcesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数描述**： 资源的标签信息，格式：\"[key]\":\"[value]\"，样例参考：\"ssss\":\"1111\" **约束限制**： 不涉及。  **取值范围**： 字符串长度范围[0,500] **默认取值**： 不涉及。 
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListResourceGroupsServicesResourcesRequest withExtendRelationId(String extendRelationId) {
        this.extendRelationId = extendRelationId;
        return this;
    }

    /**
     * **参数解释** 企业项目ID。 **约束限制** 不涉及。 **取值范围** 由数字、字母和-组成，字符串长度范围[1,128] **默认取值** 不涉及。 
     * @return extendRelationId
     */
    public String getExtendRelationId() {
        return extendRelationId;
    }

    public void setExtendRelationId(String extendRelationId) {
        this.extendRelationId = extendRelationId;
    }

    public ListResourceGroupsServicesResourcesRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释**： 资源所属的云产品名称，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,128]个字符。        **默认取值**： 不涉及。 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListResourceGroupsServicesResourcesRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * **参数解释** 资源名称 **约束限制** 不涉及 **取值范围** 长度[1,128]个字符 **默认取值** 不涉及 
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListResourceGroupsServicesResourcesRequest withEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }

    /**
     * **参数解释** 按事件告警状态信息进行过滤。 **约束限制**： 不涉及。 **取值范围** 枚举值。 - health: 已设置事件告警规则且无事件告警触发的资源 - unhealthy: 已设置事件告警规则且有事件告警触发的资源 - no_alarm_rule: 未设置事件告警规则的资源 **默认取值**： 不涉及。 
     * @return eventStatus
     */
    public EventStatusEnum getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceGroupsServicesResourcesRequest that = (ListResourceGroupsServicesResourcesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.service, that.service)
            && Objects.equals(this.dimName, that.dimName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dimValue, that.dimValue) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.extendRelationId, that.extendRelationId)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.eventStatus, that.eventStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            groupId,
            service,
            dimName,
            status,
            dimValue,
            tag,
            extendRelationId,
            productName,
            resourceName,
            eventStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceGroupsServicesResourcesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dimValue: ").append(toIndentedString(dimValue)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    extendRelationId: ").append(toIndentedString(extendRelationId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
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
