package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： SAML 提供商。  **取值范围**： 不涉及。
 */
public class InlineResponse201SamlProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml_metadata_document")

    private String samlMetadataDocument;

    /**
     * **参数解释**： 指定 SAML 身份提供商的加密设置。  **取值范围**： 取值范围为[Required,Allowed]。
     */
    public static final class AssertionEncryptionModeEnum {

        /**
         * Enum REQUIRED for value: "Required"
         */
        public static final AssertionEncryptionModeEnum REQUIRED = new AssertionEncryptionModeEnum("Required");

        /**
         * Enum ALLOWED for value: "Allowed"
         */
        public static final AssertionEncryptionModeEnum ALLOWED = new AssertionEncryptionModeEnum("Allowed");

        private static final Map<String, AssertionEncryptionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssertionEncryptionModeEnum> createStaticFields() {
            Map<String, AssertionEncryptionModeEnum> map = new HashMap<>();
            map.put("Required", REQUIRED);
            map.put("Allowed", ALLOWED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssertionEncryptionModeEnum(String value) {
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
        public static AssertionEncryptionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AssertionEncryptionModeEnum(value));
        }

        public static AssertionEncryptionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssertionEncryptionModeEnum) {
                return this.value.equals(((AssertionEncryptionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assertion_encryption_mode")

    private AssertionEncryptionModeEnum assertionEncryptionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_keys")

    private List<InlineResponse200PrivateKeys> privateKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private OffsetDateTime expiresAt;

    public InlineResponse201SamlProvider withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * **参数解释**： SAML 身份提供商的ID。  **取值范围**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、中划线（-）。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public InlineResponse201SamlProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： SAML 身份提供商的名称。  **取值范围**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、下划线（_）、中划线（-）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InlineResponse201SamlProvider withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 身份提供商描述。  **取值范围**： 字符串长度在 0 到 255 之间，不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\"、\"$\"、\"^\"和\"*\"的字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InlineResponse201SamlProvider withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * **参数解释**： 统一资源名称。  **取值范围**： 字符串长度在 16 到 1500 之间，可以包含：字母、数字、斜杠（/）、等号（=）、下划线（_）、冒号（:）、中划线（-）
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public InlineResponse201SamlProvider withSamlMetadataDocument(String samlMetadataDocument) {
        this.samlMetadataDocument = samlMetadataDocument;
        return this;
    }

    /**
     * **参数解释**： 支持 SAML 2.0 的身份提供商 (IdP) 的 XML 文档。  **取值范围**： 长度范围为[1000,512000]。
     * @return samlMetadataDocument
     */
    public String getSamlMetadataDocument() {
        return samlMetadataDocument;
    }

    public void setSamlMetadataDocument(String samlMetadataDocument) {
        this.samlMetadataDocument = samlMetadataDocument;
    }

    public InlineResponse201SamlProvider withAssertionEncryptionMode(
        AssertionEncryptionModeEnum assertionEncryptionMode) {
        this.assertionEncryptionMode = assertionEncryptionMode;
        return this;
    }

    /**
     * **参数解释**： 指定 SAML 身份提供商的加密设置。  **取值范围**： 取值范围为[Required,Allowed]。
     * @return assertionEncryptionMode
     */
    public AssertionEncryptionModeEnum getAssertionEncryptionMode() {
        return assertionEncryptionMode;
    }

    public void setAssertionEncryptionMode(AssertionEncryptionModeEnum assertionEncryptionMode) {
        this.assertionEncryptionMode = assertionEncryptionMode;
    }

    public InlineResponse201SamlProvider withPrivateKeys(List<InlineResponse200PrivateKeys> privateKeys) {
        this.privateKeys = privateKeys;
        return this;
    }

    public InlineResponse201SamlProvider addPrivateKeysItem(InlineResponse200PrivateKeys privateKeysItem) {
        if (this.privateKeys == null) {
            this.privateKeys = new ArrayList<>();
        }
        this.privateKeys.add(privateKeysItem);
        return this;
    }

    public InlineResponse201SamlProvider withPrivateKeys(
        Consumer<List<InlineResponse200PrivateKeys>> privateKeysSetter) {
        if (this.privateKeys == null) {
            this.privateKeys = new ArrayList<>();
        }
        privateKeysSetter.accept(this.privateKeys);
        return this;
    }

    /**
     * **参数解释**： 解密 SAML 断言的私钥。  **取值范围**： 不涉及。
     * @return privateKeys
     */
    public List<InlineResponse200PrivateKeys> getPrivateKeys() {
        return privateKeys;
    }

    public void setPrivateKeys(List<InlineResponse200PrivateKeys> privateKeys) {
        this.privateKeys = privateKeys;
    }

    public InlineResponse201SamlProvider withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： SAML 身份提供商创建时间。  **取值范围**： 不涉及。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public InlineResponse201SamlProvider withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * **参数解释**： SAML 身份提供商过期时间。  **取值范围**： 不涉及。
     * @return expiresAt
     */
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InlineResponse201SamlProvider that = (InlineResponse201SamlProvider) obj;
        return Objects.equals(this.providerId, that.providerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.samlMetadataDocument, that.samlMetadataDocument)
            && Objects.equals(this.assertionEncryptionMode, that.assertionEncryptionMode)
            && Objects.equals(this.privateKeys, that.privateKeys) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.expiresAt, that.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId,
            name,
            description,
            urn,
            samlMetadataDocument,
            assertionEncryptionMode,
            privateKeys,
            createdAt,
            expiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse201SamlProvider {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    samlMetadataDocument: ").append(toIndentedString(samlMetadataDocument)).append("\n");
        sb.append("    assertionEncryptionMode: ").append(toIndentedString(assertionEncryptionMode)).append("\n");
        sb.append("    privateKeys: ").append(toIndentedString(privateKeys)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
