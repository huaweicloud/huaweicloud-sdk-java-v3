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
public class ListNetworkDiagnosisJobsRequest {

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
     * **参数解释**：网络诊断作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - RUNNING：诊断中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时 **默认取值**：不涉及。
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

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

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TIMEOUT", TIMEOUT);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private String createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private String createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ListNetworkDiagnosisJobsRequest withId(String id) {
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

    public ListNetworkDiagnosisJobsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称，支持模糊查询。  **约束限制**：不涉及。  **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListNetworkDiagnosisJobsRequest withOffset(Integer offset) {
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

    public ListNetworkDiagnosisJobsRequest withLimit(Integer limit) {
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

    public ListNetworkDiagnosisJobsRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：网络诊断作业状态。 **约束限制**：不涉及。 **取值范围**：   - CREATING：创建中   - RUNNING：诊断中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时 **默认取值**：不涉及。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListNetworkDiagnosisJobsRequest withCreateStartTime(String createStartTime) {
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

    public ListNetworkDiagnosisJobsRequest withCreateEndTime(String createEndTime) {
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

    public ListNetworkDiagnosisJobsRequest withWorkspaceId(String workspaceId) {
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
        ListNetworkDiagnosisJobsRequest that = (ListNetworkDiagnosisJobsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, offset, limit, status, createStartTime, createEndTime, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDiagnosisJobsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
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
