package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCoreCodeInterpretersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释：** 排序字段 **约束范围：** 不涉及 **取值范围：** 必须是created_at或updated_at **默认取值：** 缺省值为created_at
     */
    public static final class SortKeyEnum {

        /**
         * Enum CREATED_AT for value: "created_at"
         */
        public static final SortKeyEnum CREATED_AT = new SortKeyEnum("created_at");

        /**
         * Enum UPDATED_AT for value: "updated_at"
         */
        public static final SortKeyEnum UPDATED_AT = new SortKeyEnum("updated_at");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("created_at", CREATED_AT);
            map.put("updated_at", UPDATED_AT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * **参数解释：** 排序方向 **约束范围：** 不涉及 **取值范围：** 必须是asc或desc **默认取值：** 缺省值为desc
     */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortDirEnum(value));
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_exists")

    private String tagKeyExists;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_matches")

    private String tagKeyMatches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value_matches")

    private String tagValueMatches;

    /**
     * **参数解释**: 标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的交集  - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的并集 **约束限制**: 不涉及。 **取值范围**： 长度为1-3个字符。允许的值为： - ALL - ANY **默认取值**: ALL
     */
    public static final class TagMatchPolicyEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final TagMatchPolicyEnum ALL = new TagMatchPolicyEnum("ALL");

        /**
         * Enum ANY for value: "ANY"
         */
        public static final TagMatchPolicyEnum ANY = new TagMatchPolicyEnum("ANY");

        private static final Map<String, TagMatchPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagMatchPolicyEnum> createStaticFields() {
            Map<String, TagMatchPolicyEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("ANY", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagMatchPolicyEnum(String value) {
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
        public static TagMatchPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagMatchPolicyEnum(value));
        }

        public static TagMatchPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagMatchPolicyEnum) {
                return this.value.equals(((TagMatchPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_match_policy")

    private TagMatchPolicyEnum tagMatchPolicy;

    public ListCoreCodeInterpretersRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 按代码解释器名称过滤。 **约束范围：** 不涉及 **取值范围：** 长度在2到40之间 **默认取值：** 空
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCoreCodeInterpretersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 返回结果偏移量。 **约束限制：** 必须为非负整数。 **取值范围：** 0-100000。 **默认取值：** 0。 
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCoreCodeInterpretersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 限制数量。 **约束限制：** 不涉及。 **取值范围：** 正整数，最大值1000。 **默认取值：** 1000。
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

    public ListCoreCodeInterpretersRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释：** 排序字段 **约束范围：** 不涉及 **取值范围：** 必须是created_at或updated_at **默认取值：** 缺省值为created_at
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListCoreCodeInterpretersRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释：** 排序方向 **约束范围：** 不涉及 **取值范围：** 必须是asc或desc **默认取值：** 缺省值为desc
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListCoreCodeInterpretersRequest withTagKeyExists(String tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签名称的资源, 多个值通过重复参数名传递，如：tag_key_exists=env&tag_key_exists=team。 **约束限制**: 支持批量查询多个标签名，最多支持10个标签。 **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagKeyExists
     */
    public String getTagKeyExists() {
        return tagKeyExists;
    }

    public void setTagKeyExists(String tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
    }

    public ListCoreCodeInterpretersRequest withTagKeyMatches(String tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串, 如：tag_key_matches=env&tag_key_matches=team。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复. **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagKeyMatches
     */
    public String getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(String tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListCoreCodeInterpretersRequest withTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_key_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，支持空字符串,  如：tag_key_matches=env&tag_value_matches=prod。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复. **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagValueMatches
     */
    public String getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListCoreCodeInterpretersRequest withTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释**: 标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的交集  - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的并集 **约束限制**: 不涉及。 **取值范围**： 长度为1-3个字符。允许的值为： - ALL - ANY **默认取值**: ALL
     * @return tagMatchPolicy
     */
    public TagMatchPolicyEnum getTagMatchPolicy() {
        return tagMatchPolicy;
    }

    public void setTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreCodeInterpretersRequest that = (ListCoreCodeInterpretersRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, offset, limit, sortKey, sortDir, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreCodeInterpretersRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    tagKeyExists: ").append(toIndentedString(tagKeyExists)).append("\n");
        sb.append("    tagKeyMatches: ").append(toIndentedString(tagKeyMatches)).append("\n");
        sb.append("    tagValueMatches: ").append(toIndentedString(tagValueMatches)).append("\n");
        sb.append("    tagMatchPolicy: ").append(toIndentedString(tagMatchPolicy)).append("\n");
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
