package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * QueueProperty
 */
public class QueueProperty {

    /**
     * 返回属性值对应的key值 computeEngine.maxInstances, 队列能启动的最大spark driver数量 computeEngine.maxPrefetchInstance, 队列预先启动的最大spark driver数量 job.maxConcurrent,单个spark driver能同时运行的最大任务数量 multipleSc.support,是否支持设置多个spark driver
     */
    public static final class KeyEnum {

        /**
         * Enum COMPUTEENGINE_MAXINSTANCES for value: "computeEngine.maxInstances"
         */
        public static final KeyEnum COMPUTEENGINE_MAXINSTANCES = new KeyEnum("computeEngine.maxInstances");

        /**
         * Enum COMPUTEENGINE_MAXPREFETCHINSTANCE for value: "computeEngine.maxPrefetchInstance"
         */
        public static final KeyEnum COMPUTEENGINE_MAXPREFETCHINSTANCE =
            new KeyEnum("computeEngine.maxPrefetchInstance");

        /**
         * Enum JOB_MAXCONCURRENT for value: "job.maxConcurrent"
         */
        public static final KeyEnum JOB_MAXCONCURRENT = new KeyEnum("job.maxConcurrent");

        /**
         * Enum MULTIPLESC_SUPPORT for value: "multipleSc.support"
         */
        public static final KeyEnum MULTIPLESC_SUPPORT = new KeyEnum("multipleSc.support");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("computeEngine.maxInstances", COMPUTEENGINE_MAXINSTANCES);
            map.put("computeEngine.maxPrefetchInstance", COMPUTEENGINE_MAXPREFETCHINSTANCE);
            map.put("job.maxConcurrent", JOB_MAXCONCURRENT);
            map.put("multipleSc.support", MULTIPLESC_SUPPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyEnum(String value) {
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
        public static KeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyEnum(value));
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyEnum) {
                return this.value.equals(((KeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private KeyEnum key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public QueueProperty withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * 返回属性值对应的key值 computeEngine.maxInstances, 队列能启动的最大spark driver数量 computeEngine.maxPrefetchInstance, 队列预先启动的最大spark driver数量 job.maxConcurrent,单个spark driver能同时运行的最大任务数量 multipleSc.support,是否支持设置多个spark driver
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    public QueueProperty withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueProperty that = (QueueProperty) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueProperty {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
