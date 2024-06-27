package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmTags
 */
public class AlarmTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_tags")

    private List<String> autoTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_tags")

    private List<String> customTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_annotations")

    private List<String> customAnnotations = null;

    public AlarmTags withAutoTags(List<String> autoTags) {
        this.autoTags = autoTags;
        return this;
    }

    public AlarmTags addAutoTagsItem(String autoTagsItem) {
        if (this.autoTags == null) {
            this.autoTags = new ArrayList<>();
        }
        this.autoTags.add(autoTagsItem);
        return this;
    }

    public AlarmTags withAutoTags(Consumer<List<String>> autoTagsSetter) {
        if (this.autoTags == null) {
            this.autoTags = new ArrayList<>();
        }
        autoTagsSetter.accept(this.autoTags);
        return this;
    }

    /**
     * 自动标签。
     * @return autoTags
     */
    public List<String> getAutoTags() {
        return autoTags;
    }

    public void setAutoTags(List<String> autoTags) {
        this.autoTags = autoTags;
    }

    public AlarmTags withCustomTags(List<String> customTags) {
        this.customTags = customTags;
        return this;
    }

    public AlarmTags addCustomTagsItem(String customTagsItem) {
        if (this.customTags == null) {
            this.customTags = new ArrayList<>();
        }
        this.customTags.add(customTagsItem);
        return this;
    }

    public AlarmTags withCustomTags(Consumer<List<String>> customTagsSetter) {
        if (this.customTags == null) {
            this.customTags = new ArrayList<>();
        }
        customTagsSetter.accept(this.customTags);
        return this;
    }

    /**
     * 自定义标签。
     * @return customTags
     */
    public List<String> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(List<String> customTags) {
        this.customTags = customTags;
    }

    public AlarmTags withCustomAnnotations(List<String> customAnnotations) {
        this.customAnnotations = customAnnotations;
        return this;
    }

    public AlarmTags addCustomAnnotationsItem(String customAnnotationsItem) {
        if (this.customAnnotations == null) {
            this.customAnnotations = new ArrayList<>();
        }
        this.customAnnotations.add(customAnnotationsItem);
        return this;
    }

    public AlarmTags withCustomAnnotations(Consumer<List<String>> customAnnotationsSetter) {
        if (this.customAnnotations == null) {
            this.customAnnotations = new ArrayList<>();
        }
        customAnnotationsSetter.accept(this.customAnnotations);
        return this;
    }

    /**
     * 告警标注。
     * @return customAnnotations
     */
    public List<String> getCustomAnnotations() {
        return customAnnotations;
    }

    public void setCustomAnnotations(List<String> customAnnotations) {
        this.customAnnotations = customAnnotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmTags that = (AlarmTags) obj;
        return Objects.equals(this.autoTags, that.autoTags) && Objects.equals(this.customTags, that.customTags)
            && Objects.equals(this.customAnnotations, that.customAnnotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTags, customTags, customAnnotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmTags {\n");
        sb.append("    autoTags: ").append(toIndentedString(autoTags)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customAnnotations: ").append(toIndentedString(customAnnotations)).append("\n");
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
