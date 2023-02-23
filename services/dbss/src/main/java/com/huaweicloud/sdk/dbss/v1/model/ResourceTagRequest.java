package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.KeyValueBean;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceTagRequest
 */
public class ResourceTagRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<KeyValueBean> tags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<KeyValueBean> sysTags = null;
    
    public ResourceTagRequest withTags(List<KeyValueBean> tags) {
        this.tags = tags;
        return this;
    }

    
    public ResourceTagRequest addTagsItem(KeyValueBean tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceTagRequest withTags(Consumer<List<KeyValueBean>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表 租户权限时该字段必选，op_service权限时和sys_tags二选一
     * @return tags
     */
    public List<KeyValueBean> getTags() {
        return tags;
    }

    public void setTags(List<KeyValueBean> tags) {
        this.tags = tags;
    }

    

    public ResourceTagRequest withSysTags(List<KeyValueBean> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public ResourceTagRequest addSysTagsItem(KeyValueBean sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ResourceTagRequest withSysTags(Consumer<List<KeyValueBean>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表 op_service权限可以访问，和tags二选一。 目前TMS调用时只包含一个resource_tag结构体 ，key固定为：_sys_enterprise_project_id value是UUID或0,value为0表示默认企业项目
     * @return sysTags
     */
    public List<KeyValueBean> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<KeyValueBean> sysTags) {
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
        ResourceTagRequest resourceTagRequest = (ResourceTagRequest) o;
        return Objects.equals(this.tags, resourceTagRequest.tags) &&
            Objects.equals(this.sysTags, resourceTagRequest.sysTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTagRequest {\n");
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

