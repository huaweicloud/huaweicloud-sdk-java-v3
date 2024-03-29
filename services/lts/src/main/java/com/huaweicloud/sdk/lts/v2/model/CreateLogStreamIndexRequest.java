package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateLogStreamIndexRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private LTSIndexConfigInfo body;

    public CreateLogStreamIndexRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * '项目ID，账号ID，日志组ID、日志流ID，获取方式请参见：获取项目ID，获取账号ID，日志组ID、日志流ID'
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CreateLogStreamIndexRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * '项目ID，账号ID，日志组ID、日志流ID，获取方式请参见：获取项目ID，获取账号ID，日志组ID、日志流ID'
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public CreateLogStreamIndexRequest withBody(LTSIndexConfigInfo body) {
        this.body = body;
        return this;
    }

    public CreateLogStreamIndexRequest withBody(Consumer<LTSIndexConfigInfo> bodySetter) {
        if (this.body == null) {
            this.body = new LTSIndexConfigInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public LTSIndexConfigInfo getBody() {
        return body;
    }

    public void setBody(LTSIndexConfigInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLogStreamIndexRequest that = (CreateLogStreamIndexRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.streamId, that.streamId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, streamId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogStreamIndexRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
