package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 通过事件数据发现事件模型的请求
 */
public class DiscoverEventSchemaFromDataReq {

    /**
     * 事件模型格式类型
     */
    public static final class FormatEnum {

        /**
         * Enum JSON_SCHEMA_DRAFT_6 for value: "JSON_SCHEMA_DRAFT_6"
         */
        public static final FormatEnum JSON_SCHEMA_DRAFT_6 = new FormatEnum("JSON_SCHEMA_DRAFT_6");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("JSON_SCHEMA_DRAFT_6", JSON_SCHEMA_DRAFT_6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private String event;

    public DiscoverEventSchemaFromDataReq withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 事件模型格式类型
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public DiscoverEventSchemaFromDataReq withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * 事件数据内容
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscoverEventSchemaFromDataReq discoverEventSchemaFromDataReq = (DiscoverEventSchemaFromDataReq) o;
        return Objects.equals(this.format, discoverEventSchemaFromDataReq.format)
            && Objects.equals(this.event, discoverEventSchemaFromDataReq.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, event);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscoverEventSchemaFromDataReq {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
