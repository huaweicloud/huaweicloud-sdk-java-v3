package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：Sql执行历史记录。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class StatementRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_content")

    private String statementContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpu_duration")

    private String dpuDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private String duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpu_cost")

    private String dpuCost;

    /**
     * **参数解释**：Sql执行状态。 **取值范围**：   - CANCELED：取消。   - FAILED：失败。   - SUCCESSFUL：成功。   - RUNNING：运行中。   - SUBMITTED：提交。   - ERROR：错误。
     */
    public static final class StatusEnum {

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final StatusEnum SUCCESSFUL = new StatusEnum("SUCCESSFUL");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum SUBMITTED for value: "SUBMITTED"
         */
        public static final StatusEnum SUBMITTED = new StatusEnum("SUBMITTED");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CANCELED", CANCELED);
            map.put("FAILED", FAILED);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("RUNNING", RUNNING);
            map.put("SUBMITTED", SUBMITTED);
            map.put("ERROR", ERROR);
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
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private OffsetDateTime finishTime;

    public StatementRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：Sql执行StatementID。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatementRecord withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public StatementRecord withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：端点ID。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、连字符。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public StatementRecord withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：Session的ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public StatementRecord withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**：数据库名称。 **取值范围**：长度为1~256个字符，支持大小写英文字母、数字、下划线。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public StatementRecord withStatementContent(String statementContent) {
        this.statementContent = statementContent;
        return this;
    }

    /**
     * **参数解释**：sql脚本内容。 **取值范围**：长度为1~256个字符，支持大小写英文字母、数字、下划线。
     * @return statementContent
     */
    public String getStatementContent() {
        return statementContent;
    }

    public void setStatementContent(String statementContent) {
        this.statementContent = statementContent;
    }

    public StatementRecord withDpuDuration(String dpuDuration) {
        this.dpuDuration = dpuDuration;
        return this;
    }

    /**
     * **参数解释**：dpu时。 **取值范围**：不涉及。
     * @return dpuDuration
     */
    public String getDpuDuration() {
        return dpuDuration;
    }

    public void setDpuDuration(String dpuDuration) {
        this.dpuDuration = dpuDuration;
    }

    public StatementRecord withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：执行时长。 **取值范围**：不涉及。
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public StatementRecord withDpuCost(String dpuCost) {
        this.dpuCost = dpuCost;
        return this;
    }

    /**
     * **参数解释**：费用。 **取值范围**：不涉及。
     * @return dpuCost
     */
    public String getDpuCost() {
        return dpuCost;
    }

    public void setDpuCost(String dpuCost) {
        this.dpuCost = dpuCost;
    }

    public StatementRecord withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：Sql执行状态。 **取值范围**：   - CANCELED：取消。   - FAILED：失败。   - SUCCESSFUL：成功。   - RUNNING：运行中。   - SUBMITTED：提交。   - ERROR：错误。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StatementRecord withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**：用户名称。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、下划线。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public StatementRecord withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：sql创建时间，用于记录sql语句创建时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public StatementRecord withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：sql执行开始时间，时间戳，单位：毫秒。 **取值范围**：不涉及。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public StatementRecord withFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**：sql执行结束时间，时间戳，单位：毫秒。 **取值范围**：不涉及。
     * @return finishTime
     */
    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatementRecord that = (StatementRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.statementContent, that.statementContent)
            && Objects.equals(this.dpuDuration, that.dpuDuration) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.dpuCost, that.dpuCost) && Objects.equals(this.status, that.status)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.finishTime, that.finishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            workspaceId,
            endpointId,
            sessionId,
            databaseName,
            statementContent,
            dpuDuration,
            duration,
            dpuCost,
            status,
            userName,
            createTime,
            startTime,
            finishTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    statementContent: ").append(toIndentedString(statementContent)).append("\n");
        sb.append("    dpuDuration: ").append(toIndentedString(dpuDuration)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    dpuCost: ").append(toIndentedString(dpuCost)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
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
