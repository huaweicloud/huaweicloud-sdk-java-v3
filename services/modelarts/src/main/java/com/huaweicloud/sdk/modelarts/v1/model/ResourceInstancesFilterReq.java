package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询训练作业资源列表的请求体。
 */
public class ResourceInstancesFilterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<MutiValueTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    public ResourceInstancesFilterReq withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。未创建工作空间时默认值为\"0\"，存在创建并使用的工作空间，以实际取值为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ResourceInstancesFilterReq withTags(List<MutiValueTag> tags) {
        this.tags = tags;
        return this;
    }

    public ResourceInstancesFilterReq addTagsItem(MutiValueTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ResourceInstancesFilterReq withTags(Consumer<List<MutiValueTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：标签筛选条件，按标签key-value对筛选作业。同一key下多个value为OR关系，不同key之间为AND关系。 **约束限制**：同一key的values不能重复，不同key不能重复。 **取值范围**：不涉及。
     * @return tags
     */
    public List<MutiValueTag> getTags() {
        return tags;
    }

    public void setTags(List<MutiValueTag> tags) {
        this.tags = tags;
    }

    public ResourceInstancesFilterReq withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释**：是否查询没有任何标签的作业。 **约束限制**：设为true时忽略tags筛选条件。 **取值范围**： - true：仅查询无标签的作业 - false：按tags条件筛选 **默认取值**：false。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ResourceInstancesFilterReq withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public ResourceInstancesFilterReq addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ResourceInstancesFilterReq withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释**：资源名称搜索条件。 **约束限制**：最多支持1个匹配项，且key必须为resource_name。 **取值范围**：不涉及。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
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
        ResourceInstancesFilterReq that = (ResourceInstancesFilterReq) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, tags, withoutAnyTag, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstancesFilterReq {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
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
