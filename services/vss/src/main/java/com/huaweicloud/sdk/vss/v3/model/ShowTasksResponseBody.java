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

/** ShowTasksResponseBody */
public class ShowTasksResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /** 扫描任务类型: * normal - 普通任务 * monitor - 监测任务 */
    public static final class TaskTypeEnum {

        /** Enum NORMAL for value: "normal" */
        public static final TaskTypeEnum NORMAL = new TaskTypeEnum("normal");

        /** Enum MONITOR for value: "monitor" */
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
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_settings")

    private TaskSettings taskSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /** 任务状态: * running - 正在运行 * success - 成功 * canceled - 已取消 * waiting - 正在等待 * failure - 失败 */
    public static final class TaskStatusEnum {

        /** Enum RUNNING for value: "running" */
        public static final TaskStatusEnum RUNNING = new TaskStatusEnum("running");

        /** Enum SUCCESS for value: "success" */
        public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("success");

        /** Enum CANCELED for value: "canceled" */
        public static final TaskStatusEnum CANCELED = new TaskStatusEnum("canceled");

        /** Enum WAITING for value: "waiting" */
        public static final TaskStatusEnum WAITING = new TaskStatusEnum("waiting");

        /** Enum FAILURE for value: "failure" */
        public static final TaskStatusEnum FAILURE = new TaskStatusEnum("failure");

        private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStatusEnum> createStaticFields() {
            Map<String, TaskStatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("success", SUCCESS);
            map.put("canceled", CANCELED);
            map.put("waiting", WAITING);
            map.put("failure", FAILURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskStatusEnum(String value) {
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
        public static TaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskStatusEnum(value);
            }
            return result;
        }

        public static TaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskStatusEnum) {
                return this.value.equals(((TaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private TaskStatusEnum taskStatus;

    /** 监测任务状态: * running - 正在运行 * waiting - 正在等待 * finished - 已完成 */
    public static final class ScheduleStatusEnum {

        /** Enum RUNNING for value: "running" */
        public static final ScheduleStatusEnum RUNNING = new ScheduleStatusEnum("running");

        /** Enum WAITING for value: "waiting" */
        public static final ScheduleStatusEnum WAITING = new ScheduleStatusEnum("waiting");

        /** Enum FINISHED for value: "finished" */
        public static final ScheduleStatusEnum FINISHED = new ScheduleStatusEnum("finished");

        private static final Map<String, ScheduleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduleStatusEnum> createStaticFields() {
            Map<String, ScheduleStatusEnum> map = new HashMap<>();
            map.put("running", RUNNING);
            map.put("waiting", WAITING);
            map.put("finished", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduleStatusEnum(String value) {
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
        public static ScheduleStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ScheduleStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScheduleStatusEnum(value);
            }
            return result;
        }

        public static ScheduleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ScheduleStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduleStatusEnum) {
                return this.value.equals(((ScheduleStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private ScheduleStatusEnum scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_num")

    private Long packNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    /** 安全等级: * - safety : 安全 * - average : 中风险 * - highrisk: 高风险 */
    public static final class SafeLevelEnum {

        /** Enum SAFETY for value: "safety" */
        public static final SafeLevelEnum SAFETY = new SafeLevelEnum("safety");

        /** Enum AVERAGE for value: "average" */
        public static final SafeLevelEnum AVERAGE = new SafeLevelEnum("average");

        /** Enum HIGHRISK for value: "highrisk" */
        public static final SafeLevelEnum HIGHRISK = new SafeLevelEnum("highrisk");

        private static final Map<String, SafeLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SafeLevelEnum> createStaticFields() {
            Map<String, SafeLevelEnum> map = new HashMap<>();
            map.put("safety", SAFETY);
            map.put("average", AVERAGE);
            map.put("highrisk", HIGHRISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SafeLevelEnum(String value) {
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
        public static SafeLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SafeLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SafeLevelEnum(value);
            }
            return result;
        }

        public static SafeLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SafeLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SafeLevelEnum) {
                return this.value.equals(((SafeLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_level")

    private SafeLevelEnum safeLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics")

    private VulnsLevel statistics;

    public ShowTasksResponseBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /** 任务名称
     * 
     * @return taskName */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowTasksResponseBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 待扫描的目标网址
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowTasksResponseBody withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /** 扫描任务类型: * normal - 普通任务 * monitor - 监测任务
     * 
     * @return taskType */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ShowTasksResponseBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTasksResponseBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 域名
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowTasksResponseBody withTaskSettings(TaskSettings taskSettings) {
        this.taskSettings = taskSettings;
        return this;
    }

    public ShowTasksResponseBody withTaskSettings(Consumer<TaskSettings> taskSettingsSetter) {
        if (this.taskSettings == null) {
            this.taskSettings = new TaskSettings();
            taskSettingsSetter.accept(this.taskSettings);
        }

        return this;
    }

    /** Get taskSettings
     * 
     * @return taskSettings */
    public TaskSettings getTaskSettings() {
        return taskSettings;
    }

    public void setTaskSettings(TaskSettings taskSettings) {
        this.taskSettings = taskSettings;
    }

    public ShowTasksResponseBody withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建任务的时间
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowTasksResponseBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 任务启动的时间
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowTasksResponseBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 任务结束的时间
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowTasksResponseBody withTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /** 任务状态: * running - 正在运行 * success - 成功 * canceled - 已取消 * waiting - 正在等待 * failure - 失败
     * 
     * @return taskStatus */
    public TaskStatusEnum getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatusEnum taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowTasksResponseBody withScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /** 监测任务状态: * running - 正在运行 * waiting - 正在等待 * finished - 已完成
     * 
     * @return scheduleStatus */
    public ScheduleStatusEnum getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ShowTasksResponseBody withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /** 任务进度 minimum: 0 maximum: 100
     * 
     * @return progress */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ShowTasksResponseBody withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** 任务状态描述
     * 
     * @return reason */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ShowTasksResponseBody withPackNum(Long packNum) {
        this.packNum = packNum;
        return this;
    }

    /** 包总数 minimum: 0 maximum: 100000
     * 
     * @return packNum */
    public Long getPackNum() {
        return packNum;
    }

    public void setPackNum(Long packNum) {
        this.packNum = packNum;
    }

    public ShowTasksResponseBody withScore(Integer score) {
        this.score = score;
        return this;
    }

    /** 安全分数 minimum: 0 maximum: 100
     * 
     * @return score */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ShowTasksResponseBody withSafeLevel(SafeLevelEnum safeLevel) {
        this.safeLevel = safeLevel;
        return this;
    }

    /** 安全等级: * - safety : 安全 * - average : 中风险 * - highrisk: 高风险
     * 
     * @return safeLevel */
    public SafeLevelEnum getSafeLevel() {
        return safeLevel;
    }

    public void setSafeLevel(SafeLevelEnum safeLevel) {
        this.safeLevel = safeLevel;
    }

    public ShowTasksResponseBody withStatistics(VulnsLevel statistics) {
        this.statistics = statistics;
        return this;
    }

    public ShowTasksResponseBody withStatistics(Consumer<VulnsLevel> statisticsSetter) {
        if (this.statistics == null) {
            this.statistics = new VulnsLevel();
            statisticsSetter.accept(this.statistics);
        }

        return this;
    }

    /** Get statistics
     * 
     * @return statistics */
    public VulnsLevel getStatistics() {
        return statistics;
    }

    public void setStatistics(VulnsLevel statistics) {
        this.statistics = statistics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTasksResponseBody showTasksResponseBody = (ShowTasksResponseBody) o;
        return Objects.equals(this.taskName, showTasksResponseBody.taskName)
            && Objects.equals(this.url, showTasksResponseBody.url)
            && Objects.equals(this.taskType, showTasksResponseBody.taskType)
            && Objects.equals(this.taskId, showTasksResponseBody.taskId)
            && Objects.equals(this.domainName, showTasksResponseBody.domainName)
            && Objects.equals(this.taskSettings, showTasksResponseBody.taskSettings)
            && Objects.equals(this.createTime, showTasksResponseBody.createTime)
            && Objects.equals(this.startTime, showTasksResponseBody.startTime)
            && Objects.equals(this.endTime, showTasksResponseBody.endTime)
            && Objects.equals(this.taskStatus, showTasksResponseBody.taskStatus)
            && Objects.equals(this.scheduleStatus, showTasksResponseBody.scheduleStatus)
            && Objects.equals(this.progress, showTasksResponseBody.progress)
            && Objects.equals(this.reason, showTasksResponseBody.reason)
            && Objects.equals(this.packNum, showTasksResponseBody.packNum)
            && Objects.equals(this.score, showTasksResponseBody.score)
            && Objects.equals(this.safeLevel, showTasksResponseBody.safeLevel)
            && Objects.equals(this.statistics, showTasksResponseBody.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            url,
            taskType,
            taskId,
            domainName,
            taskSettings,
            createTime,
            startTime,
            endTime,
            taskStatus,
            scheduleStatus,
            progress,
            reason,
            packNum,
            score,
            safeLevel,
            statistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTasksResponseBody {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    taskSettings: ").append(toIndentedString(taskSettings)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    packNum: ").append(toIndentedString(packNum)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    safeLevel: ").append(toIndentedString(safeLevel)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
