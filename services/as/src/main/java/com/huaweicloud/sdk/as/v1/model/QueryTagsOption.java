package com.huaweicloud.sdk.as.v1.model;

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
 * 请求正常
 */
public class QueryTagsOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsMultiValue> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<TagsMultiValue> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<TagsMultiValue> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<TagsMultiValue> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 操作标识（仅限filter，count）：filter（过滤）：即分页查询。count（查询总条数）：按照条件将总条数返回即可。
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
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Matches> matches = null;

    public QueryTagsOption withTags(List<TagsMultiValue> tags) {
        this.tags = tags;
        return this;
    }

    public QueryTagsOption addTagsItem(TagsMultiValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryTagsOption withTags(Consumer<List<TagsMultiValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 过滤条件，包含标签，最多包含10个Tag，结构体不能缺失。
     * @return tags
     */
    public List<TagsMultiValue> getTags() {
        return tags;
    }

    public void setTags(List<TagsMultiValue> tags) {
        this.tags = tags;
    }

    public QueryTagsOption withTagsAny(List<TagsMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public QueryTagsOption addTagsAnyItem(TagsMultiValue tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public QueryTagsOption withTagsAny(Consumer<List<TagsMultiValue>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 过滤条件，包含任意标签，最多包含10个Tag。
     * @return tagsAny
     */
    public List<TagsMultiValue> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagsMultiValue> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public QueryTagsOption withNotTags(List<TagsMultiValue> notTags) {
        this.notTags = notTags;
        return this;
    }

    public QueryTagsOption addNotTagsItem(TagsMultiValue notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public QueryTagsOption withNotTags(Consumer<List<TagsMultiValue>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 过滤条件，不包含标签，最多包含10个Tag。
     * @return notTags
     */
    public List<TagsMultiValue> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagsMultiValue> notTags) {
        this.notTags = notTags;
    }

    public QueryTagsOption withNotTagsAny(List<TagsMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public QueryTagsOption addNotTagsAnyItem(TagsMultiValue notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public QueryTagsOption withNotTagsAny(Consumer<List<TagsMultiValue>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 过滤条件，不包含任意标签，最多包含10个Tag。
     * @return notTagsAny
     */
    public List<TagsMultiValue> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagsMultiValue> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public QueryTagsOption withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000，不能为负数，最小值为1。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public QueryTagsOption withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页位置标识（资源ID或索引位置）。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public QueryTagsOption withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识（仅限filter，count）：filter（过滤）：即分页查询。count（查询总条数）：按照条件将总条数返回即可。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public QueryTagsOption withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * （索引位置），从offset指定的下一条数据开始查询。查询第一页数据时，不需要传入此参数。查询后续页码数据时，将查询前一页数据时，不需要传入此参数。查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数。必须为数字，不能为负数。action：count时，无此参数。action：filter时，默认为0
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public QueryTagsOption withMatches(List<Matches> matches) {
        this.matches = matches;
        return this;
    }

    public QueryTagsOption addMatchesItem(Matches matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public QueryTagsOption withMatches(Consumer<List<Matches>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 模糊搜索字段。
     * @return matches
     */
    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
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
        QueryTagsOption that = (QueryTagsOption) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.tagsAny, that.tagsAny)
            && Objects.equals(this.notTags, that.notTags) && Objects.equals(this.notTagsAny, that.notTagsAny)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.action, that.action) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, marker, action, offset, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryTagsOption {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
