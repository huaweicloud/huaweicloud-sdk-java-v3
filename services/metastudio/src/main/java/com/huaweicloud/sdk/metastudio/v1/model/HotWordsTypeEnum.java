package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 热词类型。 &gt; SIS:使用的语音识别服务为SIS时选此类型 &gt; MOBVOI:使用的语音识别服务为MOBVOI时选择此类型
 */
public class HotWordsTypeEnum {

    /**
     * Enum SIS for value: "SIS"
     */
    public static final HotWordsTypeEnum SIS = new HotWordsTypeEnum("SIS");

    /**
     * Enum MOBVOI for value: "MOBVOI"
     */
    public static final HotWordsTypeEnum MOBVOI = new HotWordsTypeEnum("MOBVOI");

    private static final Map<String, HotWordsTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, HotWordsTypeEnum> createStaticFields() {
        Map<String, HotWordsTypeEnum> map = new HashMap<>();
        map.put("SIS", SIS);
        map.put("MOBVOI", MOBVOI);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HotWordsTypeEnum(String value) {
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
    public static HotWordsTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HotWordsTypeEnum(value));
    }

    public static HotWordsTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HotWordsTypeEnum) {
            return this.value.equals(((HotWordsTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
