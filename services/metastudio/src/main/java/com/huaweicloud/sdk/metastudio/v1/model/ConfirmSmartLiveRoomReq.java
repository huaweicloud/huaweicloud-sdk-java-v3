package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 确认直播间剧本请求
 */
public class ConfirmSmartLiveRoomReq {

    /**
     * 确认操作。 * confirm: 确认。 * reject: 拒绝。
     */
    public static final class ActionEnum {

        /**
         * Enum CONFIRM for value: "confirm"
         */
        public static final ActionEnum CONFIRM = new ActionEnum("confirm");

        /**
         * Enum REJECT for value: "reject"
         */
        public static final ActionEnum REJECT = new ActionEnum("reject");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("confirm", CONFIRM);
            map.put("reject", REJECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_version")

    private String scriptVersion;

    public ConfirmSmartLiveRoomReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 确认操作。 * confirm: 确认。 * reject: 拒绝。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ConfirmSmartLiveRoomReq withScriptVersion(String scriptVersion) {
        this.scriptVersion = scriptVersion;
        return this;
    }

    /**
     * 剧本版本。从查询直播间详情接口中获取。
     * @return scriptVersion
     */
    public String getScriptVersion() {
        return scriptVersion;
    }

    public void setScriptVersion(String scriptVersion) {
        this.scriptVersion = scriptVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmSmartLiveRoomReq that = (ConfirmSmartLiveRoomReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.scriptVersion, that.scriptVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, scriptVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmSmartLiveRoomReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    scriptVersion: ").append(toIndentedString(scriptVersion)).append("\n");
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
