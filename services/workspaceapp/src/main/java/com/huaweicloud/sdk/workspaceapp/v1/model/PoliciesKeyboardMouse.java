package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 键盘鼠标。
 */
public class PoliciesKeyboardMouse {

    /**
     * 虚拟机鼠标回馈。取值为： SELFADAPTION：自适应鼠标回馈。 FORCE：强制鼠标回馈。 CLOSE：关闭鼠标回馈。
     */
    public static final class MouseFeedbackEnum {

        /**
         * Enum SELFADAPTION for value: "SELFADAPTION"
         */
        public static final MouseFeedbackEnum SELFADAPTION = new MouseFeedbackEnum("SELFADAPTION");

        /**
         * Enum FORCE for value: "FORCE"
         */
        public static final MouseFeedbackEnum FORCE = new MouseFeedbackEnum("FORCE");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final MouseFeedbackEnum CLOSE = new MouseFeedbackEnum("CLOSE");

        private static final Map<String, MouseFeedbackEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MouseFeedbackEnum> createStaticFields() {
            Map<String, MouseFeedbackEnum> map = new HashMap<>();
            map.put("SELFADAPTION", SELFADAPTION);
            map.put("FORCE", FORCE);
            map.put("CLOSE", CLOSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MouseFeedbackEnum(String value) {
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
        public static MouseFeedbackEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MouseFeedbackEnum(value));
        }

        public static MouseFeedbackEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MouseFeedbackEnum) {
                return this.value.equals(((MouseFeedbackEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mouse_feedback")

    private MouseFeedbackEnum mouseFeedback;

    /**
     * 虚拟机鼠标模拟方式。取值为： ABSOLUTE_POSITION：绝对位置模拟。 RELATIVE_POSITION：相对位置模拟。
     */
    public static final class MouseSimulationModeEnum {

        /**
         * Enum ABSOLUTE_POSITION for value: "ABSOLUTE_POSITION"
         */
        public static final MouseSimulationModeEnum ABSOLUTE_POSITION =
            new MouseSimulationModeEnum("ABSOLUTE_POSITION");

        /**
         * Enum RELATIVE_POSITION for value: "RELATIVE_POSITION"
         */
        public static final MouseSimulationModeEnum RELATIVE_POSITION =
            new MouseSimulationModeEnum("RELATIVE_POSITION");

        private static final Map<String, MouseSimulationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MouseSimulationModeEnum> createStaticFields() {
            Map<String, MouseSimulationModeEnum> map = new HashMap<>();
            map.put("ABSOLUTE_POSITION", ABSOLUTE_POSITION);
            map.put("RELATIVE_POSITION", RELATIVE_POSITION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MouseSimulationModeEnum(String value) {
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
        public static MouseSimulationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MouseSimulationModeEnum(value));
        }

        public static MouseSimulationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MouseSimulationModeEnum) {
                return this.value.equals(((MouseSimulationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mouse_simulation_mode")

    private MouseSimulationModeEnum mouseSimulationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_cursor_feedback")

    private Boolean externalCursorFeedback;

    public PoliciesKeyboardMouse withMouseFeedback(MouseFeedbackEnum mouseFeedback) {
        this.mouseFeedback = mouseFeedback;
        return this;
    }

    /**
     * 虚拟机鼠标回馈。取值为： SELFADAPTION：自适应鼠标回馈。 FORCE：强制鼠标回馈。 CLOSE：关闭鼠标回馈。
     * @return mouseFeedback
     */
    public MouseFeedbackEnum getMouseFeedback() {
        return mouseFeedback;
    }

    public void setMouseFeedback(MouseFeedbackEnum mouseFeedback) {
        this.mouseFeedback = mouseFeedback;
    }

    public PoliciesKeyboardMouse withMouseSimulationMode(MouseSimulationModeEnum mouseSimulationMode) {
        this.mouseSimulationMode = mouseSimulationMode;
        return this;
    }

    /**
     * 虚拟机鼠标模拟方式。取值为： ABSOLUTE_POSITION：绝对位置模拟。 RELATIVE_POSITION：相对位置模拟。
     * @return mouseSimulationMode
     */
    public MouseSimulationModeEnum getMouseSimulationMode() {
        return mouseSimulationMode;
    }

    public void setMouseSimulationMode(MouseSimulationModeEnum mouseSimulationMode) {
        this.mouseSimulationMode = mouseSimulationMode;
    }

    public PoliciesKeyboardMouse withExternalCursorFeedback(Boolean externalCursorFeedback) {
        this.externalCursorFeedback = externalCursorFeedback;
        return this;
    }

    /**
     * 虚拟机外部光标反馈。取值为： false：表示关闭。 true：表示开启。
     * @return externalCursorFeedback
     */
    public Boolean getExternalCursorFeedback() {
        return externalCursorFeedback;
    }

    public void setExternalCursorFeedback(Boolean externalCursorFeedback) {
        this.externalCursorFeedback = externalCursorFeedback;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesKeyboardMouse that = (PoliciesKeyboardMouse) obj;
        return Objects.equals(this.mouseFeedback, that.mouseFeedback)
            && Objects.equals(this.mouseSimulationMode, that.mouseSimulationMode)
            && Objects.equals(this.externalCursorFeedback, that.externalCursorFeedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouseFeedback, mouseSimulationMode, externalCursorFeedback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesKeyboardMouse {\n");
        sb.append("    mouseFeedback: ").append(toIndentedString(mouseFeedback)).append("\n");
        sb.append("    mouseSimulationMode: ").append(toIndentedString(mouseSimulationMode)).append("\n");
        sb.append("    externalCursorFeedback: ").append(toIndentedString(externalCursorFeedback)).append("\n");
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
