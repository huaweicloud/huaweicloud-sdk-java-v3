package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FlashResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    private Integer channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sentences")

    private List<Sentences> sentences = null;

    public FlashResult withChannelId(Integer channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 音频声道id
     * @return channelId
     */
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public FlashResult withSentences(List<Sentences> sentences) {
        this.sentences = sentences;
        return this;
    }

    public FlashResult addSentencesItem(Sentences sentencesItem) {
        if (this.sentences == null) {
            this.sentences = new ArrayList<>();
        }
        this.sentences.add(sentencesItem);
        return this;
    }

    public FlashResult withSentences(Consumer<List<Sentences>> sentencesSetter) {
        if (this.sentences == null) {
            this.sentences = new ArrayList<>();
        }
        sentencesSetter.accept(this.sentences);
        return this;
    }

    /**
     * 分句结果
     * @return sentences
     */
    public List<Sentences> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentences> sentences) {
        this.sentences = sentences;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlashResult that = (FlashResult) obj;
        return Objects.equals(this.channelId, that.channelId) && Objects.equals(this.sentences, that.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, sentences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlashResult {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
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
