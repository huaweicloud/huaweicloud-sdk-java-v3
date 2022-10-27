package com.huaweicloud.sdk.cae.v1.model;

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
 * 请求数据。
 */
public class ExecuteActionRequestBodyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    /**
    * action名称。
    */
    public static final class NameEnum {

        /**
         * Enum DEPLOY for value: "deploy"
         */
        public static final NameEnum DEPLOY = new NameEnum("deploy");

        /**
         * Enum UPGRADE for value: "upgrade"
         */
        public static final NameEnum UPGRADE = new NameEnum("upgrade");

        /**
         * Enum CONFIGURE for value: "configure"
         */
        public static final NameEnum CONFIGURE = new NameEnum("configure");

        /**
         * Enum SCALE for value: "scale"
         */
        public static final NameEnum SCALE = new NameEnum("scale");

        /**
         * Enum RESTART for value: "restart"
         */
        public static final NameEnum RESTART = new NameEnum("restart");

        /**
         * Enum START for value: "start"
         */
        public static final NameEnum START = new NameEnum("start");

        /**
         * Enum STOP for value: "stop"
         */
        public static final NameEnum STOP = new NameEnum("stop");

        /**
         * Enum ROLLBACK for value: "rollback"
         */
        public static final NameEnum ROLLBACK = new NameEnum("rollback");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("deploy", DEPLOY);
            map.put("upgrade", UPGRADE);
            map.put("configure", CONFIGURE);
            map.put("scale", SCALE);
            map.put("restart", RESTART);
            map.put("start", START);
            map.put("stop", STOP);
            map.put("rollback", ROLLBACK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    public ExecuteActionRequestBodyMetadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ExecuteActionRequestBodyMetadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ExecuteActionRequestBodyMetadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 资源信息。
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ExecuteActionRequestBodyMetadata withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * action名称。
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteActionRequestBodyMetadata executeActionRequestBodyMetadata = (ExecuteActionRequestBodyMetadata) o;
        return Objects.equals(this.annotations, executeActionRequestBodyMetadata.annotations)
            && Objects.equals(this.name, executeActionRequestBodyMetadata.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotations, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteActionRequestBodyMetadata {\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
