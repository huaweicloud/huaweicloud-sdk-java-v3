package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.ExQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Answers  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qa_pair_id")
    

    private String qaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="st_question")
    

    private String stQuestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ex_questions")
    
    private List<ExQuestions> exQuestions = null;
    
    public Answers withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    


    /**
     * Answers.
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    

    public Answers withStQuestion(String stQuestion) {
        this.stQuestion = stQuestion;
        return this;
    }

    


    /**
     * 标准问题。
     * @return stQuestion
     */
    public String getStQuestion() {
        return stQuestion;
    }

    public void setStQuestion(String stQuestion) {
        this.stQuestion = stQuestion;
    }

    

    public Answers withScore(Double score) {
        this.score = score;
        return this;
    }

    


    /**
     * 相似度得分，精确到小数点后3位。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    

    public Answers withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * Domain.
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public Answers withAnswer(String answer) {
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

    

    public Answers withExQuestions(List<ExQuestions> exQuestions) {
        this.exQuestions = exQuestions;
        return this;
    }

    
    public Answers addExQuestionsItem(ExQuestions exQuestionsItem) {
        if(this.exQuestions == null) {
            this.exQuestions = new ArrayList<>();
        }
        this.exQuestions.add(exQuestionsItem);
        return this;
    }

    public Answers withExQuestions(Consumer<List<ExQuestions>> exQuestionsSetter) {
        if(this.exQuestions == null) {
            this.exQuestions = new ArrayList<>();
        }
        exQuestionsSetter.accept(this.exQuestions);
        return this;
    }

    /**
     * 扩展问。
     * @return exQuestions
     */
    public List<ExQuestions> getExQuestions() {
        return exQuestions;
    }

    public void setExQuestions(List<ExQuestions> exQuestions) {
        this.exQuestions = exQuestions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Answers answers = (Answers) o;
        return Objects.equals(this.qaPairId, answers.qaPairId) &&
            Objects.equals(this.stQuestion, answers.stQuestion) &&
            Objects.equals(this.score, answers.score) &&
            Objects.equals(this.domain, answers.domain) &&
            Objects.equals(this.answer, answers.answer) &&
            Objects.equals(this.exQuestions, answers.exQuestions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qaPairId, stQuestion, score, domain, answer, exQuestions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Answers {\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    stQuestion: ").append(toIndentedString(stQuestion)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    exQuestions: ").append(toIndentedString(exQuestions)).append("\n");
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

