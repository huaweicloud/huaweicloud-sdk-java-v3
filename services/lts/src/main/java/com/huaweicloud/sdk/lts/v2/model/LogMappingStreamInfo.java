package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LogMappingStreamInfo
 */
public class LogMappingStreamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_log_stream_id")

    private String sourceLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_id")

    private String targetLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_name")

    private String targetLogStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_eps_id")

    private String targetLogStreamEpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_ttl")

    private Integer targetLogStreamTtl;

    public LogMappingStreamInfo withSourceLogStreamId(String sourceLogStreamId) {
        this.sourceLogStreamId = sourceLogStreamId;
        return this;
    }

    /**
     * 源日志流ID
     * @return sourceLogStreamId
     */
    public String getSourceLogStreamId() {
        return sourceLogStreamId;
    }

    public void setSourceLogStreamId(String sourceLogStreamId) {
        this.sourceLogStreamId = sourceLogStreamId;
    }

    public LogMappingStreamInfo withTargetLogStreamId(String targetLogStreamId) {
        this.targetLogStreamId = targetLogStreamId;
        return this;
    }

    /**
     * 目标日志流ID
     * @return targetLogStreamId
     */
    public String getTargetLogStreamId() {
        return targetLogStreamId;
    }

    public void setTargetLogStreamId(String targetLogStreamId) {
        this.targetLogStreamId = targetLogStreamId;
    }

    public LogMappingStreamInfo withTargetLogStreamName(String targetLogStreamName) {
        this.targetLogStreamName = targetLogStreamName;
        return this;
    }

    /**
     * 目标日志流名称
     * @return targetLogStreamName
     */
    public String getTargetLogStreamName() {
        return targetLogStreamName;
    }

    public void setTargetLogStreamName(String targetLogStreamName) {
        this.targetLogStreamName = targetLogStreamName;
    }

    public LogMappingStreamInfo withTargetLogStreamEpsId(String targetLogStreamEpsId) {
        this.targetLogStreamEpsId = targetLogStreamEpsId;
        return this;
    }

    /**
     * 目标日志流EPS ID
     * @return targetLogStreamEpsId
     */
    public String getTargetLogStreamEpsId() {
        return targetLogStreamEpsId;
    }

    public void setTargetLogStreamEpsId(String targetLogStreamEpsId) {
        this.targetLogStreamEpsId = targetLogStreamEpsId;
    }

    public LogMappingStreamInfo withTargetLogStreamTtl(Integer targetLogStreamTtl) {
        this.targetLogStreamTtl = targetLogStreamTtl;
        return this;
    }

    /**
     * 目标日志流ttl
     * @return targetLogStreamTtl
     */
    public Integer getTargetLogStreamTtl() {
        return targetLogStreamTtl;
    }

    public void setTargetLogStreamTtl(Integer targetLogStreamTtl) {
        this.targetLogStreamTtl = targetLogStreamTtl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogMappingStreamInfo that = (LogMappingStreamInfo) obj;
        return Objects.equals(this.sourceLogStreamId, that.sourceLogStreamId)
            && Objects.equals(this.targetLogStreamId, that.targetLogStreamId)
            && Objects.equals(this.targetLogStreamName, that.targetLogStreamName)
            && Objects.equals(this.targetLogStreamEpsId, that.targetLogStreamEpsId)
            && Objects.equals(this.targetLogStreamTtl, that.targetLogStreamTtl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceLogStreamId, targetLogStreamId, targetLogStreamName, targetLogStreamEpsId, targetLogStreamTtl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogMappingStreamInfo {\n");
        sb.append("    sourceLogStreamId: ").append(toIndentedString(sourceLogStreamId)).append("\n");
        sb.append("    targetLogStreamId: ").append(toIndentedString(targetLogStreamId)).append("\n");
        sb.append("    targetLogStreamName: ").append(toIndentedString(targetLogStreamName)).append("\n");
        sb.append("    targetLogStreamEpsId: ").append(toIndentedString(targetLogStreamEpsId)).append("\n");
        sb.append("    targetLogStreamTtl: ").append(toIndentedString(targetLogStreamTtl)).append("\n");
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
