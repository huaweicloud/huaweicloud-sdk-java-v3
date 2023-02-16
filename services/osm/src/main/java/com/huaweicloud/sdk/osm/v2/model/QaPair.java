package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QaPair
 */
public class QaPair {

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
    @JsonProperty(value = "answers")

    private List<Answer> answers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_id")

    private String qaPairId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ex_questions")

    private List<ExtendQuestion> exQuestions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_question_ids")

    private List<String> relatedQuestionIds = null;

    public QaPair withDomain(String domain) {
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

    public QaPair withLink(String link) {
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

    public QaPair withQuestion(String question) {
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

    public QaPair withAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public QaPair addAnswersItem(Answer answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public QaPair withAnswers(Consumer<List<Answer>> answersSetter) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 答案列表
     * @return answers
     */
    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public QaPair withQaPairId(String qaPairId) {
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

    public QaPair withExQuestions(List<ExtendQuestion> exQuestions) {
        this.exQuestions = exQuestions;
        return this;
    }

    public QaPair addExQuestionsItem(ExtendQuestion exQuestionsItem) {
        if (this.exQuestions == null) {
            this.exQuestions = new ArrayList<>();
        }
        this.exQuestions.add(exQuestionsItem);
        return this;
    }

    public QaPair withExQuestions(Consumer<List<ExtendQuestion>> exQuestionsSetter) {
        if (this.exQuestions == null) {
            this.exQuestions = new ArrayList<>();
        }
        exQuestionsSetter.accept(this.exQuestions);
        return this;
    }

    /**
     * 扩展问题列表
     * @return exQuestions
     */
    public List<ExtendQuestion> getExQuestions() {
        return exQuestions;
    }

    public void setExQuestions(List<ExtendQuestion> exQuestions) {
        this.exQuestions = exQuestions;
    }

    public QaPair withRelatedQuestionIds(List<String> relatedQuestionIds) {
        this.relatedQuestionIds = relatedQuestionIds;
        return this;
    }

    public QaPair addRelatedQuestionIdsItem(String relatedQuestionIdsItem) {
        if (this.relatedQuestionIds == null) {
            this.relatedQuestionIds = new ArrayList<>();
        }
        this.relatedQuestionIds.add(relatedQuestionIdsItem);
        return this;
    }

    public QaPair withRelatedQuestionIds(Consumer<List<String>> relatedQuestionIdsSetter) {
        if (this.relatedQuestionIds == null) {
            this.relatedQuestionIds = new ArrayList<>();
        }
        relatedQuestionIdsSetter.accept(this.relatedQuestionIds);
        return this;
    }

    /**
     * 相关问题列表
     * @return relatedQuestionIds
     */
    public List<String> getRelatedQuestionIds() {
        return relatedQuestionIds;
    }

    public void setRelatedQuestionIds(List<String> relatedQuestionIds) {
        this.relatedQuestionIds = relatedQuestionIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QaPair qaPair = (QaPair) o;
        return Objects.equals(this.domain, qaPair.domain) && Objects.equals(this.link, qaPair.link)
            && Objects.equals(this.question, qaPair.question) && Objects.equals(this.answers, qaPair.answers)
            && Objects.equals(this.qaPairId, qaPair.qaPairId) && Objects.equals(this.exQuestions, qaPair.exQuestions)
            && Objects.equals(this.relatedQuestionIds, qaPair.relatedQuestionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, link, question, answers, qaPairId, exQuestions, relatedQuestionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QaPair {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
        sb.append("    exQuestions: ").append(toIndentedString(exQuestions)).append("\n");
        sb.append("    relatedQuestionIds: ").append(toIndentedString(relatedQuestionIds)).append("\n");
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
