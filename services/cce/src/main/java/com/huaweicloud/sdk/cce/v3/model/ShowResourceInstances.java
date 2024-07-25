package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ShowResourceInstances {

    /**
     * action类型，\"filter\"或者\"count\"。
     */
    public static final class ActionEnum {

        /**
         * Enum FILTER for value: "filter"
         */
        public static final ActionEnum FILTER = new ActionEnum("filter");

        /**
         * Enum COUNT for value: "count"
         */
        public static final ActionEnum COUNT = new ActionEnum("count");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("filter", FILTER);
            map.put("count", COUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private TagFilter tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private TagFilter tagsAny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private TagFilter notTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private TagFilter notTagsAny;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private TagFilter sysTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Object> matches = null;

    public ShowResourceInstances withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * action类型，\"filter\"或者\"count\"。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ShowResourceInstances withTags(TagFilter tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceInstances withTags(Consumer<TagFilter> tagsSetter) {
        if (this.tags == null) {
            this.tags = new TagFilter();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public TagFilter getTags() {
        return tags;
    }

    public void setTags(TagFilter tags) {
        this.tags = tags;
    }

    public ShowResourceInstances withTagsAny(TagFilter tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ShowResourceInstances withTagsAny(Consumer<TagFilter> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new TagFilter();
            tagsAnySetter.accept(this.tagsAny);
        }

        return this;
    }

    /**
     * Get tagsAny
     * @return tagsAny
     */
    public TagFilter getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(TagFilter tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ShowResourceInstances withNotTags(TagFilter notTags) {
        this.notTags = notTags;
        return this;
    }

    public ShowResourceInstances withNotTags(Consumer<TagFilter> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new TagFilter();
            notTagsSetter.accept(this.notTags);
        }

        return this;
    }

    /**
     * Get notTags
     * @return notTags
     */
    public TagFilter getNotTags() {
        return notTags;
    }

    public void setNotTags(TagFilter notTags) {
        this.notTags = notTags;
    }

    public ShowResourceInstances withNotTagsAny(TagFilter notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ShowResourceInstances withNotTagsAny(Consumer<TagFilter> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new TagFilter();
            notTagsAnySetter.accept(this.notTagsAny);
        }

        return this;
    }

    /**
     * Get notTagsAny
     * @return notTagsAny
     */
    public TagFilter getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(TagFilter notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ShowResourceInstances withSysTags(TagFilter sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ShowResourceInstances withSysTags(Consumer<TagFilter> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new TagFilter();
            sysTagsSetter.accept(this.sysTags);
        }

        return this;
    }

    /**
     * Get sysTags
     * @return sysTags
     */
    public TagFilter getSysTags() {
        return sysTags;
    }

    public void setSysTags(TagFilter sysTags) {
        this.sysTags = sysTags;
    }

    public ShowResourceInstances withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 忽略其他标签字段，返回不带任何标签的资源。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ShowResourceInstances withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowResourceInstances withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowResourceInstances withMatches(List<Object> matches) {
        this.matches = matches;
        return this;
    }

    public ShowResourceInstances addMatchesItem(Object matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ShowResourceInstances withMatches(Consumer<List<Object>> matchesSetter) {
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
    public List<Object> getMatches() {
        return matches;
    }

    public void setMatches(List<Object> matches) {
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
        ShowResourceInstances that = (ShowResourceInstances) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.tagsAny, that.tagsAny) && Objects.equals(this.notTags, that.notTags)
            && Objects.equals(this.notTagsAny, that.notTagsAny) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, tags, tagsAny, notTags, notTagsAny, sysTags, withoutAnyTag, limit, offset, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceInstances {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
