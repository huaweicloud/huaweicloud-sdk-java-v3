package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListLogDiagnosisJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释**：作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - PARTIAILLY_SUCCEEDED：部分成功 **默认取值**：不涉及。 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final StatusEnum PENDING = new StatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

        /**
         * Enum TIMEOUT for value: "TIMEOUT"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("TIMEOUT");

        /**
         * Enum PARTIAILLY_SUCCEEDED for value: "PARTIAILLY_SUCCEEDED"
         */
        public static final StatusEnum PARTIAILLY_SUCCEEDED = new StatusEnum("PARTIAILLY_SUCCEEDED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TIMEOUT", TIMEOUT);
            map.put("PARTIAILLY_SUCCEEDED", PARTIAILLY_SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     */
    public static final class ResultStatusEnum {

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final ResultStatusEnum ABNORMAL = new ResultStatusEnum("ABNORMAL");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final ResultStatusEnum NORMAL = new ResultStatusEnum("NORMAL");

        private static final Map<String, ResultStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultStatusEnum> createStaticFields() {
            Map<String, ResultStatusEnum> map = new HashMap<>();
            map.put("ABNORMAL", ABNORMAL);
            map.put("NORMAL", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultStatusEnum(String value) {
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
        public static ResultStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultStatusEnum(value));
        }

        public static ResultStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultStatusEnum) {
                return this.value.equals(((ResultStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatusEnum resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private String createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private String createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_start_time")

    private String updateStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_end_time")

    private String updateEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListLogDiagnosisJobsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：作业ID，支持模糊查询。 **约束限制**：不涉及。  **取值范围**：只允许输入长度为1到36位由数字、英文、下划线（_）或中划线（-）组成的字符，且开头和结尾不能有空格。  **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListLogDiagnosisJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：巡检作业名称，支持模糊查询。 **约束限制**：不涉及。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListLogDiagnosisJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：[0,1000000000]。 **默认取值**：0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListLogDiagnosisJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：[1,100]。 **默认取值**：10。 
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

    public ListLogDiagnosisJobsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - PARTIAILLY_SUCCEEDED：部分成功 **默认取值**：不涉及。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListLogDiagnosisJobsRequest withResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * **参数解释**：结果。 **约束限制**：不涉及。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 **默认取值**：不涉及。 
     * @return resultStatus
     */
    public ResultStatusEnum getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatusEnum resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ListLogDiagnosisJobsRequest withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**：创建者。 **约束限制**：不涉及。 **取值范围**：长度为[0,50]的字符串。 **默认取值**：不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListLogDiagnosisJobsRequest withCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * **参数解释**：创建开始时间。 **约束限制**：可以与QueryCreateEndTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public ListLogDiagnosisJobsRequest withCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * **参数解释**：创建结束时间。 **约束限制**：可以与QueryCreateStartTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public ListLogDiagnosisJobsRequest withUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }

    /**
     * **参数解释**：更新开始时间。 **约束限制**：可以与QueryUpdateEndTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return updateStartTime
     */
    public String getUpdateStartTime() {
        return updateStartTime;
    }

    public void setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
    }

    public ListLogDiagnosisJobsRequest withUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }

    /**
     * **参数解释**：更新结束时间。 **约束限制**：可以与QueryUpdateStartTime配合使用从而限定一个具体的时间范围。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return updateEndTime
     */
    public String getUpdateEndTime() {
        return updateEndTime;
    }

    public void setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
    }

    public ListLogDiagnosisJobsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：0或长度为32的字符串。 **默认取值**：0。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogDiagnosisJobsRequest that = (ListLogDiagnosisJobsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.status, that.status) && Objects.equals(this.resultStatus, that.resultStatus)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.updateStartTime, that.updateStartTime)
            && Objects.equals(this.updateEndTime, that.updateEndTime)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            offset,
            limit,
            status,
            resultStatus,
            creator,
            createStartTime,
            createEndTime,
            updateStartTime,
            updateEndTime,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogDiagnosisJobsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    updateStartTime: ").append(toIndentedString(updateStartTime)).append("\n");
        sb.append("    updateEndTime: ").append(toIndentedString(updateEndTime)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
