package com.huaweicloud.sdk.workspace.v2.model;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selfhelp_console_enable")

    private Boolean selfhelpConsoleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_mouse_send_interval")

    private Integer clientMouseSendInterval;

    /**
     * Windows客户端键盘模式。取值为： GLOBAL：Windows客户端键盘全局模式。（默认） WINDOW：Windows客户端键盘窗口模式。
     */
    public static final class WindowsClientKeyboardModeEnum {

        /**
         * Enum GLOBAL for value: "GLOBAL"
         */
        public static final WindowsClientKeyboardModeEnum GLOBAL = new WindowsClientKeyboardModeEnum("GLOBAL");

        /**
         * Enum WINDOW for value: "WINDOW"
         */
        public static final WindowsClientKeyboardModeEnum WINDOW = new WindowsClientKeyboardModeEnum("WINDOW");

        private static final Map<String, WindowsClientKeyboardModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WindowsClientKeyboardModeEnum> createStaticFields() {
            Map<String, WindowsClientKeyboardModeEnum> map = new HashMap<>();
            map.put("GLOBAL", GLOBAL);
            map.put("WINDOW", WINDOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WindowsClientKeyboardModeEnum(String value) {
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
        public static WindowsClientKeyboardModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new WindowsClientKeyboardModeEnum(value));
        }

        public static WindowsClientKeyboardModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WindowsClientKeyboardModeEnum) {
                return this.value.equals(((WindowsClientKeyboardModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_client_keyboard_mode")

    private WindowsClientKeyboardModeEnum windowsClientKeyboardMode;

    /**
     * Windows客户端鼠标模式。取值为： GLOBAL：Windows客户端鼠标全局模式。 WINDOW：Windows客户端鼠标窗口模式。（默认）
     */
    public static final class WindowsClientMouseModeEnum {

        /**
         * Enum GLOBAL for value: "GLOBAL"
         */
        public static final WindowsClientMouseModeEnum GLOBAL = new WindowsClientMouseModeEnum("GLOBAL");

        /**
         * Enum WINDOW for value: "WINDOW"
         */
        public static final WindowsClientMouseModeEnum WINDOW = new WindowsClientMouseModeEnum("WINDOW");

        private static final Map<String, WindowsClientMouseModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WindowsClientMouseModeEnum> createStaticFields() {
            Map<String, WindowsClientMouseModeEnum> map = new HashMap<>();
            map.put("GLOBAL", GLOBAL);
            map.put("WINDOW", WINDOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WindowsClientMouseModeEnum(String value) {
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
        public static WindowsClientMouseModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new WindowsClientMouseModeEnum(value));
        }

        public static WindowsClientMouseModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WindowsClientMouseModeEnum) {
                return this.value.equals(((WindowsClientMouseModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_client_mouse_mode")

    private WindowsClientMouseModeEnum windowsClientMouseMode;

    /**
     * Linux客户端键盘模式。取值为： EVENT：Linux客户端键盘事件模式。（默认） GRAPH：Linux客户端键盘图形模式。
     */
    public static final class LinuxClientKeyboardModeEnum {

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final LinuxClientKeyboardModeEnum EVENT = new LinuxClientKeyboardModeEnum("EVENT");

        /**
         * Enum GRAPH for value: "GRAPH"
         */
        public static final LinuxClientKeyboardModeEnum GRAPH = new LinuxClientKeyboardModeEnum("GRAPH");

        private static final Map<String, LinuxClientKeyboardModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LinuxClientKeyboardModeEnum> createStaticFields() {
            Map<String, LinuxClientKeyboardModeEnum> map = new HashMap<>();
            map.put("EVENT", EVENT);
            map.put("GRAPH", GRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LinuxClientKeyboardModeEnum(String value) {
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
        public static LinuxClientKeyboardModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new LinuxClientKeyboardModeEnum(value));
        }

        public static LinuxClientKeyboardModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LinuxClientKeyboardModeEnum) {
                return this.value.equals(((LinuxClientKeyboardModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_client_keyboard_mode")

    private LinuxClientKeyboardModeEnum linuxClientKeyboardMode;

    /**
     * Linux客户端鼠标模式。取值为： EVENT：Linux客户端鼠标事件模式。（默认） GRAPH：Linux客户端鼠标窗口模式。
     */
    public static final class LinuxClientMouseModeEnum {

        /**
         * Enum EVENT for value: "EVENT"
         */
        public static final LinuxClientMouseModeEnum EVENT = new LinuxClientMouseModeEnum("EVENT");

        /**
         * Enum GRAPH for value: "GRAPH"
         */
        public static final LinuxClientMouseModeEnum GRAPH = new LinuxClientMouseModeEnum("GRAPH");

        private static final Map<String, LinuxClientMouseModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LinuxClientMouseModeEnum> createStaticFields() {
            Map<String, LinuxClientMouseModeEnum> map = new HashMap<>();
            map.put("EVENT", EVENT);
            map.put("GRAPH", GRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LinuxClientMouseModeEnum(String value) {
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
        public static LinuxClientMouseModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LinuxClientMouseModeEnum(value));
        }

        public static LinuxClientMouseModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LinuxClientMouseModeEnum) {
                return this.value.equals(((LinuxClientMouseModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_client_mouse_mode")

    private LinuxClientMouseModeEnum linuxClientMouseMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_keyboard")

    private Boolean specialKeyboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joy_stick_flag")

    private Boolean joyStickFlag;

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

    public PoliciesKeyboardMouse withSelfhelpConsoleEnable(Boolean selfhelpConsoleEnable) {
        this.selfhelpConsoleEnable = selfhelpConsoleEnable;
        return this;
    }

    /**
     * 自助维护台抢占登陆。取值为： false：表示关闭。 true：表示开启。
     * @return selfhelpConsoleEnable
     */
    public Boolean getSelfhelpConsoleEnable() {
        return selfhelpConsoleEnable;
    }

    public void setSelfhelpConsoleEnable(Boolean selfhelpConsoleEnable) {
        this.selfhelpConsoleEnable = selfhelpConsoleEnable;
    }

    public PoliciesKeyboardMouse withClientMouseSendInterval(Integer clientMouseSendInterval) {
        this.clientMouseSendInterval = clientMouseSendInterval;
        return this;
    }

    /**
     * 客户端鼠标发送间隔。取值范围为[1-30]。默认：30。
     * minimum: 1
     * maximum: 30
     * @return clientMouseSendInterval
     */
    public Integer getClientMouseSendInterval() {
        return clientMouseSendInterval;
    }

    public void setClientMouseSendInterval(Integer clientMouseSendInterval) {
        this.clientMouseSendInterval = clientMouseSendInterval;
    }

    public PoliciesKeyboardMouse withWindowsClientKeyboardMode(
        WindowsClientKeyboardModeEnum windowsClientKeyboardMode) {
        this.windowsClientKeyboardMode = windowsClientKeyboardMode;
        return this;
    }

    /**
     * Windows客户端键盘模式。取值为： GLOBAL：Windows客户端键盘全局模式。（默认） WINDOW：Windows客户端键盘窗口模式。
     * @return windowsClientKeyboardMode
     */
    public WindowsClientKeyboardModeEnum getWindowsClientKeyboardMode() {
        return windowsClientKeyboardMode;
    }

    public void setWindowsClientKeyboardMode(WindowsClientKeyboardModeEnum windowsClientKeyboardMode) {
        this.windowsClientKeyboardMode = windowsClientKeyboardMode;
    }

    public PoliciesKeyboardMouse withWindowsClientMouseMode(WindowsClientMouseModeEnum windowsClientMouseMode) {
        this.windowsClientMouseMode = windowsClientMouseMode;
        return this;
    }

    /**
     * Windows客户端鼠标模式。取值为： GLOBAL：Windows客户端鼠标全局模式。 WINDOW：Windows客户端鼠标窗口模式。（默认）
     * @return windowsClientMouseMode
     */
    public WindowsClientMouseModeEnum getWindowsClientMouseMode() {
        return windowsClientMouseMode;
    }

    public void setWindowsClientMouseMode(WindowsClientMouseModeEnum windowsClientMouseMode) {
        this.windowsClientMouseMode = windowsClientMouseMode;
    }

    public PoliciesKeyboardMouse withLinuxClientKeyboardMode(LinuxClientKeyboardModeEnum linuxClientKeyboardMode) {
        this.linuxClientKeyboardMode = linuxClientKeyboardMode;
        return this;
    }

    /**
     * Linux客户端键盘模式。取值为： EVENT：Linux客户端键盘事件模式。（默认） GRAPH：Linux客户端键盘图形模式。
     * @return linuxClientKeyboardMode
     */
    public LinuxClientKeyboardModeEnum getLinuxClientKeyboardMode() {
        return linuxClientKeyboardMode;
    }

    public void setLinuxClientKeyboardMode(LinuxClientKeyboardModeEnum linuxClientKeyboardMode) {
        this.linuxClientKeyboardMode = linuxClientKeyboardMode;
    }

    public PoliciesKeyboardMouse withLinuxClientMouseMode(LinuxClientMouseModeEnum linuxClientMouseMode) {
        this.linuxClientMouseMode = linuxClientMouseMode;
        return this;
    }

    /**
     * Linux客户端鼠标模式。取值为： EVENT：Linux客户端鼠标事件模式。（默认） GRAPH：Linux客户端鼠标窗口模式。
     * @return linuxClientMouseMode
     */
    public LinuxClientMouseModeEnum getLinuxClientMouseMode() {
        return linuxClientMouseMode;
    }

    public void setLinuxClientMouseMode(LinuxClientMouseModeEnum linuxClientMouseMode) {
        this.linuxClientMouseMode = linuxClientMouseMode;
    }

    public PoliciesKeyboardMouse withSpecialKeyboard(Boolean specialKeyboard) {
        this.specialKeyboard = specialKeyboard;
        return this;
    }

    /**
     * 特殊键盘。取值为： false：表示关闭。 true：表示开启。
     * @return specialKeyboard
     */
    public Boolean getSpecialKeyboard() {
        return specialKeyboard;
    }

    public void setSpecialKeyboard(Boolean specialKeyboard) {
        this.specialKeyboard = specialKeyboard;
    }

    public PoliciesKeyboardMouse withJoyStickFlag(Boolean joyStickFlag) {
        this.joyStickFlag = joyStickFlag;
        return this;
    }

    /**
     * 游戏操纵杆。取值为： false：表示关闭。 true：表示开启。
     * @return joyStickFlag
     */
    public Boolean getJoyStickFlag() {
        return joyStickFlag;
    }

    public void setJoyStickFlag(Boolean joyStickFlag) {
        this.joyStickFlag = joyStickFlag;
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
            && Objects.equals(this.externalCursorFeedback, that.externalCursorFeedback)
            && Objects.equals(this.selfhelpConsoleEnable, that.selfhelpConsoleEnable)
            && Objects.equals(this.clientMouseSendInterval, that.clientMouseSendInterval)
            && Objects.equals(this.windowsClientKeyboardMode, that.windowsClientKeyboardMode)
            && Objects.equals(this.windowsClientMouseMode, that.windowsClientMouseMode)
            && Objects.equals(this.linuxClientKeyboardMode, that.linuxClientKeyboardMode)
            && Objects.equals(this.linuxClientMouseMode, that.linuxClientMouseMode)
            && Objects.equals(this.specialKeyboard, that.specialKeyboard)
            && Objects.equals(this.joyStickFlag, that.joyStickFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mouseFeedback,
            mouseSimulationMode,
            externalCursorFeedback,
            selfhelpConsoleEnable,
            clientMouseSendInterval,
            windowsClientKeyboardMode,
            windowsClientMouseMode,
            linuxClientKeyboardMode,
            linuxClientMouseMode,
            specialKeyboard,
            joyStickFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesKeyboardMouse {\n");
        sb.append("    mouseFeedback: ").append(toIndentedString(mouseFeedback)).append("\n");
        sb.append("    mouseSimulationMode: ").append(toIndentedString(mouseSimulationMode)).append("\n");
        sb.append("    externalCursorFeedback: ").append(toIndentedString(externalCursorFeedback)).append("\n");
        sb.append("    selfhelpConsoleEnable: ").append(toIndentedString(selfhelpConsoleEnable)).append("\n");
        sb.append("    clientMouseSendInterval: ").append(toIndentedString(clientMouseSendInterval)).append("\n");
        sb.append("    windowsClientKeyboardMode: ").append(toIndentedString(windowsClientKeyboardMode)).append("\n");
        sb.append("    windowsClientMouseMode: ").append(toIndentedString(windowsClientMouseMode)).append("\n");
        sb.append("    linuxClientKeyboardMode: ").append(toIndentedString(linuxClientKeyboardMode)).append("\n");
        sb.append("    linuxClientMouseMode: ").append(toIndentedString(linuxClientMouseMode)).append("\n");
        sb.append("    specialKeyboard: ").append(toIndentedString(specialKeyboard)).append("\n");
        sb.append("    joyStickFlag: ").append(toIndentedString(joyStickFlag)).append("\n");
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
