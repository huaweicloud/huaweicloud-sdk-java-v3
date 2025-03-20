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
public class ListScheduledTaskHistoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_start_time")

    private Long startedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_end_time")

    private Long startedEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_start_time")

    private Long finishedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_end_time")

    private Long finishedEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 排序字段名：支持 started_time,finished_time
     */
    public static final class SortKeyEnum {

        /**
         * Enum STARTED_TIME for value: "started_time"
         */
        public static final SortKeyEnum STARTED_TIME = new SortKeyEnum("started_time");

        /**
         * Enum FINISHED_TIME for value: "finished_time"
         */
        public static final SortKeyEnum FINISHED_TIME = new SortKeyEnum("finished_time");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("started_time", STARTED_TIME);
            map.put("finished_time", FINISHED_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * 排序方式，asc升序，desc降序
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    public ListScheduledTaskHistoryRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * ID of ScheduledTask
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListScheduledTaskHistoryRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工单ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListScheduledTaskHistoryRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListScheduledTaskHistoryRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListScheduledTaskHistoryRequest withStartedStartTime(Long startedStartTime) {
        this.startedStartTime = startedStartTime;
        return this;
    }

    /**
     * 开始时间参数的查询开始区间时间戳
     * minimum: 0
     * maximum: 9000000000000000
     * @return startedStartTime
     */
    public Long getStartedStartTime() {
        return startedStartTime;
    }

    public void setStartedStartTime(Long startedStartTime) {
        this.startedStartTime = startedStartTime;
    }

    public ListScheduledTaskHistoryRequest withStartedEndTime(Long startedEndTime) {
        this.startedEndTime = startedEndTime;
        return this;
    }

    /**
     * 开始时间参数的查询结束区间时间戳
     * minimum: 0
     * maximum: 9000000000000000
     * @return startedEndTime
     */
    public Long getStartedEndTime() {
        return startedEndTime;
    }

    public void setStartedEndTime(Long startedEndTime) {
        this.startedEndTime = startedEndTime;
    }

    public ListScheduledTaskHistoryRequest withFinishedStartTime(Long finishedStartTime) {
        this.finishedStartTime = finishedStartTime;
        return this;
    }

    /**
     * 结束时间参数的查询开始区间时间戳
     * @return finishedStartTime
     */
    public Long getFinishedStartTime() {
        return finishedStartTime;
    }

    public void setFinishedStartTime(Long finishedStartTime) {
        this.finishedStartTime = finishedStartTime;
    }

    public ListScheduledTaskHistoryRequest withFinishedEndTime(Long finishedEndTime) {
        this.finishedEndTime = finishedEndTime;
        return this;
    }

    /**
     * 结束时间参数的查询结束区间时间戳
     * minimum: 0
     * maximum: 9000000000000000
     * @return finishedEndTime
     */
    public Long getFinishedEndTime() {
        return finishedEndTime;
    }

    public void setFinishedEndTime(Long finishedEndTime) {
        this.finishedEndTime = finishedEndTime;
    }

    public ListScheduledTaskHistoryRequest withMarker(String marker) {
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

    public ListScheduledTaskHistoryRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页指针
     * minimum: 0
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListScheduledTaskHistoryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
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

    public ListScheduledTaskHistoryRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段名：支持 started_time,finished_time
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListScheduledTaskHistoryRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式，asc升序，desc降序
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledTaskHistoryRequest that = (ListScheduledTaskHistoryRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.region, that.region) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startedStartTime, that.startedStartTime)
            && Objects.equals(this.startedEndTime, that.startedEndTime)
            && Objects.equals(this.finishedStartTime, that.finishedStartTime)
            && Objects.equals(this.finishedEndTime, that.finishedEndTime) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            id,
            region,
            status,
            startedStartTime,
            startedEndTime,
            finishedStartTime,
            finishedEndTime,
            marker,
            offset,
            limit,
            sortKey,
            sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledTaskHistoryRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startedStartTime: ").append(toIndentedString(startedStartTime)).append("\n");
        sb.append("    startedEndTime: ").append(toIndentedString(startedEndTime)).append("\n");
        sb.append("    finishedStartTime: ").append(toIndentedString(finishedStartTime)).append("\n");
        sb.append("    finishedEndTime: ").append(toIndentedString(finishedEndTime)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
