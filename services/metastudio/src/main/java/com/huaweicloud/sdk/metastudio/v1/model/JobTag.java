package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务标签。 * ECOMMERCE: 电商 * NEWS: 新闻 * MARKETING: 营销 * LIVE: 直播 * EDUCATION: 教培 * CUSTOMER: 客服 * STORYTELLING: 故事
 */
public class JobTag {

    /**
     * Enum ECOMMERCE for value: "ECOMMERCE"
     */
    public static final JobTag ECOMMERCE = new JobTag("ECOMMERCE");

    /**
     * Enum NEWS for value: "NEWS"
     */
    public static final JobTag NEWS = new JobTag("NEWS");

    /**
     * Enum MARKETING for value: "MARKETING"
     */
    public static final JobTag MARKETING = new JobTag("MARKETING");

    /**
     * Enum LIVE for value: "LIVE"
     */
    public static final JobTag LIVE = new JobTag("LIVE");

    /**
     * Enum EDUCATION for value: "EDUCATION"
     */
    public static final JobTag EDUCATION = new JobTag("EDUCATION");

    /**
     * Enum CUSTOMER for value: "CUSTOMER"
     */
    public static final JobTag CUSTOMER = new JobTag("CUSTOMER");

    /**
     * Enum STORYTELLING for value: "STORYTELLING"
     */
    public static final JobTag STORYTELLING = new JobTag("STORYTELLING");

    private static final Map<String, JobTag> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobTag> createStaticFields() {
        Map<String, JobTag> map = new HashMap<>();
        map.put("ECOMMERCE", ECOMMERCE);
        map.put("NEWS", NEWS);
        map.put("MARKETING", MARKETING);
        map.put("LIVE", LIVE);
        map.put("EDUCATION", EDUCATION);
        map.put("CUSTOMER", CUSTOMER);
        map.put("STORYTELLING", STORYTELLING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobTag(String value) {
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
    public static JobTag fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTag(value));
    }

    public static JobTag valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobTag) {
            return this.value.equals(((JobTag) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
