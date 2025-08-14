package com.huaweicloud.sdk.identitycenter.v1.model;

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
 * IdentityStoreDto
 */
public class IdentityStoreDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    /**
     * 身份源类型
     */
    public static final class IdentityStoreTypeEnum {

        /**
         * Enum USERPOOL for value: "UserPool"
         */
        public static final IdentityStoreTypeEnum USERPOOL = new IdentityStoreTypeEnum("UserPool");

        private static final Map<String, IdentityStoreTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IdentityStoreTypeEnum> createStaticFields() {
            Map<String, IdentityStoreTypeEnum> map = new HashMap<>();
            map.put("UserPool", USERPOOL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IdentityStoreTypeEnum(String value) {
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
        public static IdentityStoreTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IdentityStoreTypeEnum(value));
        }

        public static IdentityStoreTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IdentityStoreTypeEnum) {
                return this.value.equals(((IdentityStoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_type")

    private IdentityStoreTypeEnum identityStoreType;

    /**
     * 登录认证类型
     */
    public static final class AuthenticationTypeEnum {

        /**
         * Enum SAML_2_0 for value: "SAML_2.0"
         */
        public static final AuthenticationTypeEnum SAML_2_0 = new AuthenticationTypeEnum("SAML_2.0");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final AuthenticationTypeEnum DEFAULT = new AuthenticationTypeEnum("DEFAULT");

        private static final Map<String, AuthenticationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthenticationTypeEnum> createStaticFields() {
            Map<String, AuthenticationTypeEnum> map = new HashMap<>();
            map.put("SAML_2.0", SAML_2_0);
            map.put("DEFAULT", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthenticationTypeEnum(String value) {
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
        public static AuthenticationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthenticationTypeEnum(value));
        }

        public static AuthenticationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthenticationTypeEnum) {
                return this.value.equals(((AuthenticationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_type")

    private AuthenticationTypeEnum authenticationType;

    /**
     * Gets or Sets provisioningType
     */
    public static final class ProvisioningTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final ProvisioningTypeEnum DEFAULT = new ProvisioningTypeEnum("DEFAULT");

        /**
         * Enum SCIM for value: "SCIM"
         */
        public static final ProvisioningTypeEnum SCIM = new ProvisioningTypeEnum("SCIM");

        private static final Map<String, ProvisioningTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProvisioningTypeEnum> createStaticFields() {
            Map<String, ProvisioningTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("SCIM", SCIM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProvisioningTypeEnum(String value) {
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
        public static ProvisioningTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProvisioningTypeEnum(value));
        }

        public static ProvisioningTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProvisioningTypeEnum) {
                return this.value.equals(((ProvisioningTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_type")

    private List<ProvisioningTypeEnum> provisioningType = null;

    /**
     * 身份源是否启用状态
     */
    public static final class StatusEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("ENABLED", ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public IdentityStoreDto withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 关联到IAM身份中心实例的身份源的全局唯一标识符（ID）。
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public IdentityStoreDto withIdentityStoreType(IdentityStoreTypeEnum identityStoreType) {
        this.identityStoreType = identityStoreType;
        return this;
    }

    /**
     * 身份源类型
     * @return identityStoreType
     */
    public IdentityStoreTypeEnum getIdentityStoreType() {
        return identityStoreType;
    }

    public void setIdentityStoreType(IdentityStoreTypeEnum identityStoreType) {
        this.identityStoreType = identityStoreType;
    }

    public IdentityStoreDto withAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 登录认证类型
     * @return authenticationType
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
    }

    public IdentityStoreDto withProvisioningType(List<ProvisioningTypeEnum> provisioningType) {
        this.provisioningType = provisioningType;
        return this;
    }

    public IdentityStoreDto addProvisioningTypeItem(ProvisioningTypeEnum provisioningTypeItem) {
        if (this.provisioningType == null) {
            this.provisioningType = new ArrayList<>();
        }
        this.provisioningType.add(provisioningTypeItem);
        return this;
    }

    public IdentityStoreDto withProvisioningType(Consumer<List<ProvisioningTypeEnum>> provisioningTypeSetter) {
        if (this.provisioningType == null) {
            this.provisioningType = new ArrayList<>();
        }
        provisioningTypeSetter.accept(this.provisioningType);
        return this;
    }

    /**
     * 预配类型
     * @return provisioningType
     */
    public List<ProvisioningTypeEnum> getProvisioningType() {
        return provisioningType;
    }

    public void setProvisioningType(List<ProvisioningTypeEnum> provisioningType) {
        this.provisioningType = provisioningType;
    }

    public IdentityStoreDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 身份源是否启用状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityStoreDto that = (IdentityStoreDto) obj;
        return Objects.equals(this.identityStoreId, that.identityStoreId)
            && Objects.equals(this.identityStoreType, that.identityStoreType)
            && Objects.equals(this.authenticationType, that.authenticationType)
            && Objects.equals(this.provisioningType, that.provisioningType) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityStoreId, identityStoreType, authenticationType, provisioningType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityStoreDto {\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    identityStoreType: ").append(toIndentedString(identityStoreType)).append("\n");
        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
        sb.append("    provisioningType: ").append(toIndentedString(provisioningType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
