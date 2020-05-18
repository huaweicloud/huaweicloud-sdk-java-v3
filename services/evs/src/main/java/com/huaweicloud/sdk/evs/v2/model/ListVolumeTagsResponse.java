package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListVolumeTagsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private Map<String, List<String>> tags = null;
    
    public ListVolumeTagsResponse withTags(Map<String, List<String>> tags) {
        this.tags = tags;
        return this;
    }

    

    public ListVolumeTagsResponse putTagsItem(String key, List<String> tagsItem) {
         if (this.tags == null) {
            this.tags = new HashMap<>();
         }
        this.tags.put(key, tagsItem);
        return this;
    }

    public ListVolumeTagsResponse withTags(Consumer<Map<String, List<String>>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }
    /**
     * 所有云硬盘的标签信息
     * @return tags
     */
    public Map<String, List<String>> getTags() {
        return tags;
    }

    public void setTags(Map<String, List<String>> tags) {
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
        ListVolumeTagsResponse listVolumeTagsResponse = (ListVolumeTagsResponse) o;
        return Objects.equals(this.tags, listVolumeTagsResponse.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVolumeTagsResponse {\n");
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

