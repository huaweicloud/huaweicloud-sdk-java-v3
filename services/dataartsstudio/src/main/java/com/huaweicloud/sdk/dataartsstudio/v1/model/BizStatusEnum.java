package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 业务状态
 */
public class BizStatusEnum {

    /**
     * Enum DRAFT for value: "DRAFT"
     */
    public static final BizStatusEnum DRAFT = new BizStatusEnum("DRAFT");

    /**
     * Enum PUBLISH_DEVELOPING for value: "PUBLISH_DEVELOPING"
     */
    public static final BizStatusEnum PUBLISH_DEVELOPING = new BizStatusEnum("PUBLISH_DEVELOPING");

    /**
     * Enum PUBLISHED for value: "PUBLISHED"
     */
    public static final BizStatusEnum PUBLISHED = new BizStatusEnum("PUBLISHED");

    /**
     * Enum OFFLINE_DEVELOPING for value: "OFFLINE_DEVELOPING"
     */
    public static final BizStatusEnum OFFLINE_DEVELOPING = new BizStatusEnum("OFFLINE_DEVELOPING");

    /**
     * Enum OFFLINE for value: "OFFLINE"
     */
    public static final BizStatusEnum OFFLINE = new BizStatusEnum("OFFLINE");

    /**
     * Enum REJECT for value: "REJECT"
     */
    public static final BizStatusEnum REJECT = new BizStatusEnum("REJECT");

    private static final Map<String, BizStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, BizStatusEnum> createStaticFields() {
        Map<String, BizStatusEnum> map = new HashMap<>();
        map.put("DRAFT", DRAFT);
        map.put("PUBLISH_DEVELOPING", PUBLISH_DEVELOPING);
        map.put("PUBLISHED", PUBLISHED);
        map.put("OFFLINE_DEVELOPING", OFFLINE_DEVELOPING);
        map.put("OFFLINE", OFFLINE);
        map.put("REJECT", REJECT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BizStatusEnum(String value) {
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
    public static BizStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BizStatusEnum(value));
    }

    public static BizStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BizStatusEnum) {
            return this.value.equals(((BizStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
