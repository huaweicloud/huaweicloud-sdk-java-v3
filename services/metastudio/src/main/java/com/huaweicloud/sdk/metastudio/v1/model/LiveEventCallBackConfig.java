package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 直播事件回调通知配置
 */
public class LiveEventCallBackConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_event_type_callback_url")

    private String liveEventTypeCallbackUrl;

    /**
     * 认证类型。 * NONE。URL中自带认证。 * MSS_A。HMACSHA256签名模式，在URL中追加参数:hwSecret,hwTime。取值方式：hwSecret=hmac_sha256(Key, URI（live_event_callback_url）+ hwTime)&hwTime=hex(timestamp)
     */
    public static final class AuthTypeEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthTypeEnum NONE = new AuthTypeEnum("NONE");

        /**
         * Enum MSS_A for value: "MSS_A"
         */
        public static final AuthTypeEnum MSS_A = new AuthTypeEnum("MSS_A");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("MSS_A", MSS_A);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_event_type")

    private List<String> callbackEventType = null;

    public LiveEventCallBackConfig withLiveEventTypeCallbackUrl(String liveEventTypeCallbackUrl) {
        this.liveEventTypeCallbackUrl = liveEventTypeCallbackUrl;
        return this;
    }

    /**
     * 直播事件回调地址。https地址，需自带鉴权串。
     * @return liveEventTypeCallbackUrl
     */
    public String getLiveEventTypeCallbackUrl() {
        return liveEventTypeCallbackUrl;
    }

    public void setLiveEventTypeCallbackUrl(String liveEventTypeCallbackUrl) {
        this.liveEventTypeCallbackUrl = liveEventTypeCallbackUrl;
    }

    public LiveEventCallBackConfig withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型。 * NONE。URL中自带认证。 * MSS_A。HMACSHA256签名模式，在URL中追加参数:hwSecret,hwTime。取值方式：hwSecret=hmac_sha256(Key, URI（live_event_callback_url）+ hwTime)&hwTime=hex(timestamp)
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public LiveEventCallBackConfig withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 密钥Key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LiveEventCallBackConfig withCallbackEventType(List<String> callbackEventType) {
        this.callbackEventType = callbackEventType;
        return this;
    }

    public LiveEventCallBackConfig addCallbackEventTypeItem(String callbackEventTypeItem) {
        if (this.callbackEventType == null) {
            this.callbackEventType = new ArrayList<>();
        }
        this.callbackEventType.add(callbackEventTypeItem);
        return this;
    }

    public LiveEventCallBackConfig withCallbackEventType(Consumer<List<String>> callbackEventTypeSetter) {
        if (this.callbackEventType == null) {
            this.callbackEventType = new ArrayList<>();
        }
        callbackEventTypeSetter.accept(this.callbackEventType);
        return this;
    }

    /**
     * 回调的直播事件类型列表
     * @return callbackEventType
     */
    public List<String> getCallbackEventType() {
        return callbackEventType;
    }

    public void setCallbackEventType(List<String> callbackEventType) {
        this.callbackEventType = callbackEventType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveEventCallBackConfig that = (LiveEventCallBackConfig) obj;
        return Objects.equals(this.liveEventTypeCallbackUrl, that.liveEventTypeCallbackUrl)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.key, that.key)
            && Objects.equals(this.callbackEventType, that.callbackEventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveEventTypeCallbackUrl, authType, key, callbackEventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveEventCallBackConfig {\n");
        sb.append("    liveEventTypeCallbackUrl: ").append(toIndentedString(liveEventTypeCallbackUrl)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    callbackEventType: ").append(toIndentedString(callbackEventType)).append("\n");
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
