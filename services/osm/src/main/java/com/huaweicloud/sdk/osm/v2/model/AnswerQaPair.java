package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AnswerQaPair
 */
public class AnswerQaPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_id")

    private String qaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relevance_details")

    private List<RelevanceQapair> relevanceDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_complete")

    private Boolean taskComplete;

    public AnswerQaPair withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 相似度得分
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

    public AnswerQaPair withAnswer(String answer) {
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

    public AnswerQaPair withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 主题
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AnswerQaPair withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public AnswerQaPair withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 问题
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerQaPair withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    /**
     * 语料Id
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    public AnswerQaPair withRelevanceDetails(List<RelevanceQapair> relevanceDetails) {
        this.relevanceDetails = relevanceDetails;
        return this;
    }

    public AnswerQaPair addRelevanceDetailsItem(RelevanceQapair relevanceDetailsItem) {
        if (this.relevanceDetails == null) {
            this.relevanceDetails = new ArrayList<>();
        }
        this.relevanceDetails.add(relevanceDetailsItem);
        return this;
    }

    public AnswerQaPair withRelevanceDetails(Consumer<List<RelevanceQapair>> relevanceDetailsSetter) {
        if (this.relevanceDetails == null) {
            this.relevanceDetails = new ArrayList<>();
        }
        relevanceDetailsSetter.accept(this.relevanceDetails);
        return this;
    }

    /**
     * 相关问题详情列表
     * @return relevanceDetails
     */
    public List<RelevanceQapair> getRelevanceDetails() {
        return relevanceDetails;
    }

    public void setRelevanceDetails(List<RelevanceQapair> relevanceDetails) {
        this.relevanceDetails = relevanceDetails;
    }

    public AnswerQaPair withTaskComplete(Boolean taskComplete) {
        this.taskComplete = taskComplete;
        return this;
    }

    /**
     * 技能意图识别是否结束
     * @return taskComplete
     */
    public Boolean getTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(Boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnswerQaPair answerQaPair = (AnswerQaPair) o;
        return Objects.equals(this.score, answerQaPair.score) && Objects.equals(this.answer, answerQaPair.answer)
            && Objects.equals(this.domain, answerQaPair.domain) && Objects.equals(this.link, answerQaPair.link)
            && Objects.equals(this.question, answerQaPair.question)
            && Objects.equals(this.qaPairId, answerQaPair.qaPairId)
            && Objects.equals(this.relevanceDetails, answerQaPair.relevanceDetails)
            && Objects.equals(this.taskComplete, answerQaPair.taskComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, answer, domain, link, question, qaPairId, relevanceDetails, taskComplete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnswerQaPair {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    relevanceDetails: ").append(toIndentedString(relevanceDetails)).append("\n");
        sb.append("    taskComplete: ").append(toIndentedString(taskComplete)).append("\n");
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
