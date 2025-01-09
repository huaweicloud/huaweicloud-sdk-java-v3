package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 实例类型： * &#x60;INIT&#x60; - 初始化中 * &#x60;WAITING&#x60; - 等待安装结束 * &#x60;SUCCESS&#x60; - 成功 * &#x60;FAIL&#x60; - 失败
 */
public class JobStatus {

    /**
     * Enum INIT for value: "INIT"
     */
    public static final JobStatus INIT = new JobStatus("INIT");

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final JobStatus WAITING = new JobStatus("WAITING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final JobStatus SUCCESS = new JobStatus("SUCCESS");

    /**
     * Enum FAIL for value: "FAIL"
     */
    public static final JobStatus FAIL = new JobStatus("FAIL");

    private static final Map<String, JobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobStatus> createStaticFields() {
        Map<String, JobStatus> map = new HashMap<>();
        map.put("INIT", INIT);
        map.put("WAITING", WAITING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAIL", FAIL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobStatus(String value) {
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
    public static JobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatus(value));
    }

    public static JobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobStatus) {
            return this.value.equals(((JobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
