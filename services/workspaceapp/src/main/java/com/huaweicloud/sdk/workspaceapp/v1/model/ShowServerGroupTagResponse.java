package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ShowServerGroupTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<TmsTag> sysTags = null;

    public ShowServerGroupTagResponse withTags(List<TmsTag> tags) {
        this.tags = tags;
        return this;
    }

    public ShowServerGroupTagResponse addTagsItem(TmsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowServerGroupTagResponse withTags(Consumer<List<TmsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<TmsTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsTag> tags) {
        this.tags = tags;
    }

    public ShowServerGroupTagResponse withSysTags(List<TmsTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowServerGroupTagResponse addSysTagsItem(TmsTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ShowServerGroupTagResponse withSysTags(Consumer<List<TmsTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限才可以获取此字段，非op_service场景不能返回此字段，目前只包含一个resource_tag结构体。 > - key：_sys_enterprise_project_id。 > - value：企业项目id，0表示默认企业项目。
     * @return sysTags
     */
    public List<TmsTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<TmsTag> sysTags) {
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
        ShowServerGroupTagResponse that = (ShowServerGroupTagResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerGroupTagResponse {\n");
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
