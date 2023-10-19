package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 中心网络策略详情。
 */
public class CentralNetworkPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private CentralNetworkPolicyStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_id")

    private String centralNetworkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_template_version")

    private DocumentTemplateVersionEnum documentTemplateVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Boolean isApplied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document")

    private CentralNetworkPolicyDocument document;

    public CentralNetworkPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CentralNetworkPolicy withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 实例创建时间。UTC时间格式，yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CentralNetworkPolicy withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 实例所属帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CentralNetworkPolicy withState(CentralNetworkPolicyStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public CentralNetworkPolicyStateEnum getState() {
        return state;
    }

    public void setState(CentralNetworkPolicyStateEnum state) {
        this.state = state;
    }

    public CentralNetworkPolicy withCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return centralNetworkId
     */
    public String getCentralNetworkId() {
        return centralNetworkId;
    }

    public void setCentralNetworkId(String centralNetworkId) {
        this.centralNetworkId = centralNetworkId;
    }

    public CentralNetworkPolicy withDocumentTemplateVersion(DocumentTemplateVersionEnum documentTemplateVersion) {
        this.documentTemplateVersion = documentTemplateVersion;
        return this;
    }

    /**
     * Get documentTemplateVersion
     * @return documentTemplateVersion
     */
    public DocumentTemplateVersionEnum getDocumentTemplateVersion() {
        return documentTemplateVersion;
    }

    public void setDocumentTemplateVersion(DocumentTemplateVersionEnum documentTemplateVersion) {
        this.documentTemplateVersion = documentTemplateVersion;
    }

    public CentralNetworkPolicy withIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * 是否被应用。
     * @return isApplied
     */
    public Boolean getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public CentralNetworkPolicy withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 中心网络策略的版本。
     * minimum: 1
     * maximum: 4096
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CentralNetworkPolicy withDocument(CentralNetworkPolicyDocument document) {
        this.document = document;
        return this;
    }

    public CentralNetworkPolicy withDocument(Consumer<CentralNetworkPolicyDocument> documentSetter) {
        if (this.document == null) {
            this.document = new CentralNetworkPolicyDocument();
            documentSetter.accept(this.document);
        }

        return this;
    }

    /**
     * Get document
     * @return document
     */
    public CentralNetworkPolicyDocument getDocument() {
        return document;
    }

    public void setDocument(CentralNetworkPolicyDocument document) {
        this.document = document;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CentralNetworkPolicy that = (CentralNetworkPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.centralNetworkId, that.centralNetworkId)
            && Objects.equals(this.documentTemplateVersion, that.documentTemplateVersion)
            && Objects.equals(this.isApplied, that.isApplied) && Objects.equals(this.version, that.version)
            && Objects.equals(this.document, that.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            createdAt,
            domainId,
            state,
            centralNetworkId,
            documentTemplateVersion,
            isApplied,
            version,
            document);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CentralNetworkPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    centralNetworkId: ").append(toIndentedString(centralNetworkId)).append("\n");
        sb.append("    documentTemplateVersion: ").append(toIndentedString(documentTemplateVersion)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
