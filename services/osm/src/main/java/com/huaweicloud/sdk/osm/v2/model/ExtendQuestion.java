package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtendQuestion
 */
public class ExtendQuestion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    public ExtendQuestion withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 扩展问内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ExtendQuestion withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 分值
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendQuestion extendQuestion = (ExtendQuestion) o;
        return Objects.equals(this.content, extendQuestion.content) && Objects.equals(this.score, extendQuestion.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendQuestion {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
