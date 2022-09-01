package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志接入采集Windows事件日志
 */
public class AccessConfigWindowsLogInfo {

    /**
     * Gets or Sets categorys
     */
    public static final class CategorysEnum {

        /**
         * Enum APPLICATION for value: "Application"
         */
        public static final CategorysEnum APPLICATION = new CategorysEnum("Application");

        /**
         * Enum SYSTEM for value: "System"
         */
        public static final CategorysEnum SYSTEM = new CategorysEnum("System");

        /**
         * Enum SECURITY for value: "Security"
         */
        public static final CategorysEnum SECURITY = new CategorysEnum("Security");

        /**
         * Enum SETUP for value: "Setup"
         */
        public static final CategorysEnum SETUP = new CategorysEnum("Setup");

        private static final Map<String, CategorysEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategorysEnum> createStaticFields() {
            Map<String, CategorysEnum> map = new HashMap<>();
            map.put("Application", APPLICATION);
            map.put("System", SYSTEM);
            map.put("Security", SECURITY);
            map.put("Setup", SETUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategorysEnum(String value) {
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
        public static CategorysEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CategorysEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategorysEnum(value);
            }
            return result;
        }

        public static CategorysEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CategorysEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategorysEnum) {
                return this.value.equals(((CategorysEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categorys")

    @JacksonXmlProperty(localName = "categorys")

    private List<CategorysEnum> categorys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_offset")

    @JacksonXmlProperty(localName = "time_offset")

    private AccessConfigTimeOffset timeOffset;

    /**
     * Gets or Sets eventLevel
     */
    public static final class EventLevelEnum {

        /**
         * Enum INFORMATION for value: "information"
         */
        public static final EventLevelEnum INFORMATION = new EventLevelEnum("information");

        /**
         * Enum WARNING for value: "warning"
         */
        public static final EventLevelEnum WARNING = new EventLevelEnum("warning");

        /**
         * Enum ERROR for value: "error"
         */
        public static final EventLevelEnum ERROR = new EventLevelEnum("error");

        /**
         * Enum CRITICAL for value: "critical"
         */
        public static final EventLevelEnum CRITICAL = new EventLevelEnum("critical");

        /**
         * Enum VERBOSE for value: "verbose"
         */
        public static final EventLevelEnum VERBOSE = new EventLevelEnum("verbose");

        private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventLevelEnum> createStaticFields() {
            Map<String, EventLevelEnum> map = new HashMap<>();
            map.put("information", INFORMATION);
            map.put("warning", WARNING);
            map.put("error", ERROR);
            map.put("critical", CRITICAL);
            map.put("verbose", VERBOSE);
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
            EventLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventLevelEnum(value);
            }
            return result;
        }

        public static EventLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "event_level")

    private List<EventLevelEnum> eventLevel = null;

    public AccessConfigWindowsLogInfo withCategorys(List<CategorysEnum> categorys) {
        this.categorys = categorys;
        return this;
    }

    public AccessConfigWindowsLogInfo addCategorysItem(CategorysEnum categorysItem) {
        if (this.categorys == null) {
            this.categorys = new ArrayList<>();
        }
        this.categorys.add(categorysItem);
        return this;
    }

    public AccessConfigWindowsLogInfo withCategorys(Consumer<List<CategorysEnum>> categorysSetter) {
        if (this.categorys == null) {
            this.categorys = new ArrayList<>();
        }
        categorysSetter.accept(this.categorys);
        return this;
    }

    /**
     * 采集Windows事件日志类型。Application：应用系统，System：系统，Security：安全，Setup：启动
     * @return categorys
     */
    public List<CategorysEnum> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<CategorysEnum> categorys) {
        this.categorys = categorys;
    }

    public AccessConfigWindowsLogInfo withTimeOffset(AccessConfigTimeOffset timeOffset) {
        this.timeOffset = timeOffset;
        return this;
    }

    public AccessConfigWindowsLogInfo withTimeOffset(Consumer<AccessConfigTimeOffset> timeOffsetSetter) {
        if (this.timeOffset == null) {
            this.timeOffset = new AccessConfigTimeOffset();
            timeOffsetSetter.accept(this.timeOffset);
        }

        return this;
    }

    /**
     * Get timeOffset
     * @return timeOffset
     */
    public AccessConfigTimeOffset getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(AccessConfigTimeOffset timeOffset) {
        this.timeOffset = timeOffset;
    }

    public AccessConfigWindowsLogInfo withEventLevel(List<EventLevelEnum> eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    public AccessConfigWindowsLogInfo addEventLevelItem(EventLevelEnum eventLevelItem) {
        if (this.eventLevel == null) {
            this.eventLevel = new ArrayList<>();
        }
        this.eventLevel.add(eventLevelItem);
        return this;
    }

    public AccessConfigWindowsLogInfo withEventLevel(Consumer<List<EventLevelEnum>> eventLevelSetter) {
        if (this.eventLevel == null) {
            this.eventLevel = new ArrayList<>();
        }
        eventLevelSetter.accept(this.eventLevel);
        return this;
    }

    /**
     * 事件等级。information：info，warning：告警，error：错误，critical：关键，verbose：冗长
     * @return eventLevel
     */
    public List<EventLevelEnum> getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(List<EventLevelEnum> eventLevel) {
        this.eventLevel = eventLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigWindowsLogInfo accessConfigWindowsLogInfo = (AccessConfigWindowsLogInfo) o;
        return Objects.equals(this.categorys, accessConfigWindowsLogInfo.categorys)
            && Objects.equals(this.timeOffset, accessConfigWindowsLogInfo.timeOffset)
            && Objects.equals(this.eventLevel, accessConfigWindowsLogInfo.eventLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categorys, timeOffset, eventLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigWindowsLogInfo {\n");
        sb.append("    categorys: ").append(toIndentedString(categorys)).append("\n");
        sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
        sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
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
