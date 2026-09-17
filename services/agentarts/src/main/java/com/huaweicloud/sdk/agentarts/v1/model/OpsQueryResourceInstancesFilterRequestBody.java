package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 根据标签过滤查询资源实例列表的请求体。 支持用户标签（tags）和系统标签（sys_tags）过滤，两者可同时使用（与关系）。 支持 without_any_tag 查询无标签资源，支持 matches 按资源名称或ID搜索。 **约束限制：** 不涉及。
 */
public class OpsQueryResourceInstancesFilterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTagFilter> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<OpsTmsTagFilter> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<OpsTmsMatch> matches = null;

    public OpsQueryResourceInstancesFilterRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释：** 是否查询未打标签的资源。 **约束限制：** 不涉及。 **取值范围：** - true：查询所有不带标签的资源，此时忽略tags和sys_tags字段。 - false：正常按标签条件过滤。 **默认取值：** 不涉及。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public OpsQueryResourceInstancesFilterRequestBody withTags(List<OpsTmsTagFilter> tags) {
        this.tags = tags;
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody addTagsItem(OpsTmsTagFilter tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody withTags(Consumer<List<OpsTmsTagFilter>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 用户标签匹配条件列表。数组元素为OpsTmsTagFilter对象，包含key和values字段。最多包含20个key，每个key下最多20个value。Key不能重复，同一个key中values不能重复。key之间是与关系，key-value结构中value是或关系。无tag过滤条件时返回全量数据。value以*开头时使用LIKE模糊匹配（contains），否则使用精确匹配。 **约束限制：** 数组元素最大数量为20。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tags
     */
    public List<OpsTmsTagFilter> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTagFilter> tags) {
        this.tags = tags;
    }

    public OpsQueryResourceInstancesFilterRequestBody withSysTags(List<OpsTmsTagFilter> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody addSysTagsItem(OpsTmsTagFilter sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody withSysTags(Consumer<List<OpsTmsTagFilter>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释：** 系统标签匹配条件列表。数组元素为OpsTmsTagFilter对象，包含key和values字段。仅op_service权限可使用。与tags字段可同时使用（与关系），key之间是与关系，key-value结构中value是或关系。无sys_tags时按照仅tags条件处理。value以*开头时使用LIKE模糊匹配（contains），否则使用精确匹配。 **约束限制：** 数组元素最大数量为20。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return sysTags
     */
    public List<OpsTmsTagFilter> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<OpsTmsTagFilter> sysTags) {
        this.sysTags = sysTags;
    }

    public OpsQueryResourceInstancesFilterRequestBody withMatches(List<OpsTmsMatch> matches) {
        this.matches = matches;
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody addMatchesItem(OpsTmsMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public OpsQueryResourceInstancesFilterRequestBody withMatches(Consumer<List<OpsTmsMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释：** 标签匹配条件列表。数组元素为OpsTmsMatch对象，包含key和value字段。多个match之间为OR关系。key支持resource_name（前缀模糊匹配，空值精确匹配空串返回空列表）和resource_id（精确匹配，空值返回空列表）。 **约束限制：** 数组元素最大数量为20。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return matches
     */
    public List<OpsTmsMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<OpsTmsMatch> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsQueryResourceInstancesFilterRequestBody that = (OpsQueryResourceInstancesFilterRequestBody) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, sysTags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsQueryResourceInstancesFilterRequestBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
