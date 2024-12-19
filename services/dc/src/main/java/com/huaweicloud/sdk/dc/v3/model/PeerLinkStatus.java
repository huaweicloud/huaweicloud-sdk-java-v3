package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 关联连接状态，PENDING_CREATE (创建中), PENDING_UPDATE (更新中), ACTIVE (可用状态), ERROR (失败状态)。
 */
public class PeerLinkStatus {

    /**
     * Enum PENDING_CREATE for value: "PENDING_CREATE"
     */
    public static final PeerLinkStatus PENDING_CREATE = new PeerLinkStatus("PENDING_CREATE");

    /**
     * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
     */
    public static final PeerLinkStatus PENDING_UPDATE = new PeerLinkStatus("PENDING_UPDATE");

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final PeerLinkStatus ACTIVE = new PeerLinkStatus("ACTIVE");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final PeerLinkStatus ERROR = new PeerLinkStatus("ERROR");

    private static final Map<String, PeerLinkStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, PeerLinkStatus> createStaticFields() {
        Map<String, PeerLinkStatus> map = new HashMap<>();
        map.put("PENDING_CREATE", PENDING_CREATE);
        map.put("PENDING_UPDATE", PENDING_UPDATE);
        map.put("ACTIVE", ACTIVE);
        map.put("ERROR", ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PeerLinkStatus(String value) {
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
    public static PeerLinkStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeerLinkStatus(value));
    }

    public static PeerLinkStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PeerLinkStatus) {
            return this.value.equals(((PeerLinkStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
