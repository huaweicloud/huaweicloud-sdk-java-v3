package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListCertificatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private List<String> domain = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_certificate_id")

    private List<String> scmCertificateId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_name")

    private List<String> commonName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private List<String> fingerprint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private List<String> source = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private List<String> protectionStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private List<String> protectionReason = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    public ListCertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * **参数解释**：上一页最后一条记录的ID。  **约束限制**： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListCertificatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：每页返回的个数。  **约束限制**：不涉及  **取值范围**：0-2000  **默认取值**：2000
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCertificatesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /**
     * **参数解释**：是否反向查询。  **约束限制**： - 必须与limit一起使用。 - 当page_reverse=true时，若要查询上一页，marker取值为当前页返回值的previous_marker。  **取值范围**： - true：查询上一页。 - false：查询下一页。  **默认取值**：false
     * @return pageReverse
     */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListCertificatesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListCertificatesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListCertificatesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * **参数解释**：证书ID。 支持多值查询，查询条件格式：*id=xxx&id=xxx*。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListCertificatesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListCertificatesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListCertificatesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * **参数解释**：证书的名称。 支持多值查询，查询条件格式：*name=xxx&name=xxx*。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListCertificatesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListCertificatesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListCertificatesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * **参数解释**：证书的描述。 支持多值查询，查询条件格式：*description=xxx&description=xxx*。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListCertificatesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**：证书的管理状态。  **约束限制**：不涉及  **取值范围**： - true：表示证书可用。 - false：表示证书不可用。  **默认取值**：不涉及
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListCertificatesRequest withDomain(List<String> domain) {
        this.domain = domain;
        return this;
    }

    public ListCertificatesRequest addDomainItem(String domainItem) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domainItem);
        return this;
    }

    public ListCertificatesRequest withDomain(Consumer<List<String>> domainSetter) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        domainSetter.accept(this.domain);
        return this;
    }

    /**
     * **参数解释**：服务器证书所签域名。 支持多值查询，查询条件格式：domain=xxx&domain=xxx。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return domain
     */
    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public ListCertificatesRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListCertificatesRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListCertificatesRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释**：证书的类型。 支持多值查询，查询条件格式：type=xxx&type=xxx。  **约束限制**：不涉及  **取值范围**： - server：服务器证书。 - client：CA证书。 - server_sm：服务器SM双证书。  **默认取值**：不涉及
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListCertificatesRequest withScmCertificateId(List<String> scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
        return this;
    }

    public ListCertificatesRequest addScmCertificateIdItem(String scmCertificateIdItem) {
        if (this.scmCertificateId == null) {
            this.scmCertificateId = new ArrayList<>();
        }
        this.scmCertificateId.add(scmCertificateIdItem);
        return this;
    }

    public ListCertificatesRequest withScmCertificateId(Consumer<List<String>> scmCertificateIdSetter) {
        if (this.scmCertificateId == null) {
            this.scmCertificateId = new ArrayList<>();
        }
        scmCertificateIdSetter.accept(this.scmCertificateId);
        return this;
    }

    /**
     * **参数解释**：云证书与管理服务（CCM）中的证书ID。 支持多值查询，查询条件格式：scm_certificate_id=xxx&scm_certificate_id=xxx。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return scmCertificateId
     */
    public List<String> getScmCertificateId() {
        return scmCertificateId;
    }

    public void setScmCertificateId(List<String> scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
    }

    public ListCertificatesRequest withCommonName(List<String> commonName) {
        this.commonName = commonName;
        return this;
    }

    public ListCertificatesRequest addCommonNameItem(String commonNameItem) {
        if (this.commonName == null) {
            this.commonName = new ArrayList<>();
        }
        this.commonName.add(commonNameItem);
        return this;
    }

    public ListCertificatesRequest withCommonName(Consumer<List<String>> commonNameSetter) {
        if (this.commonName == null) {
            this.commonName = new ArrayList<>();
        }
        commonNameSetter.accept(this.commonName);
        return this;
    }

    /**
     * **参数解释**：证书的主域名。 支持多值查询，查询条件格式：common_name=xxx&common_name=xxx。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return commonName
     */
    public List<String> getCommonName() {
        return commonName;
    }

    public void setCommonName(List<String> commonName) {
        this.commonName = commonName;
    }

    public ListCertificatesRequest withFingerprint(List<String> fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    public ListCertificatesRequest addFingerprintItem(String fingerprintItem) {
        if (this.fingerprint == null) {
            this.fingerprint = new ArrayList<>();
        }
        this.fingerprint.add(fingerprintItem);
        return this;
    }

    public ListCertificatesRequest withFingerprint(Consumer<List<String>> fingerprintSetter) {
        if (this.fingerprint == null) {
            this.fingerprint = new ArrayList<>();
        }
        fingerprintSetter.accept(this.fingerprint);
        return this;
    }

    /**
     * **参数解释**：证书的指纹。 支持多值查询，查询条件格式：fingerprint=xxx&fingerprint=xxx。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return fingerprint
     */
    public List<String> getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(List<String> fingerprint) {
        this.fingerprint = fingerprint;
    }

    public ListCertificatesRequest withSource(List<String> source) {
        this.source = source;
        return this;
    }

    public ListCertificatesRequest addSourceItem(String sourceItem) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        this.source.add(sourceItem);
        return this;
    }

    public ListCertificatesRequest withSource(Consumer<List<String>> sourceSetter) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        sourceSetter.accept(this.source);
        return this;
    }

    /**
     * **参数解释**：证书来源。 支持多值查询，查询条件格式：source=xxx&source=xxx。  **约束限制**：不涉及  **取值范围**： - scm：表示关联云证书与管理服务（CCM）中的证书。 - 空值：表示自有证书。  **默认取值**：不涉及
     * @return source
     */
    public List<String> getSource() {
        return source;
    }

    public void setSource(List<String> source) {
        this.source = source;
    }

    public ListCertificatesRequest withProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    public ListCertificatesRequest addProtectionStatusItem(String protectionStatusItem) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        this.protectionStatus.add(protectionStatusItem);
        return this;
    }

    public ListCertificatesRequest withProtectionStatus(Consumer<List<String>> protectionStatusSetter) {
        if (this.protectionStatus == null) {
            this.protectionStatus = new ArrayList<>();
        }
        protectionStatusSetter.accept(this.protectionStatus);
        return this;
    }

    /**
     * **参数解释**：修改保护状态。 支持多值查询，查询条件格式：protection_status=xxx&protection_status=xxx。  **约束限制**：不涉及  **取值范围**： - nonProtection: 不保护 - consoleProtection: 控制台修改保护，即禁止通过控制台修改。  **默认取值**：不涉及
     * @return protectionStatus
     */
    public List<String> getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(List<String> protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public ListCertificatesRequest withProtectionReason(List<String> protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    public ListCertificatesRequest addProtectionReasonItem(String protectionReasonItem) {
        if (this.protectionReason == null) {
            this.protectionReason = new ArrayList<>();
        }
        this.protectionReason.add(protectionReasonItem);
        return this;
    }

    public ListCertificatesRequest withProtectionReason(Consumer<List<String>> protectionReasonSetter) {
        if (this.protectionReason == null) {
            this.protectionReason = new ArrayList<>();
        }
        protectionReasonSetter.accept(this.protectionReason);
        return this;
    }

    /**
     * **参数解释**：设置修改保护的原因。 支持多值查询，查询条件格式：protection_reason=xxx&protection_reason=xxx。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return protectionReason
     */
    public List<String> getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(List<String> protectionReason) {
        this.protectionReason = protectionReason;
    }

    public ListCertificatesRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListCertificatesRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListCertificatesRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * **参数解释**：资源所属的企业项目ID。 支持多值查询，查询条件格式： *enterprise_project_id=xxx&enterprise_project_id=xxx*。  **约束限制**： - 如果enterprise_project_id不传值，默认查询所有企业项目下的资源，鉴权按照细粒度权限鉴权，必须在用户组下分配elb:certificates:list权限。 - 如果enterprise_project_id传值，鉴权按照企业项目权限鉴权，分为传入具体eps_id和all_granted_eps两种场景，前者查询指定eps_id的eps下的资源，后者查询的是所有有list权限的eps下的资源。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertificatesRequest that = (ListCertificatesRequest) obj;
        return Objects.equals(this.marker, that.marker) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pageReverse, that.pageReverse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.type, that.type) && Objects.equals(this.scmCertificateId, that.scmCertificateId)
            && Objects.equals(this.commonName, that.commonName) && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.source, that.source) && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker,
            limit,
            pageReverse,
            id,
            name,
            description,
            adminStateUp,
            domain,
            type,
            scmCertificateId,
            commonName,
            fingerprint,
            source,
            protectionStatus,
            protectionReason,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scmCertificateId: ").append(toIndentedString(scmCertificateId)).append("\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
