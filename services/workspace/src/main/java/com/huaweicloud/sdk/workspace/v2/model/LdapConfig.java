package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ldap认证配置
 */
public class LdapConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_dn")

    private String baseDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administrator_dn")

    private String administratorDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administrator_password")

    private String administratorPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_dn")

    private String userDn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ssl")

    private Boolean useSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content")

    private String certContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username_attribute")

    private String usernameAttribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_class")

    private String objectClass;

    /**
     * 安全类型
     */
    public static final class SecurityTypeEnum {

        /**
         * Enum USE_SSL for value: "USE_SSL"
         */
        public static final SecurityTypeEnum USE_SSL = new SecurityTypeEnum("USE_SSL");

        /**
         * Enum USE_TLS for value: "USE_TLS"
         */
        public static final SecurityTypeEnum USE_TLS = new SecurityTypeEnum("USE_TLS");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final SecurityTypeEnum CLOSE = new SecurityTypeEnum("CLOSE");

        private static final Map<String, SecurityTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecurityTypeEnum> createStaticFields() {
            Map<String, SecurityTypeEnum> map = new HashMap<>();
            map.put("USE_SSL", USE_SSL);
            map.put("USE_TLS", USE_TLS);
            map.put("CLOSE", CLOSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecurityTypeEnum(String value) {
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
        public static SecurityTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecurityTypeEnum(value));
        }

        public static SecurityTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecurityTypeEnum) {
                return this.value.equals(((SecurityTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_type")

    private SecurityTypeEnum securityType;

    public LdapConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * host
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public LdapConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口,取值范围1-65535,默认389
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public LdapConfig withBaseDn(String baseDn) {
        this.baseDn = baseDn;
        return this;
    }

    /**
     * base_dn
     * @return baseDn
     */
    public String getBaseDn() {
        return baseDn;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public LdapConfig withAdministratorDn(String administratorDn) {
        this.administratorDn = administratorDn;
        return this;
    }

    /**
     * 管理员dn
     * @return administratorDn
     */
    public String getAdministratorDn() {
        return administratorDn;
    }

    public void setAdministratorDn(String administratorDn) {
        this.administratorDn = administratorDn;
    }

    public LdapConfig withAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword;
        return this;
    }

    /**
     * 管理员密码
     * @return administratorPassword
     */
    public String getAdministratorPassword() {
        return administratorPassword;
    }

    public void setAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword;
    }

    public LdapConfig withUserDn(String userDn) {
        this.userDn = userDn;
        return this;
    }

    /**
     * 用户dn
     * @return userDn
     */
    public String getUserDn() {
        return userDn;
    }

    public void setUserDn(String userDn) {
        this.userDn = userDn;
    }

    public LdapConfig withUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
        return this;
    }

    /**
     * 是否启用ssl
     * @return useSsl
     */
    public Boolean getUseSsl() {
        return useSsl;
    }

    public void setUseSsl(Boolean useSsl) {
        this.useSsl = useSsl;
    }

    public LdapConfig withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    /**
     * 证书
     * @return certContent
     */
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    public LdapConfig withUsernameAttribute(String usernameAttribute) {
        this.usernameAttribute = usernameAttribute;
        return this;
    }

    /**
     * 用户名属性
     * @return usernameAttribute
     */
    public String getUsernameAttribute() {
        return usernameAttribute;
    }

    public void setUsernameAttribute(String usernameAttribute) {
        this.usernameAttribute = usernameAttribute;
    }

    public LdapConfig withObjectClass(String objectClass) {
        this.objectClass = objectClass;
        return this;
    }

    /**
     * 用户ObjectClass
     * @return objectClass
     */
    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public LdapConfig withSecurityType(SecurityTypeEnum securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * 安全类型
     * @return securityType
     */
    public SecurityTypeEnum getSecurityType() {
        return securityType;
    }

    public void setSecurityType(SecurityTypeEnum securityType) {
        this.securityType = securityType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LdapConfig that = (LdapConfig) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.port, that.port)
            && Objects.equals(this.baseDn, that.baseDn) && Objects.equals(this.administratorDn, that.administratorDn)
            && Objects.equals(this.administratorPassword, that.administratorPassword)
            && Objects.equals(this.userDn, that.userDn) && Objects.equals(this.useSsl, that.useSsl)
            && Objects.equals(this.certContent, that.certContent)
            && Objects.equals(this.usernameAttribute, that.usernameAttribute)
            && Objects.equals(this.objectClass, that.objectClass)
            && Objects.equals(this.securityType, that.securityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host,
            port,
            baseDn,
            administratorDn,
            administratorPassword,
            userDn,
            useSsl,
            certContent,
            usernameAttribute,
            objectClass,
            securityType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LdapConfig {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
        sb.append("    administratorDn: ").append(toIndentedString(administratorDn)).append("\n");
        sb.append("    administratorPassword: ").append(toIndentedString(administratorPassword)).append("\n");
        sb.append("    userDn: ").append(toIndentedString(userDn)).append("\n");
        sb.append("    useSsl: ").append(toIndentedString(useSsl)).append("\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
        sb.append("    usernameAttribute: ").append(toIndentedString(usernameAttribute)).append("\n");
        sb.append("    objectClass: ").append(toIndentedString(objectClass)).append("\n");
        sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
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
