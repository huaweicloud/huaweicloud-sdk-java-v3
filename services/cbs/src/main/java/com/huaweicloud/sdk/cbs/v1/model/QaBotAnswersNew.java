package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class QaBotAnswersNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answers")

    private List<QaBotAnswer> answers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommend_answers")

    private List<RecomendAnswer> recommendAnswers = null;

    public QaBotAnswersNew withAnswers(List<QaBotAnswer> answers) {
        this.answers = answers;
        return this;
    }

    public QaBotAnswersNew addAnswersItem(QaBotAnswer answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public QaBotAnswersNew withAnswers(Consumer<List<QaBotAnswer>> answersSetter) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 问答机器人回复。
     * @return answers
     */
    public List<QaBotAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<QaBotAnswer> answers) {
        this.answers = answers;
    }

    public QaBotAnswersNew withRecommendAnswers(List<RecomendAnswer> recommendAnswers) {
        this.recommendAnswers = recommendAnswers;
        return this;
    }

    public QaBotAnswersNew addRecommendAnswersItem(RecomendAnswer recommendAnswersItem) {
        if (this.recommendAnswers == null) {
            this.recommendAnswers = new ArrayList<>();
        }
        this.recommendAnswers.add(recommendAnswersItem);
        return this;
    }

    public QaBotAnswersNew withRecommendAnswers(Consumer<List<RecomendAnswer>> recommendAnswersSetter) {
        if (this.recommendAnswers == null) {
            this.recommendAnswers = new ArrayList<>();
        }
        recommendAnswersSetter.accept(this.recommendAnswers);
        return this;
    }

    /**
     * 问答机器人推荐问题
     * @return recommendAnswers
     */
    public List<RecomendAnswer> getRecommendAnswers() {
        return recommendAnswers;
    }

    public void setRecommendAnswers(List<RecomendAnswer> recommendAnswers) {
        this.recommendAnswers = recommendAnswers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QaBotAnswersNew that = (QaBotAnswersNew) obj;
        return Objects.equals(this.answers, that.answers)
            && Objects.equals(this.recommendAnswers, that.recommendAnswers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answers, recommendAnswers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaBotAnswersNew {\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
        sb.append("    recommendAnswers: ").append(toIndentedString(recommendAnswers)).append("\n");
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
