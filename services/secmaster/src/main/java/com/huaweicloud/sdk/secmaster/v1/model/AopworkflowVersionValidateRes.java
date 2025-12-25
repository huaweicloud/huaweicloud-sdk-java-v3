package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 校验流程的请求对象
 */
public class AopworkflowVersionValidateRes {

    /**
     * **参数解释**: 流程的校验类型 - BASIC 基础校验 - CIRCLE 环路校验 - APP_PARAMS 参数校验  **约束限制**: 不涉及         **取值范围**: - BASIC - CIRCLE - APP_PARAMS  **默认值**:  不涉及
     */
    public static final class ModeEnum {

        /**
         * Enum BASIC for value: "BASIC"
         */
        public static final ModeEnum BASIC = new ModeEnum("BASIC");

        /**
         * Enum CIRCLE for value: "CIRCLE"
         */
        public static final ModeEnum CIRCLE = new ModeEnum("CIRCLE");

        /**
         * Enum APP_PARAMS for value: "APP_PARAMS"
         */
        public static final ModeEnum APP_PARAMS = new ModeEnum("APP_PARAMS");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("BASIC", BASIC);
            map.put("CIRCLE", CIRCLE);
            map.put("APP_PARAMS", APP_PARAMS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskconfig")

    private String taskconfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow")

    private String taskflow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aopworkflow_id")

    private String aopworkflowId;

    public AopworkflowVersionValidateRes withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**: 流程的校验类型 - BASIC 基础校验 - CIRCLE 环路校验 - APP_PARAMS 参数校验  **约束限制**: 不涉及         **取值范围**: - BASIC - CIRCLE - APP_PARAMS  **默认值**:  不涉及
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public AopworkflowVersionValidateRes withTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
        return this;
    }

    /**
     * **参数解释**: 流程拓扑图的参数配置 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskconfig
     */
    public String getTaskconfig() {
        return taskconfig;
    }

    public void setTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
    }

    public AopworkflowVersionValidateRes withTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }

    /**
     * **参数解释**: 流程的拓扑图的BASE64编码 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskflow
     */
    public String getTaskflow() {
        return taskflow;
    }

    public void setTaskflow(String taskflow) {
        this.taskflow = taskflow;
    }

    public AopworkflowVersionValidateRes withAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
        return this;
    }

    /**
     * **参数解释**: 流程的ID **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return aopworkflowId
     */
    public String getAopworkflowId() {
        return aopworkflowId;
    }

    public void setAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopworkflowVersionValidateRes that = (AopworkflowVersionValidateRes) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.taskconfig, that.taskconfig)
            && Objects.equals(this.taskflow, that.taskflow) && Objects.equals(this.aopworkflowId, that.aopworkflowId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, taskconfig, taskflow, aopworkflowId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopworkflowVersionValidateRes {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    taskconfig: ").append(toIndentedString(taskconfig)).append("\n");
        sb.append("    taskflow: ").append(toIndentedString(taskflow)).append("\n");
        sb.append("    aopworkflowId: ").append(toIndentedString(aopworkflowId)).append("\n");
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
