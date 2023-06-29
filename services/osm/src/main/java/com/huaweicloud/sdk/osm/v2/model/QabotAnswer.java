package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QabotAnswer
 */
public class QabotAnswer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer")

    private String answer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_id")

    private String qaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_score_question")

    private String topScoreQuestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relevance_details")

    private List<RelevanceQapair> relevanceDetails = null;

    public QabotAnswer withQuestion(String question) {
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

    public QabotAnswer withAnswer(String answer) {
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

    public QabotAnswer withScore(Double score) {
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

    public QabotAnswer withDomain(String domain) {
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

    public QabotAnswer withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 链接地址
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public QabotAnswer withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    /**
     * 语料id
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    public QabotAnswer withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 主题id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public QabotAnswer withTopScoreQuestion(String topScoreQuestion) {
        this.topScoreQuestion = topScoreQuestion;
        return this;
    }

    /**
     * 推荐答案
     * @return topScoreQuestion
     */
    public String getTopScoreQuestion() {
        return topScoreQuestion;
    }

    public void setTopScoreQuestion(String topScoreQuestion) {
        this.topScoreQuestion = topScoreQuestion;
    }

    public QabotAnswer withRelevanceDetails(List<RelevanceQapair> relevanceDetails) {
        this.relevanceDetails = relevanceDetails;
        return this;
    }

    public QabotAnswer addRelevanceDetailsItem(RelevanceQapair relevanceDetailsItem) {
        if (this.relevanceDetails == null) {
            this.relevanceDetails = new ArrayList<>();
        }
        this.relevanceDetails.add(relevanceDetailsItem);
        return this;
    }

    public QabotAnswer withRelevanceDetails(Consumer<List<RelevanceQapair>> relevanceDetailsSetter) {
        if (this.relevanceDetails == null) {
            this.relevanceDetails = new ArrayList<>();
        }
        relevanceDetailsSetter.accept(this.relevanceDetails);
        return this;
    }

    /**
     * 相关问题列表
     * @return relevanceDetails
     */
    public List<RelevanceQapair> getRelevanceDetails() {
        return relevanceDetails;
    }

    public void setRelevanceDetails(List<RelevanceQapair> relevanceDetails) {
        this.relevanceDetails = relevanceDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QabotAnswer that = (QabotAnswer) obj;
        return Objects.equals(this.question, that.question) && Objects.equals(this.answer, that.answer)
            && Objects.equals(this.score, that.score) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.link, that.link) && Objects.equals(this.qaPairId, that.qaPairId)
            && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.topScoreQuestion, that.topScoreQuestion)
            && Objects.equals(this.relevanceDetails, that.relevanceDetails);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(question, answer, score, domain, link, qaPairId, domainId, topScoreQuestion, relevanceDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QabotAnswer {\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    topScoreQuestion: ").append(toIndentedString(topScoreQuestion)).append("\n");
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
