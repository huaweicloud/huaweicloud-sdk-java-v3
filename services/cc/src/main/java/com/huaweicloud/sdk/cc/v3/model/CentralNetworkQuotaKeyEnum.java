package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络配额类型。 - central_networks_per_account (每个账户的中心网数) - policy_versions_per_central_network (每个中心网的策略数) - size_of_document_per_central_network_policy_version (中心网络策略文档大小(KB)) - planes_per_central_network (每个中心网的平面数) - er_instances_per_region_per_central_network (每个中心网络每个区域的Er实例数) - connections_per_central_network (每个中心网的连接数) - attachments_per_central_network (每个中心网的附件数) - GDGW_attachments_per_region_per_central_network (每个中心网每个区域的GDGW附件数) - ER_ROUTE_TABLE_attachments_per_region_per_central_network (每个中心网每个区域的ER_ROUTE_TABLE附件数)
 */
public class CentralNetworkQuotaKeyEnum {

    /**
     * Enum CENTRAL_NETWORKS_PER_ACCOUNT for value: "central_networks_per_account"
     */
    public static final CentralNetworkQuotaKeyEnum CENTRAL_NETWORKS_PER_ACCOUNT =
        new CentralNetworkQuotaKeyEnum("central_networks_per_account");

    /**
     * Enum POLICY_VERSIONS_PER_CENTRAL_NETWORK for value: "policy_versions_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum POLICY_VERSIONS_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("policy_versions_per_central_network");

    /**
     * Enum SIZE_OF_DOCUMENT_PER_CENTRAL_NETWORK_POLICY_VERSION for value: "size_of_document_per_central_network_policy_version"
     */
    public static final CentralNetworkQuotaKeyEnum SIZE_OF_DOCUMENT_PER_CENTRAL_NETWORK_POLICY_VERSION =
        new CentralNetworkQuotaKeyEnum("size_of_document_per_central_network_policy_version");

    /**
     * Enum PLANES_PER_CENTRAL_NETWORK for value: "planes_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum PLANES_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("planes_per_central_network");

    /**
     * Enum ER_INSTANCES_PER_REGION_PER_CENTRAL_NETWORK for value: "er_instances_per_region_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum ER_INSTANCES_PER_REGION_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("er_instances_per_region_per_central_network");

    /**
     * Enum CONNECTIONS_PER_CENTRAL_NETWORK for value: "connections_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum CONNECTIONS_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("connections_per_central_network");

    /**
     * Enum ATTACHMENTS_PER_CENTRAL_NETWORK for value: "attachments_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum ATTACHMENTS_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("attachments_per_central_network");

    /**
     * Enum GDGW_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK for value: "GDGW_attachments_per_region_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum GDGW_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("GDGW_attachments_per_region_per_central_network");

    /**
     * Enum ER_ROUTE_TABLE_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK for value: "ER_ROUTE_TABLE_attachments_per_region_per_central_network"
     */
    public static final CentralNetworkQuotaKeyEnum ER_ROUTE_TABLE_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK =
        new CentralNetworkQuotaKeyEnum("ER_ROUTE_TABLE_attachments_per_region_per_central_network");

    private static final Map<String, CentralNetworkQuotaKeyEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, CentralNetworkQuotaKeyEnum> createStaticFields() {
        Map<String, CentralNetworkQuotaKeyEnum> map = new HashMap<>();
        map.put("central_networks_per_account", CENTRAL_NETWORKS_PER_ACCOUNT);
        map.put("policy_versions_per_central_network", POLICY_VERSIONS_PER_CENTRAL_NETWORK);
        map.put("size_of_document_per_central_network_policy_version",
            SIZE_OF_DOCUMENT_PER_CENTRAL_NETWORK_POLICY_VERSION);
        map.put("planes_per_central_network", PLANES_PER_CENTRAL_NETWORK);
        map.put("er_instances_per_region_per_central_network", ER_INSTANCES_PER_REGION_PER_CENTRAL_NETWORK);
        map.put("connections_per_central_network", CONNECTIONS_PER_CENTRAL_NETWORK);
        map.put("attachments_per_central_network", ATTACHMENTS_PER_CENTRAL_NETWORK);
        map.put("GDGW_attachments_per_region_per_central_network", GDGW_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK);
        map.put("ER_ROUTE_TABLE_attachments_per_region_per_central_network",
            ER_ROUTE_TABLE_ATTACHMENTS_PER_REGION_PER_CENTRAL_NETWORK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CentralNetworkQuotaKeyEnum(String value) {
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
    public static CentralNetworkQuotaKeyEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CentralNetworkQuotaKeyEnum(value));
    }

    public static CentralNetworkQuotaKeyEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CentralNetworkQuotaKeyEnum) {
            return this.value.equals(((CentralNetworkQuotaKeyEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
