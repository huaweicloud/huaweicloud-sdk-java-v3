package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.TagsOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddTagsRequestBody
 */
public class AddTagsRequestBody  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsOption> tags = null;
    
    public AddTagsRequestBody withTags(List<TagsOption> tags) {
        this.tags = tags;
        return this;
    }

    
    public AddTagsRequestBody addTagsItem(TagsOption tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public AddTagsRequestBody withTags(Consumer<List<TagsOption>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<TagsOption> getTags() {
        return tags;
    }

    public void setTags(List<TagsOption> tags) {
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
        AddTagsRequestBody addTagsRequestBody = (AddTagsRequestBody) o;
        return Objects.equals(this.tags, addTagsRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTagsRequestBody {\n");
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

