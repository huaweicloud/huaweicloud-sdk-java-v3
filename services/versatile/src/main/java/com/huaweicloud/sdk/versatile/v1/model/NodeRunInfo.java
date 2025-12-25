package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodeRunInfo
 */
public class NodeRunInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_node_id")

    private String parentNodeId;

    /**
     * 工作流节点状态
     */
    public static final class NodeStatusEnum {

        /**
         * Enum NODE_STARTED for value: "node_started"
         */
        public static final NodeStatusEnum NODE_STARTED = new NodeStatusEnum("node_started");

        /**
         * Enum NODE_WAIT for value: "node_wait"
         */
        public static final NodeStatusEnum NODE_WAIT = new NodeStatusEnum("node_wait");

        /**
         * Enum NODE_FINISHED for value: "node_finished"
         */
        public static final NodeStatusEnum NODE_FINISHED = new NodeStatusEnum("node_finished");

        private static final Map<String, NodeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeStatusEnum> createStaticFields() {
            Map<String, NodeStatusEnum> map = new HashMap<>();
            map.put("node_started", NODE_STARTED);
            map.put("node_wait", NODE_WAIT);
            map.put("node_finished", NODE_FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NodeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeStatusEnum(value));
        }

        public static NodeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeStatusEnum) {
                return this.value.equals(((NodeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_status")

    private NodeStatusEnum nodeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_workflow_id")

    private String parentWorkflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loop_index")

    private Integer loopIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loop_node_id")

    private String loopNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Map<String, Object> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private Map<String, Object> outputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<Message> messages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Map<String, Object> metadata = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_time")

    private Long startupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefill_time")

    private Long prefillTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_error")

    private NodeRunInfoInnerError innerError;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Map<String, Object> memory = null;

    public NodeRunInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 工作流id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public NodeRunInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeRunInfo withParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }

    /**
     * 父节点id
     * @return parentNodeId
     */
    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public NodeRunInfo withNodeStatus(NodeStatusEnum nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * 工作流节点状态
     * @return nodeStatus
     */
    public NodeStatusEnum getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(NodeStatusEnum nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public NodeRunInfo withParentWorkflowId(String parentWorkflowId) {
        this.parentWorkflowId = parentWorkflowId;
        return this;
    }

    /**
     * 父工作流节点id
     * @return parentWorkflowId
     */
    public String getParentWorkflowId() {
        return parentWorkflowId;
    }

    public void setParentWorkflowId(String parentWorkflowId) {
        this.parentWorkflowId = parentWorkflowId;
    }

    public NodeRunInfo withLoopIndex(Integer loopIndex) {
        this.loopIndex = loopIndex;
        return this;
    }

    /**
     * 循环次数
     * @return loopIndex
     */
    public Integer getLoopIndex() {
        return loopIndex;
    }

    public void setLoopIndex(Integer loopIndex) {
        this.loopIndex = loopIndex;
    }

    public NodeRunInfo withLoopNodeId(String loopNodeId) {
        this.loopNodeId = loopNodeId;
        return this;
    }

    /**
     * 上层循环节点id
     * @return loopNodeId
     */
    public String getLoopNodeId() {
        return loopNodeId;
    }

    public void setLoopNodeId(String loopNodeId) {
        this.loopNodeId = loopNodeId;
    }

    public NodeRunInfo withStatus(Status status) {
        this.status = status;
        return this;
    }

    public NodeRunInfo withStatus(Consumer<Status> statusSetter) {
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

    public NodeRunInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeRunInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public NodeRunInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public NodeRunInfo withInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
        return this;
    }

    public NodeRunInfo putInputsItem(String key, Object inputsItem) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        this.inputs.put(key, inputsItem);
        return this;
    }

    public NodeRunInfo withInputs(Consumer<Map<String, Object>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new HashMap<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 输入参数：debug才设置
     * @return inputs
     */
    public Map<String, Object> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, Object> inputs) {
        this.inputs = inputs;
    }

    public NodeRunInfo withOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
        return this;
    }

    public NodeRunInfo putOutputsItem(String key, Object outputsItem) {
        if (this.outputs == null) {
            this.outputs = new HashMap<>();
        }
        this.outputs.put(key, outputsItem);
        return this;
    }

    public NodeRunInfo withOutputs(Consumer<Map<String, Object>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new HashMap<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 输出参数：debug才设置
     * @return outputs
     */
    public Map<String, Object> getOutputs() {
        return outputs;
    }

    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    public NodeRunInfo withMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public NodeRunInfo addMessagesItem(Message messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public NodeRunInfo withMessages(Consumer<List<Message>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /**
     * 消息节点或提问器节点的输出
     * @return messages
     */
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public NodeRunInfo withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    public NodeRunInfo putMetadataItem(String key, Object metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public NodeRunInfo withMetadata(Consumer<Map<String, Object>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 节点特有的输出，如：大模型原始回复debug才设置
     * @return metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public NodeRunInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，13位时间戳 workflow_started,node_started必填
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public NodeRunInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，13位时间戳 workflow_finished,node_finished必填
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public NodeRunInfo withStartupTime(Long startupTime) {
        this.startupTime = startupTime;
        return this;
    }

    /**
     * 真正启动的时间，13位时间戳
     * @return startupTime
     */
    public Long getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(Long startupTime) {
        this.startupTime = startupTime;
    }

    public NodeRunInfo withPrefillTime(Long prefillTime) {
        this.prefillTime = prefillTime;
        return this;
    }

    /**
     * 预热时间，如大模型节点表示首token时间
     * @return prefillTime
     */
    public Long getPrefillTime() {
        return prefillTime;
    }

    public void setPrefillTime(Long prefillTime) {
        this.prefillTime = prefillTime;
    }

    public NodeRunInfo withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * execution id
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public NodeRunInfo withInnerError(NodeRunInfoInnerError innerError) {
        this.innerError = innerError;
        return this;
    }

    public NodeRunInfo withInnerError(Consumer<NodeRunInfoInnerError> innerErrorSetter) {
        if (this.innerError == null) {
            this.innerError = new NodeRunInfoInnerError();
            innerErrorSetter.accept(this.innerError);
        }

        return this;
    }

    /**
     * Get innerError
     * @return innerError
     */
    public NodeRunInfoInnerError getInnerError() {
        return innerError;
    }

    public void setInnerError(NodeRunInfoInnerError innerError) {
        this.innerError = innerError;
    }

    public NodeRunInfo withMemory(Map<String, Object> memory) {
        this.memory = memory;
        return this;
    }

    public NodeRunInfo putMemoryItem(String key, Object memoryItem) {
        if (this.memory == null) {
            this.memory = new HashMap<>();
        }
        this.memory.put(key, memoryItem);
        return this;
    }

    public NodeRunInfo withMemory(Consumer<Map<String, Object>> memorySetter) {
        if (this.memory == null) {
            this.memory = new HashMap<>();
        }
        memorySetter.accept(this.memory);
        return this;
    }

    /**
     * 记忆变量
     * @return memory
     */
    public Map<String, Object> getMemory() {
        return memory;
    }

    public void setMemory(Map<String, Object> memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeRunInfo that = (NodeRunInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.parentNodeId, that.parentNodeId) && Objects.equals(this.nodeStatus, that.nodeStatus)
            && Objects.equals(this.parentWorkflowId, that.parentWorkflowId)
            && Objects.equals(this.loopIndex, that.loopIndex) && Objects.equals(this.loopNodeId, that.loopNodeId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.inputs, that.inputs) && Objects.equals(this.outputs, that.outputs)
            && Objects.equals(this.messages, that.messages) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.startupTime, that.startupTime) && Objects.equals(this.prefillTime, that.prefillTime)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.innerError, that.innerError)
            && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            nodeId,
            parentNodeId,
            nodeStatus,
            parentWorkflowId,
            loopIndex,
            loopNodeId,
            status,
            nodeName,
            nodeType,
            errorMessage,
            inputs,
            outputs,
            messages,
            metadata,
            startTime,
            endTime,
            startupTime,
            prefillTime,
            executionId,
            innerError,
            memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeRunInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    parentNodeId: ").append(toIndentedString(parentNodeId)).append("\n");
        sb.append("    nodeStatus: ").append(toIndentedString(nodeStatus)).append("\n");
        sb.append("    parentWorkflowId: ").append(toIndentedString(parentWorkflowId)).append("\n");
        sb.append("    loopIndex: ").append(toIndentedString(loopIndex)).append("\n");
        sb.append("    loopNodeId: ").append(toIndentedString(loopNodeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startupTime: ").append(toIndentedString(startupTime)).append("\n");
        sb.append("    prefillTime: ").append(toIndentedString(prefillTime)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
