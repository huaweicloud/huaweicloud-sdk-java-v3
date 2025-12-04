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
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：**  - url  - user-agent  **默认取值：** 不涉及
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private String logicOperation;

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
     * **参数解释：** 字段类型 **约束限制：** 不涉及 **取值范围：**  - url  - user-agent  **默认取值：** 不涉及
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public AnticrawlerCondition withLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * 条件列表匹配逻辑, 包括：contain、not_contain、equal、not_equal、prefix、not_prefix、suffix、not_suffix、contain_any、not_contain_all、equal_any、not_equal_all、prefix_any、not_prefix_all、suffix_any、not_suffix_all
     * @return logicOperation
     */
    public String getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(String logicOperation) {
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
     * 条件列表逻辑匹配内容。当logic_operation参数不以any或者all结尾时，需要传该参数。
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
     * 引用表id。当logic_operation参数以any或者all结尾时，需要传该参数。此外，引用表类型要与category类型保持一致。
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
