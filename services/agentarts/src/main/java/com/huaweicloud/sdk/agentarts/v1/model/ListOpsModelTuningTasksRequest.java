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
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListOpsModelTuningTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释：** 任务状态，用于根据状态筛选任务。  **约束限制：** 不涉及  **取值范围：** draft草稿态，training训练中，stopped已停止，success成功，fail失败。  **默认取值：** 无
     */
    public static final class StatusEnum {

        /**
         * Enum DRAFT for value: "draft"
         */
        public static final StatusEnum DRAFT = new StatusEnum("draft");

        /**
         * Enum TRAINING for value: "training"
         */
        public static final StatusEnum TRAINING = new StatusEnum("training");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StatusEnum STOPPED = new StatusEnum("stopped");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("draft", DRAFT);
            map.put("training", TRAINING);
            map.put("stopped", STOPPED);
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_exists")

    private List<String> tagKeyExists = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_matches")

    private List<String> tagKeyMatches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value_matches")

    private List<String> tagValueMatches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_match_policy")

    private String tagMatchPolicy;

    public ListOpsModelTuningTasksRequest withOffset(Integer offset) {
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

    public ListOpsModelTuningTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 限制数量。 **约束限制：** 不涉及。 **取值范围：** 正整数，最大值100。 **默认取值：** 100。
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

    public ListOpsModelTuningTasksRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 任务名称，用于根据名称关键词筛选任务。  **约束限制：** 支持包含匹配的模糊搜索。  **取值范围：** 长度0-64个字符。  **默认取值：** 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListOpsModelTuningTasksRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 任务状态，用于根据状态筛选任务。  **约束限制：** 不涉及  **取值范围：** draft草稿态，training训练中，stopped已停止，success成功，fail失败。  **默认取值：** 无
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListOpsModelTuningTasksRequest withTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
        return this;
    }

    public ListOpsModelTuningTasksRequest addTagKeyExistsItem(String tagKeyExistsItem) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        this.tagKeyExists.add(tagKeyExistsItem);
        return this;
    }

    public ListOpsModelTuningTasksRequest withTagKeyExists(Consumer<List<String>> tagKeyExistsSetter) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        tagKeyExistsSetter.accept(this.tagKeyExists);
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签名称的资源。 **约束限制**: 支持批量查询多个标签名，最多支持10个标签。 **取值范围**： 最小数量 0，最大数量 10 **默认取值**: 不涉及。
     * @return tagKeyExists
     */
    public List<String> getTagKeyExists() {
        return tagKeyExists;
    }

    public void setTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
    }

    public ListOpsModelTuningTasksRequest withTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    public ListOpsModelTuningTasksRequest addTagKeyMatchesItem(String tagKeyMatchesItem) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        this.tagKeyMatches.add(tagKeyMatchesItem);
        return this;
    }

    public ListOpsModelTuningTasksRequest withTagKeyMatches(Consumer<List<String>> tagKeyMatchesSetter) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        tagKeyMatchesSetter.accept(this.tagKeyMatches);
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，不支持空字符串。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复. **取值范围**： 最小数量0，最大数量 10 **默认取值**: 不涉及。
     * @return tagKeyMatches
     */
    public List<String> getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListOpsModelTuningTasksRequest withTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    public ListOpsModelTuningTasksRequest addTagValueMatchesItem(String tagValueMatchesItem) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        this.tagValueMatches.add(tagValueMatchesItem);
        return this;
    }

    public ListOpsModelTuningTasksRequest withTagValueMatches(Consumer<List<String>> tagValueMatchesSetter) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        tagValueMatchesSetter.accept(this.tagValueMatches);
        return this;
    }

    /**
     * **参数解释**：  需要匹配的包含该标签的资源，需要和tag_key_matches条件配合使用，tag_key_matches和tag_value_matches的元素个数需要一致，且标签顺序需要完全匹配，支持空字符串。 **约束限制**: 支持批量查询多个标签，最多支持10个标签。tag_key_matches和tag_value_matches键值对不可重复. **取值范围**： 最小数量 0，最大数量 10 **默认取值**: 不涉及。
     * @return tagValueMatches
     */
    public List<String> getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListOpsModelTuningTasksRequest withTagMatchPolicy(String tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释**: 标签匹配模式，仅针对tag_key_exists，tag_key_matches，tag_value_matches参数生效。 - ALL: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的所有元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含所有tag_key_matches以及tag_value_matches参数中指定的key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的交集  - ANY: 若请求中包含tag_key_exists参数，查询规则为资源标签需要包含tag_key_exists中的任意一个元素，若请求中tag_key_matches以及tag_value_matches参数存在，查询规则为资源标签需要包含tag_key_matches以及tag_value_matches参数中任意一个key-value对应的标签。 三个参数都存在时，取tag_key_exists和tag_key_matches，tag_value_matches的并集 **约束限制**: 不涉及。 **取值范围**： 长度为1-3个字符。允许的值为： - ALL - ANY **默认取值**: ALL
     * @return tagMatchPolicy
     */
    public String getTagMatchPolicy() {
        return tagMatchPolicy;
    }

    public void setTagMatchPolicy(String tagMatchPolicy) {
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
        ListOpsModelTuningTasksRequest that = (ListOpsModelTuningTasksRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, name, status, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsModelTuningTasksRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
