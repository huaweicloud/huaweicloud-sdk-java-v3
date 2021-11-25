package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class WordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "word")

    private String word;

    public WordInfo withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 起始时间
     * 
     * @return startTime */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public WordInfo withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间
     * 
     * @return endTime */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public WordInfo withWord(String word) {
        this.word = word;
        return this;
    }

    /** 分词
     * 
     * @return word */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WordInfo wordInfo = (WordInfo) o;
        return Objects.equals(this.startTime, wordInfo.startTime) && Objects.equals(this.endTime, wordInfo.endTime)
            && Objects.equals(this.word, wordInfo.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, word);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordInfo {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
