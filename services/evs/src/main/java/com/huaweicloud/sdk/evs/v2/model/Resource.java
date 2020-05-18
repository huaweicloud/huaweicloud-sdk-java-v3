package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.ListVolumesDetailsResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Resource
 */
public class Resource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_detail")
    
    private ListVolumesDetailsResponseBody resourceDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Map<String, String>> tags = new ArrayList<>();
    
    public Resource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Resource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Resource withResourceDetail(ListVolumesDetailsResponseBody resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public Resource withResourceDetail(Consumer<ListVolumesDetailsResponseBody> resourceDetailSetter) {
        if(this.resourceDetail == null ){
            this.resourceDetail = new ListVolumesDetailsResponseBody();
        }
        resourceDetailSetter.accept(this.resourceDetail);
        return this;
    }


    /**
     * Get resourceDetail
     * @return resourceDetail
     */
    public ListVolumesDetailsResponseBody getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(ListVolumesDetailsResponseBody resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public Resource withTags(List<Map<String, String>> tags) {
        this.tags = tags;
        return this;
    }

    
    public Resource addTagsItem(Map<String, String> tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public Resource withTags(Consumer<List<Map<String, String>>> tagsSetter) {
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
    public List<Map<String, String>> getTags() {
        return tags;
    }

    public void setTags(List<Map<String, String>> tags) {
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
        Resource resource = (Resource) o;
        return Objects.equals(this.resourceId, resource.resourceId) &&
            Objects.equals(this.resourceName, resource.resourceName) &&
            Objects.equals(this.resourceDetail, resource.resourceDetail) &&
            Objects.equals(this.tags, resource.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceName, resourceDetail, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
            sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
            sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
            sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
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

