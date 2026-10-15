package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：单条调优历史记录，记录一次扩容或缩容操作。
 */
public class AutoscalingHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_id")

    private String tuningId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * **参数解释**：调优动作类型。 **取值范围**：   - SCALE_OUT：扩容（并行度增加）。   - SCALE_IN：缩容（并行度减少）。
     */
    public static final class ActionTypeEnum {

        /**
         * Enum SCALE_OUT for value: "SCALE_OUT"
         */
        public static final ActionTypeEnum SCALE_OUT = new ActionTypeEnum("SCALE_OUT");

        /**
         * Enum SCALE_IN for value: "SCALE_IN"
         */
        public static final ActionTypeEnum SCALE_IN = new ActionTypeEnum("SCALE_IN");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("SCALE_OUT", SCALE_OUT);
            map.put("SCALE_IN", SCALE_IN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionTypeEnum(String value) {
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
        public static ActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_message")

    private String tuningMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_resource_setting")

    private AutoscalingHistoryOldResourceSetting oldResourceSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_resource_setting")

    private AutoscalingHistoryNewResourceSetting newResourceSetting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private OffsetDateTime triggerTime;

    public AutoscalingHistory withTuningId(String tuningId) {
        this.tuningId = tuningId;
        return this;
    }

    /**
     * **参数解释**：调优记录唯一ID。 **取值范围**：UUID格式，长度为36个字符。
     * @return tuningId
     */
    public String getTuningId() {
        return tuningId;
    }

    public void setTuningId(String tuningId) {
        this.tuningId = tuningId;
    }

    public AutoscalingHistory withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Flink作业ID。 **取值范围**：UUIDv7格式，长度为36个字符。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public AutoscalingHistory withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**：调优动作类型。 **取值范围**：   - SCALE_OUT：扩容（并行度增加）。   - SCALE_IN：缩容（并行度减少）。
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public AutoscalingHistory withTuningMessage(String tuningMessage) {
        this.tuningMessage = tuningMessage;
        return this;
    }

    /**
     * **参数解释**：调优消息，国际化字符串，人类可读，不建议程序化解析。 **取值范围**：不涉及。
     * @return tuningMessage
     */
    public String getTuningMessage() {
        return tuningMessage;
    }

    public void setTuningMessage(String tuningMessage) {
        this.tuningMessage = tuningMessage;
    }

    public AutoscalingHistory withOldResourceSetting(AutoscalingHistoryOldResourceSetting oldResourceSetting) {
        this.oldResourceSetting = oldResourceSetting;
        return this;
    }

    public AutoscalingHistory withOldResourceSetting(
        Consumer<AutoscalingHistoryOldResourceSetting> oldResourceSettingSetter) {
        if (this.oldResourceSetting == null) {
            this.oldResourceSetting = new AutoscalingHistoryOldResourceSetting();
            oldResourceSettingSetter.accept(this.oldResourceSetting);
        }

        return this;
    }

    /**
     * Get oldResourceSetting
     * @return oldResourceSetting
     */
    public AutoscalingHistoryOldResourceSetting getOldResourceSetting() {
        return oldResourceSetting;
    }

    public void setOldResourceSetting(AutoscalingHistoryOldResourceSetting oldResourceSetting) {
        this.oldResourceSetting = oldResourceSetting;
    }

    public AutoscalingHistory withNewResourceSetting(AutoscalingHistoryNewResourceSetting newResourceSetting) {
        this.newResourceSetting = newResourceSetting;
        return this;
    }

    public AutoscalingHistory withNewResourceSetting(
        Consumer<AutoscalingHistoryNewResourceSetting> newResourceSettingSetter) {
        if (this.newResourceSetting == null) {
            this.newResourceSetting = new AutoscalingHistoryNewResourceSetting();
            newResourceSettingSetter.accept(this.newResourceSetting);
        }

        return this;
    }

    /**
     * Get newResourceSetting
     * @return newResourceSetting
     */
    public AutoscalingHistoryNewResourceSetting getNewResourceSetting() {
        return newResourceSetting;
    }

    public void setNewResourceSetting(AutoscalingHistoryNewResourceSetting newResourceSetting) {
        this.newResourceSetting = newResourceSetting;
    }

    public AutoscalingHistory withTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * **参数解释**：调优触发时间，格式为ISO 8601标准的UTC日期时间字符串。 **取值范围**：不涉及。
     * @return triggerTime
     */
    public OffsetDateTime getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(OffsetDateTime triggerTime) {
        this.triggerTime = triggerTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoscalingHistory that = (AutoscalingHistory) obj;
        return Objects.equals(this.tuningId, that.tuningId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.tuningMessage, that.tuningMessage)
            && Objects.equals(this.oldResourceSetting, that.oldResourceSetting)
            && Objects.equals(this.newResourceSetting, that.newResourceSetting)
            && Objects.equals(this.triggerTime, that.triggerTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(tuningId, jobId, actionType, tuningMessage, oldResourceSetting, newResourceSetting, triggerTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoscalingHistory {\n");
        sb.append("    tuningId: ").append(toIndentedString(tuningId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    tuningMessage: ").append(toIndentedString(tuningMessage)).append("\n");
        sb.append("    oldResourceSetting: ").append(toIndentedString(oldResourceSetting)).append("\n");
        sb.append("    newResourceSetting: ").append(toIndentedString(newResourceSetting)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
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
