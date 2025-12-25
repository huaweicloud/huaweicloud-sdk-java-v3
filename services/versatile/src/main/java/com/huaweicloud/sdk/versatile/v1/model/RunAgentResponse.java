package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunAgentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversation_id")

    private String conversationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private Map<String, Object> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<NodeMessage> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, Object> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private List<NodeRunInfo> nodeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<WorkflowRunStreamRsp> events = null;

    public RunAgentResponse withConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * 会话id
     * @return conversationId
     */
    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public RunAgentResponse withOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
        return this;
    }

    public RunAgentResponse putOutputsItem(String key, Object outputsItem) {
        if (this.outputs == null) {
            this.outputs = new HashMap<>();
        }
        this.outputs.put(key, outputsItem);
        return this;
    }

    public RunAgentResponse withOutputs(Consumer<Map<String, Object>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new HashMap<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * Get outputs
     * @return outputs
     */
    public Map<String, Object> getOutputs() {
        return outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    public RunAgentResponse withMessages(List<NodeMessage> messages) {
        this.messages = messages;
        return this;
    }

    public RunAgentResponse addMessagesItem(NodeMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public RunAgentResponse withMessages(Consumer<List<NodeMessage>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * Get messages
     * @return messages
     */
    public List<NodeMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<NodeMessage> messages) {
        this.messages = messages;
    }

    public RunAgentResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 会话id
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public RunAgentResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 会话id
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public RunAgentResponse withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    public RunAgentResponse putMetadataItem(String key, Object metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public RunAgentResponse withMetadata(Consumer<Map<String, Object>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public RunAgentResponse withStatus(Status status) {
        this.status = status;
        return this;
    }

    public RunAgentResponse withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RunAgentResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public RunAgentResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public RunAgentResponse withNodeInfo(List<NodeRunInfo> nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public RunAgentResponse addNodeInfoItem(NodeRunInfo nodeInfoItem) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new ArrayList<>();
        }
        this.nodeInfo.add(nodeInfoItem);
        return this;
    }

    public RunAgentResponse withNodeInfo(Consumer<List<NodeRunInfo>> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new ArrayList<>();
        }
        nodeInfoSetter.accept(this.nodeInfo);
        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public List<NodeRunInfo> getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(List<NodeRunInfo> nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public RunAgentResponse withEvents(List<WorkflowRunStreamRsp> events) {
        this.events = events;
        return this;
    }

    public RunAgentResponse addEventsItem(WorkflowRunStreamRsp eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public RunAgentResponse withEvents(Consumer<List<WorkflowRunStreamRsp>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * Get events
     * @return events
     */
    public List<WorkflowRunStreamRsp> getEvents() {
        return events;
    }

    public void setEvents(List<WorkflowRunStreamRsp> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunAgentResponse that = (RunAgentResponse) obj;
        return Objects.equals(this.conversationId, that.conversationId) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.messages, that.messages) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.nodeInfo, that.nodeInfo)
            && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversationId,
            outputs,
            messages,
            errorCode,
            errorMessage,
            metadata,
            status,
            startTime,
            endTime,
            nodeInfo,
            events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunAgentResponse {\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
