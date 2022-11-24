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
public class HotQuestionCount  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="qa_pair_id")
    
    
    private String qaPairId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="st_question")
    
    
    private String stQuestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    
    private String domain;

    public HotQuestionCount withQaPairId(String qaPairId) {
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

    

    public HotQuestionCount withStQuestion(String stQuestion) {
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

    

    public HotQuestionCount withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 标准问题所属领域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HotQuestionCount hotQuestionCount = (HotQuestionCount) o;
        return Objects.equals(this.qaPairId, hotQuestionCount.qaPairId) &&
            Objects.equals(this.stQuestion, hotQuestionCount.stQuestion) &&
            Objects.equals(this.domain, hotQuestionCount.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(qaPairId, stQuestion, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotQuestionCount {\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    stQuestion: ").append(toIndentedString(stQuestion)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

