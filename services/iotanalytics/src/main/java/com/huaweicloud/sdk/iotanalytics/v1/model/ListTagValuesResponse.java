package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTagValuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    @JacksonXmlProperty(localName = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_values")

    @JacksonXmlProperty(localName = "tag_values")

    private List<String> tagValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListTagValuesResponse withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签的名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ListTagValuesResponse withTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }

    public ListTagValuesResponse addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    public ListTagValuesResponse withTagValues(Consumer<List<String>> tagValuesSetter) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        tagValuesSetter.accept(this.tagValues);
        return this;
    }

    /**
     * 标签的值列表
     * @return tagValues
     */
    public List<String> getTagValues() {
        return tagValues;
    }

    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }

    public ListTagValuesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 当前列表元素总数
     * minimum: 0
     * maximum: 2000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagValuesResponse listTagValuesResponse = (ListTagValuesResponse) o;
        return Objects.equals(this.tagName, listTagValuesResponse.tagName)
            && Objects.equals(this.tagValues, listTagValuesResponse.tagValues)
            && Objects.equals(this.count, listTagValuesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, tagValues, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagValuesResponse {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
