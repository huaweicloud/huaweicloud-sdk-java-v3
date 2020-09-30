package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.SysTag;
import com.huaweicloud.sdk.cbr.v1.model.Tag;
import com.huaweicloud.sdk.cbr.v1.model.Vault;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TagResource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_detail")
    
    private List<Vault> resourceDetail = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Tag> tags = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<SysTag> sysTags = new ArrayList<>();
    
    public TagResource withResourceId(String resourceId) {
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

    public TagResource withResourceDetail(List<Vault> resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    
    public TagResource addResourceDetailItem(Vault resourceDetailItem) {
        this.resourceDetail.add(resourceDetailItem);
        return this;
    }

    public TagResource withResourceDetail(Consumer<List<Vault>> resourceDetailSetter) {
        if(this.resourceDetail == null ){
            this.resourceDetail = new ArrayList<>();
        }
        resourceDetailSetter.accept(this.resourceDetail);
        return this;
    }

    /**
     * 资源详情
     * @return resourceDetail
     */
    public List<Vault> getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(List<Vault> resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public TagResource withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    
    public TagResource addTagsItem(Tag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public TagResource withTags(Consumer<List<Tag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表 没有标签默认为空数字。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public TagResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public TagResource withSysTags(List<SysTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public TagResource addSysTagsItem(SysTag sysTagsItem) {
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public TagResource withSysTags(Consumer<List<SysTag>> sysTagsSetter) {
        if(this.sysTags == null ){
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限才可以可以获取此字段：  目前只包含一个resource_tag 结构体。  key：_sys_enterprise_project_id  value：企业项目id，0表示默认企业项目  非op_service场景不能返回此字段。
     * @return sysTags
     */
    public List<SysTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTag> sysTags) {
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
        TagResource tagResource = (TagResource) o;
        return Objects.equals(this.resourceId, tagResource.resourceId) &&
            Objects.equals(this.resourceDetail, tagResource.resourceDetail) &&
            Objects.equals(this.tags, tagResource.tags) &&
            Objects.equals(this.resourceName, tagResource.resourceName) &&
            Objects.equals(this.sysTags, tagResource.sysTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceDetail, tags, resourceName, sysTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

