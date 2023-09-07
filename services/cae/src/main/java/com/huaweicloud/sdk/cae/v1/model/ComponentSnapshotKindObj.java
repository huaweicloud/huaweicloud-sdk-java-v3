package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“ComponentSnapshot”，该值不可修改。
 */
public class ComponentSnapshotKindObj {

    /**
     * Enum COMPONENTSNAPSHOT for value: "ComponentSnapshot"
     */
    public static final ComponentSnapshotKindObj COMPONENTSNAPSHOT = new ComponentSnapshotKindObj("ComponentSnapshot");

    private static final Map<String, ComponentSnapshotKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentSnapshotKindObj> createStaticFields() {
        Map<String, ComponentSnapshotKindObj> map = new HashMap<>();
        map.put("ComponentSnapshot", COMPONENTSNAPSHOT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentSnapshotKindObj(String value) {
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
    public static ComponentSnapshotKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentSnapshotKindObj(value));
    }

    public static ComponentSnapshotKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentSnapshotKindObj) {
            return this.value.equals(((ComponentSnapshotKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
