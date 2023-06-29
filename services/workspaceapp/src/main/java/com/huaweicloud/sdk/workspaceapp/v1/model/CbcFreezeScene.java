package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 更新云服务状态的业务场景，默认&#x60;ARREAR&#x60;。 * &#x60;ARREAR&#x60; - 欠费场景；为正常的运营业务场景，包括包周期资源到期、按需资源扣费失败 * &#x60;POLICE&#x60; - 公安冻结场景 * &#x60;ILLEGAL&#x60; - 违规冻结场景 * &#x60;VERIFY&#x60; - 客户未实名认证冻结场景 * &#x60;PARTNER&#x60; - 合作伙伴冻结（合作伙伴冻结子客户资源）
 */
public class CbcFreezeScene {

    /**
     * Enum ARREAR for value: "ARREAR"
     */
    public static final CbcFreezeScene ARREAR = new CbcFreezeScene("ARREAR");

    /**
     * Enum POLICE for value: "POLICE"
     */
    public static final CbcFreezeScene POLICE = new CbcFreezeScene("POLICE");

    /**
     * Enum ILLEGAL for value: "ILLEGAL"
     */
    public static final CbcFreezeScene ILLEGAL = new CbcFreezeScene("ILLEGAL");

    /**
     * Enum VERIFY for value: "VERIFY"
     */
    public static final CbcFreezeScene VERIFY = new CbcFreezeScene("VERIFY");

    /**
     * Enum PARTNER for value: "PARTNER"
     */
    public static final CbcFreezeScene PARTNER = new CbcFreezeScene("PARTNER");

    private static final Map<String, CbcFreezeScene> STATIC_FIELDS = createStaticFields();

    private static Map<String, CbcFreezeScene> createStaticFields() {
        Map<String, CbcFreezeScene> map = new HashMap<>();
        map.put("ARREAR", ARREAR);
        map.put("POLICE", POLICE);
        map.put("ILLEGAL", ILLEGAL);
        map.put("VERIFY", VERIFY);
        map.put("PARTNER", PARTNER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    CbcFreezeScene(String value) {
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
    public static CbcFreezeScene fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CbcFreezeScene(value));
    }

    public static CbcFreezeScene valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CbcFreezeScene) {
            return this.value.equals(((CbcFreezeScene) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
