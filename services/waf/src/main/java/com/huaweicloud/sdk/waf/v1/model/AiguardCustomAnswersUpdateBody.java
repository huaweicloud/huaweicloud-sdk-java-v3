package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiguardCustomAnswersUpdateBody
 */
public class AiguardCustomAnswersUpdateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answers")

    private List<String> answers = null;

    public AiguardCustomAnswersUpdateBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 代答库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AiguardCustomAnswersUpdateBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 代答库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AiguardCustomAnswersUpdateBody withAnswers(List<String> answers) {
        this.answers = answers;
        return this;
    }

    public AiguardCustomAnswersUpdateBody addAnswersItem(String answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public AiguardCustomAnswersUpdateBody withAnswers(Consumer<List<String>> answersSetter) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 答案列表（全量替换）
     * @return answers
     */
    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiguardCustomAnswersUpdateBody that = (AiguardCustomAnswersUpdateBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.answers, that.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, answers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiguardCustomAnswersUpdateBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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
