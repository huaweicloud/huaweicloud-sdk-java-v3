package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowLtsLogDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    public ShowLtsLogDetailsResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 日志组id
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowLtsLogDetailsResponse withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /** 日志流id
     * 
     * @return streamId */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public ShowLtsLogDetailsResponse withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /** 日志流名称
     * 
     * @return streamName */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLtsLogDetailsResponse showLtsLogDetailsResponse = (ShowLtsLogDetailsResponse) o;
        return Objects.equals(this.groupId, showLtsLogDetailsResponse.groupId)
            && Objects.equals(this.streamId, showLtsLogDetailsResponse.streamId)
            && Objects.equals(this.streamName, showLtsLogDetailsResponse.streamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, streamId, streamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLtsLogDetailsResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
