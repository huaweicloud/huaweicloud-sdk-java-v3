package com.huaweicloud.sdk.deh.v1.model;

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

/** 按标签查询专属主机列表请求参数。 */
public class ReqListDehByTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<Tag> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /** 操作标识，包括filter和count两种。 1.filter：表示按标签过滤专属主机，返回符合条件的专属主机列表。此时，为分页查询。 2.count：表示按标签搜索专属主机，返回符合条件的专属主机个数。 */
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
    @JsonProperty(value = "tags_any")

    private List<Tag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<Tag> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    public ReqListDehByTags withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public ReqListDehByTags addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ReqListDehByTags withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 查询包含所有指定标签的专属主机结构体不能缺失。 1.最多包含10个key，每个key下面的value最多10个。 2.结构体不能缺失。 3.key不能为空或者空字符串。 4.key不能重复。
     * 5.同一个key中value不能重复。
     * 
     * @return tags */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ReqListDehByTags withNotTags(List<Tag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ReqListDehByTags addNotTagsItem(Tag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ReqListDehByTags withNotTags(Consumer<List<Tag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /** 查询不包含所有指定标签的专属主机。 1.最多包含10个key，每个key下面的value最多10个。 2.结构体不能缺失。 3.key不能为空或者空字符串。 4.key不能重复。 5.同一个key中value不能重复。
     * 
     * @return notTags */
    public List<Tag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tag> notTags) {
        this.notTags = notTags;
    }

    public ReqListDehByTags withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询返回的专属主机数量限制，最多为1000，不能为负数。 1.如果action的值为count，此参数无效。 2.如果action的值为filter，limit默认为1000。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ReqListDehByTags withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 索引位置，从offset指定的下一条数据开始查询。必须为数字，不能为负数。 查询第一页数据时，不需要传入此参数。查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数。
     * 1.如果action的值为count，此参数无效。 2.如果action的值为filter，offset默认为0。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ReqListDehByTags withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /** 操作标识，包括filter和count两种。 1.filter：表示按标签过滤专属主机，返回符合条件的专属主机列表。此时，为分页查询。 2.count：表示按标签搜索专属主机，返回符合条件的专属主机个数。
     * 
     * @return action */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ReqListDehByTags withTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ReqListDehByTags addTagsAnyItem(Tag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ReqListDehByTags withTagsAny(Consumer<List<Tag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /** 包含任意标签。 1.最多包含10个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。 2.key不能重复，同一个key中value不能重复。
     * 3.结果返回包含标签的资源列表，key之间是“或”的关系，key-value结构中value是“或”的关系。 4.无过滤条件时返回全量数据。
     * 
     * @return tagsAny */
    public List<Tag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ReqListDehByTags withNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ReqListDehByTags addNotTagsAnyItem(Tag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ReqListDehByTags withNotTagsAny(Consumer<List<Tag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /** 不包含任意标签。 1.最多包含10个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。 2.key不能重复，同一个key中value不能重复。
     * 3.结果返回不包含标签的资源列表，key之间是“或”的关系，key-value结构中value是或的关系。 4.无过滤条件时返回全量数据。
     * 
     * @return notTagsAny */
    public List<Tag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ReqListDehByTags withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public ReqListDehByTags addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ReqListDehByTags withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /** 搜索字段，用于按条件搜索专属主机。 当前仅支持按resource_name进行搜索。
     * 
     * @return matches */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
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
        ReqListDehByTags reqListDehByTags = (ReqListDehByTags) o;
        return Objects.equals(this.tags, reqListDehByTags.tags)
            && Objects.equals(this.notTags, reqListDehByTags.notTags)
            && Objects.equals(this.limit, reqListDehByTags.limit)
            && Objects.equals(this.offset, reqListDehByTags.offset)
            && Objects.equals(this.action, reqListDehByTags.action)
            && Objects.equals(this.tagsAny, reqListDehByTags.tagsAny)
            && Objects.equals(this.notTagsAny, reqListDehByTags.notTagsAny)
            && Objects.equals(this.matches, reqListDehByTags.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, notTags, limit, offset, action, tagsAny, notTagsAny, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqListDehByTags {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
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
