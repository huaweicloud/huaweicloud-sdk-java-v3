package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 标签的多种语言输出。 */
public class ImageTaggingItemBodyI18nTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh")

    private String zh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    private String en;

    public ImageTaggingItemBodyI18nTag withZh(String zh) {
        this.zh = zh;
        return this;
    }

    /** 中文标签
     * 
     * @return zh */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public ImageTaggingItemBodyI18nTag withEn(String en) {
        this.en = en;
        return this;
    }

    /** 英文标签
     * 
     * @return en */
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTaggingItemBodyI18nTag imageTaggingItemBodyI18nTag = (ImageTaggingItemBodyI18nTag) o;
        return Objects.equals(this.zh, imageTaggingItemBodyI18nTag.zh)
            && Objects.equals(this.en, imageTaggingItemBodyI18nTag.en);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zh, en);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingItemBodyI18nTag {\n");
        sb.append("    zh: ").append(toIndentedString(zh)).append("\n");
        sb.append("    en: ").append(toIndentedString(en)).append("\n");
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