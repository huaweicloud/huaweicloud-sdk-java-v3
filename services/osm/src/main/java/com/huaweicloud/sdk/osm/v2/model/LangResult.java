package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LangResult
 */
public class LangResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_en")

    private Boolean isEn;

    public LangResult withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LangResult withIsEn(Boolean isEn) {
        this.isEn = isEn;
        return this;
    }

    /**
     * 是否英语
     * @return isEn
     */
    public Boolean getIsEn() {
        return isEn;
    }

    public void setIsEn(Boolean isEn) {
        this.isEn = isEn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LangResult langResult = (LangResult) o;
        return Objects.equals(this.language, langResult.language) && Objects.equals(this.isEn, langResult.isEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, isEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LangResult {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    isEn: ").append(toIndentedString(isEn)).append("\n");
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
