package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分支网络配额类型。 - site_networks_per_account (每个账户的分支网络数) - sites_per_mesh_site_network (网状分支网络的分支数) - spoke_sites_per_star_site_network (星状分支网络的Spoke分支数) - sites_per_hybrid_site_network (混合分支网络的分支数)
 */
public class SiteNetworkQuotaKeyEnum {

    /**
     * Enum SITE_NETWORKS_PER_ACCOUNT for value: "site_networks_per_account"
     */
    public static final SiteNetworkQuotaKeyEnum SITE_NETWORKS_PER_ACCOUNT =
        new SiteNetworkQuotaKeyEnum("site_networks_per_account");

    /**
     * Enum SITES_PER_MESH_SITE_NETWORK for value: "sites_per_mesh_site_network"
     */
    public static final SiteNetworkQuotaKeyEnum SITES_PER_MESH_SITE_NETWORK =
        new SiteNetworkQuotaKeyEnum("sites_per_mesh_site_network");

    /**
     * Enum SPOKE_SITES_PER_STAR_SITE_NETWORK for value: "spoke_sites_per_star_site_network"
     */
    public static final SiteNetworkQuotaKeyEnum SPOKE_SITES_PER_STAR_SITE_NETWORK =
        new SiteNetworkQuotaKeyEnum("spoke_sites_per_star_site_network");

    /**
     * Enum SITES_PER_HYBRID_SITE_NETWORK for value: "sites_per_hybrid_site_network"
     */
    public static final SiteNetworkQuotaKeyEnum SITES_PER_HYBRID_SITE_NETWORK =
        new SiteNetworkQuotaKeyEnum("sites_per_hybrid_site_network");

    private static final Map<String, SiteNetworkQuotaKeyEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteNetworkQuotaKeyEnum> createStaticFields() {
        Map<String, SiteNetworkQuotaKeyEnum> map = new HashMap<>();
        map.put("site_networks_per_account", SITE_NETWORKS_PER_ACCOUNT);
        map.put("sites_per_mesh_site_network", SITES_PER_MESH_SITE_NETWORK);
        map.put("spoke_sites_per_star_site_network", SPOKE_SITES_PER_STAR_SITE_NETWORK);
        map.put("sites_per_hybrid_site_network", SITES_PER_HYBRID_SITE_NETWORK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteNetworkQuotaKeyEnum(String value) {
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
    public static SiteNetworkQuotaKeyEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteNetworkQuotaKeyEnum(value));
    }

    public static SiteNetworkQuotaKeyEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteNetworkQuotaKeyEnum) {
            return this.value.equals(((SiteNetworkQuotaKeyEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
