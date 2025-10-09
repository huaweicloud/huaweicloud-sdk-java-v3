package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 如下字段不可使用：  - node.kubernetes.io/memory-pressure - node.kubernetes.io/disk-pressure - node.kubernetes.io/out-of-disk - node.kubernetes.io/unschedulable - node.kubernetes.io/network-unavailable
 */
public class Taint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * **参数解释**： K8s污点的作用效果。 **约束限制**： 不涉及 **取值范围**： 只可选NoSchedule，PreferNoSchedule或NoExecute。 **默认取值**： 不涉及
     */
    public static final class EffectEnum {

        /**
         * Enum NOSCHEDULE for value: "NoSchedule"
         */
        public static final EffectEnum NOSCHEDULE = new EffectEnum("NoSchedule");

        /**
         * Enum PREFERNOSCHEDULE for value: "PreferNoSchedule"
         */
        public static final EffectEnum PREFERNOSCHEDULE = new EffectEnum("PreferNoSchedule");

        /**
         * Enum NOEXECUTE for value: "NoExecute"
         */
        public static final EffectEnum NOEXECUTE = new EffectEnum("NoExecute");

        private static final Map<String, EffectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectEnum> createStaticFields() {
            Map<String, EffectEnum> map = new HashMap<>();
            map.put("NoSchedule", NOSCHEDULE);
            map.put("PreferNoSchedule", PREFERNOSCHEDULE);
            map.put("NoExecute", NOEXECUTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectEnum(String value) {
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
        public static EffectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectEnum(value));
        }

        public static EffectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectEnum) {
                return this.value.equals(((EffectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private EffectEnum effect;

    public Taint withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： K8s污点的键。 **约束限制**： 必须以字母或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Taint withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： K8s污点的值。 **约束限制**： 必须以字母或数字开头和结尾，可以包含字母、数字、连字符、下划线和点，最长63个字符。 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Taint withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    /**
     * **参数解释**： K8s污点的作用效果。 **约束限制**： 不涉及 **取值范围**： 只可选NoSchedule，PreferNoSchedule或NoExecute。 **默认取值**： 不涉及
     * @return effect
     */
    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Taint that = (Taint) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value)
            && Objects.equals(this.effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Taint {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
