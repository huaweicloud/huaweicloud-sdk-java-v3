package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateSAMLProviderReqBody
 */
public class CreateSAMLProviderReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml_metadata_document")

    private String samlMetadataDocument;

    /**
     * **参数解释**： 指定 SAML 提供商的加密设置。  **约束限制**： 不涉及。  **取值范围**： 取值范围为[Required,Allowed]。  **默认取值**： 不涉及。
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
    @JsonProperty(value = "add_private_key")

    private String addPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateSAMLProviderReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： SAML 提供商的名称。  **约束限制**： 字符串长度在 1 到 64 之间，并且只能包含：字母、数字、下划线（_）、中划线（-）。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSAMLProviderReqBody withSamlMetadataDocument(String samlMetadataDocument) {
        this.samlMetadataDocument = samlMetadataDocument;
        return this;
    }

    /**
     * **参数解释**： 由支持 SAML 2.0 的身份提供商 (IdP) 生成的 XML 文档。该文档包含颁发者的名称、过期信息，以及可用于验证从 IdP 接收到的 SAML 身份验证响应（断言）的密钥。  **约束限制**： 长度范围为[1000,512000]。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return samlMetadataDocument
     */
    public String getSamlMetadataDocument() {
        return samlMetadataDocument;
    }

    public void setSamlMetadataDocument(String samlMetadataDocument) {
        this.samlMetadataDocument = samlMetadataDocument;
    }

    public CreateSAMLProviderReqBody withAssertionEncryptionMode(AssertionEncryptionModeEnum assertionEncryptionMode) {
        this.assertionEncryptionMode = assertionEncryptionMode;
        return this;
    }

    /**
     * **参数解释**： 指定 SAML 提供商的加密设置。  **约束限制**： 不涉及。  **取值范围**： 取值范围为[Required,Allowed]。  **默认取值**： 不涉及。
     * @return assertionEncryptionMode
     */
    public AssertionEncryptionModeEnum getAssertionEncryptionMode() {
        return assertionEncryptionMode;
    }

    public void setAssertionEncryptionMode(AssertionEncryptionModeEnum assertionEncryptionMode) {
        this.assertionEncryptionMode = assertionEncryptionMode;
    }

    public CreateSAMLProviderReqBody withAddPrivateKey(String addPrivateKey) {
        this.addPrivateKey = addPrivateKey;
        return this;
    }

    /**
     * **参数解释**： 添加解密 SAML 断言的私钥，必须是一个 PEM 格式的 RSA 私钥。在接收到加密的 SAML 断言时，IAM 会基于 RSA-OAEP 算法使用该私钥解密得到用于加密 SAML 断言的对称密钥，然后再基于 AES-GCM 或 AES-CBC 加密算法使用对称密钥解密出 SAML 断言明文。  **约束限制**： 长度范围为[1,16384]。  **取值范围**： 字符串必须由 1 个或多个字符组成，这些字符可以是：空格、可见 ASCII 字符、Latin-1 扩展字符、Tab、换行、回车  **默认取值**： 不涉及。
     * @return addPrivateKey
     */
    public String getAddPrivateKey() {
        return addPrivateKey;
    }

    public void setAddPrivateKey(String addPrivateKey) {
        this.addPrivateKey = addPrivateKey;
    }

    public CreateSAMLProviderReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 身份提供商描述。  **约束限制**： 长度范围为[0,255]。  **取值范围**： 不能包含特定字符\"@\"、\"#\"、\"%\"、\"&\"、\"<\"、\">\"、\"\\\"、\"$\"、\"^\"和\"*\"的字符串。  **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSAMLProviderReqBody that = (CreateSAMLProviderReqBody) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.samlMetadataDocument, that.samlMetadataDocument)
            && Objects.equals(this.assertionEncryptionMode, that.assertionEncryptionMode)
            && Objects.equals(this.addPrivateKey, that.addPrivateKey)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, samlMetadataDocument, assertionEncryptionMode, addPrivateKey, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSAMLProviderReqBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    samlMetadataDocument: ").append(toIndentedString(samlMetadataDocument)).append("\n");
        sb.append("    assertionEncryptionMode: ").append(toIndentedString(assertionEncryptionMode)).append("\n");
        sb.append("    addPrivateKey: ").append(toIndentedString(addPrivateKey)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
