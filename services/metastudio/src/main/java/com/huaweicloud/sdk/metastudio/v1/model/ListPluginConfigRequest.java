package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListPluginConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")

    private String xAppUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 插件供应商  * BOCHA:博查  * AMAP_WEATHER：高德天气
     */
    public static final class PluginProviderEnum {

        /**
         * Enum BOCHA for value: "BOCHA"
         */
        public static final PluginProviderEnum BOCHA = new PluginProviderEnum("BOCHA");

        /**
         * Enum AMAP_WEATHER for value: "AMAP_WEATHER"
         */
        public static final PluginProviderEnum AMAP_WEATHER = new PluginProviderEnum("AMAP_WEATHER");

        private static final Map<String, PluginProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginProviderEnum> createStaticFields() {
            Map<String, PluginProviderEnum> map = new HashMap<>();
            map.put("BOCHA", BOCHA);
            map.put("AMAP_WEATHER", AMAP_WEATHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PluginProviderEnum(String value) {
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
        public static PluginProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginProviderEnum(value));
        }

        public static PluginProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PluginProviderEnum) {
                return this.value.equals(((PluginProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_provider")

    private PluginProviderEnum pluginProvider;

    /**
     * 插件类型  * WEATHER_QUERY：天气查询  * WEB_SEARCH：网络搜索
     */
    public static final class PluginTypeEnum {

        /**
         * Enum WEATHER_QUERY for value: "WEATHER_QUERY"
         */
        public static final PluginTypeEnum WEATHER_QUERY = new PluginTypeEnum("WEATHER_QUERY");

        /**
         * Enum WEB_SEARCH for value: "WEB_SEARCH"
         */
        public static final PluginTypeEnum WEB_SEARCH = new PluginTypeEnum("WEB_SEARCH");

        private static final Map<String, PluginTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginTypeEnum> createStaticFields() {
            Map<String, PluginTypeEnum> map = new HashMap<>();
            map.put("WEATHER_QUERY", WEATHER_QUERY);
            map.put("WEB_SEARCH", WEB_SEARCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PluginTypeEnum(String value) {
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
        public static PluginTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginTypeEnum(value));
        }

        public static PluginTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PluginTypeEnum) {
                return this.value.equals(((PluginTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_type")

    private PluginTypeEnum pluginType;

    public ListPluginConfigRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带的鉴权信息。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public ListPluginConfigRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，请求的发生时间。
     * @return xSdkDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public ListPluginConfigRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 使用AK/SK方式认证时必选，携带项目ID信息。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListPluginConfigRequest withXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
        return this;
    }

    /**
     * 第三方用户ID。不允许输入中文。
     * @return xAppUserId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-App-UserId")
    public String getXAppUserId() {
        return xAppUserId;
    }

    public void setXAppUserId(String xAppUserId) {
        this.xAppUserId = xAppUserId;
    }

    public ListPluginConfigRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPluginConfigRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
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

    public ListPluginConfigRequest withPluginProvider(PluginProviderEnum pluginProvider) {
        this.pluginProvider = pluginProvider;
        return this;
    }

    /**
     * 插件供应商  * BOCHA:博查  * AMAP_WEATHER：高德天气
     * @return pluginProvider
     */
    public PluginProviderEnum getPluginProvider() {
        return pluginProvider;
    }

    public void setPluginProvider(PluginProviderEnum pluginProvider) {
        this.pluginProvider = pluginProvider;
    }

    public ListPluginConfigRequest withPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * 插件类型  * WEATHER_QUERY：天气查询  * WEB_SEARCH：网络搜索
     * @return pluginType
     */
    public PluginTypeEnum getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginConfigRequest that = (ListPluginConfigRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xSdkDate, that.xSdkDate)
            && Objects.equals(this.xProjectId, that.xProjectId) && Objects.equals(this.xAppUserId, that.xAppUserId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pluginProvider, that.pluginProvider)
            && Objects.equals(this.pluginType, that.pluginType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, xAppUserId, offset, limit, pluginProvider, pluginType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginConfigRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xAppUserId: ").append(toIndentedString(xAppUserId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pluginProvider: ").append(toIndentedString(pluginProvider)).append("\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
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
