package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：可用API版本信息。
 */
public class ApiVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * **参数解释**：API版本的状态。  **取值范围**： - CURRENT：当前版本，当前所支持的API版本中最高的版本。 - STABLE：稳定版本，其他可用版本。 - DEPRECATED：废弃版本。
     */
    public static final class StatusEnum {

        /**
         * Enum CURRENT for value: "CURRENT"
         */
        public static final StatusEnum CURRENT = new StatusEnum("CURRENT");

        /**
         * Enum STABLE for value: "STABLE"
         */
        public static final StatusEnum STABLE = new StatusEnum("STABLE");

        /**
         * Enum DEPRECATED for value: "DEPRECATED"
         */
        public static final StatusEnum DEPRECATED = new StatusEnum("DEPRECATED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CURRENT", CURRENT);
            map.put("STABLE", STABLE);
            map.put("DEPRECATED", DEPRECATED);
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

    public ApiVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：API版本号。  **取值范围**：由高到低版本分别为v3，v2，v2.0。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiVersionInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：API版本的状态。  **取值范围**： - CURRENT：当前版本，当前所支持的API版本中最高的版本。 - STABLE：稳定版本，其他可用版本。 - DEPRECATED：废弃版本。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiVersionInfo that = (ApiVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
