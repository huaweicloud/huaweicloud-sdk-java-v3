package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** This is a auto create Body Object */
public class Follow302StatusRequest {

    /** follow302状态（\"off\"/\"on\"） */
    public static final class Follow302StatusEnum {

        /** Enum OFF for value: "off" */
        public static final Follow302StatusEnum OFF = new Follow302StatusEnum("off");

        /** Enum ON for value: "on" */
        public static final Follow302StatusEnum ON = new Follow302StatusEnum("on");

        private static final Map<String, Follow302StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Follow302StatusEnum> createStaticFields() {
            Map<String, Follow302StatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Follow302StatusEnum(String value) {
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
        public static Follow302StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            Follow302StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new Follow302StatusEnum(value);
            }
            return result;
        }

        public static Follow302StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            Follow302StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Follow302StatusEnum) {
                return this.value.equals(((Follow302StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow302_status")

    private Follow302StatusEnum follow302Status;

    public Follow302StatusRequest withFollow302Status(Follow302StatusEnum follow302Status) {
        this.follow302Status = follow302Status;
        return this;
    }

    /** follow302状态（\"off\"/\"on\"）
     * 
     * @return follow302Status */
    public Follow302StatusEnum getFollow302Status() {
        return follow302Status;
    }

    public void setFollow302Status(Follow302StatusEnum follow302Status) {
        this.follow302Status = follow302Status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Follow302StatusRequest follow302StatusRequest = (Follow302StatusRequest) o;
        return Objects.equals(this.follow302Status, follow302StatusRequest.follow302Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(follow302Status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Follow302StatusRequest {\n");
        sb.append("    follow302Status: ").append(toIndentedString(follow302Status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
