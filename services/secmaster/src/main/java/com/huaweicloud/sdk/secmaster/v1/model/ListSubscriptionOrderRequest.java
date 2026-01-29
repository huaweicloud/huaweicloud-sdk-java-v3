package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListSubscriptionOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 订单资源详情信息枚举，DEFAULT:默认缺省值，获取开通的资源列表，不包含套餐包；PURCHASE：在DEFAULT基础上返回租户名下ECS数量；RESOURCE_LIST在DEFAULT基础上返回套餐包列表；USAGE：返回资源用量信息；SMN：返回已订阅的smn topic列表
     */
    public static final class PageEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final PageEnum DEFAULT = new PageEnum("DEFAULT");

        /**
         * Enum PURCHASE for value: "PURCHASE"
         */
        public static final PageEnum PURCHASE = new PageEnum("PURCHASE");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final PageEnum SMN = new PageEnum("SMN");

        /**
         * Enum USAGE for value: "USAGE"
         */
        public static final PageEnum USAGE = new PageEnum("USAGE");

        /**
         * Enum RESOURCE_LIST for value: "RESOURCE_LIST"
         */
        public static final PageEnum RESOURCE_LIST = new PageEnum("RESOURCE_LIST");

        private static final Map<String, PageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PageEnum> createStaticFields() {
            Map<String, PageEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("PURCHASE", PURCHASE);
            map.put("SMN", SMN);
            map.put("USAGE", USAGE);
            map.put("RESOURCE_LIST", RESOURCE_LIST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PageEnum(String value) {
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
        public static PageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PageEnum(value));
        }

        public static PageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PageEnum) {
                return this.value.equals(((PageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private PageEnum page;

    public ListSubscriptionOrderRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 用户当前语言环境
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListSubscriptionOrderRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * smn订阅偏移量
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSubscriptionOrderRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * smn订阅返回数量
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

    public ListSubscriptionOrderRequest withPage(PageEnum page) {
        this.page = page;
        return this;
    }

    /**
     * 订单资源详情信息枚举，DEFAULT:默认缺省值，获取开通的资源列表，不包含套餐包；PURCHASE：在DEFAULT基础上返回租户名下ECS数量；RESOURCE_LIST在DEFAULT基础上返回套餐包列表；USAGE：返回资源用量信息；SMN：返回已订阅的smn topic列表
     * @return page
     */
    public PageEnum getPage() {
        return page;
    }

    public void setPage(PageEnum page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionOrderRequest that = (ListSubscriptionOrderRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, offset, limit, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionOrderRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
