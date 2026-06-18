package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TenantCMKDto
 */
public class TenantCMKDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_key_name")

    private String cmkKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_key_id")

    private String cmkKeyId;

    /**
     * **参数解释：** 加密主密钥key的状态。 **取值范围：** 1表示待激活状态,2 表示启用状态,3 表示禁用状态,4 表示计划删除状态,5 表示等待导入状态。
     */
    public static final class KeyStateEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final KeyStateEnum _1 = new KeyStateEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final KeyStateEnum _2 = new KeyStateEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final KeyStateEnum _3 = new KeyStateEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final KeyStateEnum _4 = new KeyStateEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final KeyStateEnum _5 = new KeyStateEnum("5");

        private static final Map<String, KeyStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyStateEnum> createStaticFields() {
            Map<String, KeyStateEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyStateEnum(String value) {
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
        public static KeyStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyStateEnum(value));
        }

        public static KeyStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyStateEnum) {
                return this.value.equals(((KeyStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_state")

    private KeyStateEnum keyState;

    public TenantCMKDto withCmkKeyName(String cmkKeyName) {
        this.cmkKeyName = cmkKeyName;
        return this;
    }

    /**
     * **参数解释：** 加密主密钥的名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return cmkKeyName
     */
    public String getCmkKeyName() {
        return cmkKeyName;
    }

    public void setCmkKeyName(String cmkKeyName) {
        this.cmkKeyName = cmkKeyName;
    }

    public TenantCMKDto withCmkKeyId(String cmkKeyId) {
        this.cmkKeyId = cmkKeyId;
        return this;
    }

    /**
     * **参数解释：** 加密主密钥的id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return cmkKeyId
     */
    public String getCmkKeyId() {
        return cmkKeyId;
    }

    public void setCmkKeyId(String cmkKeyId) {
        this.cmkKeyId = cmkKeyId;
    }

    public TenantCMKDto withKeyState(KeyStateEnum keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * **参数解释：** 加密主密钥key的状态。 **取值范围：** 1表示待激活状态,2 表示启用状态,3 表示禁用状态,4 表示计划删除状态,5 表示等待导入状态。
     * @return keyState
     */
    public KeyStateEnum getKeyState() {
        return keyState;
    }

    public void setKeyState(KeyStateEnum keyState) {
        this.keyState = keyState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantCMKDto that = (TenantCMKDto) obj;
        return Objects.equals(this.cmkKeyName, that.cmkKeyName) && Objects.equals(this.cmkKeyId, that.cmkKeyId)
            && Objects.equals(this.keyState, that.keyState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmkKeyName, cmkKeyId, keyState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantCMKDto {\n");
        sb.append("    cmkKeyName: ").append(toIndentedString(cmkKeyName)).append("\n");
        sb.append("    cmkKeyId: ").append(toIndentedString(cmkKeyId)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
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
