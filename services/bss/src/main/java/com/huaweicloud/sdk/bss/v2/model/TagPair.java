package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TagPair
 */
public class TagPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    @JacksonXmlProperty(localName = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value")

    @JacksonXmlProperty(localName = "tag_value")

    private String tagValue;

    public TagPair withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * 标签key。
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public TagPair withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * 标签value。
     * @return tagValue
     */
    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagPair tagPair = (TagPair) o;
        return Objects.equals(this.tagKey, tagPair.tagKey) && Objects.equals(this.tagValue, tagPair.tagValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagKey, tagValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagPair {\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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
