package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ImageTaggingItemBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private String confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_tag")

    private ImageTaggingItemBodyI18nTag i18nTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_type")

    private ImageTaggingItemBodyI18nType i18nType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ImageTaggingInstance> instances = null;

    public ImageTaggingItemBody withConfidence(String confidence) {
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

    public ImageTaggingItemBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 标签的类别。返回的标签类型，包含二十多种大类，具体可以参考[图像标签](http://support.huaweicloud.com/image_faq/image_01_0037.html)。 
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

    public ImageTaggingItemBody withI18nTag(ImageTaggingItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
        return this;
    }

    public ImageTaggingItemBody withI18nTag(Consumer<ImageTaggingItemBodyI18nTag> i18nTagSetter) {
        if (this.i18nTag == null) {
            this.i18nTag = new ImageTaggingItemBodyI18nTag();
            i18nTagSetter.accept(this.i18nTag);
        }

        return this;
    }

    /**
     * Get i18nTag
     * @return i18nTag
     */
    public ImageTaggingItemBodyI18nTag getI18nTag() {
        return i18nTag;
    }

    public void setI18nTag(ImageTaggingItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
    }

    public ImageTaggingItemBody withI18nType(ImageTaggingItemBodyI18nType i18nType) {
        this.i18nType = i18nType;
        return this;
    }

    public ImageTaggingItemBody withI18nType(Consumer<ImageTaggingItemBodyI18nType> i18nTypeSetter) {
        if (this.i18nType == null) {
            this.i18nType = new ImageTaggingItemBodyI18nType();
            i18nTypeSetter.accept(this.i18nType);
        }

        return this;
    }

    /**
     * Get i18nType
     * @return i18nType
     */
    public ImageTaggingItemBodyI18nType getI18nType() {
        return i18nType;
    }

    public void setI18nType(ImageTaggingItemBodyI18nType i18nType) {
        this.i18nType = i18nType;
    }

    public ImageTaggingItemBody withInstances(List<ImageTaggingInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ImageTaggingItemBody addInstancesItem(ImageTaggingInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ImageTaggingItemBody withInstances(Consumer<List<ImageTaggingInstance>> instancesSetter) {
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
        ImageTaggingItemBody imageTaggingItemBody = (ImageTaggingItemBody) o;
        return Objects.equals(this.confidence, imageTaggingItemBody.confidence)
            && Objects.equals(this.type, imageTaggingItemBody.type)
            && Objects.equals(this.tag, imageTaggingItemBody.tag)
            && Objects.equals(this.i18nTag, imageTaggingItemBody.i18nTag)
            && Objects.equals(this.i18nType, imageTaggingItemBody.i18nType)
            && Objects.equals(this.instances, imageTaggingItemBody.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, type, tag, i18nTag, i18nType, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingItemBody {\n");
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
