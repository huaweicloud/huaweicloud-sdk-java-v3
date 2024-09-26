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
 * 配额实例
 */
public class CloudConnectionQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QuotaTypeEnum(value));
        }

        public static QuotaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_number")

    private Integer quotaNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_used")

    private Integer quotaUsed;

    public CloudConnectionQuota withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CloudConnectionQuota withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /**
     * 云连接实例ID。
     * @return cloudConnectionId
     */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public CloudConnectionQuota withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CloudConnectionQuota withQuotaType(QuotaTypeEnum quotaType) {
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

    public CloudConnectionQuota withQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
        return this;
    }

    /**
     * 配额数量。
     * minimum: 0
     * maximum: 102400
     * @return quotaNumber
     */
    public Integer getQuotaNumber() {
        return quotaNumber;
    }

    public void setQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
    }

    public CloudConnectionQuota withQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
        return this;
    }

    /**
     * 配额使用数量。
     * minimum: 0
     * maximum: 102400
     * @return quotaUsed
     */
    public Integer getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudConnectionQuota that = (CloudConnectionQuota) obj;
        return Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.cloudConnectionId, that.cloudConnectionId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.quotaType, that.quotaType)
            && Objects.equals(this.quotaNumber, that.quotaNumber) && Objects.equals(this.quotaUsed, that.quotaUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, cloudConnectionId, regionId, quotaType, quotaNumber, quotaUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudConnectionQuota {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    quotaNumber: ").append(toIndentedString(quotaNumber)).append("\n");
        sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
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
