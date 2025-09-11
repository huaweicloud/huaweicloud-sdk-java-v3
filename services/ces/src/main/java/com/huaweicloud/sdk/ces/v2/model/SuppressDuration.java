package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 告警抑制时间，单位为秒，对应页面上创建告警规则时告警策略最后一个字段，该字段主要为解决告警频繁的问题。 **约束限制**： 不涉及。 **取值范围**： 枚举值，只能为0、300、600、900、1800、3600、10800、21600、43200、86400。 - 0：对于指标类告警，0代表告警一次。对于事件类告警，在立即触发场景中，0代表不抑制；在累计触发场景，0代表只告警一次。 - 300代表满足告警触发条件后每5分钟告警一次。 - 600代表满足告警触发条件后每10分钟告警一次。 - 900代表满足告警触发条件后每15分钟告警一次。 - 1800代表满足告警触发条件后每30分钟告警一次。 - 3600代表满足告警触发条件后每60分钟告警一次。 - 10800代表满足告警触发条件后每3小时告警一次。 - 21600代表满足告警触发条件后每6小时告警一次。 - 43200代表满足告警触发条件后每12小时告警一次。 - 86000代表满足告警触发条件后每一天告警一次。 **默认取值**： 不涉及。 
 */
public class SuppressDuration {

    /**
     * Enum NUMBER_0 for value: 0
     */
    public static final SuppressDuration NUMBER_0 = new SuppressDuration(0);

    /**
     * Enum NUMBER_300 for value: 300
     */
    public static final SuppressDuration NUMBER_300 = new SuppressDuration(300);

    /**
     * Enum NUMBER_600 for value: 600
     */
    public static final SuppressDuration NUMBER_600 = new SuppressDuration(600);

    /**
     * Enum NUMBER_900 for value: 900
     */
    public static final SuppressDuration NUMBER_900 = new SuppressDuration(900);

    /**
     * Enum NUMBER_1800 for value: 1800
     */
    public static final SuppressDuration NUMBER_1800 = new SuppressDuration(1800);

    /**
     * Enum NUMBER_3600 for value: 3600
     */
    public static final SuppressDuration NUMBER_3600 = new SuppressDuration(3600);

    /**
     * Enum NUMBER_10800 for value: 10800
     */
    public static final SuppressDuration NUMBER_10800 = new SuppressDuration(10800);

    /**
     * Enum NUMBER_21600 for value: 21600
     */
    public static final SuppressDuration NUMBER_21600 = new SuppressDuration(21600);

    /**
     * Enum NUMBER_43200 for value: 43200
     */
    public static final SuppressDuration NUMBER_43200 = new SuppressDuration(43200);

    /**
     * Enum NUMBER_86400 for value: 86400
     */
    public static final SuppressDuration NUMBER_86400 = new SuppressDuration(86400);

    private static final Map<Integer, SuppressDuration> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, SuppressDuration> createStaticFields() {
        Map<Integer, SuppressDuration> map = new HashMap<>();
        map.put(0, NUMBER_0);
        map.put(300, NUMBER_300);
        map.put(600, NUMBER_600);
        map.put(900, NUMBER_900);
        map.put(1800, NUMBER_1800);
        map.put(3600, NUMBER_3600);
        map.put(10800, NUMBER_10800);
        map.put(21600, NUMBER_21600);
        map.put(43200, NUMBER_43200);
        map.put(86400, NUMBER_86400);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    SuppressDuration(Integer value) {
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
    public static SuppressDuration fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SuppressDuration(value));
    }

    public static SuppressDuration valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SuppressDuration) {
            return this.value.equals(((SuppressDuration) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
