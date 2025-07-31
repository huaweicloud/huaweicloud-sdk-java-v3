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
 * GetResourceGroupResources
 */
public class GetResourceGroupResources {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<ResourceDimension> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

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
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public GetResourceGroupResources withStatus(StatusEnum status) {
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

    public GetResourceGroupResources withDimensions(List<ResourceDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public GetResourceGroupResources addDimensionsItem(ResourceDimension dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public GetResourceGroupResources withDimensions(Consumer<List<ResourceDimension>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 资源的维度信息
     * @return dimensions
     */
    public List<ResourceDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<ResourceDimension> dimensions) {
        this.dimensions = dimensions;
    }

    public GetResourceGroupResources withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 资源的tag信息,格式为key/value的json字符串,样例为\"{\\\"sss\\\":\\\"aaa\\\"}\"
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public GetResourceGroupResources withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public GetResourceGroupResources withEventStatus(EventStatusEnum eventStatus) {
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

    public GetResourceGroupResources withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetResourceGroupResources that = (GetResourceGroupResources) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.dimensions, that.dimensions)
            && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.eventStatus, that.eventStatus)
            && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, dimensions, tags, enterpriseProjectId, eventStatus, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetResourceGroupResources {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
