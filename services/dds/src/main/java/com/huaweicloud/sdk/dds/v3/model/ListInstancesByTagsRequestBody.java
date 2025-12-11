package com.huaweicloud.sdk.dds.v3.model;

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
 * ListInstancesByTagsRequestBody
 */
public class ListInstancesByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    /**
     * **参数解释：** 操作标识。 **约束限制：** - 取值为“count”，表示仅返回总记录数，禁止返回其他字段。 - 取值为“filter”，表示根据标签过滤条件查询实例。 **取值范围：** count和filter **默认取值：** 不涉及。
     */
    public static final class ActionEnum {

        /**
         * Enum COUNT for value: "count"
         */
        public static final ActionEnum COUNT = new ActionEnum("count");

        /**
         * Enum FILTER for value: "filter"
         */
        public static final ActionEnum FILTER = new ActionEnum("filter");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("count", COUNT);
            map.put("filter", FILTER);
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
    @JsonProperty(value = "matches")

    private List<QueryMatchItem> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<QueryTagItem> tags = null;

    public ListInstancesByTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 索引位置偏移量，表示从第一条数据偏移offset条数据后开始查询。 **约束限制：**   - “action”值为“count”时，不传该参数。   - “action”值为“filter”时，取值必须为数字，不能为负数。 **取值范围：** 不涉及。 **默认取值：** 默认取0值，表示从第一条数据开始查询。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstancesByTagsRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 查询记录数。 **约束限制：**   - “action”值为“count”时，不传该参数。   - “action”值为“filter”时，取值范围：1~100。不传该参数时，默认查询前100条实例信息。 **取值范围：** 1~100 **默认取值：** 不涉及。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstancesByTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 操作标识。 **约束限制：** - 取值为“count”，表示仅返回总记录数，禁止返回其他字段。 - 取值为“filter”，表示根据标签过滤条件查询实例。 **取值范围：** count和filter **默认取值：** 不涉及。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListInstancesByTagsRequestBody withMatches(List<QueryMatchItem> matches) {
        this.matches = matches;
        return this;
    }

    public ListInstancesByTagsRequestBody addMatchesItem(QueryMatchItem matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListInstancesByTagsRequestBody withMatches(Consumer<List<QueryMatchItem>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * **参数解释：** 搜索字段。 **约束限制：**   - 该字段值为空，表示不按照实例名称或实例ID查询。   - 该字段值不为空， **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return matches
     */
    public List<QueryMatchItem> getMatches() {
        return matches;
    }

    public void setMatches(List<QueryMatchItem> matches) {
        this.matches = matches;
    }

    public ListInstancesByTagsRequestBody withTags(List<QueryTagItem> tags) {
        this.tags = tags;
        return this;
    }

    public ListInstancesByTagsRequestBody addTagsItem(QueryTagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstancesByTagsRequestBody withTags(Consumer<List<QueryTagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 包含标签。 **约束限制：** 最多包含10个key。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tags
     */
    public List<QueryTagItem> getTags() {
        return tags;
    }

    public void setTags(List<QueryTagItem> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesByTagsRequestBody that = (ListInstancesByTagsRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.action, that.action) && Objects.equals(this.matches, that.matches)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, action, matches, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesByTagsRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
