package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 登录主机鉴权，使用密码登录则填写密码即可，使用密钥则填写密钥，二选一即可。
 */
public class DeploymentHostAuthorizationBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    /**
     * 认证类型，0表示使用密码认证，1表示使用密钥认证
     */
    public static final class TrustedTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TrustedTypeEnum NUMBER_0 = new TrustedTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TrustedTypeEnum NUMBER_1 = new TrustedTypeEnum(1);

        private static final Map<Integer, TrustedTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TrustedTypeEnum> createStaticFields() {
            Map<Integer, TrustedTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TrustedTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TrustedTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            TrustedTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TrustedTypeEnum(value);
            }
            return result;
        }

        public static TrustedTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            TrustedTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TrustedTypeEnum) {
                return this.value.equals(((TrustedTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trusted_type")

    private TrustedTypeEnum trustedType;

    public DeploymentHostAuthorizationBody withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名，可输入中英文，数字和符号(-_.)。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DeploymentHostAuthorizationBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码，认证类型为0时，密码必填。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DeploymentHostAuthorizationBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 密钥，认证类型为1时，密钥必填
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public DeploymentHostAuthorizationBody withTrustedType(TrustedTypeEnum trustedType) {
        this.trustedType = trustedType;
        return this;
    }

    /**
     * 认证类型，0表示使用密码认证，1表示使用密钥认证
     * @return trustedType
     */
    public TrustedTypeEnum getTrustedType() {
        return trustedType;
    }

    public void setTrustedType(TrustedTypeEnum trustedType) {
        this.trustedType = trustedType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentHostAuthorizationBody deploymentHostAuthorizationBody = (DeploymentHostAuthorizationBody) o;
        return Objects.equals(this.username, deploymentHostAuthorizationBody.username)
            && Objects.equals(this.password, deploymentHostAuthorizationBody.password)
            && Objects.equals(this.privateKey, deploymentHostAuthorizationBody.privateKey)
            && Objects.equals(this.trustedType, deploymentHostAuthorizationBody.trustedType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, privateKey, trustedType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentHostAuthorizationBody {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    trustedType: ").append(toIndentedString(trustedType)).append("\n");
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
