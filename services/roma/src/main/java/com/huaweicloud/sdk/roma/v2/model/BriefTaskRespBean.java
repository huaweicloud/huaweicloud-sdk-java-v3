package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 查询任务列表返回的对象 */
public class BriefTaskRespBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    /** 任务类型 - REALTIME (实时) - TIMING (定时) */
    public static final class TaskTypeEnum {

        /** Enum REALTIME for value: "REALTIME" */
        public static final TaskTypeEnum REALTIME = new TaskTypeEnum("REALTIME");

        /** Enum TIMING for value: "TIMING" */
        public static final TaskTypeEnum TIMING = new TaskTypeEnum("TIMING");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("REALTIME", REALTIME);
            map.put("TIMING", TIMING);
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

    /** 任务状态 - 0 (停止/未启动) - 1 (运行中) */
    public static final class StatusEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private LocalDate createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private Long lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private String executeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_app_id")

    private String sourceAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_app_id")

    private String targetAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_instance_id")

    private String sourceInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_type")

    private String extType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_tag")

    private String taskTag;

    public BriefTaskRespBean withTaskId(String taskId) {
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

    public BriefTaskRespBean withTaskName(String taskName) {
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

    public BriefTaskRespBean withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /** 任务类型 - REALTIME (实时) - TIMING (定时)
     * 
     * @return taskType */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public BriefTaskRespBean withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务状态 - 0 (停止/未启动) - 1 (运行中) minimum: 0 maximum: 1
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BriefTaskRespBean withCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /** 创建时间
     * 
     * @return createdDate */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public BriefTaskRespBean withVersion(String version) {
        this.version = version;
        return this;
    }

    /** 任务的版本
     * 
     * @return version */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BriefTaskRespBean withLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** 上次修改时间 minimum: 1 maximum: -8446744073709551617
     * 
     * @return lastModifiedTime */
    public Long getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public BriefTaskRespBean withExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /** 任务执行状态 - UNSTARTED (未启动) - WAITING (等待执行) - RUNNING (执行中) - SUCCESS (执行成功) - CANCELLED (任务取消) - ERROR (执行异常)
     * 
     * @return executeStatus */
    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    public BriefTaskRespBean withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /** 源端数据源所属应用ID
     * 
     * @return sourceAppId */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public BriefTaskRespBean withTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    /** 目标端数据源所属应用ID
     * 
     * @return targetAppId */
    public String getTargetAppId() {
        return targetAppId;
    }

    public void setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
    }

    public BriefTaskRespBean withSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }

    /** 源端实例ID
     * 
     * @return sourceInstanceId */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    public void setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
    }

    public BriefTaskRespBean withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /** 目标端实例ID
     * 
     * @return targetInstanceId */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public BriefTaskRespBean withExtType(String extType) {
        this.extType = extType;
        return this;
    }

    /** 组合任务类型, 可为空
     * 
     * @return extType */
    public String getExtType() {
        return extType;
    }

    public void setExtType(String extType) {
        this.extType = extType;
    }

    public BriefTaskRespBean withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public BriefTaskRespBean withTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }

    /** 任务标签
     * 
     * @return taskTag */
    public String getTaskTag() {
        return taskTag;
    }

    public void setTaskTag(String taskTag) {
        this.taskTag = taskTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BriefTaskRespBean briefTaskRespBean = (BriefTaskRespBean) o;
        return Objects.equals(this.taskId, briefTaskRespBean.taskId)
            && Objects.equals(this.taskName, briefTaskRespBean.taskName)
            && Objects.equals(this.taskType, briefTaskRespBean.taskType)
            && Objects.equals(this.status, briefTaskRespBean.status)
            && Objects.equals(this.createdDate, briefTaskRespBean.createdDate)
            && Objects.equals(this.version, briefTaskRespBean.version)
            && Objects.equals(this.lastModifiedTime, briefTaskRespBean.lastModifiedTime)
            && Objects.equals(this.executeStatus, briefTaskRespBean.executeStatus)
            && Objects.equals(this.sourceAppId, briefTaskRespBean.sourceAppId)
            && Objects.equals(this.targetAppId, briefTaskRespBean.targetAppId)
            && Objects.equals(this.sourceInstanceId, briefTaskRespBean.sourceInstanceId)
            && Objects.equals(this.targetInstanceId, briefTaskRespBean.targetInstanceId)
            && Objects.equals(this.extType, briefTaskRespBean.extType)
            && Objects.equals(this.enterpriseProjectId, briefTaskRespBean.enterpriseProjectId)
            && Objects.equals(this.taskTag, briefTaskRespBean.taskTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            taskType,
            status,
            createdDate,
            version,
            lastModifiedTime,
            executeStatus,
            sourceAppId,
            targetAppId,
            sourceInstanceId,
            targetInstanceId,
            extType,
            enterpriseProjectId,
            taskTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefTaskRespBean {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
        sb.append("    sourceInstanceId: ").append(toIndentedString(sourceInstanceId)).append("\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    extType: ").append(toIndentedString(extType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    taskTag: ").append(toIndentedString(taskTag)).append("\n");
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
