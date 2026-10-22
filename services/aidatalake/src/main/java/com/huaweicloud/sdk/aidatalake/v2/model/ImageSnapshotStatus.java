package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：镜像快照状态。 **约束限制**：不涉及。 **取值范围**：   - Creating：创建中。   - Available：可用。   - Unavailable：不可用。 **默认取值**：不涉及。 
 */
public class ImageSnapshotStatus {

    /**
     * Enum CREATING for value: "Creating"
     */
    public static final ImageSnapshotStatus CREATING = new ImageSnapshotStatus("Creating");

    /**
     * Enum AVAILABLE for value: "Available"
     */
    public static final ImageSnapshotStatus AVAILABLE = new ImageSnapshotStatus("Available");

    /**
     * Enum UNAVAILABLE for value: "Unavailable"
     */
    public static final ImageSnapshotStatus UNAVAILABLE = new ImageSnapshotStatus("Unavailable");

    private static final Map<String, ImageSnapshotStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageSnapshotStatus> createStaticFields() {
        Map<String, ImageSnapshotStatus> map = new HashMap<>();
        map.put("Creating", CREATING);
        map.put("Available", AVAILABLE);
        map.put("Unavailable", UNAVAILABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageSnapshotStatus(String value) {
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
    public static ImageSnapshotStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageSnapshotStatus(value));
    }

    public static ImageSnapshotStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageSnapshotStatus) {
            return this.value.equals(((ImageSnapshotStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
