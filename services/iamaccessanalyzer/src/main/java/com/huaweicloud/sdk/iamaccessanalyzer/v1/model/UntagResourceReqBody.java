package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UntagResourceReqBody
 */
public class UntagResourceReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_keys")

    private List<String> tagKeys = null;

    public UntagResourceReqBody withTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }

    public UntagResourceReqBody addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    public UntagResourceReqBody withTagKeys(Consumer<List<String>> tagKeysSetter) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        tagKeysSetter.accept(this.tagKeys);
        return this;
    }

    /**
     * Get tagKeys
     * @return tagKeys
     */
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UntagResourceReqBody that = (UntagResourceReqBody) obj;
        return Objects.equals(this.tagKeys, that.tagKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UntagResourceReqBody {\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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
