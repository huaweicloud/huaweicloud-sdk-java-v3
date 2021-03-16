package com.huaweicloud.sdk.dns.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.TagValues;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTagsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagValues> tags = null;
    
    public ListTagsResponse withTags(List<TagValues> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListTagsResponse addTagsItem(TagValues tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ListTagsResponse withTags(Consumer<List<TagValues>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<TagValues> getTags() {
        return tags;
    }

    public void setTags(List<TagValues> tags) {
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
        ListTagsResponse listTagsResponse = (ListTagsResponse) o;
        return Objects.equals(this.tags, listTagsResponse.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsResponse {\n");
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

