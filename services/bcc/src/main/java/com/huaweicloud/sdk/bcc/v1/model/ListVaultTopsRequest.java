package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListVaultTopsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 返回的类型：按容量排序返回或者按使用率排序返回，取值范围：vault_util,used_vault_size
     */
    public static final class MetricNameEnum {

        /**
         * Enum VAULT_UTIL for value: "vault_util"
         */
        public static final MetricNameEnum VAULT_UTIL = new MetricNameEnum("vault_util");

        /**
         * Enum USED_VAULT_SIZE for value: "used_vault_size"
         */
        public static final MetricNameEnum USED_VAULT_SIZE = new MetricNameEnum("used_vault_size");

        private static final Map<String, MetricNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricNameEnum> createStaticFields() {
            Map<String, MetricNameEnum> map = new HashMap<>();
            map.put("vault_util", VAULT_UTIL);
            map.put("used_vault_size", USED_VAULT_SIZE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricNameEnum(String value) {
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
        public static MetricNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricNameEnum(value));
        }

        public static MetricNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricNameEnum) {
                return this.value.equals(((MetricNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private MetricNameEnum metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListVaultTopsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListVaultTopsRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListVaultTopsRequest withMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 返回的类型：按容量排序返回或者按使用率排序返回，取值范围：vault_util,used_vault_size
     * @return metricName
     */
    public MetricNameEnum getMetricName() {
        return metricName;
    }

    public void setMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
    }

    public ListVaultTopsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的存储库数量，取值范围(0,100]，默认值为5，用于限制结果数据条数。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVaultTopsRequest that = (ListVaultTopsRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, regionId, metricName, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultTopsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
