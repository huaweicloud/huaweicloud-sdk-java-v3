package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AomMappingLogStreamInfo */
public class AomMappingLogStreamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_group_id")

    private String targetLogGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_group_name")

    private String targetLogGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_id")

    private String targetLogStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_log_stream_name")

    private String targetLogStreamName;

    public AomMappingLogStreamInfo withTargetLogGroupId(String targetLogGroupId) {
        this.targetLogGroupId = targetLogGroupId;
        return this;
    }

    /** 日志组id
     * 
     * @return targetLogGroupId */
    public String getTargetLogGroupId() {
        return targetLogGroupId;
    }

    public void setTargetLogGroupId(String targetLogGroupId) {
        this.targetLogGroupId = targetLogGroupId;
    }

    public AomMappingLogStreamInfo withTargetLogGroupName(String targetLogGroupName) {
        this.targetLogGroupName = targetLogGroupName;
        return this;
    }

    /** 目标日志组名称。
     * 
     * @return targetLogGroupName */
    public String getTargetLogGroupName() {
        return targetLogGroupName;
    }

    public void setTargetLogGroupName(String targetLogGroupName) {
        this.targetLogGroupName = targetLogGroupName;
    }

    public AomMappingLogStreamInfo withTargetLogStreamId(String targetLogStreamId) {
        this.targetLogStreamId = targetLogStreamId;
        return this;
    }

    /** 日志流id
     * 
     * @return targetLogStreamId */
    public String getTargetLogStreamId() {
        return targetLogStreamId;
    }

    public void setTargetLogStreamId(String targetLogStreamId) {
        this.targetLogStreamId = targetLogStreamId;
    }

    public AomMappingLogStreamInfo withTargetLogStreamName(String targetLogStreamName) {
        this.targetLogStreamName = targetLogStreamName;
        return this;
    }

    /** 目标日志组名称。
     * 
     * @return targetLogStreamName */
    public String getTargetLogStreamName() {
        return targetLogStreamName;
    }

    public void setTargetLogStreamName(String targetLogStreamName) {
        this.targetLogStreamName = targetLogStreamName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AomMappingLogStreamInfo aomMappingLogStreamInfo = (AomMappingLogStreamInfo) o;
        return Objects.equals(this.targetLogGroupId, aomMappingLogStreamInfo.targetLogGroupId)
            && Objects.equals(this.targetLogGroupName, aomMappingLogStreamInfo.targetLogGroupName)
            && Objects.equals(this.targetLogStreamId, aomMappingLogStreamInfo.targetLogStreamId)
            && Objects.equals(this.targetLogStreamName, aomMappingLogStreamInfo.targetLogStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetLogGroupId, targetLogGroupName, targetLogStreamId, targetLogStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AomMappingLogStreamInfo {\n");
        sb.append("    targetLogGroupId: ").append(toIndentedString(targetLogGroupId)).append("\n");
        sb.append("    targetLogGroupName: ").append(toIndentedString(targetLogGroupName)).append("\n");
        sb.append("    targetLogStreamId: ").append(toIndentedString(targetLogStreamId)).append("\n");
        sb.append("    targetLogStreamName: ").append(toIndentedString(targetLogStreamName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
