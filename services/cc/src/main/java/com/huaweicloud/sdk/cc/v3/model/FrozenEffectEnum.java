package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 冻结效果。 - RELEASABLE(冻结可释放) - UNRELEASABLE(冻结不可释放)
 */
public class FrozenEffectEnum {

    /**
     * Enum RELEASABLE for value: "RELEASABLE"
     */
    public static final FrozenEffectEnum RELEASABLE = new FrozenEffectEnum("RELEASABLE");

    /**
     * Enum UNRELEASABLE for value: "UNRELEASABLE"
     */
    public static final FrozenEffectEnum UNRELEASABLE = new FrozenEffectEnum("UNRELEASABLE");

    private static final Map<String, FrozenEffectEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, FrozenEffectEnum> createStaticFields() {
        Map<String, FrozenEffectEnum> map = new HashMap<>();
        map.put("RELEASABLE", RELEASABLE);
        map.put("UNRELEASABLE", UNRELEASABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FrozenEffectEnum(String value) {
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
    public static FrozenEffectEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrozenEffectEnum(value));
    }

    public static FrozenEffectEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FrozenEffectEnum) {
            return this.value.equals(((FrozenEffectEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
