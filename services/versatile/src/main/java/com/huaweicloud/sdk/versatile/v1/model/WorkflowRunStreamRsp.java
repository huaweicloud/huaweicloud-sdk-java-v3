package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作流执行接口流式响应体
 */
public class WorkflowRunStreamRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private String event;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversation_id")

    private String conversationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdTime")

    private Long createdTime;

    public WorkflowRunStreamRsp withEvent(String event) {
        this.event = event;
        return this;
    }

    /**
     * 事件类型：1、workflow_started 2、node_started 3、node_wait 4、node_finished 5、workflow_finished 6、text_chunk ：流式输出到对话框的信息
     * @return event
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public WorkflowRunStreamRsp withConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * 执行的conversation_id
     * @return conversationId
     */
    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public WorkflowRunStreamRsp withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 类型说明：1. node_started，node_finished，node_wait data使用NodeInfo对象 2. workflow_started, workflow_finished  data使用 WorkflowInfo对象 3. text_chunk使用对象TextChunk
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public WorkflowRunStreamRsp withCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 事件发生时间
     * @return createdTime
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowRunStreamRsp that = (WorkflowRunStreamRsp) obj;
        return Objects.equals(this.event, that.event) && Objects.equals(this.conversationId, that.conversationId)
            && Objects.equals(this.data, that.data) && Objects.equals(this.createdTime, that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, conversationId, data, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunStreamRsp {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
