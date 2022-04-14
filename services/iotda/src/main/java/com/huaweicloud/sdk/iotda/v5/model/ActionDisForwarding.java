package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 转发DIS服务消息结构 */
public class ActionDisForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    public ActionDisForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /** **参数说明**：DIS服务对应的region区域。
     * 
     * @return regionName */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ActionDisForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** **参数说明**：DIS服务对应的projectId信息。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ActionDisForwarding withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /** **参数说明**：DIS服务对应的通道名称，和通道ID参数中至少一个不为空，和通道ID参数都存在时，以通道ID参数值为准。通过调用DIS服务
     * [查询通道列表](https://support.huaweicloud.com/api-dis/dis_02_0024.html)接口获取。
     * 
     * @return streamName */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ActionDisForwarding withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /** **参数说明**：DIS服务对应的通道ID，和通道名称参数中至少一个不为空，和通道名称参数都存在时，以本参数值为准。通过调用DIS服务
     * [查询通道详情](https://support.huaweicloud.com/api-dis/dis_02_0025.html)接口获取。
     * 
     * @return streamId */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionDisForwarding actionDisForwarding = (ActionDisForwarding) o;
        return Objects.equals(this.regionName, actionDisForwarding.regionName)
            && Objects.equals(this.projectId, actionDisForwarding.projectId)
            && Objects.equals(this.streamName, actionDisForwarding.streamName)
            && Objects.equals(this.streamId, actionDisForwarding.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, streamName, streamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionDisForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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
