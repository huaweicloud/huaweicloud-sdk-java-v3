package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DictionaryDelete
 */
public class DictionaryDelete {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_id")

    private String dictId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_key")

    private String dictKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    public DictionaryDelete withDictId(String dictId) {
        this.dictId = dictId;
        return this;
    }

    /**
     * 字典id
     * @return dictId
     */
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public DictionaryDelete withDictKey(String dictKey) {
        this.dictKey = dictKey;
        return this;
    }

    /**
     * 字典key
     * @return dictKey
     */
    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public DictionaryDelete withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 用户当前语言环境
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DictionaryDelete that = (DictionaryDelete) obj;
        return Objects.equals(this.dictId, that.dictId) && Objects.equals(this.dictKey, that.dictKey)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, dictKey, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DictionaryDelete {\n");
        sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
        sb.append("    dictKey: ").append(toIndentedString(dictKey)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
