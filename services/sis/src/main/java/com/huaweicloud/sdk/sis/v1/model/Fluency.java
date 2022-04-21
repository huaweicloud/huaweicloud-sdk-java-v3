package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 整体流利度打分
 */
public class Fluency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rhythm")

    private Float rhythm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cohesion")

    private Float cohesion;

    public Fluency withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 流利度综合得分 0-100
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Fluency withRhythm(Float rhythm) {
        this.rhythm = rhythm;
        return this;
    }

    /**
     * 韵律得分 0-100 韵律指音素在单词和句子中的发音长度是否得当
     * @return rhythm
     */
    public Float getRhythm() {
        return rhythm;
    }

    public void setRhythm(Float rhythm) {
        this.rhythm = rhythm;
    }

    public Fluency withCohesion(Float cohesion) {
        this.cohesion = cohesion;
        return this;
    }

    /**
     * 连贯性得分 0-100
     * @return cohesion
     */
    public Float getCohesion() {
        return cohesion;
    }

    public void setCohesion(Float cohesion) {
        this.cohesion = cohesion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fluency fluency = (Fluency) o;
        return Objects.equals(this.score, fluency.score) && Objects.equals(this.rhythm, fluency.rhythm)
            && Objects.equals(this.cohesion, fluency.cohesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, rhythm, cohesion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fluency {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    rhythm: ").append(toIndentedString(rhythm)).append("\n");
        sb.append("    cohesion: ").append(toIndentedString(cohesion)).append("\n");
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
