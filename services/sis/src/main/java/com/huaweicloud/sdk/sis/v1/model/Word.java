package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 单个单词的发音评测结果 */
public class Word {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_original")

    private String textOriginal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_normalised")

    private List<String> textNormalised = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_of_vocabulary")

    private Boolean outOfVocabulary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Float startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Float endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pronunciation")

    private WordPronunciation pronunciation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fluency")

    private WordFluency fluency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phonemes")

    private List<Phoneme> phonemes = null;

    public Word withText(String text) {
        this.text = text;
        return this;
    }

    /** 去除了所有标点符号后的原始文本 前端调用接口后推荐使用“​text​”来在UI 中展示结果
     * 
     * @return text */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Word withTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
        return this;
    }

    /** 接口接收的原始文本
     * 
     * @return textOriginal */
    public String getTextOriginal() {
        return textOriginal;
    }

    public void setTextOriginal(String textOriginal) {
        this.textOriginal = textOriginal;
    }

    public Word withTextNormalised(List<String> textNormalised) {
        this.textNormalised = textNormalised;
        return this;
    }

    public Word addTextNormalisedItem(String textNormalisedItem) {
        if (this.textNormalised == null) {
            this.textNormalised = new ArrayList<>();
        }
        this.textNormalised.add(textNormalisedItem);
        return this;
    }

    public Word withTextNormalised(Consumer<List<String>> textNormalisedSetter) {
        if (this.textNormalised == null) {
            this.textNormalised = new ArrayList<>();
        }
        textNormalisedSetter.accept(this.textNormalised);
        return this;
    }

    /** 原始文本规范化后切分成的单词 如175 会 规范为 [\"one\", \"\"hundred\", \"and\", \"seventy\", \"five\"]
     * 
     * @return textNormalised */
    public List<String> getTextNormalised() {
        return textNormalised;
    }

    public void setTextNormalised(List<String> textNormalised) {
        this.textNormalised = textNormalised;
    }

    public Word withOutOfVocabulary(Boolean outOfVocabulary) {
        this.outOfVocabulary = outOfVocabulary;
        return this;
    }

    /** 是否命中模型发音字典 如果未命中，则表明会根据发音规律推测正确发音
     * 
     * @return outOfVocabulary */
    public Boolean getOutOfVocabulary() {
        return outOfVocabulary;
    }

    public void setOutOfVocabulary(Boolean outOfVocabulary) {
        this.outOfVocabulary = outOfVocabulary;
    }

    public Word withStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 起始时间
     * 
     * @return startTime */
    public Float getStartTime() {
        return startTime;
    }

    public void setStartTime(Float startTime) {
        this.startTime = startTime;
    }

    public Word withEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间
     * 
     * @return endTime */
    public Float getEndTime() {
        return endTime;
    }

    public void setEndTime(Float endTime) {
        this.endTime = endTime;
    }

    public Word withScore(Float score) {
        this.score = score;
        return this;
    }

    /** 综合评分 minimum: 0 maximum: 1E+2
     * 
     * @return score */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Word withPronunciation(WordPronunciation pronunciation) {
        this.pronunciation = pronunciation;
        return this;
    }

    public Word withPronunciation(Consumer<WordPronunciation> pronunciationSetter) {
        if (this.pronunciation == null) {
            this.pronunciation = new WordPronunciation();
            pronunciationSetter.accept(this.pronunciation);
        }

        return this;
    }

    /** Get pronunciation
     * 
     * @return pronunciation */
    public WordPronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(WordPronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    public Word withFluency(WordFluency fluency) {
        this.fluency = fluency;
        return this;
    }

    public Word withFluency(Consumer<WordFluency> fluencySetter) {
        if (this.fluency == null) {
            this.fluency = new WordFluency();
            fluencySetter.accept(this.fluency);
        }

        return this;
    }

    /** Get fluency
     * 
     * @return fluency */
    public WordFluency getFluency() {
        return fluency;
    }

    public void setFluency(WordFluency fluency) {
        this.fluency = fluency;
    }

    public Word withPhonemes(List<Phoneme> phonemes) {
        this.phonemes = phonemes;
        return this;
    }

    public Word addPhonemesItem(Phoneme phonemesItem) {
        if (this.phonemes == null) {
            this.phonemes = new ArrayList<>();
        }
        this.phonemes.add(phonemesItem);
        return this;
    }

    public Word withPhonemes(Consumer<List<Phoneme>> phonemesSetter) {
        if (this.phonemes == null) {
            this.phonemes = new ArrayList<>();
        }
        phonemesSetter.accept(this.phonemes);
        return this;
    }

    /** 音节打分表
     * 
     * @return phonemes */
    public List<Phoneme> getPhonemes() {
        return phonemes;
    }

    public void setPhonemes(List<Phoneme> phonemes) {
        this.phonemes = phonemes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Word word = (Word) o;
        return Objects.equals(this.text, word.text) && Objects.equals(this.textOriginal, word.textOriginal)
            && Objects.equals(this.textNormalised, word.textNormalised)
            && Objects.equals(this.outOfVocabulary, word.outOfVocabulary)
            && Objects.equals(this.startTime, word.startTime) && Objects.equals(this.endTime, word.endTime)
            && Objects.equals(this.score, word.score) && Objects.equals(this.pronunciation, word.pronunciation)
            && Objects.equals(this.fluency, word.fluency) && Objects.equals(this.phonemes, word.phonemes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text,
            textOriginal,
            textNormalised,
            outOfVocabulary,
            startTime,
            endTime,
            score,
            pronunciation,
            fluency,
            phonemes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Word {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    textOriginal: ").append(toIndentedString(textOriginal)).append("\n");
        sb.append("    textNormalised: ").append(toIndentedString(textNormalised)).append("\n");
        sb.append("    outOfVocabulary: ").append(toIndentedString(outOfVocabulary)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    pronunciation: ").append(toIndentedString(pronunciation)).append("\n");
        sb.append("    fluency: ").append(toIndentedString(fluency)).append("\n");
        sb.append("    phonemes: ").append(toIndentedString(phonemes)).append("\n");
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
