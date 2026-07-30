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
 * RedeployConfig
 */
public class RedeployConfig {

    /**
     * 节点的重部署类型。若节点状态为不可用，将无法进行SOFT模式，只能进行HARD模式，HARD模式包含节点重置操作，会导致本地盘及云盘上的全部数据丢失，请谨慎操作
     */
    public static final class TypeEnum {

        /**
         * Enum SOFT for value: "SOFT"
         */
        public static final TypeEnum SOFT = new TypeEnum("SOFT");

        /**
         * Enum HARD for value: "HARD"
         */
        public static final TypeEnum HARD = new TypeEnum("HARD");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SOFT", SOFT);
            map.put("HARD", HARD);
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

    /**
     * 静默修复开关。开启autoFlow开关时，如重部署失败系统将自动流转至\"系统维护\"或发起\"二次重部署\"，并产生新的计划事件，该过程自动授权，无需二次授权
     */
    public static final class AutoFlowEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final AutoFlowEnum TRUE = new AutoFlowEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final AutoFlowEnum FALSE = new AutoFlowEnum("false");

        private static final Map<String, AutoFlowEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoFlowEnum> createStaticFields() {
            Map<String, AutoFlowEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoFlowEnum(String value) {
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
        public static AutoFlowEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoFlowEnum(value));
        }

        public static AutoFlowEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoFlowEnum) {
                return this.value.equals(((AutoFlowEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoFlow")

    private AutoFlowEnum autoFlow;

    public RedeployConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点的重部署类型。若节点状态为不可用，将无法进行SOFT模式，只能进行HARD模式，HARD模式包含节点重置操作，会导致本地盘及云盘上的全部数据丢失，请谨慎操作
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RedeployConfig withAutoFlow(AutoFlowEnum autoFlow) {
        this.autoFlow = autoFlow;
        return this;
    }

    /**
     * 静默修复开关。开启autoFlow开关时，如重部署失败系统将自动流转至\"系统维护\"或发起\"二次重部署\"，并产生新的计划事件，该过程自动授权，无需二次授权
     * @return autoFlow
     */
    public AutoFlowEnum getAutoFlow() {
        return autoFlow;
    }

    public void setAutoFlow(AutoFlowEnum autoFlow) {
        this.autoFlow = autoFlow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedeployConfig that = (RedeployConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.autoFlow, that.autoFlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, autoFlow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedeployConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    autoFlow: ").append(toIndentedString(autoFlow)).append("\n");
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
