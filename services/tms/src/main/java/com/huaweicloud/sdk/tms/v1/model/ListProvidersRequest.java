package com.huaweicloud.sdk.tms.v1.model;

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
public class ListProvidersRequest {

    /**
     * 指定显示语言
     */
    public static final class LocaleEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final LocaleEnum ZH_CN = new LocaleEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final LocaleEnum EN_US = new LocaleEnum("en-us");

        private static final Map<String, LocaleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocaleEnum> createStaticFields() {
            Map<String, LocaleEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocaleEnum(String value) {
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
        public static LocaleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LocaleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LocaleEnum(value);
            }
            return result;
        }

        public static LocaleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LocaleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocaleEnum) {
                return this.value.equals(((LocaleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private LocaleEnum locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    public ListProvidersRequest withLocale(LocaleEnum locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 指定显示语言
     * @return locale
     */
    public LocaleEnum getLocale() {
        return locale;
    }

    public void setLocale(LocaleEnum locale) {
        this.locale = locale;
    }

    public ListProvidersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数默认为200，limit最多为200, 最小值为1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProvidersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，从offset指定的下一条数据开始查询，必须为数字，不能为负数，默认为0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProvidersRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProvidersRequest listProvidersRequest = (ListProvidersRequest) o;
        return Objects.equals(this.locale, listProvidersRequest.locale)
            && Objects.equals(this.limit, listProvidersRequest.limit)
            && Objects.equals(this.offset, listProvidersRequest.offset)
            && Objects.equals(this.provider, listProvidersRequest.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, limit, offset, provider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvidersRequest {\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
