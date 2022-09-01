package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DIS服务配置信息
 */
public class DisForwarding {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    @JacksonXmlProperty(localName = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    @JacksonXmlProperty(localName = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    @JacksonXmlProperty(localName = "stream_id")

    private String streamId;

    public DisForwarding withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数说明**：DIS服务对应的region区域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DisForwarding withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数说明**：DIS服务对应的projectId信息
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DisForwarding withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * **参数说明**：DIS服务对应的通道名称，stream_id和stream_name两个参数必须携带一个，优先使用stream_id
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public DisForwarding withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * **参数说明**：DIS服务对应的通道ID，stream_id和stream_name两个参数必须携带一个，优先使用stream_id
     * @return streamId
     */
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
        DisForwarding disForwarding = (DisForwarding) o;
        return Objects.equals(this.regionName, disForwarding.regionName)
            && Objects.equals(this.projectId, disForwarding.projectId)
            && Objects.equals(this.streamName, disForwarding.streamName)
            && Objects.equals(this.streamId, disForwarding.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, projectId, streamName, streamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisForwarding {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
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
