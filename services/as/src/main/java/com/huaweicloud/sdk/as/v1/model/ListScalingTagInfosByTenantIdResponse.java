package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.TagsMultiValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingTagInfosByTenantIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsMultiValue> tags = null;
    
    public ListScalingTagInfosByTenantIdResponse withTags(List<TagsMultiValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListScalingTagInfosByTenantIdResponse addTagsItem(TagsMultiValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListScalingTagInfosByTenantIdResponse withTags(Consumer<List<TagsMultiValue>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签。
     * @return tags
     */
    public List<TagsMultiValue> getTags() {
        return tags;
    }

    public void setTags(List<TagsMultiValue> tags) {
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
        ListScalingTagInfosByTenantIdResponse listScalingTagInfosByTenantIdResponse = (ListScalingTagInfosByTenantIdResponse) o;
        return Objects.equals(this.tags, listScalingTagInfosByTenantIdResponse.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingTagInfosByTenantIdResponse {\n");
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

