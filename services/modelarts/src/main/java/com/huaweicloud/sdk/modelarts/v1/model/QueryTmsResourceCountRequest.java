package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询TMS资源总量请求体
 */
public class QueryTmsResourceCountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TmsMatch> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CombineInferTmsTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    public QueryTmsResourceCountRequest withMatches(List<TmsMatch> matches) {
        this.matches = matches;
        return this;
    }

    public QueryTmsResourceCountRequest addMatchesItem(TmsMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public QueryTmsResourceCountRequest withMatches(Consumer<List<TmsMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释：** 匹配项，目前只支持资源名称的模糊匹配。 **约束限制：** 不涉及。
     * @return matches
     */
    public List<TmsMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<TmsMatch> matches) {
        this.matches = matches;
    }

    public QueryTmsResourceCountRequest withTags(List<CombineInferTmsTags> tags) {
        this.tags = tags;
        return this;
    }

    public QueryTmsResourceCountRequest addTagsItem(CombineInferTmsTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryTmsResourceCountRequest withTags(Consumer<List<CombineInferTmsTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签匹配项，只支持多个标签与操作，不携带表示查询所有资源。 **约束限制：** 不涉及。
     * @return tags
     */
    public List<CombineInferTmsTags> getTags() {
        return tags;
    }

    public void setTags(List<CombineInferTmsTags> tags) {
        this.tags = tags;
    }

    public QueryTmsResourceCountRequest withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * **参数解释：** 是否只查询没有打标签的资源。 **约束限制：** 不涉及。 **取值范围：** true：只查询没有打标签的资源。 false：查询所有资源。 **默认取值：** 不涉及。
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
        QueryTmsResourceCountRequest that = (QueryTmsResourceCountRequest) obj;
        return Objects.equals(this.matches, that.matches) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.withoutAnyTag, that.withoutAnyTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matches, tags, withoutAnyTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTmsResourceCountRequest {\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
