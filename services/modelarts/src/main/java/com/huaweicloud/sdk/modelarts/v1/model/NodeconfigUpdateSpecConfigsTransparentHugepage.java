package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：透明大页（Transparent Hugepage，THP）配置，用于设置节点内存大页策略。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeconfigUpdateSpecConfigsTransparentHugepage {

    /**
     * **参数解释**：透明大页模式。 **约束限制**：不涉及。 **取值范围**：可选值如下： - always：始终启用。 - madvise：建议启用。 - never：不启用。 **默认取值**：不涉及。
     */
    public static final class ModeEnum {

        /**
         * Enum ALWAYS for value: "always"
         */
        public static final ModeEnum ALWAYS = new ModeEnum("always");

        /**
         * Enum MADVISE for value: "madvise"
         */
        public static final ModeEnum MADVISE = new ModeEnum("madvise");

        /**
         * Enum NEVER for value: "never"
         */
        public static final ModeEnum NEVER = new ModeEnum("never");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("always", ALWAYS);
            map.put("madvise", MADVISE);
            map.put("never", NEVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    public NodeconfigUpdateSpecConfigsTransparentHugepage withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**：透明大页模式。 **约束限制**：不涉及。 **取值范围**：可选值如下： - always：始终启用。 - madvise：建议启用。 - never：不启用。 **默认取值**：不涉及。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigUpdateSpecConfigsTransparentHugepage that = (NodeconfigUpdateSpecConfigsTransparentHugepage) obj;
        return Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigUpdateSpecConfigsTransparentHugepage {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
