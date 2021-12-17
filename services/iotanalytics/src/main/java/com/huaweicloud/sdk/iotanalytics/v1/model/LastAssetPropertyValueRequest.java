package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 查询资产属性最新值请求 */
public class LastAssetPropertyValueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, Object> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_filter")

    private List<PropertyFilter> propertyFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_names")

    private List<String> propertyNames = null;

    public LastAssetPropertyValueRequest withTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    public LastAssetPropertyValueRequest putTagsItem(String key, Object tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public LastAssetPropertyValueRequest withTags(Consumer<Map<String, Object>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 对property按指定tags标签进行过滤查询，填入资产标签属性的属性名与属性值，不可为空，例如 {\"tagPropertyA\":
     * \"id0001\"}；注意，标签过滤只对打上标签时刻之后的数据生效，打标签之前的数据不能通过标签过滤
     * 
     * @return tags */
    public Map<String, Object> getTags() {
        return tags;
    }

    public void setTags(Map<String, Object> tags) {
        this.tags = tags;
    }

    public LastAssetPropertyValueRequest withPropertyFilter(List<PropertyFilter> propertyFilter) {
        this.propertyFilter = propertyFilter;
        return this;
    }

    public LastAssetPropertyValueRequest addPropertyFilterItem(PropertyFilter propertyFilterItem) {
        if (this.propertyFilter == null) {
            this.propertyFilter = new ArrayList<>();
        }
        this.propertyFilter.add(propertyFilterItem);
        return this;
    }

    public LastAssetPropertyValueRequest withPropertyFilter(Consumer<List<PropertyFilter>> propertyFilterSetter) {
        if (this.propertyFilter == null) {
            this.propertyFilter = new ArrayList<>();
        }
        propertyFilterSetter.accept(this.propertyFilter);
        return this;
    }

    /** 属性过滤器，最多5个
     * 
     * @return propertyFilter */
    public List<PropertyFilter> getPropertyFilter() {
        return propertyFilter;
    }

    public void setPropertyFilter(List<PropertyFilter> propertyFilter) {
        this.propertyFilter = propertyFilter;
    }

    public LastAssetPropertyValueRequest withPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }

    public LastAssetPropertyValueRequest addPropertyNamesItem(String propertyNamesItem) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        this.propertyNames.add(propertyNamesItem);
        return this;
    }

    public LastAssetPropertyValueRequest withPropertyNames(Consumer<List<String>> propertyNamesSetter) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        propertyNamesSetter.accept(this.propertyNames);
        return this;
    }

    /** 待查询的资产属性名列表,不携带该字段表示查询全部
     * 
     * @return propertyNames */
    public List<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LastAssetPropertyValueRequest lastAssetPropertyValueRequest = (LastAssetPropertyValueRequest) o;
        return Objects.equals(this.tags, lastAssetPropertyValueRequest.tags)
            && Objects.equals(this.propertyFilter, lastAssetPropertyValueRequest.propertyFilter)
            && Objects.equals(this.propertyNames, lastAssetPropertyValueRequest.propertyNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, propertyFilter, propertyNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LastAssetPropertyValueRequest {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    propertyFilter: ").append(toIndentedString(propertyFilter)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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
