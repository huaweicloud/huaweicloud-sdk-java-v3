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
 * CreateTasksRequestBody
 */
public class CreateTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * 扫描任务类型:   * normal - 普通任务   * monitor - 监测任务 
     */
    public static final class TaskTypeEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final TaskTypeEnum NORMAL = new TaskTypeEnum("normal");

        /**
         * Enum MONITOR for value: "monitor"
         */
        public static final TaskTypeEnum MONITOR = new TaskTypeEnum("monitor");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("monitor", MONITOR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskPeriodEnum(value));
        }

        public static TaskPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public CreateTasksRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateTasksRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 待扫描的目标网址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateTasksRequestBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 扫描任务类型:   * normal - 普通任务   * monitor - 监测任务 
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public CreateTasksRequestBody withTimer(String timer) {
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

    public CreateTasksRequestBody withTriggerTime(String triggerTime) {
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

    public CreateTasksRequestBody withTaskPeriod(TaskPeriodEnum taskPeriod) {
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

    public CreateTasksRequestBody withTaskConfig(TaskSettingsTaskConfig taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    public CreateTasksRequestBody withTaskConfig(Consumer<TaskSettingsTaskConfig> taskConfigSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTasksRequestBody that = (CreateTasksRequestBody) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.url, that.url)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.timer, that.timer)
            && Objects.equals(this.triggerTime, that.triggerTime) && Objects.equals(this.taskPeriod, that.taskPeriod)
            && Objects.equals(this.taskConfig, that.taskConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, url, taskType, timer, triggerTime, taskPeriod, taskConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTasksRequestBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
