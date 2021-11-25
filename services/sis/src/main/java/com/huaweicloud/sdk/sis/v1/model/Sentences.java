package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Sentences {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private FlashScoreResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    public Sentences withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 分句结果信息
     * 
     * @return endTime */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Sentences withResult(FlashScoreResult result) {
        this.result = result;
        return this;
    }

    public Sentences withResult(Consumer<FlashScoreResult> resultSetter) {
        if (this.result == null) {
            this.result = new FlashScoreResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /** Get result
     * 
     * @return result */
    public FlashScoreResult getResult() {
        return result;
    }

    public void setResult(FlashScoreResult result) {
        this.result = result;
    }

    public Sentences withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 一句话开始时间，单位毫秒
     * 
     * @return startTime */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sentences sentences = (Sentences) o;
        return Objects.equals(this.endTime, sentences.endTime) && Objects.equals(this.result, sentences.result)
            && Objects.equals(this.startTime, sentences.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, result, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sentences {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
