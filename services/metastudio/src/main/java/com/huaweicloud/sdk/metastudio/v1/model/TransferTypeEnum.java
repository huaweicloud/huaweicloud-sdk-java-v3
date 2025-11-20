package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 转移类型。默认值是TRANSFER_OUT。 **约束限制**： * 只有管理员或者开了资产转移白名单租户才有权限转出资产。 * 普通租户有权限转回已接收成功的资产，转回给转移发起方。 **取值范围**： * TRANSFER_OUT: 资产转出 * TRANSFER_BACK：资产转回
 */
public class TransferTypeEnum {

    /**
     * Enum TRANSFER_OUT for value: "TRANSFER_OUT"
     */
    public static final TransferTypeEnum TRANSFER_OUT = new TransferTypeEnum("TRANSFER_OUT");

    /**
     * Enum TRANSFER_BACK for value: "TRANSFER_BACK"
     */
    public static final TransferTypeEnum TRANSFER_BACK = new TransferTypeEnum("TRANSFER_BACK");

    private static final Map<String, TransferTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, TransferTypeEnum> createStaticFields() {
        Map<String, TransferTypeEnum> map = new HashMap<>();
        map.put("TRANSFER_OUT", TRANSFER_OUT);
        map.put("TRANSFER_BACK", TRANSFER_BACK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TransferTypeEnum(String value) {
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
    public static TransferTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransferTypeEnum(value));
    }

    public static TransferTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TransferTypeEnum) {
            return this.value.equals(((TransferTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
