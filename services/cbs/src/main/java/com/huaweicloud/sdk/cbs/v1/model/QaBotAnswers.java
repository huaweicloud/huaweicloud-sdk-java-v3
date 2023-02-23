package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.QaBotAnswer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class QaBotAnswers  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answers")
    
    private List<QaBotAnswer> answers = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    

    private String requestId;

    public QaBotAnswers withAnswers(List<QaBotAnswer> answers) {
        this.answers = answers;
        return this;
    }

    
    public QaBotAnswers addAnswersItem(QaBotAnswer answersItem) {
        if(this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public QaBotAnswers withAnswers(Consumer<List<QaBotAnswer>> answersSetter) {
        if(this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 问答机器人回复。
     * @return answers
     */
    public List<QaBotAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<QaBotAnswer> answers) {
        this.answers = answers;
    }

    

    public QaBotAnswers withRequestId(String requestId) {
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
        QaBotAnswers qaBotAnswers = (QaBotAnswers) o;
        return Objects.equals(this.answers, qaBotAnswers.answers) &&
            Objects.equals(this.requestId, qaBotAnswers.requestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answers, requestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaBotAnswers {\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

