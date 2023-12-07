package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetJobTagsRequestBody
 */
public class SetJobTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_names")

    private List<String> tagNames = null;

    public SetJobTagsRequestBody withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public SetJobTagsRequestBody addTagNamesItem(String tagNamesItem) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public SetJobTagsRequestBody withTagNames(Consumer<List<String>> tagNamesSetter) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /**
     * 标签列表, 若未空，则标识删除标签
     * @return tagNames
     */
    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetJobTagsRequestBody that = (SetJobTagsRequestBody) obj;
        return Objects.equals(this.tagNames, that.tagNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetJobTagsRequestBody {\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
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
