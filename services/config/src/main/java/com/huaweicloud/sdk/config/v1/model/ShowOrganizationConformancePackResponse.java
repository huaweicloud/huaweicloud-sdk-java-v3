package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOrganizationConformancePackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_id")

    private String orgConformancePackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_name")

    private String orgConformancePackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_conformance_pack_urn")

    private String orgConformancePackUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excluded_accounts")

    private List<String> excludedAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vars_structure")

    private List<VarsStructure> varsStructure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_key")

    private String templateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_uri")

    private String templateUri;

    public ShowOrganizationConformancePackResponse withOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
        return this;
    }

    /**
     * 组织合规规则包ID。
     * @return orgConformancePackId
     */
    public String getOrgConformancePackId() {
        return orgConformancePackId;
    }

    public void setOrgConformancePackId(String orgConformancePackId) {
        this.orgConformancePackId = orgConformancePackId;
    }

    public ShowOrganizationConformancePackResponse withOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
        return this;
    }

    /**
     * 组织合规规则包名称。
     * @return orgConformancePackName
     */
    public String getOrgConformancePackName() {
        return orgConformancePackName;
    }

    public void setOrgConformancePackName(String orgConformancePackName) {
        this.orgConformancePackName = orgConformancePackName;
    }

    public ShowOrganizationConformancePackResponse withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 组织合规规则包创建者。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public ShowOrganizationConformancePackResponse withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public ShowOrganizationConformancePackResponse withOrgConformancePackUrn(String orgConformancePackUrn) {
        this.orgConformancePackUrn = orgConformancePackUrn;
        return this;
    }

    /**
     * 组织合规规则包资源唯一标识。
     * @return orgConformancePackUrn
     */
    public String getOrgConformancePackUrn() {
        return orgConformancePackUrn;
    }

    public void setOrgConformancePackUrn(String orgConformancePackUrn) {
        this.orgConformancePackUrn = orgConformancePackUrn;
    }

    public ShowOrganizationConformancePackResponse withExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    public ShowOrganizationConformancePackResponse addExcludedAccountsItem(String excludedAccountsItem) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        this.excludedAccounts.add(excludedAccountsItem);
        return this;
    }

    public ShowOrganizationConformancePackResponse withExcludedAccounts(Consumer<List<String>> excludedAccountsSetter) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        excludedAccountsSetter.accept(this.excludedAccounts);
        return this;
    }

    /**
     * 排除配置合规包的帐号。
     * @return excludedAccounts
     */
    public List<String> getExcludedAccounts() {
        return excludedAccounts;
    }

    public void setExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public ShowOrganizationConformancePackResponse withVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
        return this;
    }

    public ShowOrganizationConformancePackResponse addVarsStructureItem(VarsStructure varsStructureItem) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        this.varsStructure.add(varsStructureItem);
        return this;
    }

    public ShowOrganizationConformancePackResponse withVarsStructure(
        Consumer<List<VarsStructure>> varsStructureSetter) {
        if (this.varsStructure == null) {
            this.varsStructure = new ArrayList<>();
        }
        varsStructureSetter.accept(this.varsStructure);
        return this;
    }

    /**
     * 合规规则包参数。
     * @return varsStructure
     */
    public List<VarsStructure> getVarsStructure() {
        return varsStructure;
    }

    public void setVarsStructure(List<VarsStructure> varsStructure) {
        this.varsStructure = varsStructure;
    }

    public ShowOrganizationConformancePackResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 组织合规规则包创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowOrganizationConformancePackResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 组织合规规则包更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowOrganizationConformancePackResponse withTemplateKey(String templateKey) {
        this.templateKey = templateKey;
        return this;
    }

    /**
     * 预定义合规规则包模板名称。
     * @return templateKey
     */
    public String getTemplateKey() {
        return templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public ShowOrganizationConformancePackResponse withTemplateUri(String templateUri) {
        this.templateUri = templateUri;
        return this;
    }

    /**
     * 合规规则包模板OBS地址
     * @return templateUri
     */
    public String getTemplateUri() {
        return templateUri;
    }

    public void setTemplateUri(String templateUri) {
        this.templateUri = templateUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrganizationConformancePackResponse that = (ShowOrganizationConformancePackResponse) obj;
        return Objects.equals(this.orgConformancePackId, that.orgConformancePackId)
            && Objects.equals(this.orgConformancePackName, that.orgConformancePackName)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.organizationId, that.organizationId)
            && Objects.equals(this.orgConformancePackUrn, that.orgConformancePackUrn)
            && Objects.equals(this.excludedAccounts, that.excludedAccounts)
            && Objects.equals(this.varsStructure, that.varsStructure) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.templateKey, that.templateKey)
            && Objects.equals(this.templateUri, that.templateUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgConformancePackId,
            orgConformancePackName,
            ownerId,
            organizationId,
            orgConformancePackUrn,
            excludedAccounts,
            varsStructure,
            createdAt,
            updatedAt,
            templateKey,
            templateUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrganizationConformancePackResponse {\n");
        sb.append("    orgConformancePackId: ").append(toIndentedString(orgConformancePackId)).append("\n");
        sb.append("    orgConformancePackName: ").append(toIndentedString(orgConformancePackName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    orgConformancePackUrn: ").append(toIndentedString(orgConformancePackUrn)).append("\n");
        sb.append("    excludedAccounts: ").append(toIndentedString(excludedAccounts)).append("\n");
        sb.append("    varsStructure: ").append(toIndentedString(varsStructure)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
        sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
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
