package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签的多种语言输出。
 */
public class ImageMediaTaggingDetItemBodyI18nTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh")

    private String zh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    private String en;

    public ImageMediaTaggingDetItemBodyI18nTag withZh(String zh) {
        this.zh = zh;
        return this;
    }

    /**
     * 中文标签。
     * @return zh
     */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public ImageMediaTaggingDetItemBodyI18nTag withEn(String en) {
        this.en = en;
        return this;
    }

    /**
     * 英文标签。
     * @return en
     */
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageMediaTaggingDetItemBodyI18nTag that = (ImageMediaTaggingDetItemBodyI18nTag) obj;
        return Objects.equals(this.zh, that.zh) && Objects.equals(this.en, that.en);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zh, en);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMediaTaggingDetItemBodyI18nTag {\n");
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
