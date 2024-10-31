package com.huaweicloud.sdk.edgesec.v2.model;

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
 * 防护规则条件
 */
public class HttpCcRuleCondition {

    /**
     * 防护规则字段
     */
    public static final class CategoryEnum {

        /**
         * Enum URL for value: "url"
         */
        public static final CategoryEnum URL = new CategoryEnum("url");

        /**
         * Enum IP for value: "ip"
         */
        public static final CategoryEnum IP = new CategoryEnum("ip");

        /**
         * Enum PARAMS for value: "params"
         */
        public static final CategoryEnum PARAMS = new CategoryEnum("params");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final CategoryEnum COOKIE = new CategoryEnum("cookie");

        /**
         * Enum HEADER for value: "header"
         */
        public static final CategoryEnum HEADER = new CategoryEnum("header");

        /**
         * Enum CUSTOM_GEOIP for value: "custom_geoip"
         */
        public static final CategoryEnum CUSTOM_GEOIP = new CategoryEnum("custom_geoip");

        /**
         * Enum RESPONSE_CODE for value: "response_code"
         */
        public static final CategoryEnum RESPONSE_CODE = new CategoryEnum("response_code");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("ip", IP);
            map.put("params", PARAMS);
            map.put("cookie", COOKIE);
            map.put("header", HEADER);
            map.put("custom_geoip", CUSTOM_GEOIP);
            map.put("response_code", RESPONSE_CODE);
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
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operation")

    private String logicOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_list_id")

    private String valueListId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_indexes_logic")

    private Integer checkAllIndexesLogic;

    public HttpCcRuleCondition withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 防护规则字段
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public HttpCcRuleCondition withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 子字段，当字段类型（category）选择“params”、“cookie”、“header”时，请根据实际需求配置子字段且该参数必填。
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public HttpCcRuleCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public HttpCcRuleCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public HttpCcRuleCondition withContents(Consumer<List<String>> contentsSetter) {
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

    public HttpCcRuleCondition withLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
        return this;
    }

    /**
     * 条件列表匹配逻辑。   -  如果字段类型category是url， 匹配逻辑可以为：contain、 not_contain、 equal、 not_equal、 prefix、 not_prefix、 suffix、 not_suffix、 contain_any、 not_contain_all、 equal_any、 not_equal_all、 equal_any、 not_equal_all、 prefix_any、 not_prefix_all、 suffix_any、 not_suffix_all、 len_greater、 len_less、len_equal或者len_not_equal   - 如果字段类型category是ip或者ipv6，匹配逻辑可以为： equal、not_equal、equal_any或者not_equal_all   - 如果字段类型category是params、cookie或者header, 匹配逻辑可以为：contain、 not_contain、 equal、 not_equal、 prefix、 not_prefix、 suffix、 not_suffix、 contain_any、 not_contain_all、 equal_any、not_equal_all、 equal_any、 not_equal_all、 prefix_any、 not_prefix_all、 suffix_any、 not_suffix_all、 len_greater、 len_less、len_equal、len_not_equal、、num_greater、num_less、num_equal、num_not_equal、exist或者not_exist
     * @return logicOperation
     */
    public String getLogicOperation() {
        return logicOperation;
    }

    public void setLogicOperation(String logicOperation) {
        this.logicOperation = logicOperation;
    }

    public HttpCcRuleCondition withValueListId(String valueListId) {
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

    public HttpCcRuleCondition withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 若防护规则涉及阈值，即使用该字段
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public HttpCcRuleCondition withCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
        return this;
    }

    /**
     * - 1：所有子字段 - 2：任意子字段 
     * @return checkAllIndexesLogic
     */
    public Integer getCheckAllIndexesLogic() {
        return checkAllIndexesLogic;
    }

    public void setCheckAllIndexesLogic(Integer checkAllIndexesLogic) {
        this.checkAllIndexesLogic = checkAllIndexesLogic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpCcRuleCondition that = (HttpCcRuleCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.index, that.index)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.logicOperation, that.logicOperation)
            && Objects.equals(this.valueListId, that.valueListId) && Objects.equals(this.size, that.size)
            && Objects.equals(this.checkAllIndexesLogic, that.checkAllIndexesLogic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, index, contents, logicOperation, valueListId, size, checkAllIndexesLogic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpCcRuleCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    checkAllIndexesLogic: ").append(toIndentedString(checkAllIndexesLogic)).append("\n");
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
