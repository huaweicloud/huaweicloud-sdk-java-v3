package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AuthorizeDomainsRequestBody
 */
public class AuthorizeDomainsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    /**
     * 认证方式:   * file - 文件认证   * auto - 一键认证   * free - 免认证，选择此项默认已阅读并了解下述使用要求           使用须知：           1、您的账号已完成实名认证，且非受限账号。           2、您确认您已获得对扫描对象进行扫描的相关合法权利。           3、您确认您的扫描行为有合法合理目的，且符合适用的法律法规要求，不得利用本服务从事任何黑灰产等非法活动。           4、若您违反上述承诺，我们有权立即终止您对本服务的使用，并要求您对我们及相关第三方因此遭受的损失进行赔偿。 
     */
    public static final class AuthModeEnum {

        /**
         * Enum FILE for value: "file"
         */
        public static final AuthModeEnum FILE = new AuthModeEnum("file");

        /**
         * Enum AUTO for value: "auto"
         */
        public static final AuthModeEnum AUTO = new AuthModeEnum("auto");

        /**
         * Enum FREE for value: "free"
         */
        public static final AuthModeEnum FREE = new AuthModeEnum("free");

        private static final Map<String, AuthModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthModeEnum> createStaticFields() {
            Map<String, AuthModeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("auto", AUTO);
            map.put("free", FREE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthModeEnum(String value) {
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
        public static AuthModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthModeEnum(value));
        }

        public static AuthModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthModeEnum) {
                return this.value.equals(((AuthModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_mode")

    private AuthModeEnum authMode;

    public AuthorizeDomainsRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 网站域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AuthorizeDomainsRequestBody withAuthMode(AuthModeEnum authMode) {
        this.authMode = authMode;
        return this;
    }

    /**
     * 认证方式:   * file - 文件认证   * auto - 一键认证   * free - 免认证，选择此项默认已阅读并了解下述使用要求           使用须知：           1、您的账号已完成实名认证，且非受限账号。           2、您确认您已获得对扫描对象进行扫描的相关合法权利。           3、您确认您的扫描行为有合法合理目的，且符合适用的法律法规要求，不得利用本服务从事任何黑灰产等非法活动。           4、若您违反上述承诺，我们有权立即终止您对本服务的使用，并要求您对我们及相关第三方因此遭受的损失进行赔偿。 
     * @return authMode
     */
    public AuthModeEnum getAuthMode() {
        return authMode;
    }

    public void setAuthMode(AuthModeEnum authMode) {
        this.authMode = authMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeDomainsRequestBody that = (AuthorizeDomainsRequestBody) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.authMode, that.authMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName, authMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeDomainsRequestBody {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
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
