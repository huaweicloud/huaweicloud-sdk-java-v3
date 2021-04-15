package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.Stacks;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * StacksTag
 */
public class StacksTag  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_list")
    
    private List<Stacks> stackList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    
    public StacksTag withStackList(List<Stacks> stackList) {
        this.stackList = stackList;
        return this;
    }

    
    public StacksTag addStackListItem(Stacks stackListItem) {
        if(this.stackList == null) {
            this.stackList = new ArrayList<>();
        }
        this.stackList.add(stackListItem);
        return this;
    }

    public StacksTag withStackList(Consumer<List<Stacks>> stackListSetter) {
        if(this.stackList == null) {
            this.stackList = new ArrayList<>();
        }
        stackListSetter.accept(this.stackList);
        return this;
    }

    /**
     * 技术栈列表
     * @return stackList
     */
    public List<Stacks> getStackList() {
        return stackList;
    }

    public void setStackList(List<Stacks> stackList) {
        this.stackList = stackList;
    }

    

    public StacksTag withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public StacksTag addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public StacksTag withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
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
        StacksTag stacksTag = (StacksTag) o;
        return Objects.equals(this.stackList, stacksTag.stackList) &&
            Objects.equals(this.tags, stacksTag.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackList, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StacksTag {\n");
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

