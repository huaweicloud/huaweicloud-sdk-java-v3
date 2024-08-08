package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 私有hook配置项，可以指定私有hook生效的目标资源栈以及私有hook校验失败后资源栈的行为。可通过UpdatePrivateHook API更新私有hook配置项。
 */
public class ConfigurationPrimitiveTypeHolderConfiguration {

    /**
     * 指定私有hook生效的目标资源栈，有效值为NONE或ALL。  NONE：指定此私有hook不会作用于任何资源栈 ALL：指定此私有hook将会应用于账号下的所有资源栈
     */
    public static final class TargetStacksEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final TargetStacksEnum NONE = new TargetStacksEnum("NONE");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final TargetStacksEnum ALL = new TargetStacksEnum("ALL");

        private static final Map<String, TargetStacksEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetStacksEnum> createStaticFields() {
            Map<String, TargetStacksEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetStacksEnum(String value) {
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
        public static TargetStacksEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetStacksEnum(value));
        }

        public static TargetStacksEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetStacksEnum) {
                return this.value.equals(((TargetStacksEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_stacks")

    private TargetStacksEnum targetStacks;

    /**
     * 指定私有hook校验失败后的行为，有效值为FAIL或WARN。  FAIL：指定此私有hook校验失败后资源栈将停止部署，资源栈状态将更新为DEPLOYMENT_FAILED。 WARN：指定此私有hook校验失败后仅通过资源栈事件展示警告消息，但不影响资源栈部署。
     */
    public static final class FailureModeEnum {

        /**
         * Enum WARN for value: "WARN"
         */
        public static final FailureModeEnum WARN = new FailureModeEnum("WARN");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final FailureModeEnum FAIL = new FailureModeEnum("FAIL");

        private static final Map<String, FailureModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailureModeEnum> createStaticFields() {
            Map<String, FailureModeEnum> map = new HashMap<>();
            map.put("WARN", WARN);
            map.put("FAIL", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailureModeEnum(String value) {
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
        public static FailureModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FailureModeEnum(value));
        }

        public static FailureModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailureModeEnum) {
                return this.value.equals(((FailureModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_mode")

    private FailureModeEnum failureMode;

    public ConfigurationPrimitiveTypeHolderConfiguration withTargetStacks(TargetStacksEnum targetStacks) {
        this.targetStacks = targetStacks;
        return this;
    }

    /**
     * 指定私有hook生效的目标资源栈，有效值为NONE或ALL。  NONE：指定此私有hook不会作用于任何资源栈 ALL：指定此私有hook将会应用于账号下的所有资源栈
     * @return targetStacks
     */
    public TargetStacksEnum getTargetStacks() {
        return targetStacks;
    }

    public void setTargetStacks(TargetStacksEnum targetStacks) {
        this.targetStacks = targetStacks;
    }

    public ConfigurationPrimitiveTypeHolderConfiguration withFailureMode(FailureModeEnum failureMode) {
        this.failureMode = failureMode;
        return this;
    }

    /**
     * 指定私有hook校验失败后的行为，有效值为FAIL或WARN。  FAIL：指定此私有hook校验失败后资源栈将停止部署，资源栈状态将更新为DEPLOYMENT_FAILED。 WARN：指定此私有hook校验失败后仅通过资源栈事件展示警告消息，但不影响资源栈部署。
     * @return failureMode
     */
    public FailureModeEnum getFailureMode() {
        return failureMode;
    }

    public void setFailureMode(FailureModeEnum failureMode) {
        this.failureMode = failureMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationPrimitiveTypeHolderConfiguration that = (ConfigurationPrimitiveTypeHolderConfiguration) obj;
        return Objects.equals(this.targetStacks, that.targetStacks)
            && Objects.equals(this.failureMode, that.failureMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetStacks, failureMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationPrimitiveTypeHolderConfiguration {\n");
        sb.append("    targetStacks: ").append(toIndentedString(targetStacks)).append("\n");
        sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
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
