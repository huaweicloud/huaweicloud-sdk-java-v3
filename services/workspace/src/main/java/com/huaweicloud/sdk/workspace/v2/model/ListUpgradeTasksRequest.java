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
 * Request Object
 */
public class ListUpgradeTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

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
    @JsonProperty(value = "is_enable")

    private Integer isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execute_status")

    private String lastExecuteStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListUpgradeTasksRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListUpgradeTasksRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称（支持模糊查询）
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListUpgradeTasksRequest withTaskType(Integer taskType) {
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

    public ListUpgradeTasksRequest withScheduledType(ScheduledTypeEnum scheduledType) {
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

    public ListUpgradeTasksRequest withIsEnable(Integer isEnable) {
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

    public ListUpgradeTasksRequest withLastExecuteStatus(String lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * 上次执行状态
     * @return lastExecuteStatus
     */
    public String getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(String lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public ListUpgradeTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListUpgradeTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，默认10，最大100
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUpgradeTasksRequest that = (ListUpgradeTasksRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.isEnable, that.isEnable)
            && Objects.equals(this.lastExecuteStatus, that.lastExecuteStatus)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, taskType, scheduledType, isEnable, lastExecuteStatus, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpgradeTasksRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    lastExecuteStatus: ").append(toIndentedString(lastExecuteStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
