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
 * RetentionPolicy
 */
public class RetentionPolicy {

    /**
     * **参数解释**：作业级库记录自动老化策略。 **约束限制**：   - 仅当平台开启作业老化能力且作业类型为自定义训练作业（kind=job）时生效；   - 与用户级「作业自动老化」开关联动：     - 用户级开关**开启**：该用户下所有作业均参与老化（`policy=disabled` 不能单独豁免）；     - 用户级开关**关闭**：仅 `policy=enabled` 的作业参与老化；未设置或 `disabled` 均不参与。 **取值范围**：   - enabled：开启本作业老化   - disabled：关闭本作业老化（仅在用户级开关关闭时有效） **默认取值**：不传表示未单独设置，跟随用户级开关策略。
     */
    public static final class PolicyEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final PolicyEnum ENABLED = new PolicyEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final PolicyEnum DISABLED = new PolicyEnum("disabled");

        private static final Map<String, PolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyEnum> createStaticFields() {
            Map<String, PolicyEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyEnum(String value) {
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
        public static PolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEnum(value));
        }

        public static PolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyEnum) {
                return this.value.equals(((PolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private PolicyEnum policy;

    public RetentionPolicy withPolicy(PolicyEnum policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**：作业级库记录自动老化策略。 **约束限制**：   - 仅当平台开启作业老化能力且作业类型为自定义训练作业（kind=job）时生效；   - 与用户级「作业自动老化」开关联动：     - 用户级开关**开启**：该用户下所有作业均参与老化（`policy=disabled` 不能单独豁免）；     - 用户级开关**关闭**：仅 `policy=enabled` 的作业参与老化；未设置或 `disabled` 均不参与。 **取值范围**：   - enabled：开启本作业老化   - disabled：关闭本作业老化（仅在用户级开关关闭时有效） **默认取值**：不传表示未单独设置，跟随用户级开关策略。
     * @return policy
     */
    public PolicyEnum getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEnum policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetentionPolicy that = (RetentionPolicy) obj;
        return Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetentionPolicy {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
