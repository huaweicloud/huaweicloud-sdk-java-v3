package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 控制命令。
 */
public class ControlDigitalHumanLiveReq {

    /**
     * 命令名称。 - BODY_POS_RESET：视觉驱动复位 - HIPS_POS_ADJUST：模型位移调整 - EYE_POS：眼神锁定/解锁 - SKELETON_ROTATION_ADJUST：骨骼旋转 - LOCK_SKELETONS：骨骼锁定 - UNLOCK_SKELETONS：骨骼解锁
     */
    public static final class CommandEnum {

        /**
         * Enum BODY_POS_RESET for value: "BODY_POS_RESET"
         */
        public static final CommandEnum BODY_POS_RESET = new CommandEnum("BODY_POS_RESET");

        /**
         * Enum HIPS_POS_ADJUST for value: "HIPS_POS_ADJUST"
         */
        public static final CommandEnum HIPS_POS_ADJUST = new CommandEnum("HIPS_POS_ADJUST");

        /**
         * Enum EYE_POS for value: "EYE_POS"
         */
        public static final CommandEnum EYE_POS = new CommandEnum("EYE_POS");

        /**
         * Enum SKELETON_ROTATION_ADJUST for value: "SKELETON_ROTATION_ADJUST"
         */
        public static final CommandEnum SKELETON_ROTATION_ADJUST = new CommandEnum("SKELETON_ROTATION_ADJUST");

        /**
         * Enum LOCK_SKELETONS for value: "LOCK_SKELETONS"
         */
        public static final CommandEnum LOCK_SKELETONS = new CommandEnum("LOCK_SKELETONS");

        /**
         * Enum UNLOCK_SKELETONS for value: "UNLOCK_SKELETONS"
         */
        public static final CommandEnum UNLOCK_SKELETONS = new CommandEnum("UNLOCK_SKELETONS");

        private static final Map<String, CommandEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommandEnum> createStaticFields() {
            Map<String, CommandEnum> map = new HashMap<>();
            map.put("BODY_POS_RESET", BODY_POS_RESET);
            map.put("HIPS_POS_ADJUST", HIPS_POS_ADJUST);
            map.put("EYE_POS", EYE_POS);
            map.put("SKELETON_ROTATION_ADJUST", SKELETON_ROTATION_ADJUST);
            map.put("LOCK_SKELETONS", LOCK_SKELETONS);
            map.put("UNLOCK_SKELETONS", UNLOCK_SKELETONS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommandEnum(String value) {
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
        public static CommandEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommandEnum(value));
        }

        public static CommandEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommandEnum) {
                return this.value.equals(((CommandEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private CommandEnum command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Object params;

    public ControlDigitalHumanLiveReq withCommand(CommandEnum command) {
        this.command = command;
        return this;
    }

    /**
     * 命令名称。 - BODY_POS_RESET：视觉驱动复位 - HIPS_POS_ADJUST：模型位移调整 - EYE_POS：眼神锁定/解锁 - SKELETON_ROTATION_ADJUST：骨骼旋转 - LOCK_SKELETONS：骨骼锁定 - UNLOCK_SKELETONS：骨骼解锁
     * @return command
     */
    public CommandEnum getCommand() {
        return command;
    }

    public void setCommand(CommandEnum command) {
        this.command = command;
    }

    public ControlDigitalHumanLiveReq withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * 命令参数。
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ControlDigitalHumanLiveReq that = (ControlDigitalHumanLiveReq) obj;
        return Objects.equals(this.command, that.command) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(command, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ControlDigitalHumanLiveReq {\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
