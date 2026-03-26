package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 服务器冻结状态 **约束限制**： 不涉及 **取值范围** - 0：未冻结。 - 1: 公安冻结。 - 2：违规冻结。 - 3：违规冻结+公安冻结。 - 4：欠费冻结。 - 5：欠费冻结+公安冻结。 - 6：欠费冻结+违规冻结。 - 7：欠费冻结+公安冻结+违规冻结。 &#x60;&#x60;&#x60; **默认取值**： 不涉及
 */
public class FrozenState {

    /**
     * Enum NUMBER_0 for value: 0
     */
    public static final FrozenState NUMBER_0 = new FrozenState(0);

    /**
     * Enum NUMBER_1 for value: 1
     */
    public static final FrozenState NUMBER_1 = new FrozenState(1);

    /**
     * Enum NUMBER_2 for value: 2
     */
    public static final FrozenState NUMBER_2 = new FrozenState(2);

    /**
     * Enum NUMBER_3 for value: 3
     */
    public static final FrozenState NUMBER_3 = new FrozenState(3);

    /**
     * Enum NUMBER_4 for value: 4
     */
    public static final FrozenState NUMBER_4 = new FrozenState(4);

    /**
     * Enum NUMBER_5 for value: 5
     */
    public static final FrozenState NUMBER_5 = new FrozenState(5);

    /**
     * Enum NUMBER_6 for value: 6
     */
    public static final FrozenState NUMBER_6 = new FrozenState(6);

    /**
     * Enum NUMBER_7 for value: 7
     */
    public static final FrozenState NUMBER_7 = new FrozenState(7);

    private static final Map<Integer, FrozenState> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, FrozenState> createStaticFields() {
        Map<Integer, FrozenState> map = new HashMap<>();
        map.put(0, NUMBER_0);
        map.put(1, NUMBER_1);
        map.put(2, NUMBER_2);
        map.put(3, NUMBER_3);
        map.put(4, NUMBER_4);
        map.put(5, NUMBER_5);
        map.put(6, NUMBER_6);
        map.put(7, NUMBER_7);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    FrozenState(Integer value) {
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
    public static FrozenState fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrozenState(value));
    }

    public static FrozenState valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FrozenState) {
            return this.value.equals(((FrozenState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
