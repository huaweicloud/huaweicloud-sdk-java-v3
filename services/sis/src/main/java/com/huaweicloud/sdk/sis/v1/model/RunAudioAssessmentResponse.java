package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RunAudioAssessmentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completeness")

    private Float completeness;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pronunciation")

    private Pronunciation pronunciation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fluency")

    private Fluency fluency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private List<Word> words = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traceId")

    private String traceId;

    public RunAudioAssessmentResponse withScore(Float score) {
        this.score = score;
        return this;
    }

    /** 综合评分，0-100 minimum: 0 maximum: 1E+2
     * 
     * @return score */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public RunAudioAssessmentResponse withCompleteness(Float completeness) {
        this.completeness = completeness;
        return this;
    }

    /** 完整性评分，0-100 表示有多少比例的单词发音是清楚的 minimum: 0 maximum: 1E+2
     * 
     * @return completeness */
    public Float getCompleteness() {
        return completeness;
    }

    public void setCompleteness(Float completeness) {
        this.completeness = completeness;
    }

    public RunAudioAssessmentResponse withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /** 音频/视频时长，单位秒
     * 
     * @return duration */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public RunAudioAssessmentResponse withPronunciation(Pronunciation pronunciation) {
        this.pronunciation = pronunciation;
        return this;
    }

    public RunAudioAssessmentResponse withPronunciation(Consumer<Pronunciation> pronunciationSetter) {
        if (this.pronunciation == null) {
            this.pronunciation = new Pronunciation();
            pronunciationSetter.accept(this.pronunciation);
        }

        return this;
    }

    /** Get pronunciation
     * 
     * @return pronunciation */
    public Pronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(Pronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    public RunAudioAssessmentResponse withFluency(Fluency fluency) {
        this.fluency = fluency;
        return this;
    }

    public RunAudioAssessmentResponse withFluency(Consumer<Fluency> fluencySetter) {
        if (this.fluency == null) {
            this.fluency = new Fluency();
            fluencySetter.accept(this.fluency);
        }

        return this;
    }

    /** Get fluency
     * 
     * @return fluency */
    public Fluency getFluency() {
        return fluency;
    }

    public void setFluency(Fluency fluency) {
        this.fluency = fluency;
    }

    public RunAudioAssessmentResponse withWords(List<Word> words) {
        this.words = words;
        return this;
    }

    public RunAudioAssessmentResponse addWordsItem(Word wordsItem) {
        if (this.words == null) {
            this.words = new ArrayList<>();
        }
        this.words.add(wordsItem);
        return this;
    }

    public RunAudioAssessmentResponse withWords(Consumer<List<Word>> wordsSetter) {
        if (this.words == null) {
            this.words = new ArrayList<>();
        }
        wordsSetter.accept(this.words);
        return this;
    }

    /** 单词评测打分表
     * 
     * @return words */
    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public RunAudioAssessmentResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /** 评测失败时定位问题使用的字段
     * 
     * @return traceId */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunAudioAssessmentResponse runAudioAssessmentResponse = (RunAudioAssessmentResponse) o;
        return Objects.equals(this.score, runAudioAssessmentResponse.score)
            && Objects.equals(this.completeness, runAudioAssessmentResponse.completeness)
            && Objects.equals(this.duration, runAudioAssessmentResponse.duration)
            && Objects.equals(this.pronunciation, runAudioAssessmentResponse.pronunciation)
            && Objects.equals(this.fluency, runAudioAssessmentResponse.fluency)
            && Objects.equals(this.words, runAudioAssessmentResponse.words)
            && Objects.equals(this.traceId, runAudioAssessmentResponse.traceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, completeness, duration, pronunciation, fluency, words, traceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunAudioAssessmentResponse {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    completeness: ").append(toIndentedString(completeness)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    pronunciation: ").append(toIndentedString(pronunciation)).append("\n");
        sb.append("    fluency: ").append(toIndentedString(fluency)).append("\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
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
