package com.huaweicloud.sdk.agentarts.v1.model;

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
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCustomModelProvidersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_exists")

    private List<String> tagKeyExists = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_matches")

    private List<String> tagKeyMatches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value_matches")

    private List<String> tagValueMatches = null;

    /**
     * **参数解释：** 标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的交集。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的并集。 **约束限制：** 不涉及。 **取值范围：** 允许的值为： - ALL - ANY **默认取值：** ALL 
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListCustomModelProvidersRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 按名称过滤模型提供商，支持模糊匹配。 **约束限制：** 不涉及。 **取值范围：** 长度为 2-40 个字符。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCustomModelProvidersRequest withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 按模型提供商ID过滤，支持多个ID（最多支持20个ID）。 示例: id=id1&id=id2 **约束限制：** 长度固定为36字符，必须为UUID格式。 **取值范围：** 匹配标准的UUID格式（8-4-4-4-12的十六进制数字串，由连字符分隔），符合正则条件^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$。 **默认取值：** 不涉及。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ListCustomModelProvidersRequest withTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
        return this;
    }

    public ListCustomModelProvidersRequest addTagKeyExistsItem(String tagKeyExistsItem) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        this.tagKeyExists.add(tagKeyExistsItem);
        return this;
    }

    public ListCustomModelProvidersRequest withTagKeyExists(Consumer<List<String>> tagKeyExistsSetter) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        tagKeyExistsSetter.accept(this.tagKeyExists);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签名称的资源。 **约束限制：** 支持批量查询多个标签名，最多支持10个标签。 **取值范围：** 最小数量 1，最大数量 10。 **默认取值：** 不涉及。 
     * @return tagKeyExists
     */
    public List<String> getTagKeyExists() {
        return tagKeyExists;
    }

    public void setTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
    }

    public ListCustomModelProvidersRequest withTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    public ListCustomModelProvidersRequest addTagKeyMatchesItem(String tagKeyMatchesItem) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        this.tagKeyMatches.add(tagKeyMatchesItem);
        return this;
    }

    public ListCustomModelProvidersRequest withTagKeyMatches(Consumer<List<String>> tagKeyMatchesSetter) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        tagKeyMatchesSetter.accept(this.tagKeyMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串。 **约束限制：** 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复。 **取值范围：** 最小数量 1，最大数量 10。 **默认取值：** 不涉及。 
     * @return tagKeyMatches
     */
    public List<String> getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListCustomModelProvidersRequest withTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    public ListCustomModelProvidersRequest addTagValueMatchesItem(String tagValueMatchesItem) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        this.tagValueMatches.add(tagValueMatchesItem);
        return this;
    }

    public ListCustomModelProvidersRequest withTagValueMatches(Consumer<List<String>> tagValueMatchesSetter) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        tagValueMatchesSetter.accept(this.tagValueMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签的资源，需要和tag_key_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，支持空字符串。 **约束限制：** 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复。 **取值范围：** 最小数量 1，最大数量 10。 **默认取值：** 不涉及。 
     * @return tagValueMatches
     */
    public List<String> getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListCustomModelProvidersRequest withTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释：** 标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的交集。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的并集。 **约束限制：** 不涉及。 **取值范围：** 允许的值为： - ALL - ANY **默认取值：** ALL 
     * @return tagMatchPolicy
     */
    public TagMatchPolicyEnum getTagMatchPolicy() {
        return tagMatchPolicy;
    }

    public void setTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
    }

    public ListCustomModelProvidersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回的最大结果数。 **约束限制：** 不涉及。 **取值范围：** 整数类型，取值为1-100。 **默认取值：** 50 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCustomModelProvidersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 返回结果偏移量。 **约束限制：** 不涉及。 **取值范围：** 整数类型，取值为0-100000。 **默认取值：** 0 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomModelProvidersRequest that = (ListCustomModelProvidersRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomModelProvidersRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tagKeyExists: ").append(toIndentedString(tagKeyExists)).append("\n");
        sb.append("    tagKeyMatches: ").append(toIndentedString(tagKeyMatches)).append("\n");
        sb.append("    tagValueMatches: ").append(toIndentedString(tagValueMatches)).append("\n");
        sb.append("    tagMatchPolicy: ").append(toIndentedString(tagMatchPolicy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
