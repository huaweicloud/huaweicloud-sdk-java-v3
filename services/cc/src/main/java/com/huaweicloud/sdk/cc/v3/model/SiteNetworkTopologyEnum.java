package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 拓扑结构。 - p2p（点对点拓扑） - mesh （网状拓扑） - star （星形拓扑） - hybrid （混合拓扑）
 */
public class SiteNetworkTopologyEnum {

    /**
     * Enum P2P for value: "p2p"
     */
    public static final SiteNetworkTopologyEnum P2P = new SiteNetworkTopologyEnum("p2p");

    /**
     * Enum MESH for value: "mesh"
     */
    public static final SiteNetworkTopologyEnum MESH = new SiteNetworkTopologyEnum("mesh");

    /**
     * Enum STAR for value: "star"
     */
    public static final SiteNetworkTopologyEnum STAR = new SiteNetworkTopologyEnum("star");

    /**
     * Enum HYBRID for value: "hybrid"
     */
    public static final SiteNetworkTopologyEnum HYBRID = new SiteNetworkTopologyEnum("hybrid");

    private static final Map<String, SiteNetworkTopologyEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SiteNetworkTopologyEnum> createStaticFields() {
        Map<String, SiteNetworkTopologyEnum> map = new HashMap<>();
        map.put("p2p", P2P);
        map.put("mesh", MESH);
        map.put("star", STAR);
        map.put("hybrid", HYBRID);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SiteNetworkTopologyEnum(String value) {
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
    public static SiteNetworkTopologyEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SiteNetworkTopologyEnum(value));
    }

    public static SiteNetworkTopologyEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SiteNetworkTopologyEnum) {
            return this.value.equals(((SiteNetworkTopologyEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
