package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源类型。 当前支持的形象资源类型如下： * 2D_DIGITAL_HUMAN_BASIC：形象制作基础版 * 2D_DIGITAL_HUMAN_ADVANCED：形象制作高级版 * 2D_DIGITAL_HUMAN_FLEXUS：形象制作FLEXUS版  当前支持的声音资源类型如下： * VOICE_BASIC: 声音制作基础版 * VOICE_MIDDLE: 声音制作进阶版 * VOICE_ADVANCE：声音制作高级版 * VOICE_THIRD_PARTY：声音制作第三方出门问问 * VOICE_THIRD_PARTY_LJZN: 声音制作第三方逻辑智能 * VOICE_FLEXUS: 声音制作Flexus版资源
 */
public class BillResourceType {

    /**
     * Enum _2D_DIGITAL_HUMAN_BASIC for value: "2D_DIGITAL_HUMAN_BASIC"
     */
    public static final BillResourceType _2D_DIGITAL_HUMAN_BASIC = new BillResourceType("2D_DIGITAL_HUMAN_BASIC");

    /**
     * Enum _2D_DIGITAL_HUMAN_ADVANCED for value: "2D_DIGITAL_HUMAN_ADVANCED"
     */
    public static final BillResourceType _2D_DIGITAL_HUMAN_ADVANCED = new BillResourceType("2D_DIGITAL_HUMAN_ADVANCED");

    /**
     * Enum _2D_DIGITAL_HUMAN_FLEXUS for value: "2D_DIGITAL_HUMAN_FLEXUS"
     */
    public static final BillResourceType _2D_DIGITAL_HUMAN_FLEXUS = new BillResourceType("2D_DIGITAL_HUMAN_FLEXUS");

    /**
     * Enum VOICE_BASIC for value: "VOICE_BASIC"
     */
    public static final BillResourceType VOICE_BASIC = new BillResourceType("VOICE_BASIC");

    /**
     * Enum VOICE_MIDDLE for value: "VOICE_MIDDLE"
     */
    public static final BillResourceType VOICE_MIDDLE = new BillResourceType("VOICE_MIDDLE");

    /**
     * Enum VOICE_ADVANCE for value: "VOICE_ADVANCE"
     */
    public static final BillResourceType VOICE_ADVANCE = new BillResourceType("VOICE_ADVANCE");

    /**
     * Enum VOICE_THIRD_PARTY for value: "VOICE_THIRD_PARTY"
     */
    public static final BillResourceType VOICE_THIRD_PARTY = new BillResourceType("VOICE_THIRD_PARTY");

    /**
     * Enum VOICE_THIRD_PARTY_LJZN for value: "VOICE_THIRD_PARTY_LJZN"
     */
    public static final BillResourceType VOICE_THIRD_PARTY_LJZN = new BillResourceType("VOICE_THIRD_PARTY_LJZN");

    /**
     * Enum VOICE_FLEXUS for value: "VOICE_FLEXUS"
     */
    public static final BillResourceType VOICE_FLEXUS = new BillResourceType("VOICE_FLEXUS");

    private static final Map<String, BillResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, BillResourceType> createStaticFields() {
        Map<String, BillResourceType> map = new HashMap<>();
        map.put("2D_DIGITAL_HUMAN_BASIC", _2D_DIGITAL_HUMAN_BASIC);
        map.put("2D_DIGITAL_HUMAN_ADVANCED", _2D_DIGITAL_HUMAN_ADVANCED);
        map.put("2D_DIGITAL_HUMAN_FLEXUS", _2D_DIGITAL_HUMAN_FLEXUS);
        map.put("VOICE_BASIC", VOICE_BASIC);
        map.put("VOICE_MIDDLE", VOICE_MIDDLE);
        map.put("VOICE_ADVANCE", VOICE_ADVANCE);
        map.put("VOICE_THIRD_PARTY", VOICE_THIRD_PARTY);
        map.put("VOICE_THIRD_PARTY_LJZN", VOICE_THIRD_PARTY_LJZN);
        map.put("VOICE_FLEXUS", VOICE_FLEXUS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BillResourceType(String value) {
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
    public static BillResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillResourceType(value));
    }

    public static BillResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BillResourceType) {
            return this.value.equals(((BillResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
