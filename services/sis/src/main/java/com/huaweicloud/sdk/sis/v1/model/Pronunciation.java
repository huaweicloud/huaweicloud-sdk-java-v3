package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 整体发音打分 */
public class Pronunciation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop")

    private Float gop;

    public Pronunciation withScore(Float score) {
        this.score = score;
        return this;
    }

    /** 发音质量综合得分 0-100
     * 
     * @return score */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Pronunciation withGop(Float gop) {
        this.gop = gop;
        return this;
    }

    /** 发音质量好坏 0-100
     * 
     * @return gop */
    public Float getGop() {
        return gop;
    }

    public void setGop(Float gop) {
        this.gop = gop;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pronunciation pronunciation = (Pronunciation) o;
        return Objects.equals(this.score, pronunciation.score) && Objects.equals(this.gop, pronunciation.gop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, gop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pronunciation {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    gop: ").append(toIndentedString(gop)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
