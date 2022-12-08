package com.huaweicloud.sdk.cc.v3.model;

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
 * 用于查询资源实例的Tag过滤条件
 */
public class ListResourceByFilterTagRequestBody {

    /**
     * 动作。|- filter：过滤。 count：查询总条数。
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<AggTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Tag> matches = null;

    public ListResourceByFilterTagRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 动作。|- filter：过滤。 count：查询总条数。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListResourceByFilterTagRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询结果数量限制
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourceByFilterTagRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询结果偏移
     * minimum: 0
     * maximum: 999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListResourceByFilterTagRequestBody withTags(List<AggTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListResourceByFilterTagRequestBody addTagsItem(AggTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListResourceByFilterTagRequestBody withTags(Consumer<List<AggTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 是否包含以下tag（多个key取\"与\"关系，多个value取\"或\"关系）
     * @return tags
     */
    public List<AggTag> getTags() {
        return tags;
    }

    public void setTags(List<AggTag> tags) {
        this.tags = tags;
    }

    public ListResourceByFilterTagRequestBody withMatches(List<Tag> matches) {
        this.matches = matches;
        return this;
    }

    public ListResourceByFilterTagRequestBody addMatchesItem(Tag matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListResourceByFilterTagRequestBody withMatches(Consumer<List<Tag>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 是否匹配以下tag，key必须为\"resource_name\"，value如果有值则模糊匹配，如果为空字符串则精确匹配
     * @return matches
     */
    public List<Tag> getMatches() {
        return matches;
    }

    public void setMatches(List<Tag> matches) {
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
        ListResourceByFilterTagRequestBody listResourceByFilterTagRequestBody = (ListResourceByFilterTagRequestBody) o;
        return Objects.equals(this.action, listResourceByFilterTagRequestBody.action)
            && Objects.equals(this.limit, listResourceByFilterTagRequestBody.limit)
            && Objects.equals(this.offset, listResourceByFilterTagRequestBody.offset)
            && Objects.equals(this.tags, listResourceByFilterTagRequestBody.tags)
            && Objects.equals(this.matches, listResourceByFilterTagRequestBody.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, limit, offset, tags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceByFilterTagRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
