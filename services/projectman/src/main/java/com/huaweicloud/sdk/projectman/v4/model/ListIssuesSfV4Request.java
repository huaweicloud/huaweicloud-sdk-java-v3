package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListIssuesSfV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 工作项类型
     */
    public static final class TrackerIdEnum {

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TrackerIdEnum NUMBER_2 = new TrackerIdEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final TrackerIdEnum NUMBER_3 = new TrackerIdEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final TrackerIdEnum NUMBER_4 = new TrackerIdEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final TrackerIdEnum NUMBER_5 = new TrackerIdEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final TrackerIdEnum NUMBER_6 = new TrackerIdEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final TrackerIdEnum NUMBER_7 = new TrackerIdEnum(7);

        private static final Map<Integer, TrackerIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TrackerIdEnum> createStaticFields() {
            Map<Integer, TrackerIdEnum> map = new HashMap<>();
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TrackerIdEnum(Integer value) {
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
        public static TrackerIdEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TrackerIdEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TrackerIdEnum(value);
            }
            return result;
        }

        public static TrackerIdEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TrackerIdEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrackerIdEnum) {
                return this.value.equals(((TrackerIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private TrackerIdEnum trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time_interval")

    private String createdTimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time_interval")

    private String updatedTimeInterval;

    public ListIssuesSfV4Request withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListIssuesSfV4Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量 从0开始
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListIssuesSfV4Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量 最小1,最大100
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

    public ListIssuesSfV4Request withTrackerId(TrackerIdEnum trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 工作项类型
     * @return trackerId
     */
    public TrackerIdEnum getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(TrackerIdEnum trackerId) {
        this.trackerId = trackerId;
    }

    public ListIssuesSfV4Request withCreatedTimeInterval(String createdTimeInterval) {
        this.createdTimeInterval = createdTimeInterval;
        return this;
    }

    /**
     * 创建工作项的时间(查询的起始时间,查询的结束时间)
     * @return createdTimeInterval
     */
    public String getCreatedTimeInterval() {
        return createdTimeInterval;
    }

    public void setCreatedTimeInterval(String createdTimeInterval) {
        this.createdTimeInterval = createdTimeInterval;
    }

    public ListIssuesSfV4Request withUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
        return this;
    }

    /**
     * 更新工作项的时间(查询的起始时间,查询的结束时间)
     * @return updatedTimeInterval
     */
    public String getUpdatedTimeInterval() {
        return updatedTimeInterval;
    }

    public void setUpdatedTimeInterval(String updatedTimeInterval) {
        this.updatedTimeInterval = updatedTimeInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssuesSfV4Request listIssuesSfV4Request = (ListIssuesSfV4Request) o;
        return Objects.equals(this.projectId, listIssuesSfV4Request.projectId)
            && Objects.equals(this.offset, listIssuesSfV4Request.offset)
            && Objects.equals(this.limit, listIssuesSfV4Request.limit)
            && Objects.equals(this.trackerId, listIssuesSfV4Request.trackerId)
            && Objects.equals(this.createdTimeInterval, listIssuesSfV4Request.createdTimeInterval)
            && Objects.equals(this.updatedTimeInterval, listIssuesSfV4Request.updatedTimeInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, offset, limit, trackerId, createdTimeInterval, updatedTimeInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuesSfV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    createdTimeInterval: ").append(toIndentedString(createdTimeInterval)).append("\n");
        sb.append("    updatedTimeInterval: ").append(toIndentedString(updatedTimeInterval)).append("\n");
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
