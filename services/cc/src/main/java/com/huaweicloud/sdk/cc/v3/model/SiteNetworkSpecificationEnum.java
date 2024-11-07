package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分支网络的规格类型定义： - site-network.is-support: 支持分支网络。 - site-network.is-support-enterprise-project: 支持分支网络的企业项目。 - site-network.is-support-tag: 支持分支网络的标签能力。 - site-network.is-support-intra-region: 支持同region创建分支网络。 - site-network.support-topologies: 支持分支网络拓扑。 - site-network.support-regions: 支持分支接入的Region列表。 - site-network.support-dscp-regions: 支持分支接入的Region列表 - site-network.support-freeze-regions: 支持分支网络冻结的Region列表 - site-network.support-locations: 支持分支接入点列表。 - site-connection-bandwidth.size-range: 分支连接带宽大小的范围。 - site-connection-bandwidth.charge-mode: 分支连接带宽计费类型。 - site-connection-bandwidth.free-line: 分支连接带宽免费线路。
 */
public class SiteNetworkSpecificationEnum {

    /**
     * Enum SITE_NETWORK_IS_SUPPORT for value: "site-network.is-support"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_IS_SUPPORT =
        new SiteNetworkSpecificationEnum("site-network.is-support");

    /**
     * Enum SITE_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT for value: "site-network.is-support-enterprise-project"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT =
        new SiteNetworkSpecificationEnum("site-network.is-support-enterprise-project");

    /**
     * Enum SITE_NETWORK_IS_SUPPORT_TAG for value: "site-network.is-support-tag"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_IS_SUPPORT_TAG =
        new SiteNetworkSpecificationEnum("site-network.is-support-tag");

    /**
     * Enum SITE_NETWORK_IS_SUPPORT_INTRA_REGION for value: "site-network.is-support-intra-region"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_IS_SUPPORT_INTRA_REGION =
        new SiteNetworkSpecificationEnum("site-network.is-support-intra-region");

    /**
     * Enum SITE_NETWORK_SUPPORT_TOPOLOGIES for value: "site-network.support-topologies"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_SUPPORT_TOPOLOGIES =
        new SiteNetworkSpecificationEnum("site-network.support-topologies");

    /**
     * Enum SITE_NETWORK_SUPPORT_REGIONS for value: "site-network.support-regions"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_SUPPORT_REGIONS =
        new SiteNetworkSpecificationEnum("site-network.support-regions");

    /**
     * Enum SITE_NETWORK_SUPPORT_DSCP_REGIONS for value: "site-network.support-dscp-regions"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_SUPPORT_DSCP_REGIONS =
        new SiteNetworkSpecificationEnum("site-network.support-dscp-regions");

    /**
     * Enum SITE_NETWORK_SUPPORT_FREEZE_REGIONS for value: "site-network.support-freeze-regions"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_SUPPORT_FREEZE_REGIONS =
        new SiteNetworkSpecificationEnum("site-network.support-freeze-regions");

    /**
     * Enum SITE_NETWORK_SUPPORT_LOCATIONS for value: "site-network.support-locations"
     */
    public static final SiteNetworkSpecificationEnum SITE_NETWORK_SUPPORT_LOCATIONS =
        new SiteNetworkSpecificationEnum("site-network.support-locations");

    /**
     * Enum SITE_CONNECTION_BANDWIDTH_SIZE_RANGE for value: "site-connection-bandwidth.size-range"
     */
    public static final SiteNetworkSpecificationEnum SITE_CONNECTION_BANDWIDTH_SIZE_RANGE =
        new SiteNetworkSpecificationEnum("site-connection-bandwidth.size-range");

    /**
     * Enum SITE_CONNECTION_BANDWIDTH_CHARGE_MODE for value: "site-connection-bandwidth.charge-mode"
     */
    public static final SiteNetworkSpecificationEnum SITE_CONNECTION_BANDWIDTH_CHARGE_MODE =
        new SiteNetworkSpecificationEnum("site-connection-bandwidth.charge-mode");

    /**
     * Enum SITE_CONNECTION_BANDWIDTH_FREE_LINE for value: "site-connection-bandwidth.free-line"
     */
    public static final SiteNetworkSpecificationEnum SITE_CONNECTION_BANDWIDTH_FREE_LINE =
        new SiteNetworkSpecificationEnum("site-connection-bandwidth.free-line");

    private static final Map<String, SiteNetworkSpecificationEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteNetworkSpecificationEnum> createStaticFields() {
        Map<String, SiteNetworkSpecificationEnum> map = new HashMap<>();
        map.put("site-network.is-support", SITE_NETWORK_IS_SUPPORT);
        map.put("site-network.is-support-enterprise-project", SITE_NETWORK_IS_SUPPORT_ENTERPRISE_PROJECT);
        map.put("site-network.is-support-tag", SITE_NETWORK_IS_SUPPORT_TAG);
        map.put("site-network.is-support-intra-region", SITE_NETWORK_IS_SUPPORT_INTRA_REGION);
        map.put("site-network.support-topologies", SITE_NETWORK_SUPPORT_TOPOLOGIES);
        map.put("site-network.support-regions", SITE_NETWORK_SUPPORT_REGIONS);
        map.put("site-network.support-dscp-regions", SITE_NETWORK_SUPPORT_DSCP_REGIONS);
        map.put("site-network.support-freeze-regions", SITE_NETWORK_SUPPORT_FREEZE_REGIONS);
        map.put("site-network.support-locations", SITE_NETWORK_SUPPORT_LOCATIONS);
        map.put("site-connection-bandwidth.size-range", SITE_CONNECTION_BANDWIDTH_SIZE_RANGE);
        map.put("site-connection-bandwidth.charge-mode", SITE_CONNECTION_BANDWIDTH_CHARGE_MODE);
        map.put("site-connection-bandwidth.free-line", SITE_CONNECTION_BANDWIDTH_FREE_LINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteNetworkSpecificationEnum(String value) {
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
    public static SiteNetworkSpecificationEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteNetworkSpecificationEnum(value));
    }

    public static SiteNetworkSpecificationEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteNetworkSpecificationEnum) {
            return this.value.equals(((SiteNetworkSpecificationEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
