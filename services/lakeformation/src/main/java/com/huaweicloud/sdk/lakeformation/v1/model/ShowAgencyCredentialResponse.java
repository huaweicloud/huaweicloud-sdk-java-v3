package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgencyCredentialResponse extends SdkResponse {

    /**
     * 委托类型：TABLE_SERVICE_TRUST-表服务委托。
     */
    public static final class AgencyTypeEnum {

        /**
         * Enum TABLE_SERVICE_TRUST for value: "TABLE_SERVICE_TRUST"
         */
        public static final AgencyTypeEnum TABLE_SERVICE_TRUST = new AgencyTypeEnum("TABLE_SERVICE_TRUST");

        private static final Map<String, AgencyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyTypeEnum> createStaticFields() {
            Map<String, AgencyTypeEnum> map = new HashMap<>();
            map.put("TABLE_SERVICE_TRUST", TABLE_SERVICE_TRUST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyTypeEnum(String value) {
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
        public static AgencyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyTypeEnum(value));
        }

        public static AgencyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyTypeEnum) {
                return this.value.equals(((AgencyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_type")

    private AgencyTypeEnum agencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issued_at")

    private String issuedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access")

    private String access;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    public ShowAgencyCredentialResponse withAgencyType(AgencyTypeEnum agencyType) {
        this.agencyType = agencyType;
        return this;
    }

    /**
     * 委托类型：TABLE_SERVICE_TRUST-表服务委托。
     * @return agencyType
     */
    public AgencyTypeEnum getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(AgencyTypeEnum agencyType) {
        this.agencyType = agencyType;
    }

    public ShowAgencyCredentialResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowAgencyCredentialResponse withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * security token
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public ShowAgencyCredentialResponse withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * token到期时间
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public ShowAgencyCredentialResponse withIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }

    /**
     * token下发时间
     * @return issuedAt
     */
    public String getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public ShowAgencyCredentialResponse withAccess(String access) {
        this.access = access;
        return this;
    }

    /**
     * ak
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public ShowAgencyCredentialResponse withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * sk
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyCredentialResponse that = (ShowAgencyCredentialResponse) obj;
        return Objects.equals(this.agencyType, that.agencyType) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.securityToken, that.securityToken) && Objects.equals(this.expiresAt, that.expiresAt)
            && Objects.equals(this.issuedAt, that.issuedAt) && Objects.equals(this.access, that.access)
            && Objects.equals(this.secret, that.secret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyType, agencyName, securityToken, expiresAt, issuedAt, access, secret);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyCredentialResponse {\n");
        sb.append("    agencyType: ").append(toIndentedString(agencyType)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
