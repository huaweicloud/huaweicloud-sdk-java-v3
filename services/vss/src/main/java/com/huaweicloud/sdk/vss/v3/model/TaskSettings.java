package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskSettings
 */
public class TaskSettings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timer")

    private String timer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_time")

    private String triggerTime;

    /**
     * 监测任务的定时触发周期:   * everyday - 每日   * threedays - 每三天   * everyweek - 每星期   * everymonth - 每月 
     */
    public static final class TaskPeriodEnum {

        /**
         * Enum EVERYDAY for value: "everyday"
         */
        public static final TaskPeriodEnum EVERYDAY = new TaskPeriodEnum("everyday");

        /**
         * Enum THREEDAYS for value: "threedays"
         */
        public static final TaskPeriodEnum THREEDAYS = new TaskPeriodEnum("threedays");

        /**
         * Enum EVERYWEEK for value: "everyweek"
         */
        public static final TaskPeriodEnum EVERYWEEK = new TaskPeriodEnum("everyweek");

        /**
         * Enum EVERYMONTH for value: "everymonth"
         */
        public static final TaskPeriodEnum EVERYMONTH = new TaskPeriodEnum("everymonth");

        private static final Map<String, TaskPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskPeriodEnum> createStaticFields() {
            Map<String, TaskPeriodEnum> map = new HashMap<>();
            map.put("everyday", EVERYDAY);
            map.put("threedays", THREEDAYS);
            map.put("everyweek", EVERYWEEK);
            map.put("everymonth", EVERYMONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskPeriodEnum(String value) {
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
        public static TaskPeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TaskPeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskPeriodEnum(value);
            }
            return result;
        }

        public static TaskPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskPeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskPeriodEnum) {
                return this.value.equals(((TaskPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_period")

    private TaskPeriodEnum taskPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_config")

    private TaskSettingsTaskConfig taskConfig;

    public TaskSettings withTimer(String timer) {
        this.timer = timer;
        return this;
    }

    /**
     * 普通任务的定时启动时间
     * @return timer
     */
    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public TaskSettings withTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    /**
     * 监测任务的定时触发时间
     * @return triggerTime
     */
    public String getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }

    public TaskSettings withTaskPeriod(TaskPeriodEnum taskPeriod) {
        this.taskPeriod = taskPeriod;
        return this;
    }

    /**
     * 监测任务的定时触发周期:   * everyday - 每日   * threedays - 每三天   * everyweek - 每星期   * everymonth - 每月 
     * @return taskPeriod
     */
    public TaskPeriodEnum getTaskPeriod() {
        return taskPeriod;
    }

    public void setTaskPeriod(TaskPeriodEnum taskPeriod) {
        this.taskPeriod = taskPeriod;
    }

    public TaskSettings withTaskConfig(TaskSettingsTaskConfig taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    public TaskSettings withTaskConfig(Consumer<TaskSettingsTaskConfig> taskConfigSetter) {
        if (this.taskConfig == null) {
            this.taskConfig = new TaskSettingsTaskConfig();
            taskConfigSetter.accept(this.taskConfig);
        }

        return this;
    }

    /**
     * Get taskConfig
     * @return taskConfig
     */
    public TaskSettingsTaskConfig getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(TaskSettingsTaskConfig taskConfig) {
        this.taskConfig = taskConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskSettings taskSettings = (TaskSettings) o;
        return Objects.equals(this.timer, taskSettings.timer)
            && Objects.equals(this.triggerTime, taskSettings.triggerTime)
            && Objects.equals(this.taskPeriod, taskSettings.taskPeriod)
            && Objects.equals(this.taskConfig, taskSettings.taskConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timer, triggerTime, taskPeriod, taskConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSettings {\n");
        sb.append("    timer: ").append(toIndentedString(timer)).append("\n");
        sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
        sb.append("    taskPeriod: ").append(toIndentedString(taskPeriod)).append("\n");
        sb.append("    taskConfig: ").append(toIndentedString(taskConfig)).append("\n");
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
