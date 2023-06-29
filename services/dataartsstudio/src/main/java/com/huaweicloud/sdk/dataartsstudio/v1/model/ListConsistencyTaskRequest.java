package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListConsistencyTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 调度状态 UNKNOWN:未知,NOT_START:未启动,SCHEDULING:调度中,FINISH_SUCCESS:正常结束,KILL:手动停止,RUNNING_EXCEPTION:运行失败
     */
    public static final class ScheduleStatusEnum {

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final ScheduleStatusEnum UNKNOWN = new ScheduleStatusEnum("UNKNOWN");

        /**
         * Enum NOT_START for value: "NOT_START"
         */
        public static final ScheduleStatusEnum NOT_START = new ScheduleStatusEnum("NOT_START");

        /**
         * Enum SCHEDULING for value: "SCHEDULING"
         */
        public static final ScheduleStatusEnum SCHEDULING = new ScheduleStatusEnum("SCHEDULING");

        /**
         * Enum FINISH_SUCCESS for value: "FINISH_SUCCESS"
         */
        public static final ScheduleStatusEnum FINISH_SUCCESS = new ScheduleStatusEnum("FINISH_SUCCESS");

        /**
         * Enum KILL for value: "KILL"
         */
        public static final ScheduleStatusEnum KILL = new ScheduleStatusEnum("KILL");

        /**
         * Enum RUNNING_EXCEPTION for value: "RUNNING_EXCEPTION"
         */
        public static final ScheduleStatusEnum RUNNING_EXCEPTION = new ScheduleStatusEnum("RUNNING_EXCEPTION");

        private static final Map<String, ScheduleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduleStatusEnum> createStaticFields() {
            Map<String, ScheduleStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("NOT_START", NOT_START);
            map.put("SCHEDULING", SCHEDULING);
            map.put("FINISH_SUCCESS", FINISH_SUCCESS);
            map.put("KILL", KILL);
            map.put("RUNNING_EXCEPTION", RUNNING_EXCEPTION);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleStatusEnum(value));
        }

        public static ScheduleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    public ListConsistencyTaskRequest withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 目录ID
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public ListConsistencyTaskRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListConsistencyTaskRequest withScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * 调度状态 UNKNOWN:未知,NOT_START:未启动,SCHEDULING:调度中,FINISH_SUCCESS:正常结束,KILL:手动停止,RUNNING_EXCEPTION:运行失败
     * @return scheduleStatus
     */
    public ScheduleStatusEnum getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ListConsistencyTaskRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 最近运行时间查询区间的开始时间,13位时间戳(精确到毫秒)
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListConsistencyTaskRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 最近运行时间查询区间的结束时间,13位时间戳(精确到毫秒)
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListConsistencyTaskRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListConsistencyTaskRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页条数,最大值为100
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListConsistencyTaskRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页偏移量,最小值0
     * minimum: 0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListConsistencyTaskRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConsistencyTaskRequest that = (ListConsistencyTaskRequest) obj;
        return Objects.equals(this.categoryId, that.categoryId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.scheduleStatus, that.scheduleStatus)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.workspace, that.workspace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, scheduleStatus, startTime, endTime, creator, limit, offset, workspace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConsistencyTaskRequest {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
