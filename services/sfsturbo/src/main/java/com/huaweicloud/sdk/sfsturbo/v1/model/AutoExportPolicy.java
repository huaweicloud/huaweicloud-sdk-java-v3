package com.huaweicloud.sdk.sfsturbo.v1.model;

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
 * 后端存储自动导出策略，SFS Turbo会以异步方式导出到OBS。
 */
public class AutoExportPolicy {

    /**
     * 后端存储自动导出到OBS桶的数据更新类型。
     */
    public static final class EventsEnum {

        /**
         * Enum NEW for value: "NEW"
         */
        public static final EventsEnum NEW = new EventsEnum("NEW");

        /**
         * Enum CHANGED for value: "CHANGED"
         */
        public static final EventsEnum CHANGED = new EventsEnum("CHANGED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final EventsEnum DELETED = new EventsEnum("DELETED");

        private static final Map<String, EventsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventsEnum> createStaticFields() {
            Map<String, EventsEnum> map = new HashMap<>();
            map.put("NEW", NEW);
            map.put("CHANGED", CHANGED);
            map.put("DELETED", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventsEnum(String value) {
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
        public static EventsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventsEnum(value));
        }

        public static EventsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventsEnum) {
                return this.value.equals(((EventsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<EventsEnum> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix")

    private String suffix;

    public AutoExportPolicy withEvents(List<EventsEnum> events) {
        this.events = events;
        return this;
    }

    public AutoExportPolicy addEventsItem(EventsEnum eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public AutoExportPolicy withEvents(Consumer<List<EventsEnum>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 后端存储自动导出到OBS桶的数据更新类型。 - NEW：表示新增数据，SFS Turbo联动目录下创建的文件，及之后对这些文件进行的元数据和数据修改，会被自动同步到OBS桶里。 - CHANGED：表示修改数据，从OBS桶里导入到SFS Turbo联动目录下的文件，在SFS Turbo上对这些文件所进行的数据和元数据的修改，会被自动同步到OBS桶里。 - DELETED：表示删除数据，在SFS Turbo联动目录下删除文件，OBS桶对应的对象也会被删除，只有被SFS Turbo写入的OBS对象才会被删除。 
     * @return events
     */
    public List<EventsEnum> getEvents() {
        return events;
    }

    public void setEvents(List<EventsEnum> events) {
        this.events = events;
    }

    public AutoExportPolicy withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 后端存储内对象匹配前缀
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public AutoExportPolicy withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * 后端存储内对象匹配后缀
     * @return suffix
     */
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoExportPolicy that = (AutoExportPolicy) obj;
        return Objects.equals(this.events, that.events) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.suffix, that.suffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, prefix, suffix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoExportPolicy {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
