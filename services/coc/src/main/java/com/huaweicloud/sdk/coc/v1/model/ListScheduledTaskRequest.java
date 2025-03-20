package com.huaweicloud.sdk.coc.v1.model;

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
public class ListScheduledTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /**
     * 定时类型(ONCE,PERIODIC,CRON)
     */
    public static final class ScheduledTypeEnum {

        /**
         * Enum ONCE for value: "ONCE"
         */
        public static final ScheduledTypeEnum ONCE = new ScheduledTypeEnum("ONCE");

        /**
         * Enum PERIODIC for value: "PERIODIC"
         */
        public static final ScheduledTypeEnum PERIODIC = new ScheduledTypeEnum("PERIODIC");

        /**
         * Enum CRON for value: "CRON"
         */
        public static final ScheduledTypeEnum CRON = new ScheduledTypeEnum("CRON");

        private static final Map<String, ScheduledTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduledTypeEnum> createStaticFields() {
            Map<String, ScheduledTypeEnum> map = new HashMap<>();
            map.put("ONCE", ONCE);
            map.put("PERIODIC", PERIODIC);
            map.put("CRON", CRON);
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

    /**
     * 引用任务类型(SCRIPT,RUNBOOK)
     */
    public static final class TaskTypeEnum {

        /**
         * Enum SCRIPT for value: "SCRIPT"
         */
        public static final TaskTypeEnum SCRIPT = new TaskTypeEnum("SCRIPT");

        /**
         * Enum RUNBOOK for value: "RUNBOOK"
         */
        public static final TaskTypeEnum RUNBOOK = new TaskTypeEnum("RUNBOOK");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("SCRIPT", SCRIPT);
            map.put("RUNBOOK", RUNBOOK);
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

    /**
     * 任务类型(CUSTOMIZATION,COMMUNAL)
     */
    public static final class AssociatedTaskTypeEnum {

        /**
         * Enum CUSTOMIZATION for value: "CUSTOMIZATION"
         */
        public static final AssociatedTaskTypeEnum CUSTOMIZATION = new AssociatedTaskTypeEnum("CUSTOMIZATION");

        /**
         * Enum COMMUNAL for value: "COMMUNAL"
         */
        public static final AssociatedTaskTypeEnum COMMUNAL = new AssociatedTaskTypeEnum("COMMUNAL");

        private static final Map<String, AssociatedTaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociatedTaskTypeEnum> createStaticFields() {
            Map<String, AssociatedTaskTypeEnum> map = new HashMap<>();
            map.put("CUSTOMIZATION", CUSTOMIZATION);
            map.put("COMMUNAL", COMMUNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociatedTaskTypeEnum(String value) {
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
        public static AssociatedTaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssociatedTaskTypeEnum(value));
        }

        public static AssociatedTaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociatedTaskTypeEnum) {
                return this.value.equals(((AssociatedTaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private AssociatedTaskTypeEnum associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer_user_name")

    private String reviewerUserName;

    /**
     * 审批状态(PENDING,REJECTED,PASSED)
     */
    public static final class ApproveStatusEnum {

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final ApproveStatusEnum PENDING = new ApproveStatusEnum("PENDING");

        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final ApproveStatusEnum REJECTED = new ApproveStatusEnum("REJECTED");

        /**
         * Enum PASSED for value: "PASSED"
         */
        public static final ApproveStatusEnum PASSED = new ApproveStatusEnum("PASSED");

        private static final Map<String, ApproveStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApproveStatusEnum> createStaticFields() {
            Map<String, ApproveStatusEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("REJECTED", REJECTED);
            map.put("PASSED", PASSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApproveStatusEnum(String value) {
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
        public static ApproveStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApproveStatusEnum(value));
        }

        public static ApproveStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApproveStatusEnum) {
                return this.value.equals(((ApproveStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_status")

    private ApproveStatusEnum approveStatus;

    /**
     * 最近执行状态(READY,PROCESSING,ABNORMAL,FINISHED,PAUSED,CANCELED)
     */
    public static final class LastExecutionStatusEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final LastExecutionStatusEnum READY = new LastExecutionStatusEnum("READY");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final LastExecutionStatusEnum PROCESSING = new LastExecutionStatusEnum("PROCESSING");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final LastExecutionStatusEnum ABNORMAL = new LastExecutionStatusEnum("ABNORMAL");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final LastExecutionStatusEnum FINISHED = new LastExecutionStatusEnum("FINISHED");

        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final LastExecutionStatusEnum PAUSED = new LastExecutionStatusEnum("PAUSED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final LastExecutionStatusEnum CANCELED = new LastExecutionStatusEnum("CANCELED");

        private static final Map<String, LastExecutionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LastExecutionStatusEnum> createStaticFields() {
            Map<String, LastExecutionStatusEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("PROCESSING", PROCESSING);
            map.put("ABNORMAL", ABNORMAL);
            map.put("FINISHED", FINISHED);
            map.put("PAUSED", PAUSED);
            map.put("CANCELED", CANCELED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LastExecutionStatusEnum(String value) {
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
        public static LastExecutionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LastExecutionStatusEnum(value));
        }

        public static LastExecutionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LastExecutionStatusEnum) {
                return this.value.equals(((LastExecutionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_status")

    private LastExecutionStatusEnum lastExecutionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_start_time")

    private Long lastExecutionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_end_time")

    private Long lastExecutionEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListScheduledTaskRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListScheduledTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListScheduledTaskRequest withTaskName(String taskName) {
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

    public ListScheduledTaskRequest withScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * 定时类型(ONCE,PERIODIC,CRON)
     * @return scheduledType
     */
    public ScheduledTypeEnum getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
    }

    public ListScheduledTaskRequest withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 引用任务类型(SCRIPT,RUNBOOK)
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ListScheduledTaskRequest withAssociatedTaskType(AssociatedTaskTypeEnum associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 任务类型(CUSTOMIZATION,COMMUNAL)
     * @return associatedTaskType
     */
    public AssociatedTaskTypeEnum getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(AssociatedTaskTypeEnum associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public ListScheduledTaskRequest withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ListScheduledTaskRequest withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ListScheduledTaskRequest withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 审批人ID
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public ListScheduledTaskRequest withReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
        return this;
    }

    /**
     * 审批人昵称
     * @return reviewerUserName
     */
    public String getReviewerUserName() {
        return reviewerUserName;
    }

    public void setReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
    }

    public ListScheduledTaskRequest withApproveStatus(ApproveStatusEnum approveStatus) {
        this.approveStatus = approveStatus;
        return this;
    }

    /**
     * 审批状态(PENDING,REJECTED,PASSED)
     * @return approveStatus
     */
    public ApproveStatusEnum getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(ApproveStatusEnum approveStatus) {
        this.approveStatus = approveStatus;
    }

    public ListScheduledTaskRequest withLastExecutionStatus(LastExecutionStatusEnum lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
        return this;
    }

    /**
     * 最近执行状态(READY,PROCESSING,ABNORMAL,FINISHED,PAUSED,CANCELED)
     * @return lastExecutionStatus
     */
    public LastExecutionStatusEnum getLastExecutionStatus() {
        return lastExecutionStatus;
    }

    public void setLastExecutionStatus(LastExecutionStatusEnum lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
    }

    public ListScheduledTaskRequest withLastExecutionStartTime(Long lastExecutionStartTime) {
        this.lastExecutionStartTime = lastExecutionStartTime;
        return this;
    }

    /**
     * 最近执行时间的查询开始时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return lastExecutionStartTime
     */
    public Long getLastExecutionStartTime() {
        return lastExecutionStartTime;
    }

    public void setLastExecutionStartTime(Long lastExecutionStartTime) {
        this.lastExecutionStartTime = lastExecutionStartTime;
    }

    public ListScheduledTaskRequest withLastExecutionEndTime(Long lastExecutionEndTime) {
        this.lastExecutionEndTime = lastExecutionEndTime;
        return this;
    }

    /**
     * 最近执行时间的查询结束时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return lastExecutionEndTime
     */
    public Long getLastExecutionEndTime() {
        return lastExecutionEndTime;
    }

    public void setLastExecutionEndTime(Long lastExecutionEndTime) {
        this.lastExecutionEndTime = lastExecutionEndTime;
    }

    public ListScheduledTaskRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页数据的最后一条记录的id
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListScheduledTaskRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListScheduledTaskRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListScheduledTaskRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页指针
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

    public ListScheduledTaskRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
     * minimum: 1
     * maximum: 1000
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
        ListScheduledTaskRequest that = (ListScheduledTaskRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.scheduledType, that.scheduledType) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.reviewerUserName, that.reviewerUserName)
            && Objects.equals(this.approveStatus, that.approveStatus)
            && Objects.equals(this.lastExecutionStatus, that.lastExecutionStatus)
            && Objects.equals(this.lastExecutionStartTime, that.lastExecutionStartTime)
            && Objects.equals(this.lastExecutionEndTime, that.lastExecutionEndTime)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            taskId,
            taskName,
            scheduledType,
            taskType,
            associatedTaskType,
            riskLevel,
            createdBy,
            reviewer,
            reviewerUserName,
            approveStatus,
            lastExecutionStatus,
            lastExecutionStartTime,
            lastExecutionEndTime,
            marker,
            regionId,
            resourceId,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTaskRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    reviewerUserName: ").append(toIndentedString(reviewerUserName)).append("\n");
        sb.append("    approveStatus: ").append(toIndentedString(approveStatus)).append("\n");
        sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
        sb.append("    lastExecutionStartTime: ").append(toIndentedString(lastExecutionStartTime)).append("\n");
        sb.append("    lastExecutionEndTime: ").append(toIndentedString(lastExecutionEndTime)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
