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
 * 升级任务VO
 */
public class UpgradeScheduledTaskVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private Integer taskType;

    /**
     * 执行周期类型：FIXED_TIME-指定时间 DAY-按天 WEEK-按周 MONTH-按月
     */
    public static final class ScheduledTypeEnum {

        /**
         * Enum FIXED_TIME for value: "FIXED_TIME"
         */
        public static final ScheduledTypeEnum FIXED_TIME = new ScheduledTypeEnum("FIXED_TIME");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final ScheduledTypeEnum DAY = new ScheduledTypeEnum("DAY");

        /**
         * Enum WEEK for value: "WEEK"
         */
        public static final ScheduledTypeEnum WEEK = new ScheduledTypeEnum("WEEK");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final ScheduledTypeEnum MONTH = new ScheduledTypeEnum("MONTH");

        private static final Map<String, ScheduledTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduledTypeEnum> createStaticFields() {
            Map<String, ScheduledTypeEnum> map = new HashMap<>();
            map.put("FIXED_TIME", FIXED_TIME);
            map.put("DAY", DAY);
            map.put("WEEK", WEEK);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduledTypeEnum(String value) {
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
        public static ScheduledTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduledTypeEnum(value));
        }

        public static ScheduledTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduledTypeEnum) {
                return this.value.equals(((ScheduledTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private ScheduledTypeEnum scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execute_status")

    private String lastExecuteStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_execute_time")

    private String nextExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Integer isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_strategy")

    private Integer executeStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpgradeScheduledTaskVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpgradeScheduledTaskVO withTaskName(String taskName) {
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

    public UpgradeScheduledTaskVO withTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型：0-云桌面 1-应用服务器 2-镜像
     * minimum: 0
     * maximum: 2
     * @return taskType
     */
    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public UpgradeScheduledTaskVO withScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 执行周期类型：FIXED_TIME-指定时间 DAY-按天 WEEK-按周 MONTH-按月
     * @return scheduledType
     */
    public ScheduledTypeEnum getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
    }

    public UpgradeScheduledTaskVO withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public UpgradeScheduledTaskVO withLastExecuteStatus(String lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * 最近一次执行情况：SUCCESS-成功 FAILED-失败 RUNNING-执行中 WAITING-等待
     * @return lastExecuteStatus
     */
    public String getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(String lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public UpgradeScheduledTaskVO withNextExecuteTime(String nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
        return this;
    }

    /**
     * 下次执行时间
     * @return nextExecuteTime
     */
    public String getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(String nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    public UpgradeScheduledTaskVO withIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * 启用状态：0-未启用 1-启用
     * minimum: 0
     * maximum: 1
     * @return isEnable
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public UpgradeScheduledTaskVO withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public UpgradeScheduledTaskVO withExecuteStrategy(Integer executeStrategy) {
        this.executeStrategy = executeStrategy;
        return this;
    }

    /**
     * 执行策略：0-全量下发 1-灰度下发
     * minimum: 0
     * maximum: 1
     * @return executeStrategy
     */
    public Integer getExecuteStrategy() {
        return executeStrategy;
    }

    public void setExecuteStrategy(Integer executeStrategy) {
        this.executeStrategy = executeStrategy;
    }

    public UpgradeScheduledTaskVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeScheduledTaskVO that = (UpgradeScheduledTaskVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.lastExecuteStatus, that.lastExecuteStatus)
            && Objects.equals(this.nextExecuteTime, that.nextExecuteTime)
            && Objects.equals(this.isEnable, that.isEnable) && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.executeStrategy, that.executeStrategy)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskName,
            taskType,
            scheduledType,
            timezone,
            lastExecuteStatus,
            nextExecuteTime,
            isEnable,
            targetVersion,
            executeStrategy,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeScheduledTaskVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    lastExecuteStatus: ").append(toIndentedString(lastExecuteStatus)).append("\n");
        sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    executeStrategy: ").append(toIndentedString(executeStrategy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
