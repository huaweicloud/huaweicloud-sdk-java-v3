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
 * CcCondition
 */
public class CcCondition {

    /**
     * 字段类型
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
         * Enum IPV6 for value: "ipv6"
         */
        public static final CategoryEnum IPV6 = new CategoryEnum("ipv6");

        /**
         * Enum ASN for value: "asn"
         */
        public static final CategoryEnum ASN = new CategoryEnum("asn");

        /**
         * Enum PARAMS for value: "params"
         */
        public static final CategoryEnum PARAMS = new CategoryEnum("params");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final CategoryEnum COOKIE = new CategoryEnum("cookie");

        /**
         * Enum REFERER for value: "referer"
         */
        public static final CategoryEnum REFERER = new CategoryEnum("referer");

        /**
         * Enum USER_AGENT for value: "user-agent"
         */
        public static final CategoryEnum USER_AGENT = new CategoryEnum("user-agent");

        /**
         * Enum HEADER for value: "header"
         */
        public static final CategoryEnum HEADER = new CategoryEnum("header");

        /**
         * Enum RESPONSE_CODE for value: "response_code"
         */
        public static final CategoryEnum RESPONSE_CODE = new CategoryEnum("response_code");

        /**
         * Enum RESPONSE_HEADER for value: "response_header"
         */
        public static final CategoryEnum RESPONSE_HEADER = new CategoryEnum("response_header");

        /**
         * Enum RESPONSE_BODY for value: "response_body"
         */
        public static final CategoryEnum RESPONSE_BODY = new CategoryEnum("response_body");

        /**
         * Enum REQUEST_BODY for value: "request_body"
         */
        public static final CategoryEnum REQUEST_BODY = new CategoryEnum("request_body");

        /**
         * Enum METHOD for value: "method"
         */
        public static final CategoryEnum METHOD = new CategoryEnum("method");

        /**
         * Enum TLS_FINGERPRINT for value: "tls_fingerprint"
         */
        public static final CategoryEnum TLS_FINGERPRINT = new CategoryEnum("tls_fingerprint");

        /**
         * Enum TLS_JA3_FINGERPRINT for value: "tls_ja3_fingerprint"
         */
        public static final CategoryEnum TLS_JA3_FINGERPRINT = new CategoryEnum("tls_ja3_fingerprint");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("url", URL);
            map.put("ip", IP);
            map.put("ipv6", IPV6);
            map.put("asn", ASN);
            map.put("params", PARAMS);
            map.put("cookie", COOKIE);
            map.put("referer", REFERER);
            map.put("user-agent", USER_AGENT);
            map.put("header", HEADER);
            map.put("response_code", RESPONSE_CODE);
            map.put("response_header", RESPONSE_HEADER);
            map.put("response_body", RESPONSE_BODY);
            map.put("request_body", REQUEST_BODY);
            map.put("method", METHOD);
            map.put("tls_fingerprint", TLS_FINGERPRINT);
            map.put("tls_ja3_fingerprint", TLS_JA3_FINGERPRINT);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    public CcCondition withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 字段类型
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CcCondition withLogicOperation(String logicOperation) {
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

    public CcCondition withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public CcCondition addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CcCondition withContents(Consumer<List<String>> contentsSetter) {
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

    public CcCondition withValueListId(String valueListId) {
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

    public CcCondition withIndex(String index) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CcCondition that = (CcCondition) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.logicOperation, that.logicOperation)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.valueListId, that.valueListId)
            && Objects.equals(this.index, that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, logicOperation, contents, valueListId, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcCondition {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    logicOperation: ").append(toIndentedString(logicOperation)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    valueListId: ").append(toIndentedString(valueListId)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
