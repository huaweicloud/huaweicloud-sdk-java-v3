package com.huaweicloud.sdk.elb.v3.model;

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
 * 证书信息。
 */
public class CertificateInfo {

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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

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
    @JsonProperty(value = "common_name")

    private String commonName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_alternative_names")

    private List<String> subjectAlternativeNames = null;

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

    public CertificateInfo withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 证书的管理状态。  不支持该字段，请勿使用。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CertificateInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书的内容。PEM编码格式。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public CertificateInfo withDescription(String description) {
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

    public CertificateInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 服务器证书所签域名。该字段仅type为server时有效。  总长度为0-10000，由若干普通域名或泛域名组成，域名之间以\",\"分隔，不超过100个域名。  普通域名：由若干字符串组成，字符串间以\".\"分隔，单个字符串长度不超过63个字符， 只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。例：www.test.com。  泛域名：在普通域名的基础上仅允许首字母为\"\\*\"。例：\\*.test.com
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CertificateInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateInfo withName(String name) {
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

    public CertificateInfo withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 服务器证书的私钥。PEM编码格式。  当type为client时，该参数被忽略，不影响证书的创建和使用。  当type为server时，该字段必须符合格式要求，且私钥必须是有效的。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CertificateInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * SSL证书的类型。分为服务器证书(server)、CA证书(client)。默认值：server。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CertificateInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 证书创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CertificateInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 证书更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CertificateInfo withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 证书使用截止时间。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CertificateInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 证书所在项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CertificateInfo withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * HTTPS协议使用的SM加密证书内容。  取值：PEM编码格式。  注意：仅在当前局点的SM加密证书特性开启才会返回该字段。
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public CertificateInfo withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * HTTPS协议使用的SM加密证书私钥。  取值：PEM编码格式。  注意：仅在当前局点的SM加密证书特性开启才会返回该字段。
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
    }

    public CertificateInfo withScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
        return this;
    }

    /**
     * SCM证书ID。
     * @return scmCertificateId
     */
    public String getScmCertificateId() {
        return scmCertificateId;
    }

    public void setScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
    }

    public CertificateInfo withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * 证书绑定的主域名。
     * @return commonName
     */
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public CertificateInfo withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * 证书指纹。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public CertificateInfo withSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    public CertificateInfo addSubjectAlternativeNamesItem(String subjectAlternativeNamesItem) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
        return this;
    }

    public CertificateInfo withSubjectAlternativeNames(Consumer<List<String>> subjectAlternativeNamesSetter) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        subjectAlternativeNamesSetter.accept(this.subjectAlternativeNames);
        return this;
    }

    /**
     * 证书绑定的所有域名。
     * @return subjectAlternativeNames
     */
    public List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public CertificateInfo withSource(String source) {
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

    public CertificateInfo withProtectionStatus(ProtectionStatusEnum protectionStatus) {
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

    public CertificateInfo withProtectionReason(String protectionReason) {
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
        CertificateInfo that = (CertificateInfo) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.type, that.type) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey)
            && Objects.equals(this.scmCertificateId, that.scmCertificateId)
            && Objects.equals(this.commonName, that.commonName) && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.subjectAlternativeNames, that.subjectAlternativeNames)
            && Objects.equals(this.source, that.source) && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            certificate,
            description,
            domain,
            id,
            name,
            privateKey,
            type,
            createdAt,
            updatedAt,
            expireTime,
            projectId,
            encCertificate,
            encPrivateKey,
            scmCertificateId,
            commonName,
            fingerprint,
            subjectAlternativeNames,
            source,
            protectionStatus,
            protectionReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateInfo {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    encCertificate: ").append(toIndentedString(encCertificate)).append("\n");
        sb.append("    encPrivateKey: ").append(toIndentedString(encPrivateKey)).append("\n");
        sb.append("    scmCertificateId: ").append(toIndentedString(scmCertificateId)).append("\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
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
