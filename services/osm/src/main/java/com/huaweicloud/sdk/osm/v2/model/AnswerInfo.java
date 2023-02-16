package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AnswerInfo
 */
public class AnswerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

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

    public AnswerInfo withAnswer(String answer) {
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

    public AnswerInfo withLink(String link) {
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

    public AnswerInfo withQuestion(String question) {
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

    public AnswerInfo withQaPairId(String qaPairId) {
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

    public AnswerInfo withRelevanceDetails(List<RelevanceQapair> relevanceDetails) {
        this.relevanceDetails = relevanceDetails;
        return this;
    }

    public AnswerInfo addRelevanceDetailsItem(RelevanceQapair relevanceDetailsItem) {
        if (this.relevanceDetails == null) {
            this.relevanceDetails = new ArrayList<>();
        }
        this.relevanceDetails.add(relevanceDetailsItem);
        return this;
    }

    public AnswerInfo withRelevanceDetails(Consumer<List<RelevanceQapair>> relevanceDetailsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnswerInfo answerInfo = (AnswerInfo) o;
        return Objects.equals(this.answer, answerInfo.answer) && Objects.equals(this.link, answerInfo.link)
            && Objects.equals(this.question, answerInfo.question) && Objects.equals(this.qaPairId, answerInfo.qaPairId)
            && Objects.equals(this.relevanceDetails, answerInfo.relevanceDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, link, question, qaPairId, relevanceDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnswerInfo {\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    relevanceDetails: ").append(toIndentedString(relevanceDetails)).append("\n");
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
