package com.huaweicloud.sdk.sdrs.v1.model;

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

/** 通过标签查询保护实例请求体 */
public class ListProtectedInstancesByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagParams> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<TagParams> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<TagParams> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<TagParams> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    /** 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数)。如果是filter就按照过滤条件查询，如果是count，只需要返回总条数，禁止返回其他字段。 */
    public static final class ActionEnum {

        /** Enum FILTER for value: "filter" */
        public static final ActionEnum FILTER = new ActionEnum("filter");

        /** Enum COUNT for value: "count" */
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
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "matches")

    private List<MatchParams> matches = null;

    public ListProtectedInstancesByTagsRequestBody withTags(List<TagParams> tags) {
        this.tags = tags;
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody addTagsItem(TagParams tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody withTags(Consumer<List<TagParams>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 包含标签，最多包含10个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据。
     * 
     * @return tags */
    public List<TagParams> getTags() {
        return tags;
    }

    public void setTags(List<TagParams> tags) {
        this.tags = tags;
    }

    public ListProtectedInstancesByTagsRequestBody withTagsAny(List<TagParams> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody addTagsAnyItem(TagParams tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody withTagsAny(Consumer<List<TagParams>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /** 包含任意标签，最多包含10个key，每个key下面的value最多10个,
     * 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * 
     * @return tagsAny */
    public List<TagParams> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagParams> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListProtectedInstancesByTagsRequestBody withNotTags(List<TagParams> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody addNotTagsItem(TagParams notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody withNotTags(Consumer<List<TagParams>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /** 不包含标签，最多包含10个key，每个key下面的value最多10个,
     * 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * 
     * @return notTags */
    public List<TagParams> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagParams> notTags) {
        this.notTags = notTags;
    }

    public ListProtectedInstancesByTagsRequestBody withNotTagsAny(List<TagParams> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody addNotTagsAnyItem(TagParams notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody withNotTagsAny(Consumer<List<TagParams>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /** 不包含任意标签，最多包含10个key，每个key下面的value最多10个,
     * 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * 
     * @return notTagsAny */
    public List<TagParams> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagParams> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListProtectedInstancesByTagsRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000,不能为负数，最小值为1。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListProtectedInstancesByTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 索引位置，偏移量（action为count时无此参数）从第一条数据偏移offset条数据后开始查询，如果action为filter默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListProtectedInstancesByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /** 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数)。如果是filter就按照过滤条件查询，如果是count，只需要返回总条数，禁止返回其他字段。
     * 
     * @return action */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListProtectedInstancesByTagsRequestBody withMatches(List<MatchParams> matches) {
        this.matches = matches;
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody addMatchesItem(MatchParams matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListProtectedInstancesByTagsRequestBody withMatches(Consumer<List<MatchParams>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /** 搜索字段,key为要匹配的字段，如resource_name等。value为匹配的值。key为固定字典值，不能包含重复的key或不支持的key。根据key的值确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写），如果value为空字符串精确匹配。目前只有resource_name，后续再扩展。
     * 
     * @return matches */
    public List<MatchParams> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchParams> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProtectedInstancesByTagsRequestBody listProtectedInstancesByTagsRequestBody =
            (ListProtectedInstancesByTagsRequestBody) o;
        return Objects.equals(this.tags, listProtectedInstancesByTagsRequestBody.tags)
            && Objects.equals(this.tagsAny, listProtectedInstancesByTagsRequestBody.tagsAny)
            && Objects.equals(this.notTags, listProtectedInstancesByTagsRequestBody.notTags)
            && Objects.equals(this.notTagsAny, listProtectedInstancesByTagsRequestBody.notTagsAny)
            && Objects.equals(this.limit, listProtectedInstancesByTagsRequestBody.limit)
            && Objects.equals(this.offset, listProtectedInstancesByTagsRequestBody.offset)
            && Objects.equals(this.action, listProtectedInstancesByTagsRequestBody.action)
            && Objects.equals(this.matches, listProtectedInstancesByTagsRequestBody.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, offset, action, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectedInstancesByTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
