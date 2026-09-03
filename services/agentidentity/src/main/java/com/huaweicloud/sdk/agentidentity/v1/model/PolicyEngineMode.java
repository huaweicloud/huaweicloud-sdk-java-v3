package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 策略集的强制模式。LOG_ONLY - 策略集会根据您的策略评估每个操作并添加工具调用是否允许或拒绝的跟踪，但不强制执行决策。使用此模式在启用强制执行之前测试和验证策略。ENFORCE - 策略集会根据您的策略评估操作并通过允许或拒绝代理操作来强制执行决策。在启用强制执行之前，请在 LOG_ONLY 模式下测试和验证策略，以避免意外拒绝或对生产流量产生不利影响。
 */
public class PolicyEngineMode {

    /**
     * Enum LOG_ONLY for value: "LOG_ONLY"
     */
    public static final PolicyEngineMode LOG_ONLY = new PolicyEngineMode("LOG_ONLY");

    /**
     * Enum ENFORCE for value: "ENFORCE"
     */
    public static final PolicyEngineMode ENFORCE = new PolicyEngineMode("ENFORCE");

    private static final Map<String, PolicyEngineMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyEngineMode> createStaticFields() {
        Map<String, PolicyEngineMode> map = new HashMap<>();
        map.put("LOG_ONLY", LOG_ONLY);
        map.put("ENFORCE", ENFORCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyEngineMode(String value) {
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
    public static PolicyEngineMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEngineMode(value));
    }

    public static PolicyEngineMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyEngineMode) {
            return this.value.equals(((PolicyEngineMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
