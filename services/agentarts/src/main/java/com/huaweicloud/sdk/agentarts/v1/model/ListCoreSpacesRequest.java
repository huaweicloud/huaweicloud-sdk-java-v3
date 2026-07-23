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
public class ListCoreSpacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

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
     * **参数解释**：  标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 **约束限制**: 不涉及。 **取值范围**： 长度为1-3个字符。允许的值为： - ALL - ANY **默认取值**: ALL
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

    public ListCoreSpacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 每页返回的记录数量（条），用于分页查询。 **约束限制：** 不涉及。 **取值范围：** 1-100。 **默认取值：** 20。 
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

    public ListCoreSpacesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 查询游标，即偏移量（条），用于分页查询时指定起始位置，从0开始。 **约束限制：** 不涉及。 **取值范围：** 0-100000。 **默认取值：** 0。 
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

    public ListCoreSpacesRequest withTagKeyExists(String tagKeyExists) {
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

    public ListCoreSpacesRequest withTagKeyMatches(String tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串, 如：tag_key_matches=env&tag_key_matches=team。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。 **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagKeyMatches
     */
    public String getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(String tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListCoreSpacesRequest withTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_key_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串,  如：tag_key_matches=env&tag_value_matches=prod。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。 **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagValueMatches
     */
    public String getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListCoreSpacesRequest withTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释**：  标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 **约束限制**: 不涉及。 **取值范围**： 长度为1-3个字符。允许的值为： - ALL - ANY **默认取值**: ALL
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
        ListCoreSpacesRequest that = (ListCoreSpacesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreSpacesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
