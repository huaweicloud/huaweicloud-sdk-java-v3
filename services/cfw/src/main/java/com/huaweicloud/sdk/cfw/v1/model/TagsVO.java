package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TagsVO
 */
public class TagsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value")

    private String tagValue;

    public TagsVO withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * 规则id
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public TagsVO withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * 规则标签键
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public TagsVO withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    /**
     * 规则标签值
     * @return tagValue
     */
    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagsVO that = (TagsVO) obj;
        return Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagKey, that.tagKey)
            && Objects.equals(this.tagValue, that.tagValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagId, tagKey, tagValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsVO {\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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
