package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 安装状态枚举。
 */
public class InstallStatusEnum {

    /**
     * Enum INSTALLING for value: "INSTALLING"
     */
    public static final InstallStatusEnum INSTALLING = new InstallStatusEnum("INSTALLING");

    /**
     * Enum INSTALLED for value: "INSTALLED"
     */
    public static final InstallStatusEnum INSTALLED = new InstallStatusEnum("INSTALLED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final InstallStatusEnum FAILED = new InstallStatusEnum("FAILED");

    /**
     * Enum UNINSTALLING for value: "UNINSTALLING"
     */
    public static final InstallStatusEnum UNINSTALLING = new InstallStatusEnum("UNINSTALLING");

    /**
     * Enum UNINSTALLED for value: "UNINSTALLED"
     */
    public static final InstallStatusEnum UNINSTALLED = new InstallStatusEnum("UNINSTALLED");

    private static final Map<String, InstallStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstallStatusEnum> createStaticFields() {
        Map<String, InstallStatusEnum> map = new HashMap<>();
        map.put("INSTALLING", INSTALLING);
        map.put("INSTALLED", INSTALLED);
        map.put("FAILED", FAILED);
        map.put("UNINSTALLING", UNINSTALLING);
        map.put("UNINSTALLED", UNINSTALLED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstallStatusEnum(String value) {
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
    public static InstallStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstallStatusEnum(value));
    }

    public static InstallStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstallStatusEnum) {
            return this.value.equals(((InstallStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
