package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListFlinkSavepointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_after")

    private Long createTimeAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_before")

    private Long createTimeBefore;

    /**
     * **参数解释**：Savepoint状态，用于按状态筛选Savepoint列表。 **约束限制**：不涉及。 **取值范围**：   - TRIGGER_PENDING：排队等待执行。   - IN_PROGRESS：执行中。   - COMPLETED：触发成功。   - FAILED：触发失败。   - ABANDONED：放弃/失效。 **默认取值**：不涉及。
     */
    public static final class StateEnum {

        /**
         * Enum TRIGGER_PENDING for value: "TRIGGER_PENDING"
         */
        public static final StateEnum TRIGGER_PENDING = new StateEnum("TRIGGER_PENDING");

        /**
         * Enum IN_PROGRESS for value: "IN_PROGRESS"
         */
        public static final StateEnum IN_PROGRESS = new StateEnum("IN_PROGRESS");

        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final StateEnum COMPLETED = new StateEnum("COMPLETED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum ABANDONED for value: "ABANDONED"
         */
        public static final StateEnum ABANDONED = new StateEnum("ABANDONED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("TRIGGER_PENDING", TRIGGER_PENDING);
            map.put("IN_PROGRESS", IN_PROGRESS);
            map.put("COMPLETED", COMPLETED);
            map.put("FAILED", FAILED);
            map.put("ABANDONED", ABANDONED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    /**
     * **参数解释**：Savepoint触发类型，用于按触发类型筛选Savepoint列表。 **约束限制**：不涉及。 **取值范围**：固定值USER_REQUEST，表示由用户手动生成。 **默认取值**：不涉及。
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum USER_REQUEST for value: "USER_REQUEST"
         */
        public static final TriggerTypeEnum USER_REQUEST = new TriggerTypeEnum("USER_REQUEST");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("USER_REQUEST", USER_REQUEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    public ListFlinkSavepointRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间的ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListFlinkSavepointRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Flink作业ID，用于唯一标识一个Flink作业，可通过[查询Flink作业列表](ListFlinkJobs.xml)接口获取。 **约束限制**：不涉及。 **取值范围**：采用UUIDv7格式，固定36个字符。 **默认取值**：不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListFlinkSavepointRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：0~1000000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFlinkSavepointRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：1~100。 **默认取值**：10。
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

    public ListFlinkSavepointRequest withCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之后的作业。unix时间戳，单位：毫秒。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * maximum: 253402271999000
     * @return createTimeAfter
     */
    public Long getCreateTimeAfter() {
        return createTimeAfter;
    }

    public void setCreateTimeAfter(Long createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }

    public ListFlinkSavepointRequest withCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }

    /**
     * **参数解释**：用于查询创建时间在该时间点之前的作业。unix时间戳，单位：毫秒。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * minimum: 1764061598000
     * maximum: 253402271999000
     * @return createTimeBefore
     */
    public Long getCreateTimeBefore() {
        return createTimeBefore;
    }

    public void setCreateTimeBefore(Long createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }

    public ListFlinkSavepointRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：Savepoint状态，用于按状态筛选Savepoint列表。 **约束限制**：不涉及。 **取值范围**：   - TRIGGER_PENDING：排队等待执行。   - IN_PROGRESS：执行中。   - COMPLETED：触发成功。   - FAILED：触发失败。   - ABANDONED：放弃/失效。 **默认取值**：不涉及。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListFlinkSavepointRequest withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * **参数解释**：Savepoint触发类型，用于按触发类型筛选Savepoint列表。 **约束限制**：不涉及。 **取值范围**：固定值USER_REQUEST，表示由用户手动生成。 **默认取值**：不涉及。
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFlinkSavepointRequest that = (ListFlinkSavepointRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.createTimeAfter, that.createTimeAfter)
            && Objects.equals(this.createTimeBefore, that.createTimeBefore) && Objects.equals(this.state, that.state)
            && Objects.equals(this.triggerType, that.triggerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, jobId, offset, limit, createTimeAfter, createTimeBefore, state, triggerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkSavepointRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    createTimeAfter: ").append(toIndentedString(createTimeAfter)).append("\n");
        sb.append("    createTimeBefore: ").append(toIndentedString(createTimeBefore)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
