package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 带宽包实例在大陆站或国际站的计费方式。 1：大陆站包周期。 2：国际站包周期。 3：大陆站按需计费。 4：国际站按需计费。 5：大陆站按95方式计费。 6：国际站按95方式计费。
 */
public class BillingModeEnum {

    /**
     * Enum NUMBER_1 for value: 1
     */
    public static final BillingModeEnum NUMBER_1 = new BillingModeEnum(1);

    /**
     * Enum NUMBER_2 for value: 2
     */
    public static final BillingModeEnum NUMBER_2 = new BillingModeEnum(2);

    /**
     * Enum NUMBER_3 for value: 3
     */
    public static final BillingModeEnum NUMBER_3 = new BillingModeEnum(3);

    /**
     * Enum NUMBER_4 for value: 4
     */
    public static final BillingModeEnum NUMBER_4 = new BillingModeEnum(4);

    /**
     * Enum NUMBER_5 for value: 5
     */
    public static final BillingModeEnum NUMBER_5 = new BillingModeEnum(5);

    /**
     * Enum NUMBER_6 for value: 6
     */
    public static final BillingModeEnum NUMBER_6 = new BillingModeEnum(6);

    private static final Map<Integer, BillingModeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, BillingModeEnum> createStaticFields() {
        Map<Integer, BillingModeEnum> map = new HashMap<>();
        map.put(1, NUMBER_1);
        map.put(2, NUMBER_2);
        map.put(3, NUMBER_3);
        map.put(4, NUMBER_4);
        map.put(5, NUMBER_5);
        map.put(6, NUMBER_6);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    BillingModeEnum(Integer value) {
        this.value = value;
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static BillingModeEnum fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingModeEnum(value));
    }

    public static BillingModeEnum valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BillingModeEnum) {
            return this.value.equals(((BillingModeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
