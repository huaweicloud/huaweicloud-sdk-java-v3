package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ExecuteTbQuestion  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question_id")
    
    
    private String questionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_file_path")
    
    
    private String audioFilePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    
    
    private String question;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    
    private Integer action;

    public ExecuteTbQuestion withQuestionId(String questionId) {
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

    

    public ExecuteTbQuestion withAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
        return this;
    }

    


    /**
     * 语音文件路径。
     * @return audioFilePath
     */
    public String getAudioFilePath() {
        return audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    

    public ExecuteTbQuestion withQuestion(String question) {
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

    

    public ExecuteTbQuestion withAction(Integer action) {
        this.action = action;
        return this;
    }

    


    /**
     * 0 继续， 1 直接中断， 2 播放结束音后中断。
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteTbQuestion executeTbQuestion = (ExecuteTbQuestion) o;
        return Objects.equals(this.questionId, executeTbQuestion.questionId) &&
            Objects.equals(this.audioFilePath, executeTbQuestion.audioFilePath) &&
            Objects.equals(this.question, executeTbQuestion.question) &&
            Objects.equals(this.action, executeTbQuestion.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(questionId, audioFilePath, question, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTbQuestion {\n");
        sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
        sb.append("    audioFilePath: ").append(toIndentedString(audioFilePath)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

