package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QaGraphAnswer
 */
public class QaGraphAnswer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private List<String> options = null;

    public QaGraphAnswer withAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    /**
     * 答案
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QaGraphAnswer withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 评分
     * minimum: 0
     * maximum: 1
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public QaGraphAnswer withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * minimum: 0
     * maximum: 2147483647
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public QaGraphAnswer withOptions(List<String> options) {
        this.options = options;
        return this;
    }

    public QaGraphAnswer addOptionsItem(String optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    public QaGraphAnswer withOptions(Consumer<List<String>> optionsSetter) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        optionsSetter.accept(this.options);
        return this;
    }

    /**
     * 列表
     * @return options
     */
    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QaGraphAnswer qaGraphAnswer = (QaGraphAnswer) o;
        return Objects.equals(this.answer, qaGraphAnswer.answer) && Objects.equals(this.score, qaGraphAnswer.score)
            && Objects.equals(this.type, qaGraphAnswer.type) && Objects.equals(this.options, qaGraphAnswer.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, score, type, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaGraphAnswer {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
