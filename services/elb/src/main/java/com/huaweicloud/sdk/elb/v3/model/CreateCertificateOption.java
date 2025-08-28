package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：创建证书请求参数。  **约束限制**：不涉及
 */
public class CreateCertificateOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * **参数解释**：证书的类型。  **约束限制**：不涉及  **取值范围**： - server：服务器证书。 - client：CA证书。 - server_sm：服务器SM双证书。  **默认取值**：server
     */
    public static final class TypeEnum {

        /**
         * Enum SERVER for value: "server"
         */
        public static final TypeEnum SERVER = new TypeEnum("server");

        /**
         * Enum CLIENT for value: "client"
         */
        public static final TypeEnum CLIENT = new TypeEnum("client");

        /**
         * Enum SERVER_SM for value: "server_sm"
         */
        public static final TypeEnum SERVER_SM = new TypeEnum("server_sm");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("client", CLIENT);
            map.put("server_sm", SERVER_SM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    private String encPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_certificate_id")

    private String scmCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护 - consoleProtection: 控制台修改保护，即禁止通过控制台修改。  **默认取值**：nonProtection
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
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
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    public CreateCertificateOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：证书的管理状态。该字段当前无用，设置为true或者false都不影响证书使用。  **约束限制**：不涉及  **取值范围**： - true：表示证书可用。 - false：表示证书不可用。  **默认取值**：true
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateCertificateOption withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * **参数解释**：证书内容。支持最大11层证书链(含证书和证书链)。  **约束限制**：不涉及  **取值范围**：PEM编码格式，最大长度65536个字符。  **默认取值**：不涉及
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public CreateCertificateOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：证书的描述。  **约束限制**：不涉及  **取值范围**：0-255个字符。  **默认取值**：不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCertificateOption withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * **参数解释**：服务器证书所签域名。  **约束限制**：该字段仅type为server时有效（其他类型证书，字段可传入，但不会生效）。  **取值范围**：总长度为0-10000，由若干普通域名或泛域名组成，域名之间以\",\"分隔，不超过100个域名。 - 普通域名：由若干字符串组成，字符串间以\".\"分隔，单个字符串长度不超过63个字符，只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。例：www.test.com。 - 泛域名：在普通域名的基础上仅允许首字母为\"\\*\"。例：\\*.test.com。  **默认取值**：不涉及
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateCertificateOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：证书的名称。  **约束限制**：不涉及  **取值范围**：0-255个字符。  **默认取值**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCertificateOption withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * **参数解释**：服务器证书的私钥。  **约束限制**： - 当type为server和server_sm时，创建时必须传入。 - 当type为其他值时，字段无用，可以不传入；若传入则必须符合PEM格式。  **取值范围**：PEM编码格式，最大长度8192个字符。  **默认取值**：不涉及
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CreateCertificateOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：项目ID。获取方式请参见[获取项目ID](elb_fl_0008.xml)。  **约束限制**：不涉及  **取值范围**：长度为32个字符，由小写字母和数字组成。  **默认取值**：不涉及  > 该字段实际无效，最终使用url中的project_id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateCertificateOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：证书的类型。  **约束限制**：不涉及  **取值范围**： - server：服务器证书。 - client：CA证书。 - server_sm：服务器SM双证书。  **默认取值**：server
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateCertificateOption withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**：资源所属的企业项目ID。创建时不传则资源属于default企业项目，返回enterprise_project_id=\"0\"。  **约束限制**：不能传入空字符串\"\"、\"0\"或不存在的企业项目ID。  **取值范围**：不涉及  **默认取值**：\"0\"  [不支持该字段，请勿使用。](tag:dt,hcso_dt)
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateCertificateOption withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * **参数解释**：服务器SM双证书的证书内容。支持最大11层证书链(含证书和证书链)。  **约束限制**：仅当type为server_sm时，才支持且必须传入。  **取值范围**：PEM编码格式。最大长度65536字符。  **默认取值**：不涉及
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public CreateCertificateOption withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * **参数解释**：服务器SM双证书的私钥。  **约束限制**：仅当type为server_sm时，才支持且必须传入。  **取值范围**：PEM编码格式，最大长度8192个字符。  **默认取值**：不涉及
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
    }

    public CreateCertificateOption withScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
        return this;
    }

    /**
     * **参数解释**：云证书管理服务（CCM）中的证书ID。  **约束限制**：仅记录证书ID，不验证其是否真实存在云证书管理服务中。并且需要将云证书管理服务中对应证书的内容手动设置到当前接口相应字段中（可能涉及字段certificate、private_key、enc_certificate和enc_private_key）  **取值范围**：不涉及  **默认取值**：不涉及
     * @return scmCertificateId
     */
    public String getScmCertificateId() {
        return scmCertificateId;
    }

    public void setScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
    }

    public CreateCertificateOption withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**：标记当前证书来源。  **约束限制**：无  **取值范围**： - scm：表示关联云证书管理服务（CCM）中的证书。 - 空值：表示自有证书。  **默认取值**：当scm_certificate_id不为空，默认取值为\"scm\"。否则默认为空值。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateCertificateOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * **参数解释**：修改保护状态。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护 - consoleProtection: 控制台修改保护，即禁止通过控制台修改。  **默认取值**：nonProtection
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public CreateCertificateOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * **参数解释**：修改保护的原因。  **约束限制**：仅当protection_status为consoleProtection时有效。  **取值范围**：不涉及  **默认取值**：空
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCertificateOption that = (CreateCertificateOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.name, that.name)
            && Objects.equals(this.privateKey, that.privateKey) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.type, that.type)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey)
            && Objects.equals(this.scmCertificateId, that.scmCertificateId) && Objects.equals(this.source, that.source)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            certificate,
            description,
            domain,
            name,
            privateKey,
            projectId,
            type,
            enterpriseProjectId,
            encCertificate,
            encPrivateKey,
            scmCertificateId,
            source,
            protectionStatus,
            protectionReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    encCertificate: ").append(toIndentedString(encCertificate)).append("\n");
        sb.append("    encPrivateKey: ").append(toIndentedString(encPrivateKey)).append("\n");
        sb.append("    scmCertificateId: ").append(toIndentedString(scmCertificateId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
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
