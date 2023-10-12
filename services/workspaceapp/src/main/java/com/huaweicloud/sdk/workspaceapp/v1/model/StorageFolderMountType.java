package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户访问APS的应用时,对应NAS存储目录在APS上的挂载策略 * &#x60;USER&#x60; - 仅挂载个人目录 * &#x60;SHARE&#x60; - 仅挂载共享目录 * &#x60;ANY&#x60; - 挂载目录不做限制(个人和共享NAS存储目录都会自动挂载)
 */
public class StorageFolderMountType {

    /**
     * Enum USER for value: "USER"
     */
    public static final StorageFolderMountType USER = new StorageFolderMountType("USER");

    /**
     * Enum SHARE for value: "SHARE"
     */
    public static final StorageFolderMountType SHARE = new StorageFolderMountType("SHARE");

    /**
     * Enum ANY for value: "ANY"
     */
    public static final StorageFolderMountType ANY = new StorageFolderMountType("ANY");

    private static final Map<String, StorageFolderMountType> STATIC_FIELDS = createStaticFields();

    private static Map<String, StorageFolderMountType> createStaticFields() {
        Map<String, StorageFolderMountType> map = new HashMap<>();
        map.put("USER", USER);
        map.put("SHARE", SHARE);
        map.put("ANY", ANY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StorageFolderMountType(String value) {
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
    public static StorageFolderMountType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageFolderMountType(value));
    }

    public static StorageFolderMountType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StorageFolderMountType) {
            return this.value.equals(((StorageFolderMountType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
