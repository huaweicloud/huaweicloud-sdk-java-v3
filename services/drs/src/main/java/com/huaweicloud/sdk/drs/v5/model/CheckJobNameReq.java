package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 校验任务名称请求体。
 */
public class CheckJobNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务类型。 - trans - subscription - offline
     */
    public static final class TypeEnum {

        /**
         * Enum TRANS for value: "trans"
         */
        public static final TypeEnum TRANS = new TypeEnum("trans");

        /**
         * Enum SUBSCRIPTION for value: "subscription"
         */
        public static final TypeEnum SUBSCRIPTION = new TypeEnum("subscription");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final TypeEnum OFFLINE = new TypeEnum("offline");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("trans", TRANS);
            map.put("subscription", SUBSCRIPTION);
            map.put("offline", OFFLINE);
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

    public CheckJobNameReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 迁移、同步、灾备、订阅任务名称，名称在4位到50位之间，必须以字母开头，可以包含字母、数字、中划线或下划线，不能包含其他特殊字符，任务名称不能重复。 - 备份迁移任务名称，名称在4位到80位之间，必须以字母开头，可以包含字母、数字、中划线或下划线，不能包含其他特殊字符，任务名称不能重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckJobNameReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型。 - trans - subscription - offline
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckJobNameReq that = (CheckJobNameReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckJobNameReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
