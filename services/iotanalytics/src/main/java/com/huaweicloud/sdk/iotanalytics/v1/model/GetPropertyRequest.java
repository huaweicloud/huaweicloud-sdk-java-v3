package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询属性值请求
 */
public class GetPropertyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_names")

    @JacksonXmlProperty(localName = "property_names")

    private List<String> propertyNames = null;

    public GetPropertyRequest withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public GetPropertyRequest putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public GetPropertyRequest withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 对property按指定tags标签进行过滤查询，填入设备标签与标签值，不可为空，例如 {\"deviceId\": \"id0001\"}
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public GetPropertyRequest withPropertyNames(List<String> propertyNames) {
        this.propertyNames = propertyNames;
        return this;
    }

    public GetPropertyRequest addPropertyNamesItem(String propertyNamesItem) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        this.propertyNames.add(propertyNamesItem);
        return this;
    }

    public GetPropertyRequest withPropertyNames(Consumer<List<String>> propertyNamesSetter) {
        if (this.propertyNames == null) {
            this.propertyNames = new ArrayList<>();
        }
        propertyNamesSetter.accept(this.propertyNames);
        return this;
    }

    /**
     * 查询设备的属性名称
     * @return propertyNames
     */
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
        GetPropertyRequest getPropertyRequest = (GetPropertyRequest) o;
        return Objects.equals(this.tags, getPropertyRequest.tags)
            && Objects.equals(this.propertyNames, getPropertyRequest.propertyNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, propertyNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPropertyRequest {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    propertyNames: ").append(toIndentedString(propertyNames)).append("\n");
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
