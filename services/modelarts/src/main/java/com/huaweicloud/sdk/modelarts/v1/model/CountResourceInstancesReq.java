package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：按标签统计训练作业资源数量的请求体。
 */
public class CountResourceInstancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CountResourceInstancesReqTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<CountResourceInstancesReqMatches> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    public CountResourceInstancesReq withTags(List<CountResourceInstancesReqTags> tags) {
        this.tags = tags;
        return this;
    }

    public CountResourceInstancesReq addTagsItem(CountResourceInstancesReqTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CountResourceInstancesReq withTags(Consumer<List<CountResourceInstancesReqTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：标签过滤条件，返回同时包含列表中所有标签的训练作业。 **约束限制**：标签个数不能超过系统允许的最大标签数。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return tags
     */
    public List<CountResourceInstancesReqTags> getTags() {
        return tags;
    }

    public void setTags(List<CountResourceInstancesReqTags> tags) {
        this.tags = tags;
    }

    public CountResourceInstancesReq withMatches(List<CountResourceInstancesReqMatches> matches) {
        this.matches = matches;
        return this;
    }

    public CountResourceInstancesReq addMatchesItem(CountResourceInstancesReqMatches matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public CountResourceInstancesReq withMatches(Consumer<List<CountResourceInstancesReqMatches>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释**：模糊匹配条件，支持按资源名称等字段进行模糊查询。 **约束限制**：最多1个匹配条件。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return matches
     */
    public List<CountResourceInstancesReqMatches> getMatches() {
        return matches;
    }

    public void setMatches(List<CountResourceInstancesReqMatches> matches) {
        this.matches = matches;
    }

    public CountResourceInstancesReq withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CountResourceInstancesReq withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释**：是否查询不带任何标签的训练作业。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：false。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountResourceInstancesReq that = (CountResourceInstancesReq) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.matches, that.matches)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.withoutAnyTag, that.withoutAnyTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, matches, workspaceId, withoutAnyTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountResourceInstancesReq {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
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
