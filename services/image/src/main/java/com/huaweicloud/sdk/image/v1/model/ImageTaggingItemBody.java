package com.huaweicloud.sdk.image.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.image.v1.model.ImageTaggingI18nTag;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ImageTaggingItemBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private String confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="i18n_tag")
    
    private ImageTaggingI18nTag i18nTag = null;

    public ImageTaggingItemBody withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 置信度，取值范围：0-100。
     * @return confidence
     */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public ImageTaggingItemBody withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 标签的类别 object：实体标签 scene：场景标签 concept：概念标签
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageTaggingItemBody withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 标签名称。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ImageTaggingItemBody withI18nTag(ImageTaggingI18nTag i18nTag) {
        this.i18nTag = i18nTag;
        return this;
    }

    public ImageTaggingItemBody withI18nTag(Consumer<ImageTaggingI18nTag> i18nTagSetter) {
        if(this.i18nTag == null ){
            this.i18nTag = new ImageTaggingI18nTag();
        }
        i18nTagSetter.accept(this.i18nTag);
        return this;
    }


    /**
     * Get i18nTag
     * @return i18nTag
     */
    public ImageTaggingI18nTag getI18nTag() {
        return i18nTag;
    }

    public void setI18nTag(ImageTaggingI18nTag i18nTag) {
        this.i18nTag = i18nTag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageTaggingItemBody imageTaggingItemBody = (ImageTaggingItemBody) o;
        return Objects.equals(this.confidence, imageTaggingItemBody.confidence) &&
            Objects.equals(this.type, imageTaggingItemBody.type) &&
            Objects.equals(this.tag, imageTaggingItemBody.tag) &&
            Objects.equals(this.i18nTag, imageTaggingItemBody.i18nTag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, type, tag, i18nTag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingItemBody {\n");
            sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
            sb.append("    i18nTag: ").append(toIndentedString(i18nTag)).append("\n");
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

