package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 磁盘类型，获取可用磁盘类型详见接口磁盘管理ListVolumeType。 * &#x60;ESSD&#x60; - 极速型SSD * &#x60;SSD&#x60; - 超高IO * &#x60;GPSSD&#x60; - 通用型SSD * &#x60;SAS&#x60; - 高IO * &#x60;SATA&#x60; - 普通IO
 */
public class VolumeType {

    /**
     * Enum ESSD for value: "ESSD"
     */
    public static final VolumeType ESSD = new VolumeType("ESSD");

    /**
     * Enum SSD for value: "SSD"
     */
    public static final VolumeType SSD = new VolumeType("SSD");

    /**
     * Enum GPSSD for value: "GPSSD"
     */
    public static final VolumeType GPSSD = new VolumeType("GPSSD");

    /**
     * Enum SAS for value: "SAS"
     */
    public static final VolumeType SAS = new VolumeType("SAS");

    /**
     * Enum SATA for value: "SATA"
     */
    public static final VolumeType SATA = new VolumeType("SATA");

    private static final Map<String, VolumeType> STATIC_FIELDS = createStaticFields();

    private static Map<String, VolumeType> createStaticFields() {
        Map<String, VolumeType> map = new HashMap<>();
        map.put("ESSD", ESSD);
        map.put("SSD", SSD);
        map.put("GPSSD", GPSSD);
        map.put("SAS", SAS);
        map.put("SATA", SATA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VolumeType(String value) {
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
    public static VolumeType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VolumeType(value));
    }

    public static VolumeType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VolumeType) {
            return this.value.equals(((VolumeType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
