package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.HotQuestionCount;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CollectHotQuestionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="questions")
    
    
    private List<HotQuestionCount> questions = null;
    
    public CollectHotQuestionsResponse withQuestions(List<HotQuestionCount> questions) {
        this.questions = questions;
        return this;
    }

    
    public CollectHotQuestionsResponse addQuestionsItem(HotQuestionCount questionsItem) {
        if(this.questions == null) {
            this.questions = new ArrayList<>();
        }
        this.questions.add(questionsItem);
        return this;
    }

    public CollectHotQuestionsResponse withQuestions(Consumer<List<HotQuestionCount>> questionsSetter) {
        if(this.questions == null) {
            this.questions = new ArrayList<>();
        }
        questionsSetter.accept(this.questions);
        return this;
    }

    /**
     * 指定时间范围内，热点问题列表。
     * @return questions
     */
    public List<HotQuestionCount> getQuestions() {
        return questions;
    }

    public void setQuestions(List<HotQuestionCount> questions) {
        this.questions = questions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectHotQuestionsResponse collectHotQuestionsResponse = (CollectHotQuestionsResponse) o;
        return Objects.equals(this.questions, collectHotQuestionsResponse.questions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(questions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectHotQuestionsResponse {\n");
        sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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

