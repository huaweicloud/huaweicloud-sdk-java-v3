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
public class PostSuggestionsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question")
    
    
    private String question;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="top")
    
    
    private Integer top;

    public PostSuggestionsReq withQuestion(String question) {
        this.question = question;
        return this;
    }

    


    /**
     * 用户输入的问题，长度为1~512。
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    

    public PostSuggestionsReq withTop(Integer top) {
        this.top = top;
        return this;
    }

    


    /**
     * 最多提示条数，默认为5，取值范围[1,10]。
     * minimum: 1
     * maximum: 10
     * @return top
     */
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostSuggestionsReq postSuggestionsReq = (PostSuggestionsReq) o;
        return Objects.equals(this.question, postSuggestionsReq.question) &&
            Objects.equals(this.top, postSuggestionsReq.top);
    }
    @Override
    public int hashCode() {
        return Objects.hash(question, top);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostSuggestionsReq {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
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

