package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 服务器管理状态 **约束限制**： 不涉及 **取值范围** - onboard：上架中，用户下单，完成LLD设计。 - ready：交付完成，完成硬装、网调、服务器初始化、软调及转维验收。 - in-use：使用中，用户发放裸机。 - frozen：冻结，因欠费导致资源冻结。 - offboarding：下架中。  &#x60;&#x60;&#x60;mermaid stateDiagram-v2    [*] --&gt; onboard : 完成LLD设计   onboard --&gt; ready : 完成网调、服务器初始化、软调及转维验收   ready --&gt; in_use : 发放裸机实例   ready --&gt; offboarding : 请求下架   ready --&gt; frozen : 欠费      in_use --&gt; ready : 删除裸机实例   in_use --&gt; frozen : 欠费    frozen --&gt; offboarding : 请求下架   in_use --&gt; offboarding : 请求下架   offboarding --&gt; [*] : 完成下架   state \&quot;in-use\&quot; as in_use &#x60;&#x60;&#x60;
 */
public class ManageState {

    /**
     * Enum DELIVERING for value: "delivering"
     */
    public static final ManageState DELIVERING = new ManageState("delivering");

    /**
     * Enum RECEIVED for value: "received"
     */
    public static final ManageState RECEIVED = new ManageState("received");

    /**
     * Enum ONBOARD for value: "onboard"
     */
    public static final ManageState ONBOARD = new ManageState("onboard");

    /**
     * Enum READY for value: "ready"
     */
    public static final ManageState READY = new ManageState("ready");

    /**
     * Enum FROZEN for value: "frozen"
     */
    public static final ManageState FROZEN = new ManageState("frozen");

    private static final Map<String, ManageState> STATIC_FIELDS = createStaticFields();

    private static Map<String, ManageState> createStaticFields() {
        Map<String, ManageState> map = new HashMap<>();
        map.put("delivering", DELIVERING);
        map.put("received", RECEIVED);
        map.put("onboard", ONBOARD);
        map.put("ready", READY);
        map.put("frozen", FROZEN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ManageState(String value) {
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
    public static ManageState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManageState(value));
    }

    public static ManageState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ManageState) {
            return this.value.equals(((ManageState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
