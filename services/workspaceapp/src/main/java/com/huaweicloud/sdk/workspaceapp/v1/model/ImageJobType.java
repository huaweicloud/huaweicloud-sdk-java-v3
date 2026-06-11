package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job类型。 * &#x60;CREATE_SERVER&#x60; - 创建镜像实例 * &#x60;CREATE_SERVER_IMAGE&#x60; - 构建镜像 * &#x60;DELETE_SERVER&#x60; - 删除镜像实例
 */
public class ImageJobType {

    /**
     * Enum CREATE_SERVER for value: "CREATE_SERVER"
     */
    public static final ImageJobType CREATE_SERVER = new ImageJobType("CREATE_SERVER");

    /**
     * Enum CREATE_SERVER_IMAGE for value: "CREATE_SERVER_IMAGE"
     */
    public static final ImageJobType CREATE_SERVER_IMAGE = new ImageJobType("CREATE_SERVER_IMAGE");

    /**
     * Enum DELETE_SERVER for value: "DELETE_SERVER"
     */
    public static final ImageJobType DELETE_SERVER = new ImageJobType("DELETE_SERVER");

    /**
     * Enum BUILD_IMAGE for value: "BUILD_IMAGE"
     */
    public static final ImageJobType BUILD_IMAGE = new ImageJobType("BUILD_IMAGE");

    /**
     * Enum GENERATE_IMAGE for value: "GENERATE_IMAGE"
     */
    public static final ImageJobType GENERATE_IMAGE = new ImageJobType("GENERATE_IMAGE");

    /**
     * Enum DELETE_IMAGE_BUILD_SERVER for value: "DELETE_IMAGE_BUILD_SERVER"
     */
    public static final ImageJobType DELETE_IMAGE_BUILD_SERVER = new ImageJobType("DELETE_IMAGE_BUILD_SERVER");

    /**
     * Enum DELETE_IMAGE for value: "DELETE_IMAGE"
     */
    public static final ImageJobType DELETE_IMAGE = new ImageJobType("DELETE_IMAGE");

    private static final Map<String, ImageJobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageJobType> createStaticFields() {
        Map<String, ImageJobType> map = new HashMap<>();
        map.put("CREATE_SERVER", CREATE_SERVER);
        map.put("CREATE_SERVER_IMAGE", CREATE_SERVER_IMAGE);
        map.put("DELETE_SERVER", DELETE_SERVER);
        map.put("BUILD_IMAGE", BUILD_IMAGE);
        map.put("GENERATE_IMAGE", GENERATE_IMAGE);
        map.put("DELETE_IMAGE_BUILD_SERVER", DELETE_IMAGE_BUILD_SERVER);
        map.put("DELETE_IMAGE", DELETE_IMAGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageJobType(String value) {
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
    public static ImageJobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageJobType(value));
    }

    public static ImageJobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageJobType) {
            return this.value.equals(((ImageJobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
