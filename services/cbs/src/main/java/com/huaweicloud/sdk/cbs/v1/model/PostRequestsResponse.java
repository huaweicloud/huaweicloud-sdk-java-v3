package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.Answers;
import com.huaweicloud.sdk.cbs.v1.model.OldExtends;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class PostRequestsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answers")
    
    private List<Answers> answers = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extends")
    

    private OldExtends _extends;

    public PostRequestsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。  调用失败时无此字段。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public PostRequestsResponse withQuestion(String question) {
        this.question = question;
        return this;
    }

    


    /**
     * 问题。  调用失败时无此字段。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    

    public PostRequestsResponse withAnswers(List<Answers> answers) {
        this.answers = answers;
        return this;
    }

    
    public PostRequestsResponse addAnswersItem(Answers answersItem) {
        if(this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public PostRequestsResponse withAnswers(Consumer<List<Answers>> answersSetter) {
        if(this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 最相似的问题集。 调用失败时无此字段。
     * @return answers
     */
    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    

    public PostRequestsResponse withExtends(OldExtends _extends) {
        this._extends = _extends;
        return this;
    }

    public PostRequestsResponse withExtends(Consumer<OldExtends> _extendsSetter) {
        if(this._extends == null ){
            this._extends = new OldExtends();
            _extendsSetter.accept(this._extends);
        }
        
        return this;
    }


    /**
     * Get _extends
     * @return _extends
     */
    public OldExtends getExtends() {
        return _extends;
    }

    public void setExtends(OldExtends _extends) {
        this._extends = _extends;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostRequestsResponse postRequestsResponse = (PostRequestsResponse) o;
        return Objects.equals(this.requestId, postRequestsResponse.requestId) &&
            Objects.equals(this.question, postRequestsResponse.question) &&
            Objects.equals(this.answers, postRequestsResponse.answers) &&
            Objects.equals(this._extends, postRequestsResponse._extends);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, question, answers, _extends);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostRequestsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
        sb.append("    _extends: ").append(toIndentedString(_extends)).append("\n");
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

