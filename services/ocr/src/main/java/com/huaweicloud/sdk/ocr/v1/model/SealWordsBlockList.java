package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SealWordsBlockList
 */
public class SealWordsBlockList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words")

    private String words;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_confidence")

    private Float wordsConfidence;

    public SealWordsBlockList withWords(String words) {
        this.words = words;
        return this;
    }

    /**
     * 印章文本块。
     * @return words
     */
    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public SealWordsBlockList withWordsConfidence(Float wordsConfidence) {
        this.wordsConfidence = wordsConfidence;
        return this;
    }

    /**
     * 印章文本块的置信度。
     * @return wordsConfidence
     */
    public Float getWordsConfidence() {
        return wordsConfidence;
    }

    public void setWordsConfidence(Float wordsConfidence) {
        this.wordsConfidence = wordsConfidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SealWordsBlockList that = (SealWordsBlockList) obj;
        return Objects.equals(this.words, that.words) && Objects.equals(this.wordsConfidence, that.wordsConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, wordsConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SealWordsBlockList {\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("    wordsConfidence: ").append(toIndentedString(wordsConfidence)).append("\n");
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
