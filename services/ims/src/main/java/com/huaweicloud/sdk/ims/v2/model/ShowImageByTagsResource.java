package com.huaweicloud.sdk.ims.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.QueryImageByTagsResourceDetail;
import com.huaweicloud.sdk.ims.v2.model.TagKeyValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * resource字段数据结构说明
 */
public class ShowImageByTagsResource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_detail")
    
    private QueryImageByTagsResourceDetail resourceDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<TagKeyValue> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;

    public ShowImageByTagsResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 镜像ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ShowImageByTagsResource withResourceDetail(QueryImageByTagsResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public ShowImageByTagsResource withResourceDetail(Consumer<QueryImageByTagsResourceDetail> resourceDetailSetter) {
        if(this.resourceDetail == null ){
            this.resourceDetail = new QueryImageByTagsResourceDetail();
            resourceDetailSetter.accept(this.resourceDetail);
        }
        
        return this;
    }


    /**
     * Get resourceDetail
     * @return resourceDetail
     */
    public QueryImageByTagsResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(QueryImageByTagsResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    

    public ShowImageByTagsResource withTags(List<TagKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    
    public ShowImageByTagsResource addTagsItem(TagKeyValue tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowImageByTagsResource withTags(Consumer<List<TagKeyValue>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像的标签列表
     * @return tags
     */
    public List<TagKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagKeyValue> tags) {
        this.tags = tags;
    }

    

    public ShowImageByTagsResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 镜像名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageByTagsResource showImageByTagsResource = (ShowImageByTagsResource) o;
        return Objects.equals(this.resourceId, showImageByTagsResource.resourceId) &&
            Objects.equals(this.resourceDetail, showImageByTagsResource.resourceDetail) &&
            Objects.equals(this.tags, showImageByTagsResource.tags) &&
            Objects.equals(this.resourceName, showImageByTagsResource.resourceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, resourceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageByTagsResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

