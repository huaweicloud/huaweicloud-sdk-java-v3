package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ChatAnswers;
import com.huaweicloud.sdk.cbs.v1.model.DocBotAnswers;
import com.huaweicloud.sdk.cbs.v1.model.KbqaAnswers;
import com.huaweicloud.sdk.cbs.v1.model.QaBotAnswersNew;
import com.huaweicloud.sdk.cbs.v1.model.TableQaAnswers;
import com.huaweicloud.sdk.cbs.v1.model.TaskBotAnswers;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteQaChatResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reply_type")
    

    private Integer replyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qabot_answers")
    

    private QaBotAnswersNew qabotAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_answers")
    

    private ChatAnswers chatAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="taskbot_answers")
    

    private TaskBotAnswers taskbotAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="docqa_answers")
    

    private DocBotAnswers docqaAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tableqa_answers")
    

    private TableQaAnswers tableqaAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kbqa_answers")
    

    private KbqaAnswers kbqaAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    

    private String requestId;

    public ExecuteQaChatResponse withReplyType(Integer replyType) {
        this.replyType = replyType;
        return this;
    }

    


    /**
     * 回复类型： 0   问答型机器人回复。 1   任务型机器人回复。 2   闲聊回复。 3   图谱问答回复。 4   文档问答回复。 5   表格问答回复。
     * @return replyType
     */
    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    

    public ExecuteQaChatResponse withQabotAnswers(QaBotAnswersNew qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
        return this;
    }

    public ExecuteQaChatResponse withQabotAnswers(Consumer<QaBotAnswersNew> qabotAnswersSetter) {
        if(this.qabotAnswers == null ){
            this.qabotAnswers = new QaBotAnswersNew();
            qabotAnswersSetter.accept(this.qabotAnswers);
        }
        
        return this;
    }


    /**
     * Get qabotAnswers
     * @return qabotAnswers
     */
    public QaBotAnswersNew getQabotAnswers() {
        return qabotAnswers;
    }

    public void setQabotAnswers(QaBotAnswersNew qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
    }

    

    public ExecuteQaChatResponse withChatAnswers(ChatAnswers chatAnswers) {
        this.chatAnswers = chatAnswers;
        return this;
    }

    public ExecuteQaChatResponse withChatAnswers(Consumer<ChatAnswers> chatAnswersSetter) {
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

    

    public ExecuteQaChatResponse withTaskbotAnswers(TaskBotAnswers taskbotAnswers) {
        this.taskbotAnswers = taskbotAnswers;
        return this;
    }

    public ExecuteQaChatResponse withTaskbotAnswers(Consumer<TaskBotAnswers> taskbotAnswersSetter) {
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

    

    public ExecuteQaChatResponse withDocqaAnswers(DocBotAnswers docqaAnswers) {
        this.docqaAnswers = docqaAnswers;
        return this;
    }

    public ExecuteQaChatResponse withDocqaAnswers(Consumer<DocBotAnswers> docqaAnswersSetter) {
        if(this.docqaAnswers == null ){
            this.docqaAnswers = new DocBotAnswers();
            docqaAnswersSetter.accept(this.docqaAnswers);
        }
        
        return this;
    }


    /**
     * Get docqaAnswers
     * @return docqaAnswers
     */
    public DocBotAnswers getDocqaAnswers() {
        return docqaAnswers;
    }

    public void setDocqaAnswers(DocBotAnswers docqaAnswers) {
        this.docqaAnswers = docqaAnswers;
    }

    

    public ExecuteQaChatResponse withTableqaAnswers(TableQaAnswers tableqaAnswers) {
        this.tableqaAnswers = tableqaAnswers;
        return this;
    }

    public ExecuteQaChatResponse withTableqaAnswers(Consumer<TableQaAnswers> tableqaAnswersSetter) {
        if(this.tableqaAnswers == null ){
            this.tableqaAnswers = new TableQaAnswers();
            tableqaAnswersSetter.accept(this.tableqaAnswers);
        }
        
        return this;
    }


    /**
     * Get tableqaAnswers
     * @return tableqaAnswers
     */
    public TableQaAnswers getTableqaAnswers() {
        return tableqaAnswers;
    }

    public void setTableqaAnswers(TableQaAnswers tableqaAnswers) {
        this.tableqaAnswers = tableqaAnswers;
    }

    

    public ExecuteQaChatResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话ID，在下一次请求中传入改id表示继续会话。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    

    public ExecuteQaChatResponse withKbqaAnswers(KbqaAnswers kbqaAnswers) {
        this.kbqaAnswers = kbqaAnswers;
        return this;
    }

    public ExecuteQaChatResponse withKbqaAnswers(Consumer<KbqaAnswers> kbqaAnswersSetter) {
        if(this.kbqaAnswers == null ){
            this.kbqaAnswers = new KbqaAnswers();
            kbqaAnswersSetter.accept(this.kbqaAnswers);
        }
        
        return this;
    }


    /**
     * Get kbqaAnswers
     * @return kbqaAnswers
     */
    public KbqaAnswers getKbqaAnswers() {
        return kbqaAnswers;
    }

    public void setKbqaAnswers(KbqaAnswers kbqaAnswers) {
        this.kbqaAnswers = kbqaAnswers;
    }

    

    public ExecuteQaChatResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。用来标记调用失败时，用来标记本次问答。
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
        ExecuteQaChatResponse executeQaChatResponse = (ExecuteQaChatResponse) o;
        return Objects.equals(this.replyType, executeQaChatResponse.replyType) &&
            Objects.equals(this.qabotAnswers, executeQaChatResponse.qabotAnswers) &&
            Objects.equals(this.chatAnswers, executeQaChatResponse.chatAnswers) &&
            Objects.equals(this.taskbotAnswers, executeQaChatResponse.taskbotAnswers) &&
            Objects.equals(this.docqaAnswers, executeQaChatResponse.docqaAnswers) &&
            Objects.equals(this.tableqaAnswers, executeQaChatResponse.tableqaAnswers) &&
            Objects.equals(this.sessionId, executeQaChatResponse.sessionId) &&
            Objects.equals(this.kbqaAnswers, executeQaChatResponse.kbqaAnswers) &&
            Objects.equals(this.requestId, executeQaChatResponse.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replyType, qabotAnswers, chatAnswers, taskbotAnswers, docqaAnswers, tableqaAnswers, sessionId, kbqaAnswers, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteQaChatResponse {\n");
        sb.append("    replyType: ").append(toIndentedString(replyType)).append("\n");
        sb.append("    qabotAnswers: ").append(toIndentedString(qabotAnswers)).append("\n");
        sb.append("    chatAnswers: ").append(toIndentedString(chatAnswers)).append("\n");
        sb.append("    taskbotAnswers: ").append(toIndentedString(taskbotAnswers)).append("\n");
        sb.append("    docqaAnswers: ").append(toIndentedString(docqaAnswers)).append("\n");
        sb.append("    tableqaAnswers: ").append(toIndentedString(tableqaAnswers)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    kbqaAnswers: ").append(toIndentedString(kbqaAnswers)).append("\n");
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

