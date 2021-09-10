package com.huaweicloud.sdk.cbs.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateTbSessionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    
    
    private String question;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    
    private Integer action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="session_id")
    
    
    private String sessionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question_id")
    
    
    private String questionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_file_path")
    
    
    private String audioFilePath;

    public CreateTbSessionResponse withQuestion(String question) {
        this.question = question;
        return this;
    }

    


    /**
     * 问题。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    

    public CreateTbSessionResponse withAction(Integer action) {
        this.action = action;
        return this;
    }

    


    /**
     * 0表示继续， 1表示直接中断， 2表示播放结束音后中断。
     * minimum: 0
     * maximum: 2
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    

    public CreateTbSessionResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    


    /**
     * 会话ID。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    

    public CreateTbSessionResponse withQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }

    


    /**
     * 问题ID。
     * @return questionId
     */
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    

    public CreateTbSessionResponse withAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
        return this;
    }

    


    /**
     * 语音文件地址。
     * @return audioFilePath
     */
    public String getAudioFilePath() {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTbSessionResponse createTbSessionResponse = (CreateTbSessionResponse) o;
        return Objects.equals(this.question, createTbSessionResponse.question) &&
            Objects.equals(this.action, createTbSessionResponse.action) &&
            Objects.equals(this.sessionId, createTbSessionResponse.sessionId) &&
            Objects.equals(this.questionId, createTbSessionResponse.questionId) &&
            Objects.equals(this.audioFilePath, createTbSessionResponse.audioFilePath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(question, action, sessionId, questionId, audioFilePath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTbSessionResponse {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    audioFilePath: ").append(toIndentedString(audioFilePath)).append("\n");
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

