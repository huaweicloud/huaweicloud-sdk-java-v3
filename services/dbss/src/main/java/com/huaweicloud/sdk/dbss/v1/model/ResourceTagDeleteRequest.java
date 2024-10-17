package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceTagDeleteRequest
 */
public class ResourceTagDeleteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagDeleteRequestTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ResourceTagDeleteRequestTags> sysTags = null;

    public ResourceTagDeleteRequest withTags(List<ResourceTagDeleteRequestTags> tags) {
        this.tags = tags;
        return this;
    }

    public ResourceTagDeleteRequest addTagsItem(ResourceTagDeleteRequestTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceTagDeleteRequest withTags(Consumer<List<ResourceTagDeleteRequestTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表 租户权限时该字段必选，op_service权限时和sys_tags二选一
     * @return tags
     */
    public List<ResourceTagDeleteRequestTags> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagDeleteRequestTags> tags) {
        this.tags = tags;
    }

    public ResourceTagDeleteRequest withSysTags(List<ResourceTagDeleteRequestTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ResourceTagDeleteRequest addSysTagsItem(ResourceTagDeleteRequestTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ResourceTagDeleteRequest withSysTags(Consumer<List<ResourceTagDeleteRequestTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表 op_service权限可以访问，和tags二选一。 目前TMS调用时只包含一个resource_tag结构体 ，key固定为：_sys_enterprise_project_id value是UUID或0,value为0表示默认企业项目。 现在仅支持create操作。
     * @return sysTags
     */
    public List<ResourceTagDeleteRequestTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceTagDeleteRequestTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceTagDeleteRequest that = (ResourceTagDeleteRequest) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTagDeleteRequest {\n");
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
