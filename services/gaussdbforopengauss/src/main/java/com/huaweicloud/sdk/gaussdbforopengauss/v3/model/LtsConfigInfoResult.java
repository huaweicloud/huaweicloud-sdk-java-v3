package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: LTS对接配置信息。 **取值范围**: 不涉及。
 */
public class LtsConfigInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_log_type")

    private String groupLogType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ttl_in_days")

    private Integer groupTtlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_log_type")

    private String streamLogType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_ttl_in_days")

    private Integer streamTtlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_structure_config_id")

    private String streamStructureConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_index_config_id")

    private String streamIndexConfigId;

    public LtsConfigInfoResult withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * **参数解释**: LTS日志组名称。 **取值范围**: 不涉及。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LtsConfigInfoResult withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * **参数解释**: LTS日志组ID。 **取值范围**: 不涉及。LTS日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsConfigInfoResult withGroupLogType(String groupLogType) {
        this.groupLogType = groupLogType;
        return this;
    }

    /**
     * **参数解释**: LTS日志组类别。 **取值范围**: 通常为asp_log，标识为智能运维专用日志组。
     * @return groupLogType
     */
    public String getGroupLogType() {
        return groupLogType;
    }

    public void setGroupLogType(String groupLogType) {
        this.groupLogType = groupLogType;
    }

    public LtsConfigInfoResult withGroupTtlInDays(Integer groupTtlInDays) {
        this.groupTtlInDays = groupTtlInDays;
        return this;
    }

    /**
     * **参数解释**: LTS日志组中数据最大保留天数。 **取值范围**: [1,30]
     * @return groupTtlInDays
     */
    public Integer getGroupTtlInDays() {
        return groupTtlInDays;
    }

    public void setGroupTtlInDays(Integer groupTtlInDays) {
        this.groupTtlInDays = groupTtlInDays;
    }

    public LtsConfigInfoResult withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * **参数解释**: LTS日志流名称。 **取值范围**: 通常为STREAM_APS_FULL_SQL-实例ID。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public LtsConfigInfoResult withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * **参数解释**: LTS日志流ID。 **取值范围**: 不涉及。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LtsConfigInfoResult withStreamLogType(String streamLogType) {
        this.streamLogType = streamLogType;
        return this;
    }

    /**
     * **参数解释**: LTS日志流类别。 **取值范围**: 通常为full_sql，标识为全量SQL专用日志流。
     * @return streamLogType
     */
    public String getStreamLogType() {
        return streamLogType;
    }

    public void setStreamLogType(String streamLogType) {
        this.streamLogType = streamLogType;
    }

    public LtsConfigInfoResult withStreamTtlInDays(Integer streamTtlInDays) {
        this.streamTtlInDays = streamTtlInDays;
        return this;
    }

    /**
     * **参数解释**: LTS日志流中数据最大保留天数。 **取值范围**: [1,30]
     * @return streamTtlInDays
     */
    public Integer getStreamTtlInDays() {
        return streamTtlInDays;
    }

    public void setStreamTtlInDays(Integer streamTtlInDays) {
        this.streamTtlInDays = streamTtlInDays;
    }

    public LtsConfigInfoResult withStreamStructureConfigId(String streamStructureConfigId) {
        this.streamStructureConfigId = streamStructureConfigId;
        return this;
    }

    /**
     * **参数解释**: LTS日志流结构化配置ID。 **取值范围**: 不涉及。
     * @return streamStructureConfigId
     */
    public String getStreamStructureConfigId() {
        return streamStructureConfigId;
    }

    public void setStreamStructureConfigId(String streamStructureConfigId) {
        this.streamStructureConfigId = streamStructureConfigId;
    }

    public LtsConfigInfoResult withStreamIndexConfigId(String streamIndexConfigId) {
        this.streamIndexConfigId = streamIndexConfigId;
        return this;
    }

    /**
     * **参数解释**: LTS日志流索引配置ID。 **取值范围**: 不涉及。
     * @return streamIndexConfigId
     */
    public String getStreamIndexConfigId() {
        return streamIndexConfigId;
    }

    public void setStreamIndexConfigId(String streamIndexConfigId) {
        this.streamIndexConfigId = streamIndexConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsConfigInfoResult that = (LtsConfigInfoResult) obj;
        return Objects.equals(this.logGroupName, that.logGroupName) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.groupLogType, that.groupLogType)
            && Objects.equals(this.groupTtlInDays, that.groupTtlInDays)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.streamLogType, that.streamLogType)
            && Objects.equals(this.streamTtlInDays, that.streamTtlInDays)
            && Objects.equals(this.streamStructureConfigId, that.streamStructureConfigId)
            && Objects.equals(this.streamIndexConfigId, that.streamIndexConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupName,
            logGroupId,
            groupLogType,
            groupTtlInDays,
            logStreamName,
            logStreamId,
            streamLogType,
            streamTtlInDays,
            streamStructureConfigId,
            streamIndexConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfigInfoResult {\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    groupLogType: ").append(toIndentedString(groupLogType)).append("\n");
        sb.append("    groupTtlInDays: ").append(toIndentedString(groupTtlInDays)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    streamLogType: ").append(toIndentedString(streamLogType)).append("\n");
        sb.append("    streamTtlInDays: ").append(toIndentedString(streamTtlInDays)).append("\n");
        sb.append("    streamStructureConfigId: ").append(toIndentedString(streamStructureConfigId)).append("\n");
        sb.append("    streamIndexConfigId: ").append(toIndentedString(streamIndexConfigId)).append("\n");
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
