package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCursorTimeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private String shardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor")

    private String cursor;

    public ShowCursorTimeRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 日志组ID，获取方式请参见：获取项目ID，获取账号ID，日志组ID、日志流ID。 缺省值：None 最小长度：36 最大长度：36
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowCursorTimeRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * 日志流ID，获取方式请参见：获取项目ID，获取账号ID，日志组ID、日志流ID 缺省值：None 最小长度：36 最大长度：36
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public ShowCursorTimeRequest withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Shard ID
     * @return shardId
     */
    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public ShowCursorTimeRequest withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /**
     * 游标值
     * @return cursor
     */
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCursorTimeRequest that = (ShowCursorTimeRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.streamId, that.streamId)
            && Objects.equals(this.shardId, that.shardId) && Objects.equals(this.cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, streamId, shardId, cursor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCursorTimeRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
        sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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
