package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 单词的流利度打分
 */
public class WordFluency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rhythm")

    private Float rhythm;

    public WordFluency withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public WordFluency withRhythm(Float rhythm) {
        this.rhythm = rhythm;
        return this;
    }

    /**
     * 
     * @return rhythm
     */
    public Float getRhythm() {
        return rhythm;
    }

    public void setRhythm(Float rhythm) {
        this.rhythm = rhythm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WordFluency wordFluency = (WordFluency) o;
        return Objects.equals(this.score, wordFluency.score) && Objects.equals(this.rhythm, wordFluency.rhythm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, rhythm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordFluency {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    rhythm: ").append(toIndentedString(rhythm)).append("\n");
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
