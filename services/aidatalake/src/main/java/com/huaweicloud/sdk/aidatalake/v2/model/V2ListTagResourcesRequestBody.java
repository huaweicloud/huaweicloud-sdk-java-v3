package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：标签管理界面查询资源实例列表的请求体。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class V2ListTagResourcesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<V2ResourceTagParam> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<V2TagMatch> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<V2SystemTagParam> sysTags = null;

    public V2ListTagResourcesRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释**：不包含任意一个标签。 **约束限制**：不涉及。 **取值范围**：   - true：查询不包含任意一个标签的资源，此时忽略“tags”过滤字段。   - false：该条件不生效，即返回所有资源或按“tags”，“matches”等条件过滤。 **默认取值**：不涉及。 
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public V2ListTagResourcesRequestBody withTags(List<V2ResourceTagParam> tags) {
        this.tags = tags;
        return this;
    }

    public V2ListTagResourcesRequestBody addTagsItem(V2ResourceTagParam tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public V2ListTagResourcesRequestBody withTags(Consumer<List<V2ResourceTagParam>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：包含标签，最多包含20个key，每个key下面的value最多20个，每个key对应的value可以为空数组但结构体不能缺失。 **约束限制**：最大数量为20个。 
     * @return tags
     */
    public List<V2ResourceTagParam> getTags() {
        return tags;
    }

    public void setTags(List<V2ResourceTagParam> tags) {
        this.tags = tags;
    }

    public V2ListTagResourcesRequestBody withMatches(List<V2TagMatch> matches) {
        this.matches = matches;
        return this;
    }

    public V2ListTagResourcesRequestBody addMatchesItem(V2TagMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public V2ListTagResourcesRequestBody withMatches(Consumer<List<V2TagMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释**：前缀搜索字段。key为固定字典值，当前只支持resource_name，表示基于资源名称前缀搜索。value为匹配的值。 **约束限制**：不涉及。 
     * @return matches
     */
    public List<V2TagMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<V2TagMatch> matches) {
        this.matches = matches;
    }

    public V2ListTagResourcesRequestBody withSysTags(List<V2SystemTagParam> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public V2ListTagResourcesRequestBody addSysTagsItem(V2SystemTagParam sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public V2ListTagResourcesRequestBody withSysTags(Consumer<List<V2SystemTagParam>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释**：系统标签列表，目前只包含一个tag结构体。key下面只包含一个value。 **约束限制**：不涉及。 
     * @return sysTags
     */
    public List<V2SystemTagParam> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<V2SystemTagParam> sysTags) {
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
        V2ListTagResourcesRequestBody that = (V2ListTagResourcesRequestBody) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.matches, that.matches) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, matches, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2ListTagResourcesRequestBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
