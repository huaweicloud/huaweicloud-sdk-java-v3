package com.huaweicloud.sdk.cbs.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ChatAnswers;
import com.huaweicloud.sdk.cbs.v1.model.QaBotAnswers;
import com.huaweicloud.sdk.cbs.v1.model.TaskBotAnswers;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteSessionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reply_type")
    
    
    private Integer replyType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_answers")
    
    
    private QaBotAnswers qabotAnswers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_answers")
    
    
    private ChatAnswers chatAnswers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="taskbot_answers")
    
    
    private TaskBotAnswers taskbotAnswers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    
    private String requestId;

    public ExecuteSessionResponse withReplyType(Integer replyType) {
        this.replyType = replyType;
        return this;
    }

    


    /**
     * 回复类型： 0   问答型机器人回复。 1   任务型机器人回复。 2   闲聊回复。
     * @return replyType
     */
    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    

    public ExecuteSessionResponse withQabotAnswers(QaBotAnswers qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
        return this;
    }

    public ExecuteSessionResponse withQabotAnswers(Consumer<QaBotAnswers> qabotAnswersSetter) {
        if(this.qabotAnswers == null ){
            this.qabotAnswers = new QaBotAnswers();
            qabotAnswersSetter.accept(this.qabotAnswers);
        }
        
        return this;
    }


    /**
     * Get qabotAnswers
     * @return qabotAnswers
     */
    public QaBotAnswers getQabotAnswers() {
        return qabotAnswers;
    }

    public void setQabotAnswers(QaBotAnswers qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
    }

    

    public ExecuteSessionResponse withChatAnswers(ChatAnswers chatAnswers) {
        this.chatAnswers = chatAnswers;
        return this;
    }

    public ExecuteSessionResponse withChatAnswers(Consumer<ChatAnswers> chatAnswersSetter) {
        if(this.chatAnswers == null ){
            this.chatAnswers = new ChatAnswers();
            chatAnswersSetter.accept(this.chatAnswers);
        }
        
        return this;
    }


    /**
     * Get chatAnswers
     * @return chatAnswers
     */
    public ChatAnswers getChatAnswers() {
        return chatAnswers;
    }

    public void setChatAnswers(ChatAnswers chatAnswers) {
        this.chatAnswers = chatAnswers;
    }

    

    public ExecuteSessionResponse withTaskbotAnswers(TaskBotAnswers taskbotAnswers) {
        this.taskbotAnswers = taskbotAnswers;
        return this;
    }

    public ExecuteSessionResponse withTaskbotAnswers(Consumer<TaskBotAnswers> taskbotAnswersSetter) {
        if(this.taskbotAnswers == null ){
            this.taskbotAnswers = new TaskBotAnswers();
            taskbotAnswersSetter.accept(this.taskbotAnswers);
        }
        
        return this;
    }


    /**
     * Get taskbotAnswers
     * @return taskbotAnswers
     */
    public TaskBotAnswers getTaskbotAnswers() {
        return taskbotAnswers;
    }

    public void setTaskbotAnswers(TaskBotAnswers taskbotAnswers) {
        this.taskbotAnswers = taskbotAnswers;
    }

    

    public ExecuteSessionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteSessionResponse executeSessionResponse = (ExecuteSessionResponse) o;
        return Objects.equals(this.replyType, executeSessionResponse.replyType) &&
            Objects.equals(this.qabotAnswers, executeSessionResponse.qabotAnswers) &&
            Objects.equals(this.chatAnswers, executeSessionResponse.chatAnswers) &&
            Objects.equals(this.taskbotAnswers, executeSessionResponse.taskbotAnswers) &&
            Objects.equals(this.requestId, executeSessionResponse.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replyType, qabotAnswers, chatAnswers, taskbotAnswers, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteSessionResponse {\n");
        sb.append("    replyType: ").append(toIndentedString(replyType)).append("\n");
        sb.append("    qabotAnswers: ").append(toIndentedString(qabotAnswers)).append("\n");
        sb.append("    chatAnswers: ").append(toIndentedString(chatAnswers)).append("\n");
        sb.append("    taskbotAnswers: ").append(toIndentedString(taskbotAnswers)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

