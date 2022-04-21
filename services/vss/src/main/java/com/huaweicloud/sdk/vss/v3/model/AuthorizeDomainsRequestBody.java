package com.huaweicloud.sdk.vss.v3.model;

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
     * 认证方式:   * file - 文件认证   * auto - 一键认证 
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

        private static final Map<String, AuthModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthModeEnum> createStaticFields() {
            Map<String, AuthModeEnum> map = new HashMap<>();
            map.put("file", FILE);
            map.put("auto", AUTO);
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
            AuthModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthModeEnum(value);
            }
            return result;
        }

        public static AuthModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 域名
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
     * 认证方式:   * file - 文件认证   * auto - 一键认证 
     * @return authMode
     */
    public AuthModeEnum getAuthMode() {
        return authMode;
    }

    public void setAuthMode(AuthModeEnum authMode) {
        this.authMode = authMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizeDomainsRequestBody authorizeDomainsRequestBody = (AuthorizeDomainsRequestBody) o;
        return Objects.equals(this.domainName, authorizeDomainsRequestBody.domainName)
            && Objects.equals(this.authMode, authorizeDomainsRequestBody.authMode);
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
