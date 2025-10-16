package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TmsResourceInstancesRequest
 */
public class TmsResourceInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsResourceInstancesTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<TmsResourceInstancesTag> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TmsResourceTag> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private String withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<TmsResourceInstancesTag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<TmsResourceInstancesTag> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<TmsResourceInstancesTag> notTags = null;

    public TmsResourceInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public TmsResourceInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数，默认为1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public TmsResourceInstancesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public TmsResourceInstancesRequest withTags(List<TmsResourceInstancesTag> tags) {
        this.tags = tags;
        return this;
    }

    public TmsResourceInstancesRequest addTagsItem(TmsResourceInstancesTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TmsResourceInstancesRequest withTags(Consumer<List<TmsResourceInstancesTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public List<TmsResourceInstancesTag> getTags() {
        return tags;
    }

    public void setTags(List<TmsResourceInstancesTag> tags) {
        this.tags = tags;
    }

    public TmsResourceInstancesRequest withSysTags(List<TmsResourceInstancesTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public TmsResourceInstancesRequest addSysTagsItem(TmsResourceInstancesTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public TmsResourceInstancesRequest withSysTags(Consumer<List<TmsResourceInstancesTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * Get sysTags
     * @return sysTags
     */
    public List<TmsResourceInstancesTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<TmsResourceInstancesTag> sysTags) {
        this.sysTags = sysTags;
    }

    public TmsResourceInstancesRequest withMatches(List<TmsResourceTag> matches) {
        this.matches = matches;
        return this;
    }

    public TmsResourceInstancesRequest addMatchesItem(TmsResourceTag matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public TmsResourceInstancesRequest withMatches(Consumer<List<TmsResourceTag>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * Get matches
     * @return matches
     */
    public List<TmsResourceTag> getMatches() {
        return matches;
    }

    public void setMatches(List<TmsResourceTag> matches) {
        this.matches = matches;
    }

    public TmsResourceInstancesRequest withWithoutAnyTag(String withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 无任何标签的资源筛选标识
     * @return withoutAnyTag
     */
    public String getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(String withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public TmsResourceInstancesRequest withTagsAny(List<TmsResourceInstancesTag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public TmsResourceInstancesRequest addTagsAnyItem(TmsResourceInstancesTag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public TmsResourceInstancesRequest withTagsAny(Consumer<List<TmsResourceInstancesTag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * Get tagsAny
     * @return tagsAny
     */
    public List<TmsResourceInstancesTag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TmsResourceInstancesTag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public TmsResourceInstancesRequest withNotTagsAny(List<TmsResourceInstancesTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public TmsResourceInstancesRequest addNotTagsAnyItem(TmsResourceInstancesTag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public TmsResourceInstancesRequest withNotTagsAny(Consumer<List<TmsResourceInstancesTag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * Get notTagsAny
     * @return notTagsAny
     */
    public List<TmsResourceInstancesTag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TmsResourceInstancesTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public TmsResourceInstancesRequest withNotTags(List<TmsResourceInstancesTag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public TmsResourceInstancesRequest addNotTagsItem(TmsResourceInstancesTag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public TmsResourceInstancesRequest withNotTags(Consumer<List<TmsResourceInstancesTag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * Get notTags
     * @return notTags
     */
    public List<TmsResourceInstancesTag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TmsResourceInstancesTag> notTags) {
        this.notTags = notTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TmsResourceInstancesRequest that = (TmsResourceInstancesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.action, that.action) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.matches, that.matches)
            && Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tagsAny, that.tagsAny)
            && Objects.equals(this.notTagsAny, that.notTagsAny) && Objects.equals(this.notTags, that.notTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, action, tags, sysTags, matches, withoutAnyTag, tagsAny, notTagsAny, notTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TmsResourceInstancesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
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
