package com.huaweicloud.sdk.waf.v1.model;

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
 * AnticrawlerCondition
 */
public class AnticrawlerCondition {

    /**
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：**  - url  - user-agent **默认取值：** 不涉及
     */
    public static final class CategoryEnum {

        /**
         * Enum URL for value: "url"
         */
        public static final CategoryEnum URL = new CategoryEnum("url");

        /**
         * Enum USER_AGENT for value: "user-agent"
         */
        public static final CategoryEnum USER_AGENT = new CategoryEnum("user-agent");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("user-agent", USER_AGENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    /**
     * **参数解释：** 条件列表匹配逻辑 **约束限制：** 不涉及 **取值范围：** - contain_any: 包含任意一个 - not_contain_all: 不包含全部 - equal_any: 等于任意一个 - not_equal_all: 不等于全部 - prefix_any: 前缀匹配任意一个 - not_prefix_all: 前缀不匹配全部 - suffix_any: 后缀匹配任意一个 - not_suffix_all: 后缀不匹配全部 - contain: 包含 - not_contain: 不包含 - equal: 等于 - not_equal: 不等于 - prefix: 前缀匹配 - not_prefix: 前缀不匹配 - suffix: 后缀匹配 - not_suffix: 后缀不匹配 - len_equal: 长度等于 - len_not_equal: 长度不等于 - len_greater: 长度大于 - len_less: 长度小于 - len_greater_equal: 长度大于等于 - len_less_equal: 长度小于等于 - regular_match: 正则匹配 - regular_not_match: 正则不匹配 **默认取值：** 不涉及
     */
    public static final class LogicOperationEnum {

        /**
         * Enum CONTAIN_ANY for value: "contain_any"
         */
        public static final LogicOperationEnum CONTAIN_ANY = new LogicOperationEnum("contain_any");

        /**
         * Enum NOT_CONTAIN_ALL for value: "not_contain_all"
         */
        public static final LogicOperationEnum NOT_CONTAIN_ALL = new LogicOperationEnum("not_contain_all");

        /**
         * Enum EQUAL_ANY for value: "equal_any"
         */
        public static final LogicOperationEnum EQUAL_ANY = new LogicOperationEnum("equal_any");

        /**
         * Enum NOT_EQUAL_ALL for value: "not_equal_all"
         */
        public static final LogicOperationEnum NOT_EQUAL_ALL = new LogicOperationEnum("not_equal_all");

        /**
         * Enum PREFIX_ANY for value: "prefix_any"
         */
        public static final LogicOperationEnum PREFIX_ANY = new LogicOperationEnum("prefix_any");

        /**
         * Enum NOT_PREFIX_ALL for value: "not_prefix_all"
         */
        public static final LogicOperationEnum NOT_PREFIX_ALL = new LogicOperationEnum("not_prefix_all");

        /**
         * Enum SUFFIX_ANY for value: "suffix_any"
         */
        public static final LogicOperationEnum SUFFIX_ANY = new LogicOperationEnum("suffix_any");

        /**
         * Enum NOT_SUFFIX_ALL for value: "not_suffix_all"
         */
        public static final LogicOperationEnum NOT_SUFFIX_ALL = new LogicOperationEnum("not_suffix_all");

        /**
         * Enum CONTAIN for value: "contain"
         */
        public static final LogicOperationEnum CONTAIN = new LogicOperationEnum("contain");

        /**
         * Enum NOT_CONTAIN for value: "not_contain"
         */
        public static final LogicOperationEnum NOT_CONTAIN = new LogicOperationEnum("not_contain");

        /**
         * Enum EQUAL for value: "equal"
         */
        public static final LogicOperationEnum EQUAL = new LogicOperationEnum("equal");

        /**
         * Enum NOT_EQUAL for value: "not_equal"
         */
        public static final LogicOperationEnum NOT_EQUAL = new LogicOperationEnum("not_equal");

        /**
         * Enum PREFIX for value: "prefix"
         */
        public static final LogicOperationEnum PREFIX = new LogicOperationEnum("prefix");

        /**
         * Enum NOT_PREFIX for value: "not_prefix"
         */
        public static final LogicOperationEnum NOT_PREFIX = new LogicOperationEnum("not_prefix");

        /**
         * Enum SUFFIX for value: "suffix"
         */
        public static final LogicOperationEnum SUFFIX = new LogicOperationEnum("suffix");

        /**
         * Enum NOT_SUFFIX for value: "not_suffix"
         */
        public static final LogicOperationEnum NOT_SUFFIX = new LogicOperationEnum("not_suffix");

        /**
         * Enum LEN_EQUAL for value: "len_equal"
         */
        public static final LogicOperationEnum LEN_EQUAL = new LogicOperationEnum("len_equal");

        /**
         * Enum LEN_NOT_EQUAL for value: "len_not_equal"
         */
        public static final LogicOperationEnum LEN_NOT_EQUAL = new LogicOperationEnum("len_not_equal");

        /**
         * Enum LEN_GREATER for value: "len_greater"
         */
        public static final LogicOperationEnum LEN_GREATER = new LogicOperationEnum("len_greater");

        /**
         * Enum LEN_LESS for value: "len_less"
         */
        public static final LogicOperationEnum LEN_LESS = new LogicOperationEnum("len_less");

        /**
         * Enum LEN_GREATER_EQUAL for value: "len_greater_equal"
         */
        public static final LogicOperationEnum LEN_GREATER_EQUAL = new LogicOperationEnum("len_greater_equal");

        /**
         * Enum LEN_LESS_EQUAL for value: "len_less_equal"
         */
        public static final LogicOperationEnum LEN_LESS_EQUAL = new LogicOperationEnum("len_less_equal");

        /**
         * Enum REGULAR_MATCH for value: "regular_match"
         */
        public static final LogicOperationEnum REGULAR_MATCH = new LogicOperationEnum("regular_match");

        /**
         * Enum REGULAR_NOT_MATCH for value: "regular_not_match"
         */
        public static final LogicOperationEnum REGULAR_NOT_MATCH = new LogicOperationEnum("regular_not_match");

        private static final Map<String, LogicOperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogicOperationEnum> createStaticFields() {
            Map<String, LogicOperationEnum> map = new HashMap<>();
            map.put("contain_any", CONTAIN_ANY);
            map.put("not_contain_all", NOT_CONTAIN_ALL);
            map.put("equal_any", EQUAL_ANY);
            map.put("not_equal_all", NOT_EQUAL_ALL);
            map.put("prefix_any", PREFIX_ANY);
            map.put("not_prefix_all", NOT_PREFIX_ALL);
            map.put("suffix_any", SUFFIX_ANY);
            map.put("not_suffix_all", NOT_SUFFIX_ALL);
            map.put("contain", CONTAIN);
            map.put("not_contain", NOT_CONTAIN);
            map.put("equal", EQUAL);
            map.put("not_equal", NOT_EQUAL);
            map.put("prefix", PREFIX);
            map.put("not_prefix", NOT_PREFIX);
            map.put("suffix", SUFFIX);
            map.put("not_suffix", NOT_SUFFIX);
            map.put("len_equal", LEN_EQUAL);
            map.put("len_not_equal", LEN_NOT_EQUAL);
            map.put("len_greater", LEN_GREATER);
            map.put("len_less", LEN_LESS);
            map.put("len_greater_equal", LEN_GREATER_EQUAL);
            map.put("len_less_equal", LEN_LESS_EQUAL);
            map.put("regular_match", REGULAR_MATCH);
            map.put("regular_not_match", REGULAR_NOT_MATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogicOperationEnum(String value) {
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
        public static LogicOperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogicOperationEnum(value));
        }

        public static LogicOperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogicOperationEnum) {
                return this.value.equals(((LogicOperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private LogicOperationEnum logicOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_id")

    private String valueListId;

    public AnticrawlerCondition withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：**  - url  - user-agent **默认取值：** 不涉及
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public AnticrawlerCondition withLogicOperation(LogicOperationEnum logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * **参数解释：** 条件列表匹配逻辑 **约束限制：** 不涉及 **取值范围：** - contain_any: 包含任意一个 - not_contain_all: 不包含全部 - equal_any: 等于任意一个 - not_equal_all: 不等于全部 - prefix_any: 前缀匹配任意一个 - not_prefix_all: 前缀不匹配全部 - suffix_any: 后缀匹配任意一个 - not_suffix_all: 后缀不匹配全部 - contain: 包含 - not_contain: 不包含 - equal: 等于 - not_equal: 不等于 - prefix: 前缀匹配 - not_prefix: 前缀不匹配 - suffix: 后缀匹配 - not_suffix: 后缀不匹配 - len_equal: 长度等于 - len_not_equal: 长度不等于 - len_greater: 长度大于 - len_less: 长度小于 - len_greater_equal: 长度大于等于 - len_less_equal: 长度小于等于 - regular_match: 正则匹配 - regular_not_match: 正则不匹配 **默认取值：** 不涉及
     * @return logicOperation
     */
    public LogicOperationEnum getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(LogicOperationEnum logicOperation) {
        this.logicOperation = logicOperation;
    }

    public AnticrawlerCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public AnticrawlerCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public AnticrawlerCondition withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * **参数解释：** 条件列表逻辑匹配内容 **约束限制：** 当logic_operation参数不以any或者all结尾时，需要传该参数；仅支持单个匹配内容 **取值范围：** 匹配内容字符串长度范围：[1, 4096] **默认取值：** 不涉及
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public AnticrawlerCondition withValueListId(String valueListId) {
        this.valueListId = valueListId;
        return this;
    }

    /**
     * **参数解释：** 引用表ID **约束限制：** 当logic_operation参数以any或者all结尾时，需要传该参数；引用表类型要与category类型保持一致 **取值范围：** 通过ListValueList接口获取引用表ID **默认取值：** 不涉及
     * @return valueListId
     */
    public String getValueListId() {
        return valueListId;
    }

    public void setValueListId(String valueListId) {
        this.valueListId = valueListId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnticrawlerCondition that = (AnticrawlerCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.logicOperation, that.logicOperation)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.valueListId, that.valueListId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, logicOperation, contents, valueListId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnticrawlerCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
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
