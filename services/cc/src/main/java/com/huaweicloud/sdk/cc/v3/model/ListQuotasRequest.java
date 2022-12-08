package com.huaweicloud.sdk.cc.v3.model;

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
public class ListQuotasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 配额类型： - cloud_connection: 可加载的云连接实例数 - cloud_connection_region: 某云连接实例下可加载的Region数 - cloud_connection_route: 某云连接实例下可加载的路由数 - region_network_instance: 某云连接实例下某个Region下可加载的网络实例数
     */
    public static final class QuotaTypeEnum {

        /**
         * Enum CLOUD_CONNECTION for value: "cloud_connection"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION = new QuotaTypeEnum("cloud_connection");

        /**
         * Enum CLOUD_CONNECTION_REGION for value: "cloud_connection_region"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION_REGION = new QuotaTypeEnum("cloud_connection_region");

        /**
         * Enum CLOUD_CONNECTION_ROUTE for value: "cloud_connection_route"
         */
        public static final QuotaTypeEnum CLOUD_CONNECTION_ROUTE = new QuotaTypeEnum("cloud_connection_route");

        /**
         * Enum REGION_NETWORK_INSTANCE for value: "region_network_instance"
         */
        public static final QuotaTypeEnum REGION_NETWORK_INSTANCE = new QuotaTypeEnum("region_network_instance");

        private static final Map<String, QuotaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QuotaTypeEnum> createStaticFields() {
            Map<String, QuotaTypeEnum> map = new HashMap<>();
            map.put("cloud_connection", CLOUD_CONNECTION);
            map.put("cloud_connection_region", CLOUD_CONNECTION_REGION);
            map.put("cloud_connection_route", CLOUD_CONNECTION_ROUTE);
            map.put("region_network_instance", REGION_NETWORK_INSTANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QuotaTypeEnum(String value) {
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
        public static QuotaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QuotaTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QuotaTypeEnum(value);
            }
            return result;
        }

        public static QuotaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QuotaTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QuotaTypeEnum) {
                return this.value.equals(((QuotaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    private QuotaTypeEnum quotaType;

    public ListQuotasRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时，每页返回的个数。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListQuotasRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询时，上一页最后一条记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListQuotasRequest withQuotaType(QuotaTypeEnum quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * 配额类型： - cloud_connection: 可加载的云连接实例数 - cloud_connection_region: 某云连接实例下可加载的Region数 - cloud_connection_route: 某云连接实例下可加载的路由数 - region_network_instance: 某云连接实例下某个Region下可加载的网络实例数
     * @return quotaType
     */
    public QuotaTypeEnum getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(QuotaTypeEnum quotaType) {
        this.quotaType = quotaType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQuotasRequest listQuotasRequest = (ListQuotasRequest) o;
        return Objects.equals(this.limit, listQuotasRequest.limit)
            && Objects.equals(this.marker, listQuotasRequest.marker)
            && Objects.equals(this.quotaType, listQuotasRequest.quotaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, quotaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotasRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
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
