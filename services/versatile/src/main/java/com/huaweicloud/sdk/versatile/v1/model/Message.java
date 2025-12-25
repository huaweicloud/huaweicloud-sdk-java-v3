package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Message
 */
public class Message {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Object name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_call")

    private Object functionCall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_calls")

    private Object toolCalls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_call_id")

    private Object toolCallId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_history")

    private Boolean enableHistory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent")

    private List<String> intent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rating")

    private Integer rating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<Object> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private FeedbackReason reason;

    public Message withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Message withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 时间戳
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Message withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * 工具名称
     * @return name
     */
    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Message withFunctionCall(Object functionCall) {
        this.functionCall = functionCall;
        return this;
    }

    /**
     * 工具调用信息
     * @return functionCall
     */
    public Object getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(Object functionCall) {
        this.functionCall = functionCall;
    }

    public Message withToolCalls(Object toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }

    /**
     * 工具调用信息
     * @return toolCalls
     */
    public Object getToolCalls() {
        return toolCalls;
    }

    public void setToolCalls(Object toolCalls) {
        this.toolCalls = toolCalls;
    }

    public Message withToolCallId(Object toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }

    /**
     * 工具调用ID信息
     * @return toolCallId
     */
    public Object getToolCallId() {
        return toolCallId;
    }

    public void setToolCallId(Object toolCallId) {
        this.toolCallId = toolCallId;
    }

    public Message withEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
        return this;
    }

    /**
     * 是否开启会话历史
     * @return enableHistory
     */
    public Boolean getEnableHistory() {
        return enableHistory;
    }

    public void setEnableHistory(Boolean enableHistory) {
        this.enableHistory = enableHistory;
    }

    public Message withIntent(List<String> intent) {
        this.intent = intent;
        return this;
    }

    public Message addIntentItem(String intentItem) {
        if (this.intent == null) {
            this.intent = new ArrayList<>();
        }
        this.intent.add(intentItem);
        return this;
    }

    public Message withIntent(Consumer<List<String>> intentSetter) {
        if (this.intent == null) {
            this.intent = new ArrayList<>();
        }
        intentSetter.accept(this.intent);
        return this;
    }

    /**
     * Get intent
     * @return intent
     */
    public List<String> getIntent() {
        return intent;
    }

    public void setIntent(List<String> intent) {
        this.intent = intent;
    }

    public Message withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 对话ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public Message withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Message withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Message withRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    /**
     * 评分，-1（点赞）、1（点踩）
     * minimum: -1
     * maximum: 1
     * @return rating
     */
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Message withFiles(List<Object> files) {
        this.files = files;
        return this;
    }

    public Message addFilesItem(Object filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public Message withFiles(Consumer<List<Object>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 多模态文件列表
     * @return files
     */
    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

    public Message withReason(FeedbackReason reason) {
        this.reason = reason;
        return this;
    }

    public Message withReason(Consumer<FeedbackReason> reasonSetter) {
        if (this.reason == null) {
            this.reason = new FeedbackReason();
            reasonSetter.accept(this.reason);
        }

        return this;
    }

    /**
     * Get reason
     * @return reason
     */
    public FeedbackReason getReason() {
        return reason;
    }

    public void setReason(FeedbackReason reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Message that = (Message) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.content, that.content)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.functionCall, that.functionCall) && Objects.equals(this.toolCalls, that.toolCalls)
            && Objects.equals(this.toolCallId, that.toolCallId)
            && Objects.equals(this.enableHistory, that.enableHistory) && Objects.equals(this.intent, that.intent)
            && Objects.equals(this.executionId, that.executionId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.rating, that.rating)
            && Objects.equals(this.files, that.files) && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role,
            content,
            createTime,
            name,
            functionCall,
            toolCalls,
            toolCallId,
            enableHistory,
            intent,
            executionId,
            nodeId,
            agentId,
            rating,
            files,
            reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Message {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
        sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
        sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
        sb.append("    enableHistory: ").append(toIndentedString(enableHistory)).append("\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
