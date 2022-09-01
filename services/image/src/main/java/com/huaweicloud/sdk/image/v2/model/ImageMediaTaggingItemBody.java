package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ImageMediaTaggingItemBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private String confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_tag")

    @JacksonXmlProperty(localName = "i18n_tag")

    private ImageMediaTaggingItemBodyI18nTag i18nTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_type")

    @JacksonXmlProperty(localName = "i18n_type")

    private ImageMediaTaggingItemBodyI18nType i18nType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    @JacksonXmlProperty(localName = "instances")

    private List<ImageTaggingInstance> instances = null;

    public ImageMediaTaggingItemBody withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，将Float型置信度转为String类型返回,取值范围：0-100。
     * @return confidence
     */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public ImageMediaTaggingItemBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 标签的类别。返回的标签类型，包含二十多种大类，具体可以参考[[图像标签](http://support.huaweicloud.com/image_faq/image_01_0037.html)](tag:hc)[[图像标签](https://support.huaweicloud.com/intl/zh-cn/image_faq/image_01_0037.html)](tag:hk) 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageMediaTaggingItemBody withTag(String tag) {
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

    public ImageMediaTaggingItemBody withI18nTag(ImageMediaTaggingItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
        return this;
    }

    public ImageMediaTaggingItemBody withI18nTag(Consumer<ImageMediaTaggingItemBodyI18nTag> i18nTagSetter) {
        if (this.i18nTag == null) {
            this.i18nTag = new ImageMediaTaggingItemBodyI18nTag();
            i18nTagSetter.accept(this.i18nTag);
        }

        return this;
    }

    /**
     * Get i18nTag
     * @return i18nTag
     */
    public ImageMediaTaggingItemBodyI18nTag getI18nTag() {
        return i18nTag;
    }

    public void setI18nTag(ImageMediaTaggingItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
    }

    public ImageMediaTaggingItemBody withI18nType(ImageMediaTaggingItemBodyI18nType i18nType) {
        this.i18nType = i18nType;
        return this;
    }

    public ImageMediaTaggingItemBody withI18nType(Consumer<ImageMediaTaggingItemBodyI18nType> i18nTypeSetter) {
        if (this.i18nType == null) {
            this.i18nType = new ImageMediaTaggingItemBodyI18nType();
            i18nTypeSetter.accept(this.i18nType);
        }

        return this;
    }

    /**
     * Get i18nType
     * @return i18nType
     */
    public ImageMediaTaggingItemBodyI18nType getI18nType() {
        return i18nType;
    }

    public void setI18nType(ImageMediaTaggingItemBodyI18nType i18nType) {
        this.i18nType = i18nType;
    }

    public ImageMediaTaggingItemBody withInstances(List<ImageTaggingInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ImageMediaTaggingItemBody addInstancesItem(ImageTaggingInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ImageMediaTaggingItemBody withInstances(Consumer<List<ImageTaggingInstance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 目标检测框信息，为空则表示没有目标检测框。
     * @return instances
     */
    public List<ImageTaggingInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<ImageTaggingInstance> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageMediaTaggingItemBody imageMediaTaggingItemBody = (ImageMediaTaggingItemBody) o;
        return Objects.equals(this.confidence, imageMediaTaggingItemBody.confidence)
            && Objects.equals(this.type, imageMediaTaggingItemBody.type)
            && Objects.equals(this.tag, imageMediaTaggingItemBody.tag)
            && Objects.equals(this.i18nTag, imageMediaTaggingItemBody.i18nTag)
            && Objects.equals(this.i18nType, imageMediaTaggingItemBody.i18nType)
            && Objects.equals(this.instances, imageMediaTaggingItemBody.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, type, tag, i18nTag, i18nType, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMediaTaggingItemBody {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    i18nTag: ").append(toIndentedString(i18nTag)).append("\n");
        sb.append("    i18nType: ").append(toIndentedString(i18nType)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
