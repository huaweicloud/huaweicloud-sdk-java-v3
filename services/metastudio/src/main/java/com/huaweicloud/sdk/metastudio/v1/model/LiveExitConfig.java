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
 * 直播任务退出配置
 */
public class LiveExitConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_live_duration")

    private Integer maxLiveDuration;

    /**
     * **参数解释**： 自动停止直播模式。 * FORCE_EXIT：立即强制停止，不做其他逻辑处理。 * SEGMENT_END:等待段落结束停止。 * SCENE_END：等待场景结束停止。 * SCRIPT_END：等待剧本结束停止。 **约束限制**： 不涉及 **默认取值**： 不设置则表示FORCE_EXIT。
     */
    public static final class AutoStopModeEnum {

        /**
         * Enum FORCE_EXIT for value: "FORCE_EXIT"
         */
        public static final AutoStopModeEnum FORCE_EXIT = new AutoStopModeEnum("FORCE_EXIT");

        /**
         * Enum SEGMENT_END for value: "SEGMENT_END"
         */
        public static final AutoStopModeEnum SEGMENT_END = new AutoStopModeEnum("SEGMENT_END");

        /**
         * Enum SCENE_END for value: "SCENE_END"
         */
        public static final AutoStopModeEnum SCENE_END = new AutoStopModeEnum("SCENE_END");

        /**
         * Enum SCRIPT_END for value: "SCRIPT_END"
         */
        public static final AutoStopModeEnum SCRIPT_END = new AutoStopModeEnum("SCRIPT_END");

        private static final Map<String, AutoStopModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AutoStopModeEnum> createStaticFields() {
            Map<String, AutoStopModeEnum> map = new HashMap<>();
            map.put("FORCE_EXIT", FORCE_EXIT);
            map.put("SEGMENT_END", SEGMENT_END);
            map.put("SCENE_END", SCENE_END);
            map.put("SCRIPT_END", SCRIPT_END);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AutoStopModeEnum(String value) {
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
        public static AutoStopModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AutoStopModeEnum(value));
        }

        public static AutoStopModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoStopModeEnum) {
                return this.value.equals(((AutoStopModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_stop_mode")

    private AutoStopModeEnum autoStopMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_exception_waiting_duration")

    private Integer maxExceptionWaitingDuration;

    public LiveExitConfig withMaxLiveDuration(Integer maxLiveDuration) {
        this.maxLiveDuration = maxLiveDuration;
        return this;
    }

    /**
     * **参数解释**： 最大直播时长。单位小时。 此数值配置为n，则标识起播后n小时后触发停止直播逻辑。 当前数值最大为168（一周），特殊的，0表示不限时。 **约束限制**： 停止直播逻辑配置为立即停止则直播停止误差在5分钟之内。其他逻辑则加上处理时长。 **默认取值**： 不设置则表示不限时。
     * minimum: 0
     * maximum: 168
     * @return maxLiveDuration
     */
    public Integer getMaxLiveDuration() {
        return maxLiveDuration;
    }

    public void setMaxLiveDuration(Integer maxLiveDuration) {
        this.maxLiveDuration = maxLiveDuration;
    }

    public LiveExitConfig withAutoStopMode(AutoStopModeEnum autoStopMode) {
        this.autoStopMode = autoStopMode;
        return this;
    }

    /**
     * **参数解释**： 自动停止直播模式。 * FORCE_EXIT：立即强制停止，不做其他逻辑处理。 * SEGMENT_END:等待段落结束停止。 * SCENE_END：等待场景结束停止。 * SCRIPT_END：等待剧本结束停止。 **约束限制**： 不涉及 **默认取值**： 不设置则表示FORCE_EXIT。
     * @return autoStopMode
     */
    public AutoStopModeEnum getAutoStopMode() {
        return autoStopMode;
    }

    public void setAutoStopMode(AutoStopModeEnum autoStopMode) {
        this.autoStopMode = autoStopMode;
    }

    public LiveExitConfig withMaxExceptionWaitingDuration(Integer maxExceptionWaitingDuration) {
        this.maxExceptionWaitingDuration = maxExceptionWaitingDuration;
        return this;
    }

    /**
     * **参数解释**： 最大异常等待时长。单位分钟。  此数值配置为n，则标识检测到异常n分钟后触发立即停止直播逻辑。 当前数值最大为60（1小时），特殊的，0表示不限时。 **约束限制**： 不涉及 **默认取值**： 不设置则为系统默认值，当前为3分钟，默认值可能会根据服务运行状态进行少许调整。
     * minimum: 0
     * maximum: 60
     * @return maxExceptionWaitingDuration
     */
    public Integer getMaxExceptionWaitingDuration() {
        return maxExceptionWaitingDuration;
    }

    public void setMaxExceptionWaitingDuration(Integer maxExceptionWaitingDuration) {
        this.maxExceptionWaitingDuration = maxExceptionWaitingDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveExitConfig that = (LiveExitConfig) obj;
        return Objects.equals(this.maxLiveDuration, that.maxLiveDuration)
            && Objects.equals(this.autoStopMode, that.autoStopMode)
            && Objects.equals(this.maxExceptionWaitingDuration, that.maxExceptionWaitingDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLiveDuration, autoStopMode, maxExceptionWaitingDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveExitConfig {\n");
        sb.append("    maxLiveDuration: ").append(toIndentedString(maxLiveDuration)).append("\n");
        sb.append("    autoStopMode: ").append(toIndentedString(autoStopMode)).append("\n");
        sb.append("    maxExceptionWaitingDuration: ")
            .append(toIndentedString(maxExceptionWaitingDuration))
            .append("\n");
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
