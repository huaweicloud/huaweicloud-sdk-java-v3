package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改安抚话术请求。
 */
public class UpdatePacifyWordsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pacify_words")

    private String pacifyWords;

    public UpdatePacifyWordsReq withPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
        return this;
    }

    /**
     * 安抚话术。
     * @return pacifyWords
     */
    public String getPacifyWords() {
        return pacifyWords;
    }

    public void setPacifyWords(String pacifyWords) {
        this.pacifyWords = pacifyWords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePacifyWordsReq that = (UpdatePacifyWordsReq) obj;
        return Objects.equals(this.pacifyWords, that.pacifyWords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pacifyWords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePacifyWordsReq {\n");
        sb.append("    pacifyWords: ").append(toIndentedString(pacifyWords)).append("\n");
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
