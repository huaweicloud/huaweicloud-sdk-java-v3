package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例标签。
 */
public class SrCreateInstanceRspInstanceTagsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateChInstanceInfoTagsInfoTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SrCreateInstanceRspInstanceTagsInfoSysTags> sysTags = null;

    public SrCreateInstanceRspInstanceTagsInfo withTags(List<CreateChInstanceInfoTagsInfoTags> tags) {
        this.tags = tags;
        return this;
    }

    public SrCreateInstanceRspInstanceTagsInfo addTagsItem(CreateChInstanceInfoTagsInfoTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SrCreateInstanceRspInstanceTagsInfo withTags(Consumer<List<CreateChInstanceInfoTagsInfoTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 用户标签。默认为空。
     * @return tags
     */
    public List<CreateChInstanceInfoTagsInfoTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateChInstanceInfoTagsInfoTags> tags) {
        this.tags = tags;
    }

    public SrCreateInstanceRspInstanceTagsInfo withSysTags(List<SrCreateInstanceRspInstanceTagsInfoSysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public SrCreateInstanceRspInstanceTagsInfo addSysTagsItem(SrCreateInstanceRspInstanceTagsInfoSysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public SrCreateInstanceRspInstanceTagsInfo withSysTags(
        Consumer<List<SrCreateInstanceRspInstanceTagsInfoSysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签。
     * @return sysTags
     */
    public List<SrCreateInstanceRspInstanceTagsInfoSysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SrCreateInstanceRspInstanceTagsInfoSysTags> sysTags) {
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
        SrCreateInstanceRspInstanceTagsInfo that = (SrCreateInstanceRspInstanceTagsInfo) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SrCreateInstanceRspInstanceTagsInfo {\n");
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
