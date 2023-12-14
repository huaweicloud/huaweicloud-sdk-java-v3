package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CallbackUrl
 */
public class CallbackUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_sign_key")

    private String authSignKey;

    /**
     * 接收回调通知服务器所在区域。 包含如下取值： - mainland_china：中国大陆区域。 - outside_mainland_china：中国大陆以外区域。
     */
    public static final class CallBackAreaEnum {

        /**
         * Enum MAINLAND_CHINA for value: "mainland_china"
         */
        public static final CallBackAreaEnum MAINLAND_CHINA = new CallBackAreaEnum("mainland_china");

        /**
         * Enum OUTSIDE_MAINLAND_CHINA for value: "outside_mainland_china"
         */
        public static final CallBackAreaEnum OUTSIDE_MAINLAND_CHINA = new CallBackAreaEnum("outside_mainland_china");

        private static final Map<String, CallBackAreaEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CallBackAreaEnum> createStaticFields() {
            Map<String, CallBackAreaEnum> map = new HashMap<>();
            map.put("mainland_china", MAINLAND_CHINA);
            map.put("outside_mainland_china", OUTSIDE_MAINLAND_CHINA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CallBackAreaEnum(String value) {
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
        public static CallBackAreaEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CallBackAreaEnum(value));
        }

        public static CallBackAreaEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CallBackAreaEnum) {
                return this.value.equals(((CallBackAreaEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_back_area")

    private CallBackAreaEnum callBackArea;

    public CallbackUrl withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 回调地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CallbackUrl withAuthSignKey(String authSignKey) {
        this.authSignKey = authSignKey;
        return this;
    }

    /**
     * 鉴权密钥
     * @return authSignKey
     */
    public String getAuthSignKey() {
        return authSignKey;
    }

    public void setAuthSignKey(String authSignKey) {
        this.authSignKey = authSignKey;
    }

    public CallbackUrl withCallBackArea(CallBackAreaEnum callBackArea) {
        this.callBackArea = callBackArea;
        return this;
    }

    /**
     * 接收回调通知服务器所在区域。 包含如下取值： - mainland_china：中国大陆区域。 - outside_mainland_china：中国大陆以外区域。
     * @return callBackArea
     */
    public CallBackAreaEnum getCallBackArea() {
        return callBackArea;
    }

    public void setCallBackArea(CallBackAreaEnum callBackArea) {
        this.callBackArea = callBackArea;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CallbackUrl that = (CallbackUrl) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.authSignKey, that.authSignKey)
            && Objects.equals(this.callBackArea, that.callBackArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, authSignKey, callBackArea);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallbackUrl {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    authSignKey: ").append(toIndentedString(authSignKey)).append("\n");
        sb.append("    callBackArea: ").append(toIndentedString(callBackArea)).append("\n");
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
