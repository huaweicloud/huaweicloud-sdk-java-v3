package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSharedTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    @JacksonXmlProperty(localName = "sys_tags")

    private List<ResourceTag> sysTags = null;

    public ShowSharedTagsResponse withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowSharedTagsResponse addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowSharedTagsResponse withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tag标签的列表。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ShowSharedTagsResponse withSysTags(List<ResourceTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowSharedTagsResponse addSysTagsItem(ResourceTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ShowSharedTagsResponse withSysTags(Consumer<List<ResourceTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限才可以获取此字段。  1.  目前只包含一个resource_tag结构体 key：_sys_enterprise_project_id  2.  目前key下面只包含一个value，0表示默认企业项目。  非op_service场景不能返回此字段。
     * @return sysTags
     */
    public List<ResourceTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceTag> sysTags) {
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
        ShowSharedTagsResponse showSharedTagsResponse = (ShowSharedTagsResponse) o;
        return Objects.equals(this.tags, showSharedTagsResponse.tags)
            && Objects.equals(this.sysTags, showSharedTagsResponse.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSharedTagsResponse {\n");
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
