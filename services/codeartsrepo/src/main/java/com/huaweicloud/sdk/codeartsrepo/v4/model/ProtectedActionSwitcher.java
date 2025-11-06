package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ProtectedActionSwitcher
 */
public class ProtectedActionSwitcher {

    /**
     * **参数解释：** 开关名。 **约束限制：** 不涉及。 **取值范围：** - allowed_force_push，允许强制推送（默认不允许强推）。 **默认取值：** 不涉及。
     */
    public static final class NameEnum {

        /**
         * Enum ALLOWED_FORCE_PUSH for value: "allowed_force_push"
         */
        public static final NameEnum ALLOWED_FORCE_PUSH = new NameEnum("allowed_force_push");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("allowed_force_push", ALLOWED_FORCE_PUSH);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public ProtectedActionSwitcher withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 开关名。 **约束限制：** 不涉及。 **取值范围：** - allowed_force_push，允许强制推送（默认不允许强推）。 **默认取值：** 不涉及。
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public ProtectedActionSwitcher withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 是否开启。 **约束限制：** 不涉及。 **取值范围：** - true，开启 - false，关闭 **默认取值：** 不涉及。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectedActionSwitcher that = (ProtectedActionSwitcher) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedActionSwitcher {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
