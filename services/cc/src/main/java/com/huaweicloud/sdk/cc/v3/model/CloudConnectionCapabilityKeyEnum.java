package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 租户能力类型，分为： - v2（V2的API） - v3（V3的API） - billing_mode_period_reduce（包周期实时降配） - billing_mode_demand（按需计费） - bwp95（按需计费-95） - bwp95Avg（按需计费-日95） - network-quality（丢包和时延统计） - er（是否支持ER） - domain_bandwidth（租户带宽值） - ipv6（是否支持IPV6） - ipv6_support_regions（IPV6支持的区域列表） - enterprise-cloud-connection.is-support（支持企业版云连接） - enterprise-cloud-connection.support-sites（支持企业版云连接的站点列表） - enterprise-cloud-connection-segment.is-support（支持企业版云连接平面） - enterprise-cloud-connection-dc-attachment.is-support（支持企业版云连接的专线网关连接）
 */
public class CloudConnectionCapabilityKeyEnum {

    /**
     * Enum V2 for value: "v2"
     */
    public static final CloudConnectionCapabilityKeyEnum V2 = new CloudConnectionCapabilityKeyEnum("v2");

    /**
     * Enum V3 for value: "v3"
     */
    public static final CloudConnectionCapabilityKeyEnum V3 = new CloudConnectionCapabilityKeyEnum("v3");

    /**
     * Enum BILLING_MODE_PERIOD_REDUCE for value: "billing_mode_period_reduce"
     */
    public static final CloudConnectionCapabilityKeyEnum BILLING_MODE_PERIOD_REDUCE =
        new CloudConnectionCapabilityKeyEnum("billing_mode_period_reduce");

    /**
     * Enum BILLING_MODE_DEMAND for value: "billing_mode_demand"
     */
    public static final CloudConnectionCapabilityKeyEnum BILLING_MODE_DEMAND =
        new CloudConnectionCapabilityKeyEnum("billing_mode_demand");

    /**
     * Enum BWP95 for value: "bwp95"
     */
    public static final CloudConnectionCapabilityKeyEnum BWP95 = new CloudConnectionCapabilityKeyEnum("bwp95");

    /**
     * Enum BWP95AVG for value: "bwp95Avg"
     */
    public static final CloudConnectionCapabilityKeyEnum BWP95AVG = new CloudConnectionCapabilityKeyEnum("bwp95Avg");

    /**
     * Enum NETWORK_QUALITY for value: "network-quality"
     */
    public static final CloudConnectionCapabilityKeyEnum NETWORK_QUALITY =
        new CloudConnectionCapabilityKeyEnum("network-quality");

    /**
     * Enum ER for value: "er"
     */
    public static final CloudConnectionCapabilityKeyEnum ER = new CloudConnectionCapabilityKeyEnum("er");

    /**
     * Enum DOMAIN_BANDWIDTH for value: "domain_bandwidth"
     */
    public static final CloudConnectionCapabilityKeyEnum DOMAIN_BANDWIDTH =
        new CloudConnectionCapabilityKeyEnum("domain_bandwidth");

    /**
     * Enum IPV6 for value: "ipv6"
     */
    public static final CloudConnectionCapabilityKeyEnum IPV6 = new CloudConnectionCapabilityKeyEnum("ipv6");

    /**
     * Enum IPV6_SUPPORT_REGIONS for value: "ipv6_support_regions"
     */
    public static final CloudConnectionCapabilityKeyEnum IPV6_SUPPORT_REGIONS =
        new CloudConnectionCapabilityKeyEnum("ipv6_support_regions");

    /**
     * Enum ENTERPRISE_CLOUD_CONNECTION_IS_SUPPORT for value: "enterprise-cloud-connection.is-support"
     */
    public static final CloudConnectionCapabilityKeyEnum ENTERPRISE_CLOUD_CONNECTION_IS_SUPPORT =
        new CloudConnectionCapabilityKeyEnum("enterprise-cloud-connection.is-support");

    /**
     * Enum ENTERPRISE_CLOUD_CONNECTION_SUPPORT_SITES for value: "enterprise-cloud-connection.support-sites"
     */
    public static final CloudConnectionCapabilityKeyEnum ENTERPRISE_CLOUD_CONNECTION_SUPPORT_SITES =
        new CloudConnectionCapabilityKeyEnum("enterprise-cloud-connection.support-sites");

    /**
     * Enum ENTERPRISE_CLOUD_CONNECTION_SEGMENT_IS_SUPPORT for value: "enterprise-cloud-connection-segment.is-support"
     */
    public static final CloudConnectionCapabilityKeyEnum ENTERPRISE_CLOUD_CONNECTION_SEGMENT_IS_SUPPORT =
        new CloudConnectionCapabilityKeyEnum("enterprise-cloud-connection-segment.is-support");

    /**
     * Enum ENTERPRISE_CLOUD_CONNECTION_DC_ATTACHMENT_IS_SUPPORT for value: "enterprise-cloud-connection-dc-attachment.is-support"
     */
    public static final CloudConnectionCapabilityKeyEnum ENTERPRISE_CLOUD_CONNECTION_DC_ATTACHMENT_IS_SUPPORT =
        new CloudConnectionCapabilityKeyEnum("enterprise-cloud-connection-dc-attachment.is-support");

    private static final Map<String, CloudConnectionCapabilityKeyEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CloudConnectionCapabilityKeyEnum> createStaticFields() {
        Map<String, CloudConnectionCapabilityKeyEnum> map = new HashMap<>();
        map.put("v2", V2);
        map.put("v3", V3);
        map.put("billing_mode_period_reduce", BILLING_MODE_PERIOD_REDUCE);
        map.put("billing_mode_demand", BILLING_MODE_DEMAND);
        map.put("bwp95", BWP95);
        map.put("bwp95Avg", BWP95AVG);
        map.put("network-quality", NETWORK_QUALITY);
        map.put("er", ER);
        map.put("domain_bandwidth", DOMAIN_BANDWIDTH);
        map.put("ipv6", IPV6);
        map.put("ipv6_support_regions", IPV6_SUPPORT_REGIONS);
        map.put("enterprise-cloud-connection.is-support", ENTERPRISE_CLOUD_CONNECTION_IS_SUPPORT);
        map.put("enterprise-cloud-connection.support-sites", ENTERPRISE_CLOUD_CONNECTION_SUPPORT_SITES);
        map.put("enterprise-cloud-connection-segment.is-support", ENTERPRISE_CLOUD_CONNECTION_SEGMENT_IS_SUPPORT);
        map.put("enterprise-cloud-connection-dc-attachment.is-support",
            ENTERPRISE_CLOUD_CONNECTION_DC_ATTACHMENT_IS_SUPPORT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CloudConnectionCapabilityKeyEnum(String value) {
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
    public static CloudConnectionCapabilityKeyEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElse(new CloudConnectionCapabilityKeyEnum(value));
    }

    public static CloudConnectionCapabilityKeyEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CloudConnectionCapabilityKeyEnum) {
            return this.value.equals(((CloudConnectionCapabilityKeyEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
