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
 * UpdateCertificateOption
 */
public class UpdateCertificateOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

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
     * 参数解释：修改保护状态  约束限制：无  取值范围：  - nonProtection: 不保护  - consoleProtection: 控制台修改保护  默认取值：nonProtection
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

    public UpdateCertificateOption withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书的内容。PEM编码格式。 最大长度65536字符。 支持证书链，最大11层(含证书和证书链)。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateCertificateOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 证书的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCertificateOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCertificateOption withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 服务器证书的私钥。PEM编码格式。 当type为client时，该参数被忽略，不影响证书的创建和使用。若传入不符合格式值，则会报错。 当type为server时，该字段必须符合格式要求，且私钥必须是有效的。 最大长度8192字符。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public UpdateCertificateOption withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 服务器证书所签域名。该字段仅type为server时有效。  总长度为0-10000，由若干普通域名或泛域名组成，域名之间以\",\"分隔，不超过100个域名。  普通域名：由若干字符串组成，字符串间以\".\"分隔，单个字符串长度不超过63个字符， 只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。例：www.test.com；  泛域名：在普通域名的基础上仅允许首字母为\"\\*\"。例：\\*.test.com
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UpdateCertificateOption withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * HTTPS协议使用的SM加密证书内容。支持证书链，最大11层(含证书和证书链)。  取值：PEM编码格式。最大长度65536字符。  使用说明：仅type为server_sm时有效。
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public UpdateCertificateOption withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * HTTPS协议使用的SM加密证书内容。  取值：PEM编码格式。最大长度8192字符。  使用说明：仅type为server_sm时有效。
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
    }

    public UpdateCertificateOption withScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
        return this;
    }

    /**
     * scm证书id
     * @return scmCertificateId
     */
    public String getScmCertificateId() {
        return scmCertificateId;
    }

    public void setScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
    }

    public UpdateCertificateOption withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 参数解释：证书来源 取值范围：无  默认取值：当scm_certificate_id不为空，且未传入source时，默认取值为“scm”； 其他情况下默认为空。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public UpdateCertificateOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 参数解释：修改保护状态  约束限制：无  取值范围：  - nonProtection: 不保护  - consoleProtection: 控制台修改保护  默认取值：nonProtection
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public UpdateCertificateOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 参数解释：设置修改保护的原因  约束限制：仅当protection_status为consoleProtection时有效  取值范围：无  默认取值：空
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
        UpdateCertificateOption that = (UpdateCertificateOption) obj;
        return Objects.equals(this.certificate, that.certificate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey)
            && Objects.equals(this.scmCertificateId, that.scmCertificateId) && Objects.equals(this.source, that.source)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate,
            description,
            name,
            privateKey,
            domain,
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
        sb.append("class UpdateCertificateOption {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
