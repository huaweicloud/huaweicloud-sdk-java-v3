package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 任务状态，可为空 - 0 （停止/未启动） - 1 （运行中） */
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

    /** 任务类型 - realtime (实时) - timing (定时) */
    public static final class TaskTypeEnum {

        /** Enum REALTIME for value: "realtime" */
        public static final TaskTypeEnum REALTIME = new TaskTypeEnum("realtime");

        /** Enum TIMING for value: "timing" */
        public static final TaskTypeEnum TIMING = new TaskTypeEnum("timing");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("realtime", REALTIME);
            map.put("timing", TIMING);
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
    @JsonProperty(value = "source_datasource_id")

    private String sourceDatasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_datasource_id")

    private String targetDatasourceId;

    /** 查询排序的条件 */
    public static final class SortFieldEnum {

        /** Enum CREATED_DATE for value: "CREATED_DATE" */
        public static final SortFieldEnum CREATED_DATE = new SortFieldEnum("CREATED_DATE");

        /** Enum STATUS for value: "STATUS" */
        public static final SortFieldEnum STATUS = new SortFieldEnum("STATUS");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("CREATED_DATE", CREATED_DATE);
            map.put("STATUS", STATUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortFieldEnum(String value) {
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
        public static SortFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortFieldEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortFieldEnum(value);
            }
            return result;
        }

        public static SortFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortFieldEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortFieldEnum) {
                return this.value.equals(((SortFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private SortFieldEnum sortField;

    /** 排序类型，可为空 - ASC (升序) - DESC (降序) */
    public static final class SortTypeEnum {

        /** Enum ASC for value: "ASC" */
        public static final SortTypeEnum ASC = new SortTypeEnum("ASC");

        /** Enum DESC for value: "DESC" */
        public static final SortTypeEnum DESC = new SortTypeEnum("DESC");

        private static final Map<String, SortTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortTypeEnum> createStaticFields() {
            Map<String, SortTypeEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortTypeEnum(String value) {
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
        public static SortTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortTypeEnum(value);
            }
            return result;
        }

        public static SortTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortTypeEnum) {
                return this.value.equals(((SortTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private SortTypeEnum sortType;

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
    @JsonProperty(value = "task_tag")

    private String taskTag;

    public ListTasksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示条目数量，最大数量999，超过999后只返回999 minimum: 0 maximum: 999
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页查询，分页的偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0 minimum: 0 maximum: 999999
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTasksRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID，可为空
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListTasksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 模糊匹配任务名称，可为空
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListTasksRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务状态，可为空 - 0 （停止/未启动） - 1 （运行中） minimum: 0 maximum: 1
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListTasksRequest withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /** 任务类型 - realtime (实时) - timing (定时)
     * 
     * @return taskType */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ListTasksRequest withSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
        return this;
    }

    /** 源端数据源ID，可为空
     * 
     * @return sourceDatasourceId */
    public String getSourceDatasourceId() {
        return sourceDatasourceId;
    }

    public void setSourceDatasourceId(String sourceDatasourceId) {
        this.sourceDatasourceId = sourceDatasourceId;
    }

    public ListTasksRequest withTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
        return this;
    }

    /** 目标端数据源ID，可为空
     * 
     * @return targetDatasourceId */
    public String getTargetDatasourceId() {
        return targetDatasourceId;
    }

    public void setTargetDatasourceId(String targetDatasourceId) {
        this.targetDatasourceId = targetDatasourceId;
    }

    public ListTasksRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /** 查询排序的条件
     * 
     * @return sortField */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    public ListTasksRequest withSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
        return this;
    }

    /** 排序类型，可为空 - ASC (升序) - DESC (降序)
     * 
     * @return sortType */
    public SortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SortTypeEnum sortType) {
        this.sortType = sortType;
    }

    public ListTasksRequest withExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /** 执行状态，可为空 - UNSTARTED (未启动) - WAITING (等待执行) - RUNNING (执行中) - SUCCESS (执行成功) - CANCELLED (任务取消) - ERROR (执行异常)
     * 
     * @return executeStatus */
    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    public ListTasksRequest withSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
        return this;
    }

    /** 源端数据源所属集成应用ID，可为空
     * 
     * @return sourceAppId */
    public String getSourceAppId() {
        return sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

    public ListTasksRequest withTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
        return this;
    }

    /** 目标端数据源所属集成应用ID，可为空
     * 
     * @return targetAppId */
    public String getTargetAppId() {
        return targetAppId;
    }

    public void setTargetAppId(String targetAppId) {
        this.targetAppId = targetAppId;
    }

    public ListTasksRequest withTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }

    /** 任务标签，可为空
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
        ListTasksRequest listTasksRequest = (ListTasksRequest) o;
        return Objects.equals(this.instanceId, listTasksRequest.instanceId)
            && Objects.equals(this.limit, listTasksRequest.limit)
            && Objects.equals(this.offset, listTasksRequest.offset)
            && Objects.equals(this.taskId, listTasksRequest.taskId) && Objects.equals(this.name, listTasksRequest.name)
            && Objects.equals(this.status, listTasksRequest.status)
            && Objects.equals(this.taskType, listTasksRequest.taskType)
            && Objects.equals(this.sourceDatasourceId, listTasksRequest.sourceDatasourceId)
            && Objects.equals(this.targetDatasourceId, listTasksRequest.targetDatasourceId)
            && Objects.equals(this.sortField, listTasksRequest.sortField)
            && Objects.equals(this.sortType, listTasksRequest.sortType)
            && Objects.equals(this.executeStatus, listTasksRequest.executeStatus)
            && Objects.equals(this.sourceAppId, listTasksRequest.sourceAppId)
            && Objects.equals(this.targetAppId, listTasksRequest.targetAppId)
            && Objects.equals(this.taskTag, listTasksRequest.taskTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            limit,
            offset,
            taskId,
            name,
            status,
            taskType,
            sourceDatasourceId,
            targetDatasourceId,
            sortField,
            sortType,
            executeStatus,
            sourceAppId,
            targetAppId,
            taskTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    sourceDatasourceId: ").append(toIndentedString(sourceDatasourceId)).append("\n");
        sb.append("    targetDatasourceId: ").append(toIndentedString(targetDatasourceId)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    sourceAppId: ").append(toIndentedString(sourceAppId)).append("\n");
        sb.append("    targetAppId: ").append(toIndentedString(targetAppId)).append("\n");
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
