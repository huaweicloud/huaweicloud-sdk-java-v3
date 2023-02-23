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
public class KbqaAnswers  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    

    private Double score;

    public KbqaAnswers withAnswer(String answer) {
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

    

    public KbqaAnswers withScore(Double score) {
        this.score = score;
        return this;
    }

    


    /**
     * 答案评分。
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KbqaAnswers kbqaAnswers = (KbqaAnswers) o;
        return Objects.equals(this.answer, kbqaAnswers.answer) &&
            Objects.equals(this.score, kbqaAnswers.score);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, score);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KbqaAnswers {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

