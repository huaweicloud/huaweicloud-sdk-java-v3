package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 指令回复话术信息。
 */
public class InstructionReplyWordsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_words")

    private String replyWords;

    public InstructionReplyWordsInfo withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public InstructionReplyWordsInfo withReplyWords(String replyWords) {
        this.replyWords = replyWords;
        return this;
    }

    /**
     * 回复话术，多个回复话术间用换行符\\n分隔。
     * @return replyWords
     */
    public String getReplyWords() {
        return replyWords;
    }

    public void setReplyWords(String replyWords) {
        this.replyWords = replyWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstructionReplyWordsInfo that = (InstructionReplyWordsInfo) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.replyWords, that.replyWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, replyWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstructionReplyWordsInfo {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    replyWords: ").append(toIndentedString(replyWords)).append("\n");
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
