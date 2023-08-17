package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据的元信息，不同数据包含的字段可能不同。
 */
public class ItemSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_tags")

    private Map<String, String> customTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_num_tags")

    private Map<String, Double> customNumTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private List<String> keywords = null;

    public ItemSource withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 数据描述信息。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ItemSource withCustomTags(Map<String, String> customTags) {
        this.customTags = customTags;
        return this;
    }

    public ItemSource putCustomTagsItem(String key, String customTagsItem) {
        if (this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        this.customTags.put(key, customTagsItem);
        return this;
    }

    public ItemSource withCustomTags(Consumer<Map<String, String>> customTagsSetter) {
        if (this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        customTagsSetter.accept(this.customTags);
        return this;
    }

    /**
     * 数据自定义字符标签。
     * @return customTags
     */
    public Map<String, String> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(Map<String, String> customTags) {
        this.customTags = customTags;
    }

    public ItemSource withCustomNumTags(Map<String, Double> customNumTags) {
        this.customNumTags = customNumTags;
        return this;
    }

    public ItemSource putCustomNumTagsItem(String key, Double customNumTagsItem) {
        if (this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        this.customNumTags.put(key, customNumTagsItem);
        return this;
    }

    public ItemSource withCustomNumTags(Consumer<Map<String, Double>> customNumTagsSetter) {
        if (this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        customNumTagsSetter.accept(this.customNumTags);
        return this;
    }

    /**
     * 数据自定义数值标签。
     * @return customNumTags
     */
    public Map<String, Double> getCustomNumTags() {
        return customNumTags;
    }

    public void setCustomNumTags(Map<String, Double> customNumTags) {
        this.customNumTags = customNumTags;
    }

    public ItemSource withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public ItemSource addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public ItemSource withKeywords(Consumer<List<String>> keywordsSetter) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 数据关键词列表。
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemSource that = (ItemSource) obj;
        return Objects.equals(this.desc, that.desc) && Objects.equals(this.customTags, that.customTags)
            && Objects.equals(this.customNumTags, that.customNumTags) && Objects.equals(this.keywords, that.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, customTags, customNumTags, keywords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemSource {\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customNumTags: ").append(toIndentedString(customNumTags)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
