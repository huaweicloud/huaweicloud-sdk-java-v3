package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 通过该类型过滤出与桌面池规格类型不一致的桌面 - product_id: 查找productID与桌面池套餐ID不一致的桌面 - image_id: 查找imageID与桌面池镜像ID不一致的桌面 - disk_num: 查找数据盘数量与桌面池配置不一致的桌面 - disk_size: 查找磁盘累加容量与桌面池配置不一致的桌面
 */
public class InconsistentTypeEnum {

    /**
     * Enum PRODUCT_ID for value: "product_id"
     */
    public static final InconsistentTypeEnum PRODUCT_ID = new InconsistentTypeEnum("product_id");

    /**
     * Enum IMAGE_ID for value: "image_id"
     */
    public static final InconsistentTypeEnum IMAGE_ID = new InconsistentTypeEnum("image_id");

    /**
     * Enum DISK_NUM for value: "disk_num"
     */
    public static final InconsistentTypeEnum DISK_NUM = new InconsistentTypeEnum("disk_num");

    /**
     * Enum DISK_SIZE for value: "disk_size"
     */
    public static final InconsistentTypeEnum DISK_SIZE = new InconsistentTypeEnum("disk_size");

    private static final Map<String, InconsistentTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, InconsistentTypeEnum> createStaticFields() {
        Map<String, InconsistentTypeEnum> map = new HashMap<>();
        map.put("product_id", PRODUCT_ID);
        map.put("image_id", IMAGE_ID);
        map.put("disk_num", DISK_NUM);
        map.put("disk_size", DISK_SIZE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InconsistentTypeEnum(String value) {
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
    public static InconsistentTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InconsistentTypeEnum(value));
    }

    public static InconsistentTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InconsistentTypeEnum) {
            return this.value.equals(((InconsistentTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
