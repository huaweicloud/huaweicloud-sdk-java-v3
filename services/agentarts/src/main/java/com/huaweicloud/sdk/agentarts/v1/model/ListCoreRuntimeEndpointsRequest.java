package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class ListCoreRuntimeEndpointsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private UUID runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

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
     * **参数解释**：  标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 **约束限制**: 不涉及。 **取值范围**： - ALL - ANY **默认取值**: ALL
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

    public ListCoreRuntimeEndpointsRequest withRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * 运行时ID，用于唯一标识一个Agent运行时实例。
     * @return runtimeId
     */
    public UUID getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
    }

    public ListCoreRuntimeEndpointsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：  分页起始页码，默认值为1。 **约束限制**: 不涉及。 **取值范围**： 1 - 1000 **默认取值**: 1
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCoreRuntimeEndpointsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：  每页记录数，默认值为10。 **约束限制**: 不涉及。 **取值范围**： 10 - 100 **默认取值**: 10
     * minimum: 10
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCoreRuntimeEndpointsRequest withTagKeyExists(String tagKeyExists) {
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

    public ListCoreRuntimeEndpointsRequest withTagKeyMatches(String tagKeyMatches) {
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

    public ListCoreRuntimeEndpointsRequest withTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_key_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串, 如：tag_key_matches=env&tag_value_matches=prod。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。 **取值范围**： 最小数量 1，最大数量 10 **默认取值**: 不涉及。
     * @return tagValueMatches
     */
    public String getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(String tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListCoreRuntimeEndpointsRequest withTagMatchPolicy(TagMatchPolicyEnum tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释**：  标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 **约束限制**: 不涉及。 **取值范围**： - ALL - ANY **默认取值**: ALL
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
        ListCoreRuntimeEndpointsRequest that = (ListCoreRuntimeEndpointsRequest) obj;
        return Objects.equals(this.runtimeId, that.runtimeId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeId, offset, limit, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreRuntimeEndpointsRequest {\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
