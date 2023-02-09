package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 角色拥有的用户/用户模型
 */
public class UserRole {

    /**
     * 主体类型 USER用户 GROUP组
     */
    public static final class PrincipalTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final PrincipalTypeEnum USER = new PrincipalTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final PrincipalTypeEnum GROUP = new PrincipalTypeEnum("GROUP");

        private static final Map<String, PrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalTypeEnum> createStaticFields() {
            Map<String, PrincipalTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalTypeEnum(String value) {
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
        public static PrincipalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalTypeEnum(value);
            }
            return result;
        }

        public static PrincipalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalTypeEnum) {
                return this.value.equals(((PrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_type")

    private PrincipalTypeEnum principalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_name")

    private String principalName;

    /**
     * 主体来源 IAM云用户 SAML联邦 LDAP ld用户 LOCAL 本地用户 OTHER 其它
     */
    public static final class PrincipalSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final PrincipalSourceEnum IAM = new PrincipalSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final PrincipalSourceEnum SAML = new PrincipalSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final PrincipalSourceEnum LDAP = new PrincipalSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PrincipalSourceEnum LOCAL = new PrincipalSourceEnum("LOCAL");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final PrincipalSourceEnum OTHER = new PrincipalSourceEnum("OTHER");

        private static final Map<String, PrincipalSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalSourceEnum> createStaticFields() {
            Map<String, PrincipalSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalSourceEnum(String value) {
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
        public static PrincipalSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalSourceEnum(value);
            }
            return result;
        }

        public static PrincipalSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalSourceEnum) {
                return this.value.equals(((PrincipalSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_source")

    private PrincipalSourceEnum principalSource;

    public UserRole withPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * 主体类型 USER用户 GROUP组
     * @return principalType
     */
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    public UserRole withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * 主体名称
     * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public UserRole withPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
        return this;
    }

    /**
     * 主体来源 IAM云用户 SAML联邦 LDAP ld用户 LOCAL 本地用户 OTHER 其它
     * @return principalSource
     */
    public PrincipalSourceEnum getPrincipalSource() {
        return principalSource;
    }

    public void setPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRole userRole = (UserRole) o;
        return Objects.equals(this.principalType, userRole.principalType)
            && Objects.equals(this.principalName, userRole.principalName)
            && Objects.equals(this.principalSource, userRole.principalSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalType, principalName, principalSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRole {\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    principalSource: ").append(toIndentedString(principalSource)).append("\n");
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
