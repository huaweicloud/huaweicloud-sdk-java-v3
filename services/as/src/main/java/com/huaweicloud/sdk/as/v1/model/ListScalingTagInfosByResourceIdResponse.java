package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.TagsSingleValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListScalingTagInfosByResourceIdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagsSingleValue> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<TagsSingleValue> sysTags = null;
    
    public ListScalingTagInfosByResourceIdResponse withTags(List<TagsSingleValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListScalingTagInfosByResourceIdResponse addTagsItem(TagsSingleValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListScalingTagInfosByResourceIdResponse withTags(Consumer<List<TagsSingleValue>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表。
     * @return tags
     */
    public List<TagsSingleValue> getTags() {
        return tags;
    }

    public void setTags(List<TagsSingleValue> tags) {
        this.tags = tags;
    }

    public ListScalingTagInfosByResourceIdResponse withSysTags(List<TagsSingleValue> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public ListScalingTagInfosByResourceIdResponse addSysTagsItem(TagsSingleValue sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListScalingTagInfosByResourceIdResponse withSysTags(Consumer<List<TagsSingleValue>> sysTagsSetter) {
        if(this.sysTags == null ){
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统资源标签列表。
     * @return sysTags
     */
    public List<TagsSingleValue> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<TagsSingleValue> sysTags) {
        this.sysTags = sysTags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingTagInfosByResourceIdResponse listScalingTagInfosByResourceIdResponse = (ListScalingTagInfosByResourceIdResponse) o;
        return Objects.equals(this.tags, listScalingTagInfosByResourceIdResponse.tags) &&
            Objects.equals(this.sysTags, listScalingTagInfosByResourceIdResponse.sysTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingTagInfosByResourceIdResponse {\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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

