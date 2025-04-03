package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LtsLogDump
 */
public class LtsLogDump {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_dump")

    private Boolean logDump;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public LtsLogDump withLogDump(Boolean logDump) {
        this.logDump = logDump;
        return this;
    }

    /**
     * 是否开启LTS日志转储功能，true表示开启，false表示关闭。
     * @return logDump
     */
    public Boolean getLogDump() {
        return logDump;
    }

    public void setLogDump(Boolean logDump) {
        this.logDump = logDump;
    }

    public LtsLogDump withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsLogDump withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LtsLogDump withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LtsLogDump withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsLogDump that = (LtsLogDump) obj;
        return Objects.equals(this.logDump, that.logDump) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logDump, logGroupId, logGroupName, logStreamId, logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsLogDump {\n");
        sb.append("    logDump: ").append(toIndentedString(logDump)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
