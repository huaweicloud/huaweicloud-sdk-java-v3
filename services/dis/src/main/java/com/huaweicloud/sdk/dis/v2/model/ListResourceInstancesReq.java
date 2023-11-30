package com.huaweicloud.sdk.dis.v2.model;

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
 * ListResourceInstancesReq
 */
public class ListResourceInstancesReq {

    /**
     * 操作标识(仅限于filter，count)  - filter：分页查询 - count：查询总条数，只需按照条件将总条数返回即可
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
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<Tags> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<Tags> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<Tags> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private String matches;

    public ListResourceInstancesReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识(仅限于filter，count)  - filter：分页查询 - count：查询总条数，只需按照条件将总条数返回即可
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListResourceInstancesReq withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数(action为count时无此参数)如果action为filter默认为1000，limit最多为1000，不能为负数，最小值为1
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListResourceInstancesReq withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置, 从offset指定的下一条数据开始查询。 查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数(action为count时无此参数)如果action为filter默认为0，必须为数字，不能为负数
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListResourceInstancesReq withTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    public ListResourceInstancesReq addTagsItem(Tags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListResourceInstancesReq withTags(Consumer<List<Tags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 返回结果包含该参数中所有标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。
     * @return tags
     */
    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public ListResourceInstancesReq withTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListResourceInstancesReq addTagsAnyItem(Tags tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListResourceInstancesReq withTagsAny(Consumer<List<Tags>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 返回结果包含该参数中任意一个标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return tagsAny
     */
    public List<Tags> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListResourceInstancesReq withNotTags(List<Tags> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListResourceInstancesReq addNotTagsItem(Tags notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListResourceInstancesReq withNotTags(Consumer<List<Tags>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 返回结果不包含该参数中所有标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个, 结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return notTags
     */
    public List<Tags> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tags> notTags) {
        this.notTags = notTags;
    }

    public ListResourceInstancesReq withNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListResourceInstancesReq addNotTagsAnyItem(Tags notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListResourceInstancesReq withNotTagsAny(Consumer<List<Tags>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 返回结果不包含该参数中任意一个标签对应的资源，该参数最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * @return notTagsAny
     */
    public List<Tags> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListResourceInstancesReq withMatches(String matches) {
        this.matches = matches;
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，当前仅支持resource_name。value为匹配的值。此字段为固定字典值
     * @return matches
     */
    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
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
        ListResourceInstancesReq that = (ListResourceInstancesReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.tagsAny, that.tagsAny) && Objects.equals(this.notTags, that.notTags)
            && Objects.equals(this.notTagsAny, that.notTagsAny) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, limit, offset, tags, tagsAny, notTags, notTagsAny, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstancesReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
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
