package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ListEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 事件级别，值为critical为紧急，major为重要，minor为次要，info为提示
     */
    public static final class EventLevelEnum {

        /**
         * Enum CRITICAL for value: "critical"
         */
        public static final EventLevelEnum CRITICAL = new EventLevelEnum("critical");

        /**
         * Enum MAJOR for value: "major"
         */
        public static final EventLevelEnum MAJOR = new EventLevelEnum("major");

        /**
         * Enum MINOR for value: "minor"
         */
        public static final EventLevelEnum MINOR = new EventLevelEnum("minor");

        /**
         * Enum INFO for value: "info"
         */
        public static final EventLevelEnum INFO = new EventLevelEnum("info");

        private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventLevelEnum> createStaticFields() {
            Map<String, EventLevelEnum> map = new HashMap<>();
            map.put("critical", CRITICAL);
            map.put("major", MAJOR);
            map.put("minor", MINOR);
            map.put("info", INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventLevelEnum(String value) {
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
        public static EventLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventLevelEnum(value));
        }

        public static EventLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventLevelEnum) {
                return this.value.equals(((EventLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_level")

    private EventLevelEnum eventLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    public ListEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页游标
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEventsRequest withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    /**
     * 事件级别，值为critical为紧急，major为重要，minor为次要，info为提示
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public ListEventsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 告警资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListEventsRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 查询开始时间，格式为时间戳（毫秒），from 必须小于 to，且查询时间范围最大不超过30天。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListEventsRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 查询截止时间，格式为时间戳（毫秒），from 必须小于 to，且查询时间范围最大不超过30天。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEventsRequest that = (ListEventsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.eventLevel, that.eventLevel) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, eventLevel, resourceId, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
