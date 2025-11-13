package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 反馈类型。 **约束限制**： 不涉及 **取值范围**： * upvote：点赞 * downvote：点踩 * none：取消反馈 **默认取值**： 不涉及
 */
public class FeedbackType {

    /**
     * Enum UPVOTE for value: "upvote"
     */
    public static final FeedbackType UPVOTE = new FeedbackType("upvote");

    /**
     * Enum DOWNVOTE for value: "downvote"
     */
    public static final FeedbackType DOWNVOTE = new FeedbackType("downvote");

    /**
     * Enum NONE for value: "none"
     */
    public static final FeedbackType NONE = new FeedbackType("none");

    private static final Map<String, FeedbackType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FeedbackType> createStaticFields() {
        Map<String, FeedbackType> map = new HashMap<>();
        map.put("upvote", UPVOTE);
        map.put("downvote", DOWNVOTE);
        map.put("none", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FeedbackType(String value) {
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
    public static FeedbackType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeedbackType(value));
    }

    public static FeedbackType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FeedbackType) {
            return this.value.equals(((FeedbackType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
