package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DisStream
 */
public class DisStream {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_guid")

    private String streamGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_qualified_name")

    private String streamQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_count")

    private Integer partitionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_count")

    private Integer appCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_count")

    private Integer taskCount;

    public DisStream withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 通道名称
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public DisStream withStreamGuid(String streamGuid) {
        this.streamGuid = streamGuid;
        return this;
    }

    /**
     * 通道GUID
     * @return streamGuid
     */
    public String getStreamGuid() {
        return streamGuid;
    }

    public void setStreamGuid(String streamGuid) {
        this.streamGuid = streamGuid;
    }

    public DisStream withStreamQualifiedName(String streamQualifiedName) {
        this.streamQualifiedName = streamQualifiedName;
        return this;
    }

    /**
     * 通道的唯一标识名称
     * @return streamQualifiedName
     */
    public String getStreamQualifiedName() {
        return streamQualifiedName;
    }

    public void setStreamQualifiedName(String streamQualifiedName) {
        this.streamQualifiedName = streamQualifiedName;
    }

    public DisStream withPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
        return this;
    }

    /**
     * 分区数
     * @return partitionCount
     */
    public Integer getPartitionCount() {
        return partitionCount;
    }

    public void setPartitionCount(Integer partitionCount) {
        this.partitionCount = partitionCount;
    }

    public DisStream withAppCount(Integer appCount) {
        this.appCount = appCount;
        return this;
    }

    /**
     * dis的app数目
     * @return appCount
     */
    public Integer getAppCount() {
        return appCount;
    }

    public void setAppCount(Integer appCount) {
        this.appCount = appCount;
    }

    public DisStream withTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * 转储任务数
     * @return taskCount
     */
    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisStream that = (DisStream) obj;
        return Objects.equals(this.streamName, that.streamName) && Objects.equals(this.streamGuid, that.streamGuid)
            && Objects.equals(this.streamQualifiedName, that.streamQualifiedName)
            && Objects.equals(this.partitionCount, that.partitionCount) && Objects.equals(this.appCount, that.appCount)
            && Objects.equals(this.taskCount, that.taskCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamName, streamGuid, streamQualifiedName, partitionCount, appCount, taskCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisStream {\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    streamGuid: ").append(toIndentedString(streamGuid)).append("\n");
        sb.append("    streamQualifiedName: ").append(toIndentedString(streamQualifiedName)).append("\n");
        sb.append("    partitionCount: ").append(toIndentedString(partitionCount)).append("\n");
        sb.append("    appCount: ").append(toIndentedString(appCount)).append("\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
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
