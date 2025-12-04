package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 不同键值对应的时间线
 */
public class StatisticsTimelineItem {

    /**
     * **参数解释：** 键值标识，用于区分不同的防护统计类型 **约束限制：** 不涉及 **取值范围：**  - ACCESS:请求总量  - CRAWLER:Bot攻击防护  - ATTACK:攻击总量  - WEB_ATTACK:Web基础防护  - PRECISE:精准防护  - CC:CC攻击防护 **默认取值：** 不涉及
     */
    public static final class KeyEnum {

        /**
         * Enum ACCESS for value: "ACCESS"
         */
        public static final KeyEnum ACCESS = new KeyEnum("ACCESS");

        /**
         * Enum CRAWLER for value: "CRAWLER"
         */
        public static final KeyEnum CRAWLER = new KeyEnum("CRAWLER");

        /**
         * Enum ATTACK for value: "ATTACK"
         */
        public static final KeyEnum ATTACK = new KeyEnum("ATTACK");

        /**
         * Enum WEB_ATTACK for value: "WEB_ATTACK"
         */
        public static final KeyEnum WEB_ATTACK = new KeyEnum("WEB_ATTACK");

        /**
         * Enum PRECISE for value: "PRECISE"
         */
        public static final KeyEnum PRECISE = new KeyEnum("PRECISE");

        /**
         * Enum CC for value: "CC"
         */
        public static final KeyEnum CC = new KeyEnum("CC");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("ACCESS", ACCESS);
            map.put("CRAWLER", CRAWLER);
            map.put("ATTACK", ATTACK);
            map.put("WEB_ATTACK", WEB_ATTACK);
            map.put("PRECISE", PRECISE);
            map.put("CC", CC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyEnum(String value) {
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
        public static KeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyEnum(value));
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyEnum) {
                return this.value.equals(((KeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private KeyEnum key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline")

    private List<TimeLineItem> timeline = null;

    public StatisticsTimelineItem withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释：** 键值标识，用于区分不同的防护统计类型 **约束限制：** 不涉及 **取值范围：**  - ACCESS:请求总量  - CRAWLER:Bot攻击防护  - ATTACK:攻击总量  - WEB_ATTACK:Web基础防护  - PRECISE:精准防护  - CC:CC攻击防护 **默认取值：** 不涉及
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    public StatisticsTimelineItem withTimeline(List<TimeLineItem> timeline) {
        this.timeline = timeline;
        return this;
    }

    public StatisticsTimelineItem addTimelineItem(TimeLineItem timelineItem) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        this.timeline.add(timelineItem);
        return this;
    }

    public StatisticsTimelineItem withTimeline(Consumer<List<TimeLineItem>> timelineSetter) {
        if (this.timeline == null) {
            this.timeline = new ArrayList<>();
        }
        timelineSetter.accept(this.timeline);
        return this;
    }

    /**
     * 对应键值的时间线统计数据
     * @return timeline
     */
    public List<TimeLineItem> getTimeline() {
        return timeline;
    }

    public void setTimeline(List<TimeLineItem> timeline) {
        this.timeline = timeline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticsTimelineItem that = (StatisticsTimelineItem) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.timeline, that.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsTimelineItem {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
