package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 镜像实例的状态: * &#39;CREATING&#39; - 实例创建中 * &#39;ACTIVE&#39; - 实例正常运行 * &#39;BUILDING&#39; - 镜像创建中 * &#39;BUILT&#39; - 镜像任务结束 * &#39;ERROR&#39; - 实例处于异常 * &#39;DELETING&#39; - 实例删除中 * &#39;NULL&#39; - 未设置
 */
public class ImageServerStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final ImageServerStatus CREATING = new ImageServerStatus("CREATING");

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final ImageServerStatus ACTIVE = new ImageServerStatus("ACTIVE");

    /**
     * Enum BUILDING for value: "BUILDING"
     */
    public static final ImageServerStatus BUILDING = new ImageServerStatus("BUILDING");

    /**
     * Enum BUILT for value: "BUILT"
     */
    public static final ImageServerStatus BUILT = new ImageServerStatus("BUILT");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final ImageServerStatus ERROR = new ImageServerStatus("ERROR");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final ImageServerStatus DELETING = new ImageServerStatus("DELETING");

    /**
     * Enum NULL for value: "null"
     */
    public static final ImageServerStatus NULL = new ImageServerStatus("null");

    private static final Map<String, ImageServerStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageServerStatus> createStaticFields() {
        Map<String, ImageServerStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("ACTIVE", ACTIVE);
        map.put("BUILDING", BUILDING);
        map.put("BUILT", BUILT);
        map.put("ERROR", ERROR);
        map.put("DELETING", DELETING);
        map.put("null", NULL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageServerStatus(String value) {
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
    public static ImageServerStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageServerStatus(value));
    }

    public static ImageServerStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageServerStatus) {
            return this.value.equals(((ImageServerStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
