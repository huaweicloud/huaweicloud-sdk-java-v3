package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改热词记录请求。
 */
public class UpdateHotWordsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_words_type")

    private HotWordsTypeEnum hotWordsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sis_hot_words")

    private UpdateSisHotWords sisHotWords;

    public UpdateHotWordsReq withHotWordsType(HotWordsTypeEnum hotWordsType) {
        this.hotWordsType = hotWordsType;
        return this;
    }

    /**
     * Get hotWordsType
     * @return hotWordsType
     */
    public HotWordsTypeEnum getHotWordsType() {
        return hotWordsType;
    }

    public void setHotWordsType(HotWordsTypeEnum hotWordsType) {
        this.hotWordsType = hotWordsType;
    }

    public UpdateHotWordsReq withSisHotWords(UpdateSisHotWords sisHotWords) {
        this.sisHotWords = sisHotWords;
        return this;
    }

    public UpdateHotWordsReq withSisHotWords(Consumer<UpdateSisHotWords> sisHotWordsSetter) {
        if (this.sisHotWords == null) {
            this.sisHotWords = new UpdateSisHotWords();
            sisHotWordsSetter.accept(this.sisHotWords);
        }

        return this;
    }

    /**
     * Get sisHotWords
     * @return sisHotWords
     */
    public UpdateSisHotWords getSisHotWords() {
        return sisHotWords;
    }

    public void setSisHotWords(UpdateSisHotWords sisHotWords) {
        this.sisHotWords = sisHotWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHotWordsReq that = (UpdateHotWordsReq) obj;
        return Objects.equals(this.hotWordsType, that.hotWordsType)
            && Objects.equals(this.sisHotWords, that.sisHotWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotWordsType, sisHotWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHotWordsReq {\n");
        sb.append("    hotWordsType: ").append(toIndentedString(hotWordsType)).append("\n");
        sb.append("    sisHotWords: ").append(toIndentedString(sisHotWords)).append("\n");
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
