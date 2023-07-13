package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSuggestionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "questions")

    private List<String> questions = null;

    public ListSuggestionsResponse withQuestions(List<String> questions) {
        this.questions = questions;
        return this;
    }

    public ListSuggestionsResponse addQuestionsItem(String questionsItem) {
        if (this.questions == null) {
            this.questions = new ArrayList<>();
        }
        this.questions.add(questionsItem);
        return this;
    }

    public ListSuggestionsResponse withQuestions(Consumer<List<String>> questionsSetter) {
        if (this.questions == null) {
            this.questions = new ArrayList<>();
        }
        questionsSetter.accept(this.questions);
        return this;
    }

    /**
     * 推荐问列表。
     * @return questions
     */
    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSuggestionsResponse that = (ListSuggestionsResponse) obj;
        return Objects.equals(this.questions, that.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSuggestionsResponse {\n");
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
