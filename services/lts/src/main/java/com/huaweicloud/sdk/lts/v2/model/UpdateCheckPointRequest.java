package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCheckPointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_group_name")

    private String consumerGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_name")

    private String consumerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ConsumerShardCheckpointInfo> body = null;

    public UpdateCheckPointRequest withGroupId(String groupId) {
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

    public UpdateCheckPointRequest withStreamId(String streamId) {
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

    public UpdateCheckPointRequest withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * 消费组名
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    public UpdateCheckPointRequest withConsumerName(String consumerName) {
        this.consumerName = consumerName;
        return this;
    }

    /**
     * 消费者名
     * @return consumerName
     */
    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public UpdateCheckPointRequest withBody(List<ConsumerShardCheckpointInfo> body) {
        this.body = body;
        return this;
    }

    public UpdateCheckPointRequest addBodyItem(ConsumerShardCheckpointInfo bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public UpdateCheckPointRequest withBody(Consumer<List<ConsumerShardCheckpointInfo>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<ConsumerShardCheckpointInfo> getBody() {
        return body;
    }

    public void setBody(List<ConsumerShardCheckpointInfo> body) {
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
        UpdateCheckPointRequest that = (UpdateCheckPointRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.streamId, that.streamId)
            && Objects.equals(this.consumerGroupName, that.consumerGroupName)
            && Objects.equals(this.consumerName, that.consumerName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, streamId, consumerGroupName, consumerName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCheckPointRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    consumerGroupName: ").append(toIndentedString(consumerGroupName)).append("\n");
        sb.append("    consumerName: ").append(toIndentedString(consumerName)).append("\n");
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
