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
 * KeyChainInfo
 */
public class KeyChainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * 计算鉴权串的方式： - d_sha256：鉴权方式D，采用HMAC-SHA256算法，建议优先选择此方式； - c_aes：鉴权方式C，采用对称加密算法； - b_md5：鉴权方式B，采用MD5信息摘要算法； - a_md5：鉴权方式A，采用MD5信息摘要算法。  > 鉴权方式ABC存在安全风险，鉴权方式D拥有更高的安全性，建议您优先使用鉴权方式D。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum D_SHA256 for value: "d_sha256"
         */
        public static final AuthTypeEnum D_SHA256 = new AuthTypeEnum("d_sha256");

        /**
         * Enum C_AES for value: "c_aes"
         */
        public static final AuthTypeEnum C_AES = new AuthTypeEnum("c_aes");

        /**
         * Enum B_MD5 for value: "b_md5"
         */
        public static final AuthTypeEnum B_MD5 = new AuthTypeEnum("b_md5");

        /**
         * Enum A_MD5 for value: "a_md5"
         */
        public static final AuthTypeEnum A_MD5 = new AuthTypeEnum("a_md5");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("d_sha256", D_SHA256);
            map.put("c_aes", C_AES);
            map.put("b_md5", B_MD5);
            map.put("a_md5", A_MD5);
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
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTypeEnum(value);
            }
            return result;
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "timeout")

    private Integer timeout;

    public KeyChainInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 防盗链Key值，由32个字符组成，支持大写字母、小写字母、数字。不可为纯数字或纯字母。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public KeyChainInfo withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 计算鉴权串的方式： - d_sha256：鉴权方式D，采用HMAC-SHA256算法，建议优先选择此方式； - c_aes：鉴权方式C，采用对称加密算法； - b_md5：鉴权方式B，采用MD5信息摘要算法； - a_md5：鉴权方式A，采用MD5信息摘要算法。  > 鉴权方式ABC存在安全风险，鉴权方式D拥有更高的安全性，建议您优先使用鉴权方式D。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public KeyChainInfo withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * URL鉴权信息的超时时长  取值范围：[60，2592000]，即1分钟-30天  单位：秒  鉴权信息中携带的请求时间与直播服务收到请求时的时间的最大差值，用于检查直播推流URL或者直播播放URL是否已过期
     * minimum: 60
     * maximum: 2592000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyChainInfo keyChainInfo = (KeyChainInfo) o;
        return Objects.equals(this.key, keyChainInfo.key) && Objects.equals(this.authType, keyChainInfo.authType)
            && Objects.equals(this.timeout, keyChainInfo.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, authType, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyChainInfo {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
