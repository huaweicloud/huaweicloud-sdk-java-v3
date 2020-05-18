package com.huaweicloud.sdk.image.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ImageTaggingI18nTag
 */
public class ImageTaggingI18nTag  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zh")
    
    private String zh;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="en")
    
    private String en;

    public ImageTaggingI18nTag withZh(String zh) {
        this.zh = zh;
        return this;
    }

    


    /**
     * 中文标签
     * @return zh
     */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public ImageTaggingI18nTag withEn(String en) {
        this.en = en;
        return this;
    }

    


    /**
     * 英文标签
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
        ImageTaggingI18nTag imageTaggingI18nTag = (ImageTaggingI18nTag) o;
        return Objects.equals(this.zh, imageTaggingI18nTag.zh) &&
            Objects.equals(this.en, imageTaggingI18nTag.en);
    }
    @Override
    public int hashCode() {
        return Objects.hash(zh, en);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingI18nTag {\n");
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

