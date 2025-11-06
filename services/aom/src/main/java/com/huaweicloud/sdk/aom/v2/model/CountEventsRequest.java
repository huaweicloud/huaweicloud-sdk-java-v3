package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CountEventsRequest {

    /**
     * 查询类型： - active_alert：代表查询活动告警 - history_alert代表查询历史告警。  不传或者传其他值，则返回指定查询条件的所有信息。
     */
    public static final class TypeEnum {

        /**
         * Enum HISTORY_ALERT for value: "history_alert"
         */
        public static final TypeEnum HISTORY_ALERT = new TypeEnum("history_alert");

        /**
         * Enum ACTIVE_ALERT for value: "active_alert"
         */
        public static final TypeEnum ACTIVE_ALERT = new TypeEnum("active_alert");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("history_alert", HISTORY_ALERT);
            map.put("active_alert", ACTIVE_ALERT);
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
    @JsonProperty(value = "body")

    private EventQueryParam body;

    public CountEventsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 查询类型： - active_alert：代表查询活动告警 - history_alert代表查询历史告警。  不传或者传其他值，则返回指定查询条件的所有信息。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CountEventsRequest withBody(EventQueryParam body) {
        this.body = body;
        return this;
    }

    public CountEventsRequest withBody(Consumer<EventQueryParam> bodySetter) {
        if (this.body == null) {
            this.body = new EventQueryParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EventQueryParam getBody() {
        return body;
    }

    public void setBody(EventQueryParam body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountEventsRequest that = (CountEventsRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountEventsRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
