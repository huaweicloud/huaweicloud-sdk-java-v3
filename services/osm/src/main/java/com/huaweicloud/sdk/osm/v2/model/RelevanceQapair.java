package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RelevanceQapair
 */
public class RelevanceQapair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question")

    private String question;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_pair_id")

    private String qaPairId;

    public RelevanceQapair withLink(String link) {
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

    public RelevanceQapair withQuestion(String question) {
        this.question = question;
        return this;
    }

    /**
     * 标准问题
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public RelevanceQapair withQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
        return this;
    }

    /**
     * 标准问题Id
     * @return qaPairId
     */
    public String getQaPairId() {
        return qaPairId;
    }

    public void setQaPairId(String qaPairId) {
        this.qaPairId = qaPairId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelevanceQapair relevanceQapair = (RelevanceQapair) o;
        return Objects.equals(this.link, relevanceQapair.link)
            && Objects.equals(this.question, relevanceQapair.question)
            && Objects.equals(this.qaPairId, relevanceQapair.qaPairId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, question, qaPairId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelevanceQapair {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    question: ").append(toIndentedString(question)).append("\n");
        sb.append("    qaPairId: ").append(toIndentedString(qaPairId)).append("\n");
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
