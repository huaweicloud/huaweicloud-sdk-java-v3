package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.DocQueryAnswerDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class DocBotAnswers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    
    
    private String answer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    
    
    private Double score;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    
    
    private String question;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer_detail")
    
    
    private DocQueryAnswerDetail answerDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="details")
    
    
    private List<DocQueryAnswerDetail> details = null;
    
    public DocBotAnswers withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    


    /**
     * 答案。
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    public DocBotAnswers withScore(Double score) {
        this.score = score;
        return this;
    }

    


    /**
     * 置信度。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    

    public DocBotAnswers withQuestion(String question) {
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

    

    public DocBotAnswers withAnswerDetail(DocQueryAnswerDetail answerDetail) {
        this.answerDetail = answerDetail;
        return this;
    }

    public DocBotAnswers withAnswerDetail(Consumer<DocQueryAnswerDetail> answerDetailSetter) {
        if(this.answerDetail == null ){
            this.answerDetail = new DocQueryAnswerDetail();
            answerDetailSetter.accept(this.answerDetail);
        }
        
        return this;
    }


    /**
     * Get answerDetail
     * @return answerDetail
     */
    public DocQueryAnswerDetail getAnswerDetail() {
        return answerDetail;
    }

    public void setAnswerDetail(DocQueryAnswerDetail answerDetail) {
        this.answerDetail = answerDetail;
    }

    

    public DocBotAnswers withDetails(List<DocQueryAnswerDetail> details) {
        this.details = details;
        return this;
    }

    
    public DocBotAnswers addDetailsItem(DocQueryAnswerDetail detailsItem) {
        if(this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public DocBotAnswers withDetails(Consumer<List<DocQueryAnswerDetail>> detailsSetter) {
        if(this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 候选答案列表
     * @return details
     */
    public List<DocQueryAnswerDetail> getDetails() {
        return details;
    }

    public void setDetails(List<DocQueryAnswerDetail> details) {
        this.details = details;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocBotAnswers docBotAnswers = (DocBotAnswers) o;
        return Objects.equals(this.answer, docBotAnswers.answer) &&
            Objects.equals(this.score, docBotAnswers.score) &&
            Objects.equals(this.question, docBotAnswers.question) &&
            Objects.equals(this.answerDetail, docBotAnswers.answerDetail) &&
            Objects.equals(this.details, docBotAnswers.details);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, score, question, answerDetail, details);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocBotAnswers {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answerDetail: ").append(toIndentedString(answerDetail)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

