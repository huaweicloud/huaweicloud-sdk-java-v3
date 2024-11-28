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
 * 直播平台授权信息
 */
public class PlatformAuthorizationInfo {

    /**
     * 授权状态。 * AUTHORIZED: 已授权 * UNAUTHORIZED: 未授权
     */
    public static final class AuthorizeStateEnum {

        /**
         * Enum AUTHORIZED for value: "AUTHORIZED"
         */
        public static final AuthorizeStateEnum AUTHORIZED = new AuthorizeStateEnum("AUTHORIZED");

        /**
         * Enum UNAUTHORIZED for value: "UNAUTHORIZED"
         */
        public static final AuthorizeStateEnum UNAUTHORIZED = new AuthorizeStateEnum("UNAUTHORIZED");

        private static final Map<String, AuthorizeStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthorizeStateEnum> createStaticFields() {
            Map<String, AuthorizeStateEnum> map = new HashMap<>();
            map.put("AUTHORIZED", AUTHORIZED);
            map.put("UNAUTHORIZED", UNAUTHORIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthorizeStateEnum(String value) {
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
        public static AuthorizeStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthorizeStateEnum(value));
        }

        public static AuthorizeStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthorizeStateEnum) {
                return this.value.equals(((AuthorizeStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorize_state")

    private AuthorizeStateEnum authorizeState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized_time")

    private String authorizedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    public PlatformAuthorizationInfo withAuthorizeState(AuthorizeStateEnum authorizeState) {
        this.authorizeState = authorizeState;
        return this;
    }

    /**
     * 授权状态。 * AUTHORIZED: 已授权 * UNAUTHORIZED: 未授权
     * @return authorizeState
     */
    public AuthorizeStateEnum getAuthorizeState() {
        return authorizeState;
    }

    public void setAuthorizeState(AuthorizeStateEnum authorizeState) {
        this.authorizeState = authorizeState;
    }

    public PlatformAuthorizationInfo withAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
        return this;
    }

    /**
     * 授权时间
     * @return authorizedTime
     */
    public String getAuthorizedTime() {
        return authorizedTime;
    }

    public void setAuthorizedTime(String authorizedTime) {
        this.authorizedTime = authorizedTime;
    }

    public PlatformAuthorizationInfo withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public PlatformAuthorizationInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 授权账号信息。 美团平台对应：opBizCode
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformAuthorizationInfo that = (PlatformAuthorizationInfo) obj;
        return Objects.equals(this.authorizeState, that.authorizeState)
            && Objects.equals(this.authorizedTime, that.authorizedTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizeState, authorizedTime, expireTime, account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlatformAuthorizationInfo {\n");
        sb.append("    authorizeState: ").append(toIndentedString(authorizeState)).append("\n");
        sb.append("    authorizedTime: ").append(toIndentedString(authorizedTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
