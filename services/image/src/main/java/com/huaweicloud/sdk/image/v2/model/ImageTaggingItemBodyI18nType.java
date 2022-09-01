package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 标签类别的多种语言输出。
 */
public class ImageTaggingItemBodyI18nType {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh")

    @JacksonXmlProperty(localName = "zh")

    private String zh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    @JacksonXmlProperty(localName = "en")

    private String en;

    public ImageTaggingItemBodyI18nType withZh(String zh) {
        this.zh = zh;
        return this;
    }

    /**
     * 中文标签类别
     * @return zh
     */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public ImageTaggingItemBodyI18nType withEn(String en) {
        this.en = en;
        return this;
    }

    /**
     * 英文标签类别
     * @return en
     */
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
        ImageTaggingItemBodyI18nType imageTaggingItemBodyI18nType = (ImageTaggingItemBodyI18nType) o;
        return Objects.equals(this.zh, imageTaggingItemBodyI18nType.zh)
            && Objects.equals(this.en, imageTaggingItemBodyI18nType.en);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zh, en);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingItemBodyI18nType {\n");
        sb.append("    zh: ").append(toIndentedString(zh)).append("\n");
        sb.append("    en: ").append(toIndentedString(en)).append("\n");
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
