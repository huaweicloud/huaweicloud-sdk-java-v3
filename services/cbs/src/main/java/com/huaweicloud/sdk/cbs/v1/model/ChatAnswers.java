package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ChatAnswers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="answer")
    
    @JacksonXmlProperty(localName = "answer")
    
    private String answer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="score")
    
    @JacksonXmlProperty(localName = "score")
    
    private Float score;

    public ChatAnswers withAnswer(String answer) {
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

    

    public ChatAnswers withScore(Float score) {
        this.score = score;
        return this;
    }

    


    /**
     * 闲聊的置信度，范围:0.0~1.0  0.0表示兜底回复
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
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
        ChatAnswers chatAnswers = (ChatAnswers) o;
        return Objects.equals(this.answer, chatAnswers.answer) &&
            Objects.equals(this.score, chatAnswers.score);
    }
    @Override
    public int hashCode() {
        return Objects.hash(answer, score);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatAnswers {\n");
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

