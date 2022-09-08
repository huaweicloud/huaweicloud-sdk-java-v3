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
public class RecomendAnswer  {



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
    @JsonProperty(value="top_score_question")
    
    
    private String topScoreQuestion;

    public RecomendAnswer withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    


    /**
     * 问答对ID。
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    

    public RecomendAnswer withStQuestion(String stQuestion) {
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

    

    public RecomendAnswer withScore(Double score) {
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

    

    public RecomendAnswer withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 所属领域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public RecomendAnswer withTopScoreQuestion(String topScoreQuestion) {
        this.topScoreQuestion = topScoreQuestion;
        return this;
    }

    


    /**
     * 最高评分的扩展问或标准问。
     * @return topScoreQuestion
     */
    public String getTopScoreQuestion() {
        return topScoreQuestion;
    }

    public void setTopScoreQuestion(String topScoreQuestion) {
        this.topScoreQuestion = topScoreQuestion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecomendAnswer recomendAnswer = (RecomendAnswer) o;
        return Objects.equals(this.qaPairId, recomendAnswer.qaPairId) &&
            Objects.equals(this.stQuestion, recomendAnswer.stQuestion) &&
            Objects.equals(this.score, recomendAnswer.score) &&
            Objects.equals(this.domain, recomendAnswer.domain) &&
            Objects.equals(this.topScoreQuestion, recomendAnswer.topScoreQuestion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qaPairId, stQuestion, score, domain, topScoreQuestion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecomendAnswer {\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    stQuestion: ").append(toIndentedString(stQuestion)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    topScoreQuestion: ").append(toIndentedString(topScoreQuestion)).append("\n");
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

