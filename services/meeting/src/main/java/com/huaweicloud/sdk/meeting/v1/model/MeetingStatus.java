package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 会议状态。 - schedule:预定状态 - created:会议已经被创建并正在召开 - destroyed:会议已经关闭 
 */
public class MeetingStatus {

    /**
     * Enum SCHEDULE for value: "schedule"
     */
    public static final MeetingStatus SCHEDULE = new MeetingStatus("schedule");

    /**
     * Enum CREATED for value: "created"
     */
    public static final MeetingStatus CREATED = new MeetingStatus("created");

    /**
     * Enum DESTROYED for value: "destroyed"
     */
    public static final MeetingStatus DESTROYED = new MeetingStatus("destroyed");

    private static final Map<String, MeetingStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, MeetingStatus> createStaticFields() {
        Map<String, MeetingStatus> map = new HashMap<>();
        map.put("schedule", SCHEDULE);
        map.put("created", CREATED);
        map.put("destroyed", DESTROYED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MeetingStatus(String value) {
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
    public static MeetingStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MeetingStatus(value));
    }

    public static MeetingStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MeetingStatus) {
            return this.value.equals(((MeetingStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
