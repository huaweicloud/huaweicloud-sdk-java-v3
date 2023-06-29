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
public class ImageMediaTaggingDetItemBody {

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

    private ImageMediaTaggingDetItemBodyI18nTag i18nTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<ImageMediaTaggingDetInstance> instances = null;

    public ImageMediaTaggingDetItemBody withConfidence(String confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，将Float型置信度转为String类型返回，取值范围：0-100。
     * @return confidence
     */
    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public ImageMediaTaggingDetItemBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 标签的类别。返回的标签类型，包含二十种大类，具体可以参考[[图像标签](http://support.huaweicloud.com/image_faq/image_01_0037.html)](tag:hc)[[图像标签](https://support.huaweicloud.com/intl/zh-cn/image_faq/image_01_0037.html)](tag:hk) 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageMediaTaggingDetItemBody withTag(String tag) {
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

    public ImageMediaTaggingDetItemBody withI18nTag(ImageMediaTaggingDetItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
        return this;
    }

    public ImageMediaTaggingDetItemBody withI18nTag(Consumer<ImageMediaTaggingDetItemBodyI18nTag> i18nTagSetter) {
        if (this.i18nTag == null) {
            this.i18nTag = new ImageMediaTaggingDetItemBodyI18nTag();
            i18nTagSetter.accept(this.i18nTag);
        }

        return this;
    }

    /**
     * Get i18nTag
     * @return i18nTag
     */
    public ImageMediaTaggingDetItemBodyI18nTag getI18nTag() {
        return i18nTag;
    }

    public void setI18nTag(ImageMediaTaggingDetItemBodyI18nTag i18nTag) {
        this.i18nTag = i18nTag;
    }

    public ImageMediaTaggingDetItemBody withInstances(List<ImageMediaTaggingDetInstance> instances) {
        this.instances = instances;
        return this;
    }

    public ImageMediaTaggingDetItemBody addInstancesItem(ImageMediaTaggingDetInstance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public ImageMediaTaggingDetItemBody withInstances(Consumer<List<ImageMediaTaggingDetInstance>> instancesSetter) {
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
    public List<ImageMediaTaggingDetInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<ImageMediaTaggingDetInstance> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageMediaTaggingDetItemBody that = (ImageMediaTaggingDetItemBody) obj;
        return Objects.equals(this.confidence, that.confidence) && Objects.equals(this.type, that.type)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.i18nTag, that.i18nTag)
            && Objects.equals(this.instances, that.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, type, tag, i18nTag, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMediaTaggingDetItemBody {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    i18nTag: ").append(toIndentedString(i18nTag)).append("\n");
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
