package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StacksTags
 */
public class StacksTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_list")

    @JacksonXmlProperty(localName = "stack_list")

    private List<StackInfo> stackList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<String> tags = null;

    public StacksTags withStackList(List<StackInfo> stackList) {
        this.stackList = stackList;
        return this;
    }

    public StacksTags addStackListItem(StackInfo stackListItem) {
        if (this.stackList == null) {
            this.stackList = new ArrayList<>();
        }
        this.stackList.add(stackListItem);
        return this;
    }

    public StacksTags withStackList(Consumer<List<StackInfo>> stackListSetter) {
        if (this.stackList == null) {
            this.stackList = new ArrayList<>();
        }
        stackListSetter.accept(this.stackList);
        return this;
    }

    /**
     * 技术栈列表
     * @return stackList
     */
    public List<StackInfo> getStackList() {
        return stackList;
    }

    public void setStackList(List<StackInfo> stackList) {
        this.stackList = stackList;
    }

    public StacksTags withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public StacksTags addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public StacksTags withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 技术栈tag集合
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StacksTags stacksTags = (StacksTags) o;
        return Objects.equals(this.stackList, stacksTags.stackList) && Objects.equals(this.tags, stacksTags.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackList, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StacksTags {\n");
        sb.append("    stackList: ").append(toIndentedString(stackList)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
