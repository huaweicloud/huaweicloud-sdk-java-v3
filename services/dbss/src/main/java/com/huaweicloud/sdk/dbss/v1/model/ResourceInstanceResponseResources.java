package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceResponseSysTags;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceResponseTags;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceInstanceResponseResources
 */
public class ResourceInstanceResponseResources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_detail")
    
    
    private Object resourceDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private List<ResourceInstanceResponseTags> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    
    private List<ResourceInstanceResponseSysTags> sysTags = null;
    
    public ResourceInstanceResponseResources withResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    


    /**
     * 资源详情。 资源对象，用于扩展。默认为空
     * @return resourceDetail
     */
    public Object getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Object resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    

    public ResourceInstanceResponseResources withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public ResourceInstanceResponseResources withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称，资源没有名称时默认为空字符串，eip返回ip地址
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public ResourceInstanceResponseResources withTags(List<ResourceInstanceResponseTags> tags) {
        this.tags = tags;
        return this;
    }

    
    public ResourceInstanceResponseResources addTagsItem(ResourceInstanceResponseTags tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceInstanceResponseResources withTags(Consumer<List<ResourceInstanceResponseTags>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组
     * @return tags
     */
    public List<ResourceInstanceResponseTags> getTags() {
        return tags;
    }

    public void setTags(List<ResourceInstanceResponseTags> tags) {
        this.tags = tags;
    }

    

    public ResourceInstanceResponseResources withSysTags(List<ResourceInstanceResponseSysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public ResourceInstanceResponseResources addSysTagsItem(ResourceInstanceResponseSysTags sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ResourceInstanceResponseResources withSysTags(Consumer<List<ResourceInstanceResponseSysTags>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限才可以可以获取此字段： 目前只包含一个resource_tag 结构体 key：_sys_enterprise_project_id value：企业项目id，0表示默认企业项目 非op_service场景不能返回此字段
     * @return sysTags
     */
    public List<ResourceInstanceResponseSysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceInstanceResponseSysTags> sysTags) {
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
        ResourceInstanceResponseResources resourceInstanceResponseResources = (ResourceInstanceResponseResources) o;
        return Objects.equals(this.resourceDetail, resourceInstanceResponseResources.resourceDetail) &&
            Objects.equals(this.resourceId, resourceInstanceResponseResources.resourceId) &&
            Objects.equals(this.resourceName, resourceInstanceResponseResources.resourceName) &&
            Objects.equals(this.tags, resourceInstanceResponseResources.tags) &&
            Objects.equals(this.sysTags, resourceInstanceResponseResources.sysTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceDetail, resourceId, resourceName, tags, sysTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstanceResponseResources {\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

