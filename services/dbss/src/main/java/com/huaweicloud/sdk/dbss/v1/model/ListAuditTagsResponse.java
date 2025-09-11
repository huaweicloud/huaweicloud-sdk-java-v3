package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAuditTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagInfoBean> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ResourceTagInfoBean> sysTags = null;

    public ListAuditTagsResponse withTags(List<ResourceTagInfoBean> tags) {
        this.tags = tags;
        return this;
    }

    public ListAuditTagsResponse addTagsItem(ResourceTagInfoBean tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListAuditTagsResponse withTags(Consumer<List<ResourceTagInfoBean>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 自定义标签
     * @return tags
     */
    public List<ResourceTagInfoBean> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagInfoBean> tags) {
        this.tags = tags;
    }

    public ListAuditTagsResponse withSysTags(List<ResourceTagInfoBean> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListAuditTagsResponse addSysTagsItem(ResourceTagInfoBean sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListAuditTagsResponse withSysTags(Consumer<List<ResourceTagInfoBean>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签
     * @return sysTags
     */
    public List<ResourceTagInfoBean> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceTagInfoBean> sysTags) {
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
        ListAuditTagsResponse that = (ListAuditTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditTagsResponse {\n");
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
